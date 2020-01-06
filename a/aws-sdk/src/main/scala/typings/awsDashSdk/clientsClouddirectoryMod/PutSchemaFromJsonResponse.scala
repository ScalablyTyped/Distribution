package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutSchemaFromJsonResponse extends js.Object {
  /**
    * The ARN of the schema to update.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.Arn] = js.native
}

object PutSchemaFromJsonResponse {
  @scala.inline
  def apply(Arn: Arn = null): PutSchemaFromJsonResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSchemaFromJsonResponse]
  }
}

