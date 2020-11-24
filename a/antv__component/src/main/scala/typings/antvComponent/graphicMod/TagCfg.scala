package typings.antvComponent.graphicMod

import typings.antvComponent.typesMod.EnhancedTextCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagCfg extends EnhancedTextCfg {
  
  /** 组件的 id 标识 */
  var id: js.UndefOr[String] = js.native
  
  /** 组件的名字 */
  var name: js.UndefOr[String] = js.native
  
  /**
    * 文本标注位置 x
    */
  var x: Double = js.native
  
  /**
    * 文本标注位置 y
    */
  var y: Double = js.native
}
object TagCfg {
  
  @scala.inline
  def apply(content: String | Double, x: Double, y: Double): TagCfg = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagCfg]
  }
  
  @scala.inline
  implicit class TagCfgOps[Self <: TagCfg] (val x: Self) extends AnyVal {
    
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
