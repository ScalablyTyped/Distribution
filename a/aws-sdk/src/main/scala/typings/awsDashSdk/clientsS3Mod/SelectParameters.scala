package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectParameters extends js.Object {
  /**
    * The expression that is used to query the object.
    */
  var Expression: typings.awsDashSdk.clientsS3Mod.Expression
  /**
    * The type of the provided expression (e.g., SQL).
    */
  var ExpressionType: typings.awsDashSdk.clientsS3Mod.ExpressionType
  /**
    * Describes the serialization format of the object.
    */
  var InputSerialization: typings.awsDashSdk.clientsS3Mod.InputSerialization
  /**
    * Describes how the results of the Select job are serialized.
    */
  var OutputSerialization: typings.awsDashSdk.clientsS3Mod.OutputSerialization
}

object SelectParameters {
  @scala.inline
  def apply(
    Expression: Expression,
    ExpressionType: ExpressionType,
    InputSerialization: InputSerialization,
    OutputSerialization: OutputSerialization
  ): SelectParameters = {
    val __obj = js.Dynamic.literal(Expression = Expression, ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization, OutputSerialization = OutputSerialization)
  
    __obj.asInstanceOf[SelectParameters]
  }
}

