package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectParameters extends js.Object {
  /**
    * The expression that is used to select the object.
    */
  var Expression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of the provided expression, for example SQL.
    */
  var ExpressionType: js.UndefOr[ExpressionType] = js.undefined
  /**
    * Describes the serialization format of the object.
    */
  var InputSerialization: js.UndefOr[InputSerialization] = js.undefined
  /**
    * Describes how the results of the select job are serialized.
    */
  var OutputSerialization: js.UndefOr[OutputSerialization] = js.undefined
}

object SelectParameters {
  @scala.inline
  def apply(
    Expression: java.lang.String = null,
    ExpressionType: ExpressionType = null,
    InputSerialization: InputSerialization = null,
    OutputSerialization: OutputSerialization = null
  ): SelectParameters = {
    val __obj = js.Dynamic.literal()
    if (Expression != null) __obj.updateDynamic("Expression")(Expression)
    if (ExpressionType != null) __obj.updateDynamic("ExpressionType")(ExpressionType.asInstanceOf[js.Any])
    if (InputSerialization != null) __obj.updateDynamic("InputSerialization")(InputSerialization)
    if (OutputSerialization != null) __obj.updateDynamic("OutputSerialization")(OutputSerialization)
    __obj.asInstanceOf[SelectParameters]
  }
}

