package typings.angularBreadcrumb.mod.angularAugmentingMod.ui

import typings.angularBreadcrumb.anon.Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IState extends js.Object {
  
  var ncyBreadcrumb: js.UndefOr[Label] = js.native
  
  var ncyBreadcrumbLabel: js.UndefOr[String] = js.native
  
  var ncyBreadcrumbLink: js.UndefOr[String] = js.native
}
object IState {
  
  @scala.inline
  def apply(): IState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IState]
  }
  
  @scala.inline
  implicit class IStateOps[Self <: IState] (val x: Self) extends AnyVal {
    
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
    def setNcyBreadcrumb(value: Label): Self = this.set("ncyBreadcrumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNcyBreadcrumb: Self = this.set("ncyBreadcrumb", js.undefined)
    
    @scala.inline
    def setNcyBreadcrumbLabel(value: String): Self = this.set("ncyBreadcrumbLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNcyBreadcrumbLabel: Self = this.set("ncyBreadcrumbLabel", js.undefined)
    
    @scala.inline
    def setNcyBreadcrumbLink(value: String): Self = this.set("ncyBreadcrumbLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNcyBreadcrumbLink: Self = this.set("ncyBreadcrumbLink", js.undefined)
  }
}
