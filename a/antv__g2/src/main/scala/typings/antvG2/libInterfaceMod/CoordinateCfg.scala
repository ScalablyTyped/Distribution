package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordinateCfg extends StObject {
  
  /**
    * @title 结束弧度
    * @description 用于极坐标，配置结束弧度。
    */
  var endAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 内半径
    * @description 用于极坐标，极坐标内半径，0 -1 范围的数值。
    */
  var innerRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 半径
    * @description 用于极坐标，配置极坐标半径，0 - 1 范围的数值。
    */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 起始弧度
    * @description 用于极坐标，配置起始弧度。
    */
  var startAngle: js.UndefOr[Double] = js.undefined
}
object CoordinateCfg {
  
  inline def apply(): CoordinateCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoordinateCfg]
  }
  
  extension [Self <: CoordinateCfg](x: Self) {
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
  }
}
