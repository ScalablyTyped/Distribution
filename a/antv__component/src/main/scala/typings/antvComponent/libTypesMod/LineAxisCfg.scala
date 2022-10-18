package typings.antvComponent.libTypesMod

import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineAxisCfg
  extends StObject
     with AxisBaseCfg {
  
  /**
    * 坐标轴的结束点
    * @type {Point}
    */
  var end: Point
  
  /**
    * 坐标轴的起始点
    * @type {Point}
    */
  var start: Point
}
object LineAxisCfg {
  
  inline def apply(container: IGroup, end: Point, start: Point, ticks: js.Array[ListItem]): LineAxisCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineAxisCfg]
  }
  
  extension [Self <: LineAxisCfg](x: Self) {
    
    inline def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
