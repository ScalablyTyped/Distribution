package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineCrosshairCfg extends CrosshairBaseCfg {
  
  /**
    * 结束点
    * @type {Point}
    */
  var end: Point = js.native
  
  /**
    * 起始点
    * @type {Point}
    */
  var start: Point = js.native
}
object LineCrosshairCfg {
  
  @scala.inline
  def apply(container: IGroup, end: Point, start: Point): LineCrosshairCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineCrosshairCfg]
  }
  
  @scala.inline
  implicit class LineCrosshairCfgMutableBuilder[Self <: LineCrosshairCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
