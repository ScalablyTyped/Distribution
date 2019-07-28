package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishSchemaResponse extends js.Object {
  /**
    * The ARN that is associated with the published schema. For more information, see arns.
    */
  var PublishedSchemaArn: js.UndefOr[Arn] = js.undefined
}

object PublishSchemaResponse {
  @scala.inline
  def apply(PublishedSchemaArn: Arn = null): PublishSchemaResponse = {
    val __obj = js.Dynamic.literal()
    if (PublishedSchemaArn != null) __obj.updateDynamic("PublishedSchemaArn")(PublishedSchemaArn)
    __obj.asInstanceOf[PublishSchemaResponse]
  }
}

