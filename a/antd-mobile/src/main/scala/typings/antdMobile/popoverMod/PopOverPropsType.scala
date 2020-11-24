package typings.antdMobile.popoverMod

import typings.antdMobile.antdMobileStrings.bottom
import typings.antdMobile.antdMobileStrings.bottomLeft
import typings.antdMobile.antdMobileStrings.bottomRight
import typings.antdMobile.antdMobileStrings.left
import typings.antdMobile.antdMobileStrings.right
import typings.antdMobile.antdMobileStrings.top
import typings.antdMobile.antdMobileStrings.topLeft
import typings.antdMobile.antdMobileStrings.topRight
import typings.antdMobile.popoverPropsTypeMod.PopoverPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopOverPropsType extends PopoverPropsType {
  
  var mask: js.UndefOr[Boolean] = js.native
  
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  
  var placement: js.UndefOr[left | right | top | bottom | topLeft | topRight | bottomLeft | bottomRight] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object PopOverPropsType {
  
  @scala.inline
  def apply(): PopOverPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopOverPropsType]
  }
  
  @scala.inline
  implicit class PopOverPropsTypeOps[Self <: PopOverPropsType] (val x: Self) extends AnyVal {
    
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
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = this.set("onVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnVisibleChange: Self = this.set("onVisibleChange", js.undefined)
    
    @scala.inline
    def setPlacement(value: left | right | top | bottom | topLeft | topRight | bottomLeft | bottomRight): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
