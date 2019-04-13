package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpgradePublishedSchemaRequest extends js.Object {
  /**
    * The ARN of the development schema with the changes used for the upgrade.
    */
  var DevelopmentSchemaArn: Arn
  /**
    * Used for testing whether the Development schema provided is backwards compatible, or not, with the publish schema provided by the user to be upgraded. If schema compatibility fails, an exception would be thrown else the call would succeed. This parameter is optional and defaults to false.
    */
  var DryRun: js.UndefOr[Bool] = js.undefined
  /**
    * Identifies the minor version of the published schema that will be created. This parameter is NOT optional.
    */
  var MinorVersion: Version
  /**
    * The ARN of the published schema to be upgraded.
    */
  var PublishedSchemaArn: Arn
}

object UpgradePublishedSchemaRequest {
  @scala.inline
  def apply(
    DevelopmentSchemaArn: Arn,
    MinorVersion: Version,
    PublishedSchemaArn: Arn,
    DryRun: js.UndefOr[Bool] = js.undefined
  ): UpgradePublishedSchemaRequest = {
    val __obj = js.Dynamic.literal(DevelopmentSchemaArn = DevelopmentSchemaArn, MinorVersion = MinorVersion, PublishedSchemaArn = PublishedSchemaArn)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[UpgradePublishedSchemaRequest]
  }
}

