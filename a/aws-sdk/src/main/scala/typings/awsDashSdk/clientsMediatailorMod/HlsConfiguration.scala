package typings.awsDashSdk.clientsMediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HlsConfiguration extends js.Object {
  /**
    * The URL that is used to initiate a playback session for devices that support Apple HLS. The session uses server-side reporting.
    */
  var ManifestEndpointPrefix: js.UndefOr[__string] = js.undefined
}

object HlsConfiguration {
  @scala.inline
  def apply(ManifestEndpointPrefix: __string = null): HlsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ManifestEndpointPrefix != null) __obj.updateDynamic("ManifestEndpointPrefix")(ManifestEndpointPrefix)
    __obj.asInstanceOf[HlsConfiguration]
  }
}

