package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.Point
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
  implicit class HtmlCrossHairCfgOps[Self <: HtmlCrossHairCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCrossHairTpl(value: String): Self = this.set("crossHairTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Point): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Point): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: CrosshairTextBaseCfg): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTpl(value: String): Self = this.set("textTpl", value.asInstanceOf[js.Any])
  }
}
