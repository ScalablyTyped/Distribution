package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservationResourceSpecification extends js.Object {
  /**
    * Channel class, e.g. 'STANDARD'
    */
  var ChannelClass: js.UndefOr[ChannelClass] = js.undefined
  /**
    * Codec, e.g. 'AVC'
    */
  var Codec: js.UndefOr[ReservationCodec] = js.undefined
  /**
    * Maximum bitrate, e.g. 'MAX_20_MBPS'
    */
  var MaximumBitrate: js.UndefOr[ReservationMaximumBitrate] = js.undefined
  /**
    * Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only)
    */
  var MaximumFramerate: js.UndefOr[ReservationMaximumFramerate] = js.undefined
  /**
    * Resolution, e.g. 'HD'
    */
  var Resolution: js.UndefOr[ReservationResolution] = js.undefined
  /**
    * Resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
    */
  var ResourceType: js.UndefOr[ReservationResourceType] = js.undefined
  /**
    * Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only)
    */
  var SpecialFeature: js.UndefOr[ReservationSpecialFeature] = js.undefined
  /**
    * Video quality, e.g. 'STANDARD' (Outputs only)
    */
  var VideoQuality: js.UndefOr[ReservationVideoQuality] = js.undefined
}

object ReservationResourceSpecification {
  @scala.inline
  def apply(
    ChannelClass: ChannelClass = null,
    Codec: ReservationCodec = null,
    MaximumBitrate: ReservationMaximumBitrate = null,
    MaximumFramerate: ReservationMaximumFramerate = null,
    Resolution: ReservationResolution = null,
    ResourceType: ReservationResourceType = null,
    SpecialFeature: ReservationSpecialFeature = null,
    VideoQuality: ReservationVideoQuality = null
  ): ReservationResourceSpecification = {
    val __obj = js.Dynamic.literal()
    if (ChannelClass != null) __obj.updateDynamic("ChannelClass")(ChannelClass.asInstanceOf[js.Any])
    if (Codec != null) __obj.updateDynamic("Codec")(Codec.asInstanceOf[js.Any])
    if (MaximumBitrate != null) __obj.updateDynamic("MaximumBitrate")(MaximumBitrate.asInstanceOf[js.Any])
    if (MaximumFramerate != null) __obj.updateDynamic("MaximumFramerate")(MaximumFramerate.asInstanceOf[js.Any])
    if (Resolution != null) __obj.updateDynamic("Resolution")(Resolution.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (SpecialFeature != null) __obj.updateDynamic("SpecialFeature")(SpecialFeature.asInstanceOf[js.Any])
    if (VideoQuality != null) __obj.updateDynamic("VideoQuality")(VideoQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservationResourceSpecification]
  }
}

