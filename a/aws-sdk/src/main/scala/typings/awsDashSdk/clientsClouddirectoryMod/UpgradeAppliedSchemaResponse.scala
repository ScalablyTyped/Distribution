package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpgradeAppliedSchemaResponse extends js.Object {
  /**
    * The ARN of the directory that is returned as part of the response.
    */
  var DirectoryArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the upgraded schema that is returned as part of the response.
    */
  var UpgradedSchemaArn: js.UndefOr[Arn] = js.native
}

object UpgradeAppliedSchemaResponse {
  @scala.inline
  def apply(DirectoryArn: Arn = null, UpgradedSchemaArn: Arn = null): UpgradeAppliedSchemaResponse = {
    val __obj = js.Dynamic.literal()
    if (DirectoryArn != null) __obj.updateDynamic("DirectoryArn")(DirectoryArn.asInstanceOf[js.Any])
    if (UpgradedSchemaArn != null) __obj.updateDynamic("UpgradedSchemaArn")(UpgradedSchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeAppliedSchemaResponse]
  }
}

