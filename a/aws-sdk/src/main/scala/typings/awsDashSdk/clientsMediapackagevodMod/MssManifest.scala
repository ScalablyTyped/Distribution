package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MssManifest extends js.Object {
  /**
    * An optional string to include in the name of the manifest.
    */
  var ManifestName: js.UndefOr[__string] = js.undefined
  var StreamSelection: js.UndefOr[typings.awsDashSdk.clientsMediapackagevodMod.StreamSelection] = js.undefined
}

object MssManifest {
  @scala.inline
  def apply(ManifestName: __string = null, StreamSelection: StreamSelection = null): MssManifest = {
    val __obj = js.Dynamic.literal()
    if (ManifestName != null) __obj.updateDynamic("ManifestName")(ManifestName)
    if (StreamSelection != null) __obj.updateDynamic("StreamSelection")(StreamSelection)
    __obj.asInstanceOf[MssManifest]
  }
}

