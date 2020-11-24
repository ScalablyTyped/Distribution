package typings.amapJsApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayBounds extends js.Object {
  
  var bounds: js.Array[LngLat] = js.native
  
  /**
    * 判断传入的点是否在ArrayBounds内
    * @param point 目标点
    */
  def contains(point: LocationValue): Boolean = js.native
  
  def getCenter(): LngLat = js.native
  
  // internal
  def toBounds(): Bounds = js.native
}
object ArrayBounds {
  
  @scala.inline
  def apply(
    bounds: js.Array[LngLat],
    contains: LocationValue => Boolean,
    getCenter: () => LngLat,
    toBounds: () => Bounds
  ): ArrayBounds = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), getCenter = js.Any.fromFunction0(getCenter), toBounds = js.Any.fromFunction0(toBounds))
    __obj.asInstanceOf[ArrayBounds]
  }
  
  @scala.inline
  implicit class ArrayBoundsOps[Self <: ArrayBounds] (val x: Self) extends AnyVal {
    
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
    def setBoundsVarargs(value: LngLat*): Self = this.set("bounds", js.Array(value :_*))
    
    @scala.inline
    def setBounds(value: js.Array[LngLat]): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContains(value: LocationValue => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCenter(value: () => LngLat): Self = this.set("getCenter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToBounds(value: () => Bounds): Self = this.set("toBounds", js.Any.fromFunction0(value))
  }
}
