package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWrapperOptions extends js.Object {
  var apiCheck: js.UndefOr[StringDictionary[js.Function]] = js.undefined
  var apiCheckFunction: js.UndefOr[String] = js.undefined
   //'throw' or 'warn
  var apiCheckInstance: js.UndefOr[js.Any] = js.undefined
  var apiCheckOptions: js.UndefOr[js.Object] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var overwriteOk: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var templateUrl: js.UndefOr[String] = js.undefined
  var types: js.UndefOr[js.Array[String]] = js.undefined
  var validateOptions: js.UndefOr[js.Function] = js.undefined
}

object IWrapperOptions {
  @scala.inline
  def apply(
    apiCheck: StringDictionary[js.Function] = null,
    apiCheckFunction: String = null,
    apiCheckInstance: js.Any = null,
    apiCheckOptions: js.Object = null,
    name: String = null,
    overwriteOk: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    templateUrl: String = null,
    types: js.Array[String] = null,
    validateOptions: js.Function = null
  ): IWrapperOptions = {
    val __obj = js.Dynamic.literal()
    if (apiCheck != null) __obj.updateDynamic("apiCheck")(apiCheck.asInstanceOf[js.Any])
    if (apiCheckFunction != null) __obj.updateDynamic("apiCheckFunction")(apiCheckFunction.asInstanceOf[js.Any])
    if (apiCheckInstance != null) __obj.updateDynamic("apiCheckInstance")(apiCheckInstance.asInstanceOf[js.Any])
    if (apiCheckOptions != null) __obj.updateDynamic("apiCheckOptions")(apiCheckOptions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(overwriteOk)) __obj.updateDynamic("overwriteOk")(overwriteOk.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (validateOptions != null) __obj.updateDynamic("validateOptions")(validateOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWrapperOptions]
  }
}

