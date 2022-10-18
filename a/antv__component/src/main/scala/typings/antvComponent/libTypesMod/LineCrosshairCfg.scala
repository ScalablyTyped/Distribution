package typings.antvComponent.libTypesMod

import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineCrosshairCfg
  extends StObject
     with CrosshairBaseCfg {
  
  /**
    * 结束点
    * @type {Point}
    */
  var end: Point
  
  /**
    * 起始点
    * @type {Point}
    */
  var start: Point
}
object LineCrosshairCfg {
  
  inline def apply(container: IGroup, end: Point, start: Point): LineCrosshairCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineCrosshairCfg]
  }
  
  extension [Self <: LineCrosshairCfg](x: Self) {
    
    inline def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
