package typings.antdMobile.whiteSpacePropsTypeMod

import typings.antdMobile.antdMobileStrings.lg
import typings.antdMobile.antdMobileStrings.md
import typings.antdMobile.antdMobileStrings.sm
import typings.antdMobile.antdMobileStrings.xl
import typings.antdMobile.antdMobileStrings.xs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhiteSpacePropsType extends js.Object {
  
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.native
}
object WhiteSpacePropsType {
  
  @scala.inline
  def apply(): WhiteSpacePropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhiteSpacePropsType]
  }
  
  @scala.inline
  implicit class WhiteSpacePropsTypeOps[Self <: WhiteSpacePropsType] (val x: Self) extends AnyVal {
    
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
    def setSize(value: xs | sm | md | lg | xl): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
