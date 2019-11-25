package typings.angularDashFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormOptionsAPI extends js.Object {
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var fieldTransform: js.UndefOr[js.Function | js.Array[js.Function]] = js.undefined
  var formState: js.UndefOr[js.Object] = js.undefined
  var removeChromeAutoComplete: js.UndefOr[Boolean] = js.undefined
  var resetModel: js.UndefOr[js.Function] = js.undefined
  var templateManipulators: js.UndefOr[ITemplateManipulators] = js.undefined
  var updateInitialValue: js.UndefOr[js.Function] = js.undefined
  var wrapper: js.UndefOr[String | js.Array[String]] = js.undefined
}

object IFormOptionsAPI {
  @scala.inline
  def apply(
    data: StringDictionary[js.Any] = null,
    fieldTransform: js.Function | js.Array[js.Function] = null,
    formState: js.Object = null,
    removeChromeAutoComplete: js.UndefOr[Boolean] = js.undefined,
    resetModel: js.Function = null,
    templateManipulators: ITemplateManipulators = null,
    updateInitialValue: js.Function = null,
    wrapper: String | js.Array[String] = null
  ): IFormOptionsAPI = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fieldTransform != null) __obj.updateDynamic("fieldTransform")(fieldTransform.asInstanceOf[js.Any])
    if (formState != null) __obj.updateDynamic("formState")(formState.asInstanceOf[js.Any])
    if (!js.isUndefined(removeChromeAutoComplete)) __obj.updateDynamic("removeChromeAutoComplete")(removeChromeAutoComplete.asInstanceOf[js.Any])
    if (resetModel != null) __obj.updateDynamic("resetModel")(resetModel.asInstanceOf[js.Any])
    if (templateManipulators != null) __obj.updateDynamic("templateManipulators")(templateManipulators.asInstanceOf[js.Any])
    if (updateInitialValue != null) __obj.updateDynamic("updateInitialValue")(updateInitialValue.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFormOptionsAPI]
  }
}

