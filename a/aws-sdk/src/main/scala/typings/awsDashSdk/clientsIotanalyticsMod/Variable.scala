package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable extends js.Object {
  /**
    * The value of the variable as a structure that specifies a data set content version.
    */
  var datasetContentVersionValue: js.UndefOr[DatasetContentVersionValue] = js.undefined
  /**
    * The value of the variable as a double (numeric).
    */
  var doubleValue: js.UndefOr[DoubleValue] = js.undefined
  /**
    * The name of the variable.
    */
  var name: VariableName
  /**
    * The value of the variable as a structure that specifies an output file URI.
    */
  var outputFileUriValue: js.UndefOr[OutputFileUriValue] = js.undefined
  /**
    * The value of the variable as a string.
    */
  var stringValue: js.UndefOr[StringValue] = js.undefined
}

object Variable {
  @scala.inline
  def apply(
    name: VariableName,
    datasetContentVersionValue: DatasetContentVersionValue = null,
    doubleValue: js.UndefOr[DoubleValue] = js.undefined,
    outputFileUriValue: OutputFileUriValue = null,
    stringValue: StringValue = null
  ): Variable = {
    val __obj = js.Dynamic.literal(name = name)
    if (datasetContentVersionValue != null) __obj.updateDynamic("datasetContentVersionValue")(datasetContentVersionValue)
    if (!js.isUndefined(doubleValue)) __obj.updateDynamic("doubleValue")(doubleValue)
    if (outputFileUriValue != null) __obj.updateDynamic("outputFileUriValue")(outputFileUriValue)
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue)
    __obj.asInstanceOf[Variable]
  }
}

