package typings
package awsDashSdkLib.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashManifest extends js.Object {
  /**
    * An optional string to include in the name of the manifest.
    */
  var ManifestName: js.UndefOr[__string] = js.undefined
  /**
    * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
    */
  var MinBufferTimeSeconds: js.UndefOr[__integer] = js.undefined
  /**
    * The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
    */
  var Profile: js.UndefOr[Profile] = js.undefined
  var StreamSelection: js.UndefOr[StreamSelection] = js.undefined
}

object DashManifest {
  @scala.inline
  def apply(
    ManifestName: __string = null,
    MinBufferTimeSeconds: js.UndefOr[__integer] = js.undefined,
    Profile: Profile = null,
    StreamSelection: StreamSelection = null
  ): DashManifest = {
    val __obj = js.Dynamic.literal()
    if (ManifestName != null) __obj.updateDynamic("ManifestName")(ManifestName)
    if (!js.isUndefined(MinBufferTimeSeconds)) __obj.updateDynamic("MinBufferTimeSeconds")(MinBufferTimeSeconds)
    if (Profile != null) __obj.updateDynamic("Profile")(Profile.asInstanceOf[js.Any])
    if (StreamSelection != null) __obj.updateDynamic("StreamSelection")(StreamSelection)
    __obj.asInstanceOf[DashManifest]
  }
}

