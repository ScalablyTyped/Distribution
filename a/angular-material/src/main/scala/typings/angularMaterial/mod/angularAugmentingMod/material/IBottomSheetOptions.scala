package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQuery
import typings.angular.mod.IController
import typings.angular.mod.IControllerConstructor
import typings.angular.mod.IScope
import typings.angular.mod.Injectable
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBottomSheetOptions extends js.Object {
  
  var bindToController: js.UndefOr[Boolean] = js.native
  
  var clickOutsideToClose: js.UndefOr[Boolean] = js.native
  
   // default: false
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.native
  
  var controllerAs: js.UndefOr[String] = js.native
  
   // default: false
  var disableBackdrop: js.UndefOr[Boolean] = js.native
  
   // default: root node
  var disableParentScroll: js.UndefOr[Boolean] = js.native
  
  var escapeToClose: js.UndefOr[Boolean] = js.native
  
  var locals: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var parent: js.UndefOr[
    (js.Function2[/* scope */ IScope, /* element */ JQuery, Element | JQuery]) | String | Element | JQuery
  ] = js.native
  
   // default: new child scope
  var preserveScope: js.UndefOr[Boolean] = js.native
  
  var resolve: js.UndefOr[ResolveObject] = js.native
  
  var scope: js.UndefOr[IScope] = js.native
  
  var template: js.UndefOr[String] = js.native
  
  var templateUrl: js.UndefOr[String] = js.native
}
object IBottomSheetOptions {
  
  @scala.inline
  def apply(): IBottomSheetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBottomSheetOptions]
  }
  
  @scala.inline
  implicit class IBottomSheetOptionsOps[Self <: IBottomSheetOptions] (val x: Self) extends AnyVal {
    
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
    def setBindToController(value: Boolean): Self = this.set("bindToController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindToController: Self = this.set("bindToController", js.undefined)
    
    @scala.inline
    def setClickOutsideToClose(value: Boolean): Self = this.set("clickOutsideToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickOutsideToClose: Self = this.set("clickOutsideToClose", js.undefined)
    
    @scala.inline
    def setControllerVarargs(value: (String | IControllerConstructor)*): Self = this.set("controller", js.Array(value :_*))
    
    @scala.inline
    def setControllerFunction1(value: /* repeated */ js.Any => Unit | IController): Self = this.set("controller", js.Any.fromFunction1(value))
    
    @scala.inline
    def setController(value: String | Injectable[IControllerConstructor]): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    
    @scala.inline
    def setControllerAs(value: String): Self = this.set("controllerAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControllerAs: Self = this.set("controllerAs", js.undefined)
    
    @scala.inline
    def setDisableBackdrop(value: Boolean): Self = this.set("disableBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableBackdrop: Self = this.set("disableBackdrop", js.undefined)
    
    @scala.inline
    def setDisableParentScroll(value: Boolean): Self = this.set("disableParentScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableParentScroll: Self = this.set("disableParentScroll", js.undefined)
    
    @scala.inline
    def setEscapeToClose(value: Boolean): Self = this.set("escapeToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeToClose: Self = this.set("escapeToClose", js.undefined)
    
    @scala.inline
    def setLocals(value: StringDictionary[js.Any]): Self = this.set("locals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocals: Self = this.set("locals", js.undefined)
    
    @scala.inline
    def setParentFunction2(value: (/* scope */ IScope, /* element */ JQuery) => Element | JQuery): Self = this.set("parent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParent(
      value: (js.Function2[/* scope */ IScope, /* element */ JQuery, Element | JQuery]) | String | Element | JQuery
    ): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setPreserveScope(value: Boolean): Self = this.set("preserveScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveScope: Self = this.set("preserveScope", js.undefined)
    
    @scala.inline
    def setResolve(value: ResolveObject): Self = this.set("resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    
    @scala.inline
    def setScope(value: IScope): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
  }
}
