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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IToastOptions extends StObject {
  
  var autoWrap: js.UndefOr[Boolean] = js.undefined
  
  var bindToController: js.UndefOr[Boolean] = js.undefined
  
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.undefined
  
  var controllerAs: js.UndefOr[String] = js.undefined
  
  // default: false
  var hideDelay: js.UndefOr[Double | `false`] = js.undefined
  
  var locals: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var parent: js.UndefOr[String | Element | JQuery] = js.undefined
  
  // default (ms): 3000
  var position: js.UndefOr[String] = js.undefined
  
  // default: new child scope
  var preserveScope: js.UndefOr[Boolean] = js.undefined
  
  // default: false
  var resolve: js.UndefOr[ResolveObject] = js.undefined
  
  var scope: js.UndefOr[IScope] = js.undefined
  
  var template: js.UndefOr[String] = js.undefined
  
  var templateUrl: js.UndefOr[String] = js.undefined
  
  // any combination of 'bottom'/'left'/'top'/'right'/'fit'; default: 'bottom left'
  var toastClass: js.UndefOr[String] = js.undefined
}
object IToastOptions {
  
  inline def apply(): IToastOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToastOptions]
  }
  
  extension [Self <: IToastOptions](x: Self) {
    
    inline def setAutoWrap(value: Boolean): Self = StObject.set(x, "autoWrap", value.asInstanceOf[js.Any])
    
    inline def setAutoWrapUndefined: Self = StObject.set(x, "autoWrap", js.undefined)
    
    inline def setBindToController(value: Boolean): Self = StObject.set(x, "bindToController", value.asInstanceOf[js.Any])
    
    inline def setBindToControllerUndefined: Self = StObject.set(x, "bindToController", js.undefined)
    
    inline def setController(value: String | Injectable[IControllerConstructor]): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
    
    inline def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
    
    inline def setControllerFunction1(value: /* repeated */ js.Any => Unit | IController): Self = StObject.set(x, "controller", js.Any.fromFunction1(value))
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setControllerVarargs(value: (String | IControllerConstructor)*): Self = StObject.set(x, "controller", js.Array(value :_*))
    
    inline def setHideDelay(value: Double | `false`): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
    
    inline def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
    
    inline def setLocals(value: StringDictionary[js.Any]): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
    
    inline def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
    
    inline def setParent(value: String | Element | JQuery): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPreserveScope(value: Boolean): Self = StObject.set(x, "preserveScope", value.asInstanceOf[js.Any])
    
    inline def setPreserveScopeUndefined: Self = StObject.set(x, "preserveScope", js.undefined)
    
    inline def setResolve(value: ResolveObject): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    inline def setScope(value: IScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    
    inline def setToastClass(value: String): Self = StObject.set(x, "toastClass", value.asInstanceOf[js.Any])
    
    inline def setToastClassUndefined: Self = StObject.set(x, "toastClass", js.undefined)
  }
}
