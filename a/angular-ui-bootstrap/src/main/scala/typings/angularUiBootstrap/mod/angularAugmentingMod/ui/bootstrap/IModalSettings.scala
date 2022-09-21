package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IAugmentedJQuery
import typings.angular.mod.IScope
import typings.angular.mod.global.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModalSettings extends StObject {
  
  /**
    * Set to false to disable animations on new modal/backdrop. Does not toggle animations for modals/backdrops that are already displayed.
    *
    * @default true
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Appends the modal to a specific element.
    *
    * @default 'body'
    */
  var appendTo: js.UndefOr[IAugmentedJQuery] = js.undefined
  
  /**
    * Sets the `aria-describedby` property on the modal.
    * The string should be an id (without the leading '#') pointing to the element that describes your modal.
    * @type {string}
    * @memberOf IModalSettings
    */
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the `aria-labelledby` property on the modal.
    * The string should be an id (without the leading '#') pointing to the element that labels your modal.
    * @type {string}
    * @memberOf IModalSettings
    */
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  
  /**
    * controls the presence of a backdrop
    * Allowed values:
    *   - true (default)
    *   - false (no backdrop)
    *   - 'static' backdrop is present but modal window is not closed when clicking outside of the modal window
    *
    * @default true
    */
  var backdrop: js.UndefOr[Boolean | String] = js.undefined
  
  /**
    * additional CSS class(es) to be added to a modal backdrop template
    */
  var backdropClass: js.UndefOr[String] = js.undefined
  
  /**
    * When used with controllerAs and set to true, it will bind the controller properties onto the $scope directly.
    *
    * @default false
    */
  var bindToController: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A string reference to the component to be rendered that is registered with Angular's compiler. If using a directive, the directive must have `restrict: 'E'` and a template or templateUrl set.
    *
    * It supports these bindings:
    *   - `close` - A method that can be used to close a modal, passing a result. The result must be passed in this format: `{$value: myResult}`
    *   - `dismiss` - A method that can be used to dismiss a modal, passing a result. The result must be passed in this format: `{$value: myRejectedResult}`
    *   - `modalInstance` - The modal instance. This is the same `$uibModalInstance` injectable found when using `controller`.
    *   - `resolve` - An object of the modal resolve values. See [UI Router resolves] for details.
    */
  var component: js.UndefOr[String] = js.undefined
  
  /**
    * a controller for a modal instance - it can initialize scope used by modal.
    * A controller can be injected with `$modalInstance`
    * If value is an array, it must be in Inline Array Annotation format for injection (strings followed by factory method)
    */
  var controller: js.UndefOr[String | Function | (js.Array[String | Function])] = js.undefined
  
  /**
    *  an alternative to the controller-as syntax, matching the API of directive definitions.
    *  Requires the controller option to be provided as well
    */
  var controllerAs: js.UndefOr[String] = js.undefined
  
  /**
    * indicates whether the dialog should be closable by hitting the ESC key
    *
    * @default true
    */
  var keyboard: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The  class added to the body element when the modal is opened.
    *
    * @default 'model-open'
    */
  var openedClass: js.UndefOr[String] = js.undefined
  
  /**
    * members that will be resolved and passed to the controller as locals; it is equivalent of the `resolve` property for AngularJS routes
    * If property value is an array, it must be in Inline Array Annotation format for injection (strings followed by factory method)
    */
  var resolve: js.UndefOr[StringDictionary[String | Function | (js.Array[String | Function]) | js.Object]] = js.undefined
  
  /**
    * a scope instance to be used for the modal's content (actually the $modal service is going to create a child scope of a provided scope).
    * Defaults to `$rootScope`.
    */
  var scope: js.UndefOr[IScope | IModalScope] = js.undefined
  
  /**
    * Optional suffix of modal window class. The value used is appended to the `modal-` class, i.e. a value of `sm` gives `modal-sm`.
    */
  var size: js.UndefOr[String] = js.undefined
  
  /**
    * inline template representing the modal's content
    */
  var template: js.UndefOr[String | js.Function0[String]] = js.undefined
  
  /**
    * a path to a template representing modal's content
    */
  var templateUrl: js.UndefOr[String | js.Function0[String]] = js.undefined
  
  /**
    * additional CSS class(es) to be added to a modal window template
    */
  var windowClass: js.UndefOr[String] = js.undefined
  
  /**
    * a path to a template overriding modal's window template
    */
  var windowTemplateUrl: js.UndefOr[String] = js.undefined
  
  /**
    * CSS class(es) to be added to the top modal window.
    */
  var windowTopClass: js.UndefOr[String] = js.undefined
}
object IModalSettings {
  
  inline def apply(): IModalSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModalSettings]
  }
  
  extension [Self <: IModalSettings](x: Self) {
    
    inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAppendTo(value: IAugmentedJQuery): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
    
    inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
    
    inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
    
    inline def setBackdrop(value: Boolean | String): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    inline def setBackdropClass(value: String): Self = StObject.set(x, "backdropClass", value.asInstanceOf[js.Any])
    
    inline def setBackdropClassUndefined: Self = StObject.set(x, "backdropClass", js.undefined)
    
    inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
    
    inline def setBindToController(value: Boolean): Self = StObject.set(x, "bindToController", value.asInstanceOf[js.Any])
    
    inline def setBindToControllerUndefined: Self = StObject.set(x, "bindToController", js.undefined)
    
    inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setController(value: String | Function | (js.Array[String | Function])): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
    
    inline def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setControllerVarargs(value: (String | Function)*): Self = StObject.set(x, "controller", js.Array(value*))
    
    inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    inline def setOpenedClass(value: String): Self = StObject.set(x, "openedClass", value.asInstanceOf[js.Any])
    
    inline def setOpenedClassUndefined: Self = StObject.set(x, "openedClass", js.undefined)
    
    inline def setResolve(value: StringDictionary[String | Function | (js.Array[String | Function]) | js.Object]): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    inline def setScope(value: IScope | IModalScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTemplate(value: String | js.Function0[String]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction0(value: () => String): Self = StObject.set(x, "template", js.Any.fromFunction0(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTemplateUrl(value: String | js.Function0[String]): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    inline def setTemplateUrlFunction0(value: () => String): Self = StObject.set(x, "templateUrl", js.Any.fromFunction0(value))
    
    inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    
    inline def setWindowClass(value: String): Self = StObject.set(x, "windowClass", value.asInstanceOf[js.Any])
    
    inline def setWindowClassUndefined: Self = StObject.set(x, "windowClass", js.undefined)
    
    inline def setWindowTemplateUrl(value: String): Self = StObject.set(x, "windowTemplateUrl", value.asInstanceOf[js.Any])
    
    inline def setWindowTemplateUrlUndefined: Self = StObject.set(x, "windowTemplateUrl", js.undefined)
    
    inline def setWindowTopClass(value: String): Self = StObject.set(x, "windowTopClass", value.asInstanceOf[js.Any])
    
    inline def setWindowTopClassUndefined: Self = StObject.set(x, "windowTopClass", js.undefined)
  }
}
