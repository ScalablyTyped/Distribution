package typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.ui.bootstrap

import org.scalablytyped.runtime.StringDictionary
import typings.angular.angularMod.Global.Function
import typings.angular.angularMod.IAugmentedJQuery
import typings.angular.angularMod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModalSettings extends js.Object {
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
  @scala.inline
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    appendTo: IAugmentedJQuery = null,
    ariaDescribedBy: String = null,
    ariaLabelledBy: String = null,
    backdrop: Boolean | String = null,
    backdropClass: String = null,
    bindToController: js.UndefOr[Boolean] = js.undefined,
    component: String = null,
    controller: String | Function | (js.Array[String | Function]) = null,
    controllerAs: String = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    openedClass: String = null,
    resolve: StringDictionary[String | Function | (js.Array[String | Function]) | js.Object] = null,
    scope: IScope | IModalScope = null,
    size: String = null,
    template: String | js.Function0[String] = null,
    templateUrl: String | js.Function0[String] = null,
    windowClass: String = null,
    windowTemplateUrl: String = null,
    windowTopClass: String = null
  ): IModalSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy)
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy)
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (backdropClass != null) __obj.updateDynamic("backdropClass")(backdropClass)
    if (!js.isUndefined(bindToController)) __obj.updateDynamic("bindToController")(bindToController)
    if (component != null) __obj.updateDynamic("component")(component)
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (openedClass != null) __obj.updateDynamic("openedClass")(openedClass)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (windowClass != null) __obj.updateDynamic("windowClass")(windowClass)
    if (windowTemplateUrl != null) __obj.updateDynamic("windowTemplateUrl")(windowTemplateUrl)
    if (windowTopClass != null) __obj.updateDynamic("windowTopClass")(windowTopClass)
    __obj.asInstanceOf[IModalSettings]
  }
}

