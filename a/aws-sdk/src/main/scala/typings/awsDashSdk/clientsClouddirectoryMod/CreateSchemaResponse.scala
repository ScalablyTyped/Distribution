package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSchemaResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: js.UndefOr[Arn] = js.native
}

object CreateSchemaResponse {
  @scala.inline
  def apply(SchemaArn: Arn = null): CreateSchemaResponse = {
    val __obj = js.Dynamic.literal()
    if (SchemaArn != null) __obj.updateDynamic("SchemaArn")(SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSchemaResponse]
  }
}

