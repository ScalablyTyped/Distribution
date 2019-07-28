package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpgradeAppliedSchemaResponse extends js.Object {
  /**
    * The ARN of the directory that is returned as part of the response.
    */
  var DirectoryArn: js.UndefOr[Arn] = js.undefined
  /**
    * The ARN of the upgraded schema that is returned as part of the response.
    */
  var UpgradedSchemaArn: js.UndefOr[Arn] = js.undefined
}

object UpgradeAppliedSchemaResponse {
  @scala.inline
  def apply(DirectoryArn: Arn = null, UpgradedSchemaArn: Arn = null): UpgradeAppliedSchemaResponse = {
    val __obj = js.Dynamic.literal()
    if (DirectoryArn != null) __obj.updateDynamic("DirectoryArn")(DirectoryArn)
    if (UpgradedSchemaArn != null) __obj.updateDynamic("UpgradedSchemaArn")(UpgradedSchemaArn)
    __obj.asInstanceOf[UpgradeAppliedSchemaResponse]
  }
}

