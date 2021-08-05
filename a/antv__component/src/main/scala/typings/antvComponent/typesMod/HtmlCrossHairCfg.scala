package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlCrossHairCfg
  extends StObject
     with HtmlComponentCfg {
  
  /**
    * crosshair 的模板
    */
  var crossHairTpl: String
  
  /**
    * 结束位置
    */
  var end: Point
  
  /**
    * 起始位置
    */
  var start: Point
  
  /**
    * 文本
    */
  var text: CrosshairTextBaseCfg
  
  /**
    * 文本的模板
    */
  var textTpl: String
}
object HtmlCrossHairCfg {
  
  inline def apply(crossHairTpl: String, end: Point, start: Point, text: CrosshairTextBaseCfg, textTpl: String): HtmlCrossHairCfg = {
    val __obj = js.Dynamic.literal(crossHairTpl = crossHairTpl.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textTpl = textTpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlCrossHairCfg]
  }
  
  extension [Self <: HtmlCrossHairCfg](x: Self) {
    
    inline def setCrossHairTpl(value: String): Self = StObject.set(x, "crossHairTpl", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setText(value: CrosshairTextBaseCfg): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextTpl(value: String): Self = StObject.set(x, "textTpl", value.asInstanceOf[js.Any])
  }
}
