package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOfferingsRequest extends js.Object {
  /**
    * Filter by channel class, 'STANDARD' or 'SINGLE_PIPELINE'
    */
  var ChannelClass: js.UndefOr[__string] = js.undefined
  /**
    * Filter to offerings that match the configuration of an existing channel, e.g. '2345678' (a channel ID)
    */
  var ChannelConfiguration: js.UndefOr[__string] = js.undefined
  /**
    * Filter by codec, 'AVC', 'HEVC', 'MPEG2', or 'AUDIO'
    */
  var Codec: js.UndefOr[__string] = js.undefined
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.MaxResults] = js.undefined
  /**
    * Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or 'MAX_50_MBPS'
    */
  var MaximumBitrate: js.UndefOr[__string] = js.undefined
  /**
    * Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
    */
  var MaximumFramerate: js.UndefOr[__string] = js.undefined
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * Filter by resolution, 'SD', 'HD', or 'UHD'
    */
  var Resolution: js.UndefOr[__string] = js.undefined
  /**
    * Filter by resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
    */
  var ResourceType: js.UndefOr[__string] = js.undefined
  /**
    * Filter by special feature, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
    */
  var SpecialFeature: js.UndefOr[__string] = js.undefined
  /**
    * Filter by video quality, 'STANDARD', 'ENHANCED', or 'PREMIUM'
    */
  var VideoQuality: js.UndefOr[__string] = js.undefined
}

object ListOfferingsRequest {
  @scala.inline
  def apply(
    ChannelClass: __string = null,
    ChannelConfiguration: __string = null,
    Codec: __string = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    MaximumBitrate: __string = null,
    MaximumFramerate: __string = null,
    NextToken: __string = null,
    Resolution: __string = null,
    ResourceType: __string = null,
    SpecialFeature: __string = null,
    VideoQuality: __string = null
  ): ListOfferingsRequest = {
    val __obj = js.Dynamic.literal()
    if (ChannelClass != null) __obj.updateDynamic("ChannelClass")(ChannelClass)
    if (ChannelConfiguration != null) __obj.updateDynamic("ChannelConfiguration")(ChannelConfiguration)
    if (Codec != null) __obj.updateDynamic("Codec")(Codec)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (MaximumBitrate != null) __obj.updateDynamic("MaximumBitrate")(MaximumBitrate)
    if (MaximumFramerate != null) __obj.updateDynamic("MaximumFramerate")(MaximumFramerate)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Resolution != null) __obj.updateDynamic("Resolution")(Resolution)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    if (SpecialFeature != null) __obj.updateDynamic("SpecialFeature")(SpecialFeature)
    if (VideoQuality != null) __obj.updateDynamic("VideoQuality")(VideoQuality)
    __obj.asInstanceOf[ListOfferingsRequest]
  }
}

