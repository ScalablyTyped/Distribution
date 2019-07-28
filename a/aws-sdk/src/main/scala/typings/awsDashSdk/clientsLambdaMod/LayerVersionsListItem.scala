package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerVersionsListItem extends js.Object {
  /**
    * The layer's compatible runtimes.
    */
  var CompatibleRuntimes: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.CompatibleRuntimes] = js.undefined
  /**
    * The date that the version was created, in ISO 8601 format. For example, 2018-11-27T15:10:45.123+0000.
    */
  var CreatedDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The description of the version.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.Description] = js.undefined
  /**
    * The ARN of the layer version.
    */
  var LayerVersionArn: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.LayerVersionArn] = js.undefined
  /**
    * The layer's open-source license.
    */
  var LicenseInfo: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.LicenseInfo] = js.undefined
  /**
    * The version number.
    */
  var Version: js.UndefOr[LayerVersionNumber] = js.undefined
}

object LayerVersionsListItem {
  @scala.inline
  def apply(
    CompatibleRuntimes: CompatibleRuntimes = null,
    CreatedDate: Timestamp = null,
    Description: Description = null,
    LayerVersionArn: LayerVersionArn = null,
    LicenseInfo: LicenseInfo = null,
    Version: js.UndefOr[LayerVersionNumber] = js.undefined
  ): LayerVersionsListItem = {
    val __obj = js.Dynamic.literal()
    if (CompatibleRuntimes != null) __obj.updateDynamic("CompatibleRuntimes")(CompatibleRuntimes)
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LayerVersionArn != null) __obj.updateDynamic("LayerVersionArn")(LayerVersionArn)
    if (LicenseInfo != null) __obj.updateDynamic("LicenseInfo")(LicenseInfo)
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[LayerVersionsListItem]
  }
}

