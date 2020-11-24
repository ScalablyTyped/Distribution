package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrosshairTextCfg extends CrosshairTextBaseCfg {
  
  /**
    * 是否自动旋转
    * @type {boolean}
    */
  var autoRotate: js.UndefOr[Boolean] = js.native
  
  /**
    * 文本的配置项
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.native
}
object CrosshairTextCfg {
  
  @scala.inline
  def apply(): CrosshairTextCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrosshairTextCfg]
  }
  
  @scala.inline
  implicit class CrosshairTextCfgOps[Self <: CrosshairTextCfg] (val x: Self) extends AnyVal {
    
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
    def setAutoRotate(value: Boolean): Self = this.set("autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRotate: Self = this.set("autoRotate", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
