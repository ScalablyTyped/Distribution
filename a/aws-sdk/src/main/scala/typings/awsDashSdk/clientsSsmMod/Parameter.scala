package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameter extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the parameter.
    */
  var ARN: js.UndefOr[String] = js.undefined
  /**
    * Date the parameter was last changed or updated and the parameter version was created.
    */
  var LastModifiedDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The name of the parameter.
    */
  var Name: js.UndefOr[PSParameterName] = js.undefined
  /**
    * Either the version number or the label used to retrieve the parameter value. Specify selectors by using one of the following formats: parameter_name:version parameter_name:label
    */
  var Selector: js.UndefOr[PSParameterSelector] = js.undefined
  /**
    * Applies to parameters that reference information in other AWS services. SourceResult is the raw result or response from the source.
    */
  var SourceResult: js.UndefOr[String] = js.undefined
  /**
    * The type of parameter. Valid values include the following: String, String list, Secure string.
    */
  var Type: js.UndefOr[ParameterType] = js.undefined
  /**
    * The parameter value.
    */
  var Value: js.UndefOr[PSParameterValue] = js.undefined
  /**
    * The parameter version.
    */
  var Version: js.UndefOr[PSParameterVersion] = js.undefined
}

object Parameter {
  @scala.inline
  def apply(
    ARN: String = null,
    LastModifiedDate: DateTime = null,
    Name: PSParameterName = null,
    Selector: PSParameterSelector = null,
    SourceResult: String = null,
    Type: ParameterType = null,
    Value: PSParameterValue = null,
    Version: Int | Double = null
  ): Parameter = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Selector != null) __obj.updateDynamic("Selector")(Selector)
    if (SourceResult != null) __obj.updateDynamic("SourceResult")(SourceResult)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value)
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
}

