package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IAugmentedJQuery
import typings.angular.mod.IScope
import typings.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModalSettings extends js.Object {
  
  /**
    * Set to false to disable animations on new modal/backdrop. Does not toggle animations for modals/backdrops that are already displayed.
    *
    * @default true
    */
  var animation: js.UndefOr[Boolean] = js.native
  
  /**
    * Appends the modal to a specific element.
    *
    * @default 'body'
    */
  var appendTo: js.UndefOr[IAugmentedJQuery] = js.native
  
  /**
    * Sets the `aria-describedby` property on the modal.
    * The string should be an id (without the leading '#') pointing to the element that describes your modal.
    * @type {string}
    * @memberOf IModalSettings
    */
  var ariaDescribedBy: js.UndefOr[String] = js.native
  
  /**
    * Sets the `aria-labelledby` property on the modal.
    * The string should be an id (without the leading '#') pointing to the element that labels your modal.
    * @type {string}
    * @memberOf IModalSettings
    */
  var ariaLabelledBy: js.UndefOr[String] = js.native
  
  /**
    * controls the presence of a backdrop
    * Allowed values:
    *   - true (default)
    *   - false (no backdrop)
    *   - 'static' backdrop is present but modal window is not closed when clicking outside of the modal window
    *
    * @default true
    */
  var backdrop: js.UndefOr[Boolean | String] = js.native
  
  /**
    * additional CSS class(es) to be added to a modal backdrop template
    */
  var backdropClass: js.UndefOr[String] = js.native
  
  /**
    * When used with controllerAs and set to true, it will bind the controller properties onto the $scope directly.
    *
    * @default false
    */
  var bindToController: js.UndefOr[Boolean] = js.native
  
  /**
    * A string reference to the component to be rendered that is registered with Angular's compiler. If using a directive, the directive must have `restrict: 'E'` and a template or templateUrl set.
    *
    * It supports these bindings:
    *   - `close` - A method that can be used to close a modal, passing a result. The result must be passed in this format: `{$value: myResult}`
    *   - `dismiss` - A method that can be used to dismiss a modal, passing a result. The result must be passed in this format: `{$value: myRejectedResult}`
    *   - `modalInstance` - The modal instance. This is the same `$uibModalInstance` injectable found when using `controller`.
    *   - `resolve` - An object of the modal resolve values. See [UI Router resolves] for details.
    */
  var component: js.UndefOr[String] = js.native
  
  /**
    * a controller for a modal instance - it can initialize scope used by modal.
    * A controller can be injected with `$modalInstance`
    * If value is an array, it must be in Inline Array Annotation format for injection (strings followed by factory method)
    */
  var controller: js.UndefOr[String | Function | (js.Array[String | Function])] = js.native
  
  /**
    *  an alternative to the controller-as syntax, matching the API of directive definitions.
    *  Requires the controller option to be provided as well
    */
  var controllerAs: js.UndefOr[String] = js.native
  
  /**
    * indicates whether the dialog should be closable by hitting the ESC key
    *
    * @default true
    */
  var keyboard: js.UndefOr[Boolean] = js.native
  
  /**
    * The  class added to the body element when the modal is opened.
    *
    * @default 'model-open'
    */
  var openedClass: js.UndefOr[String] = js.native
  
  /**
    * members that will be resolved and passed to the controller as locals; it is equivalent of the `resolve` property for AngularJS routes
    * If property value is an array, it must be in Inline Array Annotation format for injection (strings followed by factory method)
    */
  var resolve: js.UndefOr[StringDictionary[String | Function | (js.Array[String | Function]) | js.Object]] = js.native
  
  /**
    * a scope instance to be used for the modal's content (actually the $modal service is going to create a child scope of a provided scope).
    * Defaults to `$rootScope`.
    */
  var scope: js.UndefOr[IScope | IModalScope] = js.native
  
  /**
    * Optional suffix of modal window class. The value used is appended to the `modal-` class, i.e. a value of `sm` gives `modal-sm`.
    */
  var size: js.UndefOr[String] = js.native
  
  /**
    * inline template representing the modal's content
    */
  var template: js.UndefOr[String | js.Function0[String]] = js.native
  
  /**
    * a path to a template representing modal's content
    */
  var templateUrl: js.UndefOr[String | js.Function0[String]] = js.native
  
  /**
    * additional CSS class(es) to be added to a modal window template
    */
  var windowClass: js.UndefOr[String] = js.native
  
  /**
    * a path to a template overriding modal's window template
    */
  var windowTemplateUrl: js.UndefOr[String] = js.native
  
  /**
    * CSS class(es) to be added to the top modal window.
    */
  var windowTopClass: js.UndefOr[String] = js.native
}
object IModalSettings {
  
  @scala.inline
  def apply(): IModalSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModalSettings]
  }
  
  @scala.inline
  implicit class IModalSettingsOps[Self <: IModalSettings] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAppendTo(value: IAugmentedJQuery): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    
    @scala.inline
    def setAriaDescribedBy(value: String): Self = this.set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaDescribedBy: Self = this.set("ariaDescribedBy", js.undefined)
    
    @scala.inline
    def setAriaLabelledBy(value: String): Self = this.set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelledBy: Self = this.set("ariaLabelledBy", js.undefined)
    
    @scala.inline
    def setBackdrop(value: Boolean | String): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdrop: Self = this.set("backdrop", js.undefined)
    
    @scala.inline
    def setBackdropClass(value: String): Self = this.set("backdropClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdropClass: Self = this.set("backdropClass", js.undefined)
    
    @scala.inline
    def setBindToController(value: Boolean): Self = this.set("bindToController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindToController: Self = this.set("bindToController", js.undefined)
    
    @scala.inline
    def setComponent(value: String): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setControllerVarargs(value: (String | Function)*): Self = this.set("controller", js.Array(value :_*))
    
    @scala.inline
    def setController(value: String | Function | (js.Array[String | Function])): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    
    @scala.inline
    def setControllerAs(value: String): Self = this.set("controllerAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControllerAs: Self = this.set("controllerAs", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    
    @scala.inline
    def setOpenedClass(value: String): Self = this.set("openedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenedClass: Self = this.set("openedClass", js.undefined)
    
    @scala.inline
    def setResolve(value: StringDictionary[String | Function | (js.Array[String | Function]) | js.Object]): Self = this.set("resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    
    @scala.inline
    def setScope(value: IScope | IModalScope): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTemplateFunction0(value: () => String): Self = this.set("template", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTemplate(value: String | js.Function0[String]): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTemplateUrlFunction0(value: () => String): Self = this.set("templateUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTemplateUrl(value: String | js.Function0[String]): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
    
    @scala.inline
    def setWindowClass(value: String): Self = this.set("windowClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowClass: Self = this.set("windowClass", js.undefined)
    
    @scala.inline
    def setWindowTemplateUrl(value: String): Self = this.set("windowTemplateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowTemplateUrl: Self = this.set("windowTemplateUrl", js.undefined)
    
    @scala.inline
    def setWindowTopClass(value: String): Self = this.set("windowTopClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowTopClass: Self = this.set("windowTopClass", js.undefined)
  }
}
