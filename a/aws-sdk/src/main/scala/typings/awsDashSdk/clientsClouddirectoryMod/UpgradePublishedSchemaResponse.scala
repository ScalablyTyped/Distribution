package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpgradePublishedSchemaResponse extends js.Object {
  /**
    * The ARN of the upgraded schema that is returned as part of the response.
    */
  var UpgradedSchemaArn: js.UndefOr[Arn] = js.undefined
}

object UpgradePublishedSchemaResponse {
  @scala.inline
  def apply(UpgradedSchemaArn: Arn = null): UpgradePublishedSchemaResponse = {
    val __obj = js.Dynamic.literal()
    if (UpgradedSchemaArn != null) __obj.updateDynamic("UpgradedSchemaArn")(UpgradedSchemaArn)
    __obj.asInstanceOf[UpgradePublishedSchemaResponse]
  }
}

