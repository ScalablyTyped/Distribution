package typings.angularDashFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQLite
import typings.angular.angularMod.IAttributes
import typings.angular.angularMod.IController
import typings.angular.angularMod.IDirectiveLinkFn
import typings.angular.angularMod.IScope
import typings.angular.angularMod.ITranscludeFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 *
	 *
	 * see http://docs.angular-formly.com/docs/custom-templates#section-formlyconfig-settype-options
	 */
trait ITypeOptions extends js.Object {
  var apiCheck: js.UndefOr[StringDictionary[js.Function]] = js.undefined
  var apiCheckFunction: js.UndefOr[String] = js.undefined
   //'throw' or 'warn
  var apiCheckInstance: js.UndefOr[js.Any] = js.undefined
  var apiCheckOptions: js.UndefOr[js.Object] = js.undefined
  var controller: js.UndefOr[js.Function | String | js.Array[_]] = js.undefined
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var defaultOptions: js.UndefOr[IFieldConfigurationObject | js.Function] = js.undefined
  var `extends`: js.UndefOr[String] = js.undefined
  var link: js.UndefOr[IDirectiveLinkFn[IScope, JQLite, IAttributes, IController]] = js.undefined
  var name: String
  var overwriteOk: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[js.Function | String] = js.undefined
  var templateUrl: js.UndefOr[js.Function | String] = js.undefined
  var validateOptions: js.UndefOr[js.Function] = js.undefined
  var wrapper: js.UndefOr[String | js.Array[String]] = js.undefined
}

object ITypeOptions {
  @scala.inline
  def apply(
    name: String,
    apiCheck: StringDictionary[js.Function] = null,
    apiCheckFunction: String = null,
    apiCheckInstance: js.Any = null,
    apiCheckOptions: js.Object = null,
    controller: js.Function | String | js.Array[_] = null,
    data: StringDictionary[js.Any] = null,
    defaultOptions: IFieldConfigurationObject | js.Function = null,
    `extends`: String = null,
    link: (IScope, JQLite, IAttributes, /* controller */ js.UndefOr[IController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Unit = null,
    overwriteOk: js.UndefOr[Boolean] = js.undefined,
    template: js.Function | String = null,
    templateUrl: js.Function | String = null,
    validateOptions: js.Function = null,
    wrapper: String | js.Array[String] = null
  ): ITypeOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (apiCheck != null) __obj.updateDynamic("apiCheck")(apiCheck.asInstanceOf[js.Any])
    if (apiCheckFunction != null) __obj.updateDynamic("apiCheckFunction")(apiCheckFunction.asInstanceOf[js.Any])
    if (apiCheckInstance != null) __obj.updateDynamic("apiCheckInstance")(apiCheckInstance.asInstanceOf[js.Any])
    if (apiCheckOptions != null) __obj.updateDynamic("apiCheckOptions")(apiCheckOptions.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(js.Any.fromFunction5(link))
    if (!js.isUndefined(overwriteOk)) __obj.updateDynamic("overwriteOk")(overwriteOk.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (validateOptions != null) __obj.updateDynamic("validateOptions")(validateOptions.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITypeOptions]
  }
}

