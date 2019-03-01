package typings
package angularDashFormlyLib.AngularFormlyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 *
	 *
	 * see http://docs.angular-formly.com/docs/custom-templates#section-formlyconfig-settype-options
	 */
trait ITypeOptions extends js.Object {
  var apiCheck: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[angularLib.angularMod.Global.Function]
  ] = js.undefined
  var apiCheckFunction: js.UndefOr[java.lang.String] = js.undefined
   //'throw' or 'warn
  var apiCheckInstance: js.UndefOr[js.Any] = js.undefined
  var apiCheckOptions: js.UndefOr[js.Object] = js.undefined
  var controller: js.UndefOr[angularLib.angularMod.Global.Function | java.lang.String | js.Array[_]] = js.undefined
  var data: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var defaultOptions: js.UndefOr[IFieldConfigurationObject | angularLib.angularMod.Global.Function] = js.undefined
  var `extends`: js.UndefOr[java.lang.String] = js.undefined
  var link: js.UndefOr[
    angularLib.angularMod.angularNs.IDirectiveLinkFn[
      angularLib.angularMod.angularNs.IScope, 
      angularLib.JQLite, 
      angularLib.angularMod.angularNs.IAttributes, 
      angularLib.angularMod.angularNs.IController
    ]
  ] = js.undefined
  var name: java.lang.String
  var overwriteOk: js.UndefOr[scala.Boolean] = js.undefined
  var template: js.UndefOr[angularLib.angularMod.Global.Function | java.lang.String] = js.undefined
  var templateUrl: js.UndefOr[angularLib.angularMod.Global.Function | java.lang.String] = js.undefined
  var validateOptions: js.UndefOr[angularLib.angularMod.Global.Function] = js.undefined
  var wrapper: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object ITypeOptions {
  @scala.inline
  def apply(
    name: java.lang.String,
    apiCheck: org.scalablytyped.runtime.StringDictionary[angularLib.angularMod.Global.Function] = null,
    apiCheckFunction: java.lang.String = null,
    apiCheckInstance: js.Any = null,
    apiCheckOptions: js.Object = null,
    controller: angularLib.angularMod.Global.Function | java.lang.String | js.Array[_] = null,
    data: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    defaultOptions: IFieldConfigurationObject | angularLib.angularMod.Global.Function = null,
    `extends`: java.lang.String = null,
    link: angularLib.angularMod.angularNs.IDirectiveLinkFn[
      angularLib.angularMod.angularNs.IScope, 
      angularLib.JQLite, 
      angularLib.angularMod.angularNs.IAttributes, 
      angularLib.angularMod.angularNs.IController
    ] = null,
    overwriteOk: js.UndefOr[scala.Boolean] = js.undefined,
    template: angularLib.angularMod.Global.Function | java.lang.String = null,
    templateUrl: angularLib.angularMod.Global.Function | java.lang.String = null,
    validateOptions: angularLib.angularMod.Global.Function = null,
    wrapper: java.lang.String | js.Array[java.lang.String] = null
  ): ITypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (apiCheck != null) __obj.updateDynamic("apiCheck")(apiCheck)
    if (apiCheckFunction != null) __obj.updateDynamic("apiCheckFunction")(apiCheckFunction)
    if (apiCheckInstance != null) __obj.updateDynamic("apiCheckInstance")(apiCheckInstance)
    if (apiCheckOptions != null) __obj.updateDynamic("apiCheckOptions")(apiCheckOptions)
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`)
    if (link != null) __obj.updateDynamic("link")(link)
    if (!js.isUndefined(overwriteOk)) __obj.updateDynamic("overwriteOk")(overwriteOk)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (validateOptions != null) __obj.updateDynamic("validateOptions")(validateOptions)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITypeOptions]
  }
}

