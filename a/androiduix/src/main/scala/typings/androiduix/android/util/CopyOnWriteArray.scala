package typings.androiduix.android.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyOnWriteArray[T] extends js.Object {
  
  def add(items: T*): Unit = js.native
  
  def addAll(array: CopyOnWriteArray[T]): Unit = js.native
  
  def end(): Unit = js.native
  
  /* private */ def getArray(): js.Any = js.native
  
  var mAccess: js.Any = js.native
  
  var mData: js.Any = js.native
  
  var mDataCopy: js.Any = js.native
  
  var mStart: js.Any = js.native
  
  def remove(item: T): Unit = js.native
  
  def size(): Double = js.native
  
  def start(): js.Array[T] = js.native
}
object CopyOnWriteArray {
  
  @scala.inline
  def apply[T](
    add: /* repeated */ T => Unit,
    addAll: CopyOnWriteArray[T] => Unit,
    end: () => Unit,
    getArray: () => js.Any,
    mAccess: js.Any,
    mData: js.Any,
    mDataCopy: js.Any,
    mStart: js.Any,
    remove: T => Unit,
    size: () => Double,
    start: () => js.Array[T]
  ): CopyOnWriteArray[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAll = js.Any.fromFunction1(addAll), end = js.Any.fromFunction0(end), getArray = js.Any.fromFunction0(getArray), mAccess = mAccess.asInstanceOf[js.Any], mData = mData.asInstanceOf[js.Any], mDataCopy = mDataCopy.asInstanceOf[js.Any], mStart = mStart.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), size = js.Any.fromFunction0(size), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[CopyOnWriteArray[T]]
  }
  
  @scala.inline
  implicit class CopyOnWriteArrayOps[Self <: CopyOnWriteArray[_], T] (val x: Self with CopyOnWriteArray[T]) extends AnyVal {
    
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
    def setAdd(value: /* repeated */ T => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddAll(value: CopyOnWriteArray[T] => Unit): Self = this.set("addAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetArray(value: () => js.Any): Self = this.set("getArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMAccess(value: js.Any): Self = this.set("mAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMData(value: js.Any): Self = this.set("mData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDataCopy(value: js.Any): Self = this.set("mDataCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMStart(value: js.Any): Self = this.set("mStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: T => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => js.Array[T]): Self = this.set("start", js.Any.fromFunction0(value))
  }
}
