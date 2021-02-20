package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQuery
import typings.angular.mod.IController
import typings.angular.mod.IControllerConstructor
import typings.angular.mod.IScope
import typings.angular.mod.Injectable
import typings.angularMaterial.angularMaterialBooleans.`false`
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToastOptions extends StObject {
  
  var autoWrap: js.UndefOr[Boolean] = js.native
  
  var bindToController: js.UndefOr[Boolean] = js.native
  
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.native
  
  var controllerAs: js.UndefOr[String] = js.native
  
  // default: false
  var hideDelay: js.UndefOr[Double | `false`] = js.native
  
  var locals: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var parent: js.UndefOr[String | Element | JQuery] = js.native
  
  // default (ms): 3000
  var position: js.UndefOr[String] = js.native
  
  // default: new child scope
  var preserveScope: js.UndefOr[Boolean] = js.native
  
  // default: false
  var resolve: js.UndefOr[ResolveObject] = js.native
  
  var scope: js.UndefOr[IScope] = js.native
  
  var template: js.UndefOr[String] = js.native
  
  var templateUrl: js.UndefOr[String] = js.native
  
  // any combination of 'bottom'/'left'/'top'/'right'/'fit'; default: 'bottom left'
  var toastClass: js.UndefOr[String] = js.native
}
object IToastOptions {
  
  @scala.inline
  def apply(): IToastOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToastOptions]
  }
  
  @scala.inline
  implicit class IToastOptionsMutableBuilder[Self <: IToastOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoWrap(value: Boolean): Self = StObject.set(x, "autoWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoWrapUndefined: Self = StObject.set(x, "autoWrap", js.undefined)
    
    @scala.inline
    def setBindToController(value: Boolean): Self = StObject.set(x, "bindToController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindToControllerUndefined: Self = StObject.set(x, "bindToController", js.undefined)
    
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
    def setHideDelay(value: Double | `false`): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
    
    @scala.inline
    def setLocals(value: StringDictionary[js.Any]): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
    
    @scala.inline
    def setParent(value: String | Element | JQuery): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
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
    
    @scala.inline
    def setToastClass(value: String): Self = StObject.set(x, "toastClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToastClassUndefined: Self = StObject.set(x, "toastClass", js.undefined)
  }
}
