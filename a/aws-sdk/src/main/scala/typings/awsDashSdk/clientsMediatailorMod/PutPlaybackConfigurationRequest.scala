package typings.awsDashSdk.clientsMediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPlaybackConfigurationRequest extends js.Object {
  /**
    * The URL for the ad decision server (ADS). This includes the specification of static parameters and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed when calling the ADS. Alternately, for testing you can provide a static VAST URL. The maximum length is 25,000 characters.
    */
  var AdDecisionServerUrl: js.UndefOr[__string] = js.native
  /**
    * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment management. 
    */
  var CdnConfiguration: js.UndefOr[typings.awsDashSdk.clientsMediatailorMod.CdnConfiguration] = js.native
  /**
    * The configuration for DASH content. 
    */
  var DashConfiguration: js.UndefOr[DashConfigurationForPut] = js.native
  /**
    * The configuration for pre-roll ad insertion.
    */
  var LivePreRollConfiguration: js.UndefOr[typings.awsDashSdk.clientsMediatailorMod.LivePreRollConfiguration] = js.native
  /**
    * The identifier for the playback configuration.
    */
  var Name: js.UndefOr[__string] = js.native
  /**
    * The URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional for non-VPAID configurations. For VPAID, the slate is required because MediaTailor provides it in the slots that are designated for dynamic ad content. The slate must be a high-quality asset that contains both audio and video. 
    */
  var SlateAdUrl: js.UndefOr[__string] = js.native
  /**
    * The tags to assign to the playback configuration. 
    */
  var Tags: js.UndefOr[__mapOf__string] = js.native
  /**
    * The name that is used to associate this playback configuration with a custom transcode profile. This overrides the dynamic transcoding defaults of MediaTailor. Use this only if you have already set up custom profiles with the help of AWS Support.
    */
  var TranscodeProfileName: js.UndefOr[__string] = js.native
  /**
    * The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512 characters.
    */
  var VideoContentSourceUrl: js.UndefOr[__string] = js.native
}

object PutPlaybackConfigurationRequest {
  @scala.inline
  def apply(
    AdDecisionServerUrl: __string = null,
    CdnConfiguration: CdnConfiguration = null,
    DashConfiguration: DashConfigurationForPut = null,
    LivePreRollConfiguration: LivePreRollConfiguration = null,
    Name: __string = null,
    SlateAdUrl: __string = null,
    Tags: __mapOf__string = null,
    TranscodeProfileName: __string = null,
    VideoContentSourceUrl: __string = null
  ): PutPlaybackConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (AdDecisionServerUrl != null) __obj.updateDynamic("AdDecisionServerUrl")(AdDecisionServerUrl.asInstanceOf[js.Any])
    if (CdnConfiguration != null) __obj.updateDynamic("CdnConfiguration")(CdnConfiguration.asInstanceOf[js.Any])
    if (DashConfiguration != null) __obj.updateDynamic("DashConfiguration")(DashConfiguration.asInstanceOf[js.Any])
    if (LivePreRollConfiguration != null) __obj.updateDynamic("LivePreRollConfiguration")(LivePreRollConfiguration.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (SlateAdUrl != null) __obj.updateDynamic("SlateAdUrl")(SlateAdUrl.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TranscodeProfileName != null) __obj.updateDynamic("TranscodeProfileName")(TranscodeProfileName.asInstanceOf[js.Any])
    if (VideoContentSourceUrl != null) __obj.updateDynamic("VideoContentSourceUrl")(VideoContentSourceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPlaybackConfigurationRequest]
  }
}

