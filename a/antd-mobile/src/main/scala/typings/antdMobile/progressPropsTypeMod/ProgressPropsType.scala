package typings.antdMobile.progressPropsTypeMod

import typings.antdMobile.antdMobileStrings.fixed
import typings.antdMobile.antdMobileStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressPropsType extends js.Object {
  
  var appearTransition: js.UndefOr[Boolean] = js.native
  
  var percent: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[fixed | normal] = js.native
  
  var unfilled: js.UndefOr[Boolean] = js.native
}
object ProgressPropsType {
  
  @scala.inline
  def apply(): ProgressPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressPropsType]
  }
  
  @scala.inline
  implicit class ProgressPropsTypeOps[Self <: ProgressPropsType] (val x: Self) extends AnyVal {
    
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
    def setAppearTransition(value: Boolean): Self = this.set("appearTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppearTransition: Self = this.set("appearTransition", js.undefined)
    
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    
    @scala.inline
    def setPosition(value: fixed | normal): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setUnfilled(value: Boolean): Self = this.set("unfilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnfilled: Self = this.set("unfilled", js.undefined)
  }
}
