package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateOriginEndpointRequest extends js.Object {
  var CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters] = js.native
  var DashPackage: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.DashPackage] = js.native
  /**
    * A short text description of the OriginEndpoint.
    */
  var Description: js.UndefOr[__string] = js.native
  var HlsPackage: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.HlsPackage] = js.native
  /**
    * The ID of the OriginEndpoint to update.
    */
  var Id: __string = js.native
  /**
    * A short string that will be appended to the end of the Endpoint URL.
    */
  var ManifestName: js.UndefOr[__string] = js.native
  var MssPackage: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.MssPackage] = js.native
  /**
    * Control whether origination of video is allowed for this OriginEndpoint. If set to ALLOW, the OriginEndpoint
  may by requested, pursuant to any other form of access control. If set to DENY, the OriginEndpoint may not be
  requested. This can be helpful for Live to VOD harvesting, or for temporarily disabling origination
    */
  var Origination: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.Origination] = js.native
  /**
    * Maximum duration (in seconds) of content to retain for startover playback.
  If not specified, startover playback will be disabled for the OriginEndpoint.
    */
  var StartoverWindowSeconds: js.UndefOr[__integer] = js.native
  /**
    * Amount of delay (in seconds) to enforce on the playback of live content.
  If not specified, there will be no time delay in effect for the OriginEndpoint.
    */
  var TimeDelaySeconds: js.UndefOr[__integer] = js.native
  /**
    * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
    */
  var Whitelist: js.UndefOr[__listOf__string] = js.native
}

object UpdateOriginEndpointRequest {
  @scala.inline
  def apply(
    Id: __string,
    CmafPackage: CmafPackageCreateOrUpdateParameters = null,
    DashPackage: DashPackage = null,
    Description: __string = null,
    HlsPackage: HlsPackage = null,
    ManifestName: __string = null,
    MssPackage: MssPackage = null,
    Origination: Origination = null,
    StartoverWindowSeconds: Int | Double = null,
    TimeDelaySeconds: Int | Double = null,
    Whitelist: __listOf__string = null
  ): UpdateOriginEndpointRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (CmafPackage != null) __obj.updateDynamic("CmafPackage")(CmafPackage.asInstanceOf[js.Any])
    if (DashPackage != null) __obj.updateDynamic("DashPackage")(DashPackage.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (HlsPackage != null) __obj.updateDynamic("HlsPackage")(HlsPackage.asInstanceOf[js.Any])
    if (ManifestName != null) __obj.updateDynamic("ManifestName")(ManifestName.asInstanceOf[js.Any])
    if (MssPackage != null) __obj.updateDynamic("MssPackage")(MssPackage.asInstanceOf[js.Any])
    if (Origination != null) __obj.updateDynamic("Origination")(Origination.asInstanceOf[js.Any])
    if (StartoverWindowSeconds != null) __obj.updateDynamic("StartoverWindowSeconds")(StartoverWindowSeconds.asInstanceOf[js.Any])
    if (TimeDelaySeconds != null) __obj.updateDynamic("TimeDelaySeconds")(TimeDelaySeconds.asInstanceOf[js.Any])
    if (Whitelist != null) __obj.updateDynamic("Whitelist")(Whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOriginEndpointRequest]
  }
}

