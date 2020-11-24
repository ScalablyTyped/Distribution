package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapContext
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 获取当前地图中心的经纬度，返回 gcj02 坐标系的值，可以用于 my.openLocation
    *
    * @param options
    */
  def getCenterLocation(options: GetCenterLocationOptions): Unit = js.native
  
  /**
    * 将地图中心移动到当前定位点，需要配合 map 组件的 show-location 使用
    */
  def moveToLocation(): Unit = js.native
}
object MapContext {
  
  @scala.inline
  def apply(getCenterLocation: GetCenterLocationOptions => Unit, moveToLocation: () => Unit): MapContext = {
    val __obj = js.Dynamic.literal(getCenterLocation = js.Any.fromFunction1(getCenterLocation), moveToLocation = js.Any.fromFunction0(moveToLocation))
    __obj.asInstanceOf[MapContext]
  }
  
  @scala.inline
  implicit class MapContextOps[Self <: MapContext] (val x: Self) extends AnyVal {
    
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
    def setGetCenterLocation(value: GetCenterLocationOptions => Unit): Self = this.set("getCenterLocation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveToLocation(value: () => Unit): Self = this.set("moveToLocation", js.Any.fromFunction0(value))
  }
}
