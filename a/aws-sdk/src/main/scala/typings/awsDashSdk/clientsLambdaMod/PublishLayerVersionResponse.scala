package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishLayerVersionResponse extends js.Object {
  /**
    * The layer's compatible runtimes.
    */
  var CompatibleRuntimes: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.CompatibleRuntimes] = js.undefined
  /**
    * Details about the layer version.
    */
  var Content: js.UndefOr[LayerVersionContentOutput] = js.undefined
  /**
    * The date that the layer version was created, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
    */
  var CreatedDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The description of the version.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.Description] = js.undefined
  /**
    * The ARN of the layer.
    */
  var LayerArn: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.LayerArn] = js.undefined
  /**
    * The ARN of the layer version.
    */
  var LayerVersionArn: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.LayerVersionArn] = js.undefined
  /**
    * The layer's software license.
    */
  var LicenseInfo: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.LicenseInfo] = js.undefined
  /**
    * The version number.
    */
  var Version: js.UndefOr[LayerVersionNumber] = js.undefined
}

object PublishLayerVersionResponse {
  @scala.inline
  def apply(
    CompatibleRuntimes: CompatibleRuntimes = null,
    Content: LayerVersionContentOutput = null,
    CreatedDate: Timestamp = null,
    Description: Description = null,
    LayerArn: LayerArn = null,
    LayerVersionArn: LayerVersionArn = null,
    LicenseInfo: LicenseInfo = null,
    Version: Int | Double = null
  ): PublishLayerVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (CompatibleRuntimes != null) __obj.updateDynamic("CompatibleRuntimes")(CompatibleRuntimes)
    if (Content != null) __obj.updateDynamic("Content")(Content)
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LayerArn != null) __obj.updateDynamic("LayerArn")(LayerArn)
    if (LayerVersionArn != null) __obj.updateDynamic("LayerVersionArn")(LayerVersionArn)
    if (LicenseInfo != null) __obj.updateDynamic("LicenseInfo")(LicenseInfo)
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishLayerVersionResponse]
  }
}

