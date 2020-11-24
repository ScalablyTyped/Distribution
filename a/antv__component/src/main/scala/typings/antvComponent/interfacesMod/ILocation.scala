package typings.antvComponent.interfacesMod

import typings.antvComponent.typesMod.LocationCfg
import typings.antvComponent.typesMod.LocationType
import typings.antvComponent.typesMod.OffsetPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILocation[T /* <: LocationCfg */] extends js.Object {
  
  /**
    * 获取定位信息
    * @return {T} 定位信息
    */
  def getLocation(): T = js.native
  
  /**
    * 获取定位方式，point，points，region，circle，'none' 五种值
    * @return {LocationType} 定位方式
    */
  def getLocationType(): LocationType = js.native
  
  /**
    * 获取偏移信息
    * @return {OffsetPoint} 偏移信息
    */
  def getOffset(): OffsetPoint = js.native
  
  /**
    * 设置定位信息
    * @param {T} cfg 定位信息
    */
  def setLocation(cfg: T): js.Any = js.native
  
  /**
    * 设置偏移量
    * @param {number} offsetX 偏移 x
    * @param {number} offsetY 偏移 y
    */
  def setOffset(offsetX: Double, offsetY: Double): js.Any = js.native
}
object ILocation {
  
  @scala.inline
  def apply[T /* <: LocationCfg */](
    getLocation: () => T,
    getLocationType: () => LocationType,
    getOffset: () => OffsetPoint,
    setLocation: T => js.Any,
    setOffset: (Double, Double) => js.Any
  ): ILocation[T] = {
    val __obj = js.Dynamic.literal(getLocation = js.Any.fromFunction0(getLocation), getLocationType = js.Any.fromFunction0(getLocationType), getOffset = js.Any.fromFunction0(getOffset), setLocation = js.Any.fromFunction1(setLocation), setOffset = js.Any.fromFunction2(setOffset))
    __obj.asInstanceOf[ILocation[T]]
  }
  
  @scala.inline
  implicit class ILocationOps[Self <: ILocation[_], T /* <: LocationCfg */] (val x: Self with ILocation[T]) extends AnyVal {
    
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
    def setGetLocation(value: () => T): Self = this.set("getLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLocationType(value: () => LocationType): Self = this.set("getLocationType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOffset(value: () => OffsetPoint): Self = this.set("getOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetLocation(value: T => js.Any): Self = this.set("setLocation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOffset(value: (Double, Double) => js.Any): Self = this.set("setOffset", js.Any.fromFunction2(value))
  }
}
