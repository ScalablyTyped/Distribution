package typings.angularUiRouter.mod.angularAugmentingMod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHrefOptions extends js.Object {
  
  var absolute: js.UndefOr[Boolean] = js.native
  
  var inherit: js.UndefOr[Boolean] = js.native
  
  var lossy: js.UndefOr[Boolean] = js.native
  
  var relative: js.UndefOr[IState] = js.native
}
object IHrefOptions {
  
  @scala.inline
  def apply(): IHrefOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHrefOptions]
  }
  
  @scala.inline
  implicit class IHrefOptionsOps[Self <: IHrefOptions] (val x: Self) extends AnyVal {
    
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
    def setAbsolute(value: Boolean): Self = this.set("absolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsolute: Self = this.set("absolute", js.undefined)
    
    @scala.inline
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInherit: Self = this.set("inherit", js.undefined)
    
    @scala.inline
    def setLossy(value: Boolean): Self = this.set("lossy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLossy: Self = this.set("lossy", js.undefined)
    
    @scala.inline
    def setRelative(value: IState): Self = this.set("relative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
  }
}
