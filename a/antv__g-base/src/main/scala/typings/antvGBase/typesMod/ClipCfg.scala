package typings.antvGBase.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipCfg extends js.Object {
  
  /**
    * 图形的属性
    * @type {ShapeAttrs}
    */
  var attrs: ShapeAttrs = js.native
  
  /**
    * 作为 clip 的图形
    * @type {string}
    */
  var `type`: String = js.native
}
object ClipCfg {
  
  @scala.inline
  def apply(attrs: ShapeAttrs, `type`: String): ClipCfg = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipCfg]
  }
  
  @scala.inline
  implicit class ClipCfgOps[Self <: ClipCfg] (val x: Self) extends AnyVal {
    
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
    def setAttrs(value: ShapeAttrs): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
