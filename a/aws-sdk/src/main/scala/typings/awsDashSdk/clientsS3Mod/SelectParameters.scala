package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectParameters extends js.Object {
  /**
    * The expression that is used to query the object.
    */
  var Expression: typings.awsDashSdk.clientsS3Mod.Expression = js.native
  /**
    * The type of the provided expression (for example, SQL).
    */
  var ExpressionType: typings.awsDashSdk.clientsS3Mod.ExpressionType = js.native
  /**
    * Describes the serialization format of the object.
    */
  var InputSerialization: typings.awsDashSdk.clientsS3Mod.InputSerialization = js.native
  /**
    * Describes how the results of the Select job are serialized.
    */
  var OutputSerialization: typings.awsDashSdk.clientsS3Mod.OutputSerialization = js.native
}

object SelectParameters {
  @scala.inline
  def apply(
    Expression: Expression,
    ExpressionType: ExpressionType,
    InputSerialization: InputSerialization,
    OutputSerialization: OutputSerialization
  ): SelectParameters = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectParameters]
  }
}

