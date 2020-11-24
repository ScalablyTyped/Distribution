package typings.antvGBase.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementCfg extends js.Object {
  
  /**
    * 是否可以拾取
    * @type {Boolean}
    */
  var capture: js.UndefOr[Boolean] = js.native
  
  /**
    * 元素 id,可以为空
    * @type {String}
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * 是否可见
    * @type {Boolean}
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /**
    * 层次索引，决定绘制的先后顺序
    * @type {Number}
    */
  var zIndex: js.UndefOr[Double] = js.native
}
object ElementCfg {
  
  @scala.inline
  def apply(): ElementCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementCfg]
  }
  
  @scala.inline
  implicit class ElementCfgOps[Self <: ElementCfg] (val x: Self) extends AnyVal {
    
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
    def setCapture(value: Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
