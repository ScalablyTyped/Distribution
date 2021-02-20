package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlCrossHairCfg extends HtmlComponentCfg {
  
  /**
    * crosshair 的模板
    */
  var crossHairTpl: String = js.native
  
  /**
    * 结束位置
    */
  var end: Point = js.native
  
  /**
    * 起始位置
    */
  var start: Point = js.native
  
  /**
    * 文本
    */
  var text: CrosshairTextBaseCfg = js.native
  
  /**
    * 文本的模板
    */
  var textTpl: String = js.native
}
object HtmlCrossHairCfg {
  
  @scala.inline
  def apply(crossHairTpl: String, end: Point, start: Point, text: CrosshairTextBaseCfg, textTpl: String): HtmlCrossHairCfg = {
    val __obj = js.Dynamic.literal(crossHairTpl = crossHairTpl.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textTpl = textTpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlCrossHairCfg]
  }
  
  @scala.inline
  implicit class HtmlCrossHairCfgMutableBuilder[Self <: HtmlCrossHairCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossHairTpl(value: String): Self = StObject.set(x, "crossHairTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: CrosshairTextBaseCfg): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTpl(value: String): Self = StObject.set(x, "textTpl", value.asInstanceOf[js.Any])
  }
}
