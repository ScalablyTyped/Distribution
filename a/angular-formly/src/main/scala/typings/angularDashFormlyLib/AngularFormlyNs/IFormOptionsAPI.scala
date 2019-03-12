package typings
package angularDashFormlyLib.AngularFormlyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormOptionsAPI extends js.Object {
  var data: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var fieldTransform: js.UndefOr[js.Function | js.Array[js.Function]] = js.undefined
  var formState: js.UndefOr[js.Object] = js.undefined
  var removeChromeAutoComplete: js.UndefOr[scala.Boolean] = js.undefined
  var resetModel: js.UndefOr[js.Function] = js.undefined
  var templateManipulators: js.UndefOr[ITemplateManipulators] = js.undefined
  var updateInitialValue: js.UndefOr[js.Function] = js.undefined
  var wrapper: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object IFormOptionsAPI {
  @scala.inline
  def apply(
    data: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    fieldTransform: js.Function | js.Array[js.Function] = null,
    formState: js.Object = null,
    removeChromeAutoComplete: js.UndefOr[scala.Boolean] = js.undefined,
    resetModel: js.Function = null,
    templateManipulators: ITemplateManipulators = null,
    updateInitialValue: js.Function = null,
    wrapper: java.lang.String | js.Array[java.lang.String] = null
  ): IFormOptionsAPI = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (fieldTransform != null) __obj.updateDynamic("fieldTransform")(fieldTransform.asInstanceOf[js.Any])
    if (formState != null) __obj.updateDynamic("formState")(formState)
    if (!js.isUndefined(removeChromeAutoComplete)) __obj.updateDynamic("removeChromeAutoComplete")(removeChromeAutoComplete)
    if (resetModel != null) __obj.updateDynamic("resetModel")(resetModel)
    if (templateManipulators != null) __obj.updateDynamic("templateManipulators")(templateManipulators)
    if (updateInitialValue != null) __obj.updateDynamic("updateInitialValue")(updateInitialValue)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFormOptionsAPI]
  }
}

