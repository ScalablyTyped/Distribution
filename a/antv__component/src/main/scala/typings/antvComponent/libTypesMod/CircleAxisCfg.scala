package typings.antvComponent.libTypesMod

import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleAxisCfg
  extends StObject
     with AxisBaseCfg {
  
  /**
    * 中心点, x, y
    * @type {Point}
    */
  var center: Point
  
  /**
    * 结束弧度
    * @type {number}
    */
  var endAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * 半径
    * @type {number}
    */
  var radius: Double
  
  /**
    * 开始弧度
    * @type {number}
    */
  var startAngle: js.UndefOr[Double] = js.undefined
}
object CircleAxisCfg {
  
  inline def apply(center: Point, container: IGroup, radius: Double, ticks: js.Array[ListItem]): CircleAxisCfg = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleAxisCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CircleAxisCfg] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: Point): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
  }
}
