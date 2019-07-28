package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutSchemaFromJsonResponse extends js.Object {
  /**
    * The ARN of the schema to update.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.Arn] = js.undefined
}

object PutSchemaFromJsonResponse {
  @scala.inline
  def apply(Arn: Arn = null): PutSchemaFromJsonResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    __obj.asInstanceOf[PutSchemaFromJsonResponse]
  }
}

