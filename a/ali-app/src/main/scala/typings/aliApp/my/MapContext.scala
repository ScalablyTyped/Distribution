package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapContext
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 获取当前地图中心的经纬度，返回 gcj02 坐标系的值，可以用于 my.openLocation
    *
    * @param options
    */
  def getCenterLocation(options: GetCenterLocationOptions): Unit
  
  /**
    * 将地图中心移动到当前定位点，需要配合 map 组件的 show-location 使用
    */
  def moveToLocation(): Unit
}
object MapContext {
  
  inline def apply(getCenterLocation: GetCenterLocationOptions => Unit, moveToLocation: () => Unit): MapContext = {
    val __obj = js.Dynamic.literal(getCenterLocation = js.Any.fromFunction1(getCenterLocation), moveToLocation = js.Any.fromFunction0(moveToLocation))
    __obj.asInstanceOf[MapContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapContext] (val x: Self) extends AnyVal {
    
    inline def setGetCenterLocation(value: GetCenterLocationOptions => Unit): Self = StObject.set(x, "getCenterLocation", js.Any.fromFunction1(value))
    
    inline def setMoveToLocation(value: () => Unit): Self = StObject.set(x, "moveToLocation", js.Any.fromFunction0(value))
  }
}
