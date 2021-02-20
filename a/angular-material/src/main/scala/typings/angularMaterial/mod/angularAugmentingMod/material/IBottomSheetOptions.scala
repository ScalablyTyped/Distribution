package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQuery
import typings.angular.mod.IController
import typings.angular.mod.IControllerConstructor
import typings.angular.mod.IScope
import typings.angular.mod.Injectable
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBottomSheetOptions extends StObject {
  
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
  implicit class IBottomSheetOptionsMutableBuilder[Self <: IBottomSheetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindToController(value: Boolean): Self = StObject.set(x, "bindToController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindToControllerUndefined: Self = StObject.set(x, "bindToController", js.undefined)
    
    @scala.inline
    def setClickOutsideToClose(value: Boolean): Self = StObject.set(x, "clickOutsideToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickOutsideToCloseUndefined: Self = StObject.set(x, "clickOutsideToClose", js.undefined)
    
    @scala.inline
    def setController(value: String | Injectable[IControllerConstructor]): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
    
    @scala.inline
    def setControllerFunction1(value: /* repeated */ js.Any => Unit | IController): Self = StObject.set(x, "controller", js.Any.fromFunction1(value))
    
    @scala.inline
    def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    @scala.inline
    def setControllerVarargs(value: (String | IControllerConstructor)*): Self = StObject.set(x, "controller", js.Array(value :_*))
    
    @scala.inline
    def setDisableBackdrop(value: Boolean): Self = StObject.set(x, "disableBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableBackdropUndefined: Self = StObject.set(x, "disableBackdrop", js.undefined)
    
    @scala.inline
    def setDisableParentScroll(value: Boolean): Self = StObject.set(x, "disableParentScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableParentScrollUndefined: Self = StObject.set(x, "disableParentScroll", js.undefined)
    
    @scala.inline
    def setEscapeToClose(value: Boolean): Self = StObject.set(x, "escapeToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapeToCloseUndefined: Self = StObject.set(x, "escapeToClose", js.undefined)
    
    @scala.inline
    def setLocals(value: StringDictionary[js.Any]): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
    
    @scala.inline
    def setParent(
      value: (js.Function2[/* scope */ IScope, /* element */ JQuery, Element | JQuery]) | String | Element | JQuery
    ): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFunction2(value: (/* scope */ IScope, /* element */ JQuery) => Element | JQuery): Self = StObject.set(x, "parent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPreserveScope(value: Boolean): Self = StObject.set(x, "preserveScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveScopeUndefined: Self = StObject.set(x, "preserveScope", js.undefined)
    
    @scala.inline
    def setResolve(value: ResolveObject): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    @scala.inline
    def setScope(value: IScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
  }
}
