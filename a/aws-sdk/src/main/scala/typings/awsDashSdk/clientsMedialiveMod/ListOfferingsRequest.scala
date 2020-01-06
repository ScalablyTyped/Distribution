package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOfferingsRequest extends js.Object {
  /**
    * Filter by channel class, 'STANDARD' or 'SINGLE_PIPELINE'
    */
  var ChannelClass: js.UndefOr[__string] = js.native
  /**
    * Filter to offerings that match the configuration of an existing channel, e.g. '2345678' (a channel ID)
    */
  var ChannelConfiguration: js.UndefOr[__string] = js.native
  /**
    * Filter by codec, 'AVC', 'HEVC', 'MPEG2', or 'AUDIO'
    */
  var Codec: js.UndefOr[__string] = js.native
  /**
    * Filter by offering duration, e.g. '12'
    */
  var Duration: js.UndefOr[__string] = js.native
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.MaxResults] = js.native
  /**
    * Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or 'MAX_50_MBPS'
    */
  var MaximumBitrate: js.UndefOr[__string] = js.native
  /**
    * Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
    */
  var MaximumFramerate: js.UndefOr[__string] = js.native
  var NextToken: js.UndefOr[__string] = js.native
  /**
    * Filter by resolution, 'SD', 'HD', 'FHD', or 'UHD'
    */
  var Resolution: js.UndefOr[__string] = js.native
  /**
    * Filter by resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
    */
  var ResourceType: js.UndefOr[__string] = js.native
  /**
    * Filter by special feature, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
    */
  var SpecialFeature: js.UndefOr[__string] = js.native
  /**
    * Filter by video quality, 'STANDARD', 'ENHANCED', or 'PREMIUM'
    */
  var VideoQuality: js.UndefOr[__string] = js.native
}

object ListOfferingsRequest {
  @scala.inline
  def apply(
    ChannelClass: __string = null,
    ChannelConfiguration: __string = null,
    Codec: __string = null,
    Duration: __string = null,
    MaxResults: Int | Double = null,
    MaximumBitrate: __string = null,
    MaximumFramerate: __string = null,
    NextToken: __string = null,
    Resolution: __string = null,
    ResourceType: __string = null,
    SpecialFeature: __string = null,
    VideoQuality: __string = null
  ): ListOfferingsRequest = {
    val __obj = js.Dynamic.literal()
    if (ChannelClass != null) __obj.updateDynamic("ChannelClass")(ChannelClass.asInstanceOf[js.Any])
    if (ChannelConfiguration != null) __obj.updateDynamic("ChannelConfiguration")(ChannelConfiguration.asInstanceOf[js.Any])
    if (Codec != null) __obj.updateDynamic("Codec")(Codec.asInstanceOf[js.Any])
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (MaximumBitrate != null) __obj.updateDynamic("MaximumBitrate")(MaximumBitrate.asInstanceOf[js.Any])
    if (MaximumFramerate != null) __obj.updateDynamic("MaximumFramerate")(MaximumFramerate.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Resolution != null) __obj.updateDynamic("Resolution")(Resolution.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (SpecialFeature != null) __obj.updateDynamic("SpecialFeature")(SpecialFeature.asInstanceOf[js.Any])
    if (VideoQuality != null) __obj.updateDynamic("VideoQuality")(VideoQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOfferingsRequest]
  }
}

