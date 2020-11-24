package typings.antvComponent.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrosshairTextBaseCfg extends js.Object {
  
  /**
    * 文本内容
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * 距离线的距离
    * @type {number}
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * 文本位置，只支持 start， end
    * @type {string}
    */
  var position: js.UndefOr[String] = js.native
}
object CrosshairTextBaseCfg {
  
  @scala.inline
  def apply(): CrosshairTextBaseCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrosshairTextBaseCfg]
  }
  
  @scala.inline
  implicit class CrosshairTextBaseCfgOps[Self <: CrosshairTextBaseCfg] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
