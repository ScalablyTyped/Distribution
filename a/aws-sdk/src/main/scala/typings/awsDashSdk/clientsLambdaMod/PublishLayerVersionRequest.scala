package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishLayerVersionRequest extends js.Object {
  /**
    * A list of compatible function runtimes. Used for filtering with ListLayers and ListLayerVersions.
    */
  var CompatibleRuntimes: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.CompatibleRuntimes] = js.undefined
  /**
    * The function layer archive.
    */
  var Content: LayerVersionContentInput
  /**
    * The description of the version.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.Description] = js.undefined
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typings.awsDashSdk.clientsLambdaMod.LayerName
  /**
    * The layer's software license. It can be any of the following:   An SPDX license identifier. For example, MIT.   The URL of a license hosted on the internet. For example, https://opensource.org/licenses/MIT.   The full text of the license.  
    */
  var LicenseInfo: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.LicenseInfo] = js.undefined
}

object PublishLayerVersionRequest {
  @scala.inline
  def apply(
    Content: LayerVersionContentInput,
    LayerName: LayerName,
    CompatibleRuntimes: CompatibleRuntimes = null,
    Description: Description = null,
    LicenseInfo: LicenseInfo = null
  ): PublishLayerVersionRequest = {
    val __obj = js.Dynamic.literal(Content = Content, LayerName = LayerName)
    if (CompatibleRuntimes != null) __obj.updateDynamic("CompatibleRuntimes")(CompatibleRuntimes)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LicenseInfo != null) __obj.updateDynamic("LicenseInfo")(LicenseInfo)
    __obj.asInstanceOf[PublishLayerVersionRequest]
  }
}

