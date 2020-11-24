package typings.apolloServerCaching.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxSize[V] extends js.Object {
  
  var maxSize: js.UndefOr[Double] = js.native
  
  var onDispose: js.UndefOr[js.Function2[/* key */ String, /* value */ V, Unit]] = js.native
  
  var sizeCalculator: js.UndefOr[js.Function2[/* value */ V, /* key */ String, Double]] = js.native
}
object MaxSize {
  
  @scala.inline
  def apply[V](): MaxSize[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxSize[V]]
  }
  
  @scala.inline
  implicit class MaxSizeOps[Self <: MaxSize[_], V] (val x: Self with MaxSize[V]) extends AnyVal {
    
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
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setOnDispose(value: (/* key */ String, /* value */ V) => Unit): Self = this.set("onDispose", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDispose: Self = this.set("onDispose", js.undefined)
    
    @scala.inline
    def setSizeCalculator(value: (/* value */ V, /* key */ String) => Double): Self = this.set("sizeCalculator", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSizeCalculator: Self = this.set("sizeCalculator", js.undefined)
  }
}
