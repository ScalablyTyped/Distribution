package typings.antvComponent.libTypesMod

import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleCrosshairCfg
  extends StObject
     with CrosshairBaseCfg {
  
  /**
    * 圆心
    * @type {Point}
    */
  var center: Point
  
  /**
    * 结束角度
    * @type {number}
    */
  var endAngle: Double
  
  /**
    * 半径
    * @type {number}
    */
  var radius: Double
  
  /**
    * 开始角度
    * @type {number}
    */
  var startAngle: Double
}
object CircleCrosshairCfg {
  
  inline def apply(center: Point, container: IGroup, endAngle: Double, radius: Double, startAngle: Double): CircleCrosshairCfg = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleCrosshairCfg]
  }
  
  extension [Self <: CircleCrosshairCfg](x: Self) {
    
    inline def setCenter(value: Point): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
  }
}
