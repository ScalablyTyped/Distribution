package typings.androiduix.android.util.Pools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimplePool[T] extends Pool[T] {
  
  /* private */ def isInPool(instance: js.Any): js.Any = js.native
  
  var mPool: js.Array[T] = js.native
  
  var mPoolSize: Double = js.native
}
object SimplePool {
  
  @scala.inline
  def apply[T](
    acquire: () => T,
    isInPool: js.Any => js.Any,
    mPool: js.Array[T],
    mPoolSize: Double,
    release: T => Boolean
  ): SimplePool[T] = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), isInPool = js.Any.fromFunction1(isInPool), mPool = mPool.asInstanceOf[js.Any], mPoolSize = mPoolSize.asInstanceOf[js.Any], release = js.Any.fromFunction1(release))
    __obj.asInstanceOf[SimplePool[T]]
  }
  
  @scala.inline
  implicit class SimplePoolOps[Self <: SimplePool[_], T] (val x: Self with SimplePool[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsInPool(value: js.Any => js.Any): Self = this.set("isInPool", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMPoolVarargs(value: T*): Self = this.set("mPool", js.Array(value :_*))
    
    @scala.inline
    def setMPool(value: js.Array[T]): Self = this.set("mPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPoolSize(value: Double): Self = this.set("mPoolSize", value.asInstanceOf[js.Any])
  }
}
