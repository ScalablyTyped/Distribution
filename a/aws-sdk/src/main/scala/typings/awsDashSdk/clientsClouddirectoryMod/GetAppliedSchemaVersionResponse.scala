package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppliedSchemaVersionResponse extends js.Object {
  /**
    * Current applied schema ARN, including the minor version in use if one was provided.
    */
  var AppliedSchemaArn: js.UndefOr[Arn] = js.native
}

object GetAppliedSchemaVersionResponse {
  @scala.inline
  def apply(AppliedSchemaArn: Arn = null): GetAppliedSchemaVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (AppliedSchemaArn != null) __obj.updateDynamic("AppliedSchemaArn")(AppliedSchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppliedSchemaVersionResponse]
  }
}

