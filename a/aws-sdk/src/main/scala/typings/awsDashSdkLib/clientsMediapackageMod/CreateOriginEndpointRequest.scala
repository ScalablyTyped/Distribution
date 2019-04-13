package typings
package awsDashSdkLib.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOriginEndpointRequest extends js.Object {
  /**
    * The ID of the Channel that the OriginEndpoint will be associated with.
  This cannot be changed after the OriginEndpoint is created.
    */
  var ChannelId: __string
  var CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters] = js.undefined
  var DashPackage: js.UndefOr[DashPackage] = js.undefined
  /**
    * A short text description of the OriginEndpoint.
    */
  var Description: js.UndefOr[__string] = js.undefined
  var HlsPackage: js.UndefOr[HlsPackage] = js.undefined
  /**
    * The ID of the OriginEndpoint.  The ID must be unique within the region
  and it cannot be changed after the OriginEndpoint is created.
    */
  var Id: __string
  /**
    * A short string that will be used as the filename of the OriginEndpoint URL (defaults to "index").
    */
  var ManifestName: js.UndefOr[__string] = js.undefined
  var MssPackage: js.UndefOr[MssPackage] = js.undefined
  /**
    * Maximum duration (seconds) of content to retain for startover playback.
  If not specified, startover playback will be disabled for the OriginEndpoint.
    */
  var StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined
  var Tags: js.UndefOr[Tags] = js.undefined
  /**
    * Amount of delay (seconds) to enforce on the playback of live content.
  If not specified, there will be no time delay in effect for the OriginEndpoint.
    */
  var TimeDelaySeconds: js.UndefOr[__integer] = js.undefined
  /**
    * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
    */
  var Whitelist: js.UndefOr[__listOf__string] = js.undefined
}

object CreateOriginEndpointRequest {
  @scala.inline
  def apply(
    ChannelId: __string,
    Id: __string,
    CmafPackage: CmafPackageCreateOrUpdateParameters = null,
    DashPackage: DashPackage = null,
    Description: __string = null,
    HlsPackage: HlsPackage = null,
    ManifestName: __string = null,
    MssPackage: MssPackage = null,
    StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined,
    Tags: Tags = null,
    TimeDelaySeconds: js.UndefOr[__integer] = js.undefined,
    Whitelist: __listOf__string = null
  ): CreateOriginEndpointRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId, Id = Id)
    if (CmafPackage != null) __obj.updateDynamic("CmafPackage")(CmafPackage)
    if (DashPackage != null) __obj.updateDynamic("DashPackage")(DashPackage)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (HlsPackage != null) __obj.updateDynamic("HlsPackage")(HlsPackage)
    if (ManifestName != null) __obj.updateDynamic("ManifestName")(ManifestName)
    if (MssPackage != null) __obj.updateDynamic("MssPackage")(MssPackage)
    if (!js.isUndefined(StartoverWindowSeconds)) __obj.updateDynamic("StartoverWindowSeconds")(StartoverWindowSeconds)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (!js.isUndefined(TimeDelaySeconds)) __obj.updateDynamic("TimeDelaySeconds")(TimeDelaySeconds)
    if (Whitelist != null) __obj.updateDynamic("Whitelist")(Whitelist)
    __obj.asInstanceOf[CreateOriginEndpointRequest]
  }
}

