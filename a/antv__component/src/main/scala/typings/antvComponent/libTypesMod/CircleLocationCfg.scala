package typings.antvComponent.libTypesMod

import typings.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleLocationCfg
  extends StObject
     with LocationCfg {
  
  /**
    * 圆心
    * @type {Point}
    */
  var center: js.UndefOr[Point] = js.undefined
  
  /**
    * 结束角度
    * @type {number}
    */
  var endAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * 半径
    * @type {number}
    */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
    * 起始角度
    * @type {number}
    */
  var startAngle: js.UndefOr[Double] = js.undefined
}
object CircleLocationCfg {
  
  inline def apply(): CircleLocationCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleLocationCfg]
  }
  
  extension [Self <: CircleLocationCfg](x: Self) {
    
    inline def setCenter(value: Point): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
  }
}
