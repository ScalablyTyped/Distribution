package typings.antdMobile.flexPropsTypeMod

import typings.antdMobile.antdMobileStrings.`column-reverse`
import typings.antdMobile.antdMobileStrings.`row-reverse`
import typings.antdMobile.antdMobileStrings.`wrap-reverse`
import typings.antdMobile.antdMobileStrings.around
import typings.antdMobile.antdMobileStrings.baseline
import typings.antdMobile.antdMobileStrings.between
import typings.antdMobile.antdMobileStrings.center
import typings.antdMobile.antdMobileStrings.column
import typings.antdMobile.antdMobileStrings.end
import typings.antdMobile.antdMobileStrings.nowrap
import typings.antdMobile.antdMobileStrings.row
import typings.antdMobile.antdMobileStrings.start
import typings.antdMobile.antdMobileStrings.stretch
import typings.antdMobile.antdMobileStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexPropsType extends js.Object {
  
  var align: js.UndefOr[start | center | end | baseline | stretch] = js.native
  
  var direction: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var justify: js.UndefOr[start | end | center | between | around] = js.native
  
  var wrap: js.UndefOr[nowrap | typings.antdMobile.antdMobileStrings.wrap | `wrap-reverse`] = js.native
}
object FlexPropsType {
  
  @scala.inline
  def apply(): FlexPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexPropsType]
  }
  
  @scala.inline
  implicit class FlexPropsTypeOps[Self <: FlexPropsType] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: start | center | end | baseline | stretch): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setDirection(value: row | `row-reverse` | column | `column-reverse`): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setJustify(value: start | end | center | between | around): Self = this.set("justify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustify: Self = this.set("justify", js.undefined)
    
    @scala.inline
    def setWrap(value: nowrap | wrap | `wrap-reverse`): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
}
