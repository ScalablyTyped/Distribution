package typings
package awsDashSdkLib.clientsMediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutPlaybackConfigurationResponse extends js.Object {
  /**
    * The URL for the ad decision server (ADS). This includes the specification of static parameters and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide a static VAST URL. The maximum length is 25,000 characters.
    */
  var AdDecisionServerUrl: js.UndefOr[__string] = js.undefined
  /**
    * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment management. 
    */
  var CdnConfiguration: js.UndefOr[CdnConfiguration] = js.undefined
  /**
    * The configuration for DASH content. 
    */
  var DashConfiguration: js.UndefOr[DashConfiguration] = js.undefined
  /**
    * The configuration for HLS content. 
    */
  var HlsConfiguration: js.UndefOr[HlsConfiguration] = js.undefined
  /**
    * The identifier for the playback configuration.
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the playback configuration. 
    */
  var PlaybackConfigurationArn: js.UndefOr[__string] = js.undefined
  /**
    * The URL that the player accesses to get a manifest from AWS Elemental MediaTailor. This session will use server-side reporting. 
    */
  var PlaybackEndpointPrefix: js.UndefOr[__string] = js.undefined
  /**
    * The URL that the player uses to initialize a session that uses client-side reporting. 
    */
  var SessionInitializationEndpointPrefix: js.UndefOr[__string] = js.undefined
  /**
    * The URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional for non-VPAID playback configurations. For VPAID, the slate is required because MediaTailor provides it in the slots designated for dynamic ad content. The slate must be a high-quality asset that contains both audio and video. 
    */
  var SlateAdUrl: js.UndefOr[__string] = js.undefined
  /**
    * The tags assigned to the playback configuration. 
    */
  var Tags: js.UndefOr[__mapOf__string] = js.undefined
  /**
    * The name that is used to associate this playback configuration with a custom transcode profile. This overrides the dynamic transcoding defaults of MediaTailor. Use this only if you have already set up custom profiles with the help of AWS Support.
    */
  var TranscodeProfileName: js.UndefOr[__string] = js.undefined
  /**
    * The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512 characters.
    */
  var VideoContentSourceUrl: js.UndefOr[__string] = js.undefined
}

object PutPlaybackConfigurationResponse {
  @scala.inline
  def apply(
    AdDecisionServerUrl: __string = null,
    CdnConfiguration: CdnConfiguration = null,
    DashConfiguration: DashConfiguration = null,
    HlsConfiguration: HlsConfiguration = null,
    Name: __string = null,
    PlaybackConfigurationArn: __string = null,
    PlaybackEndpointPrefix: __string = null,
    SessionInitializationEndpointPrefix: __string = null,
    SlateAdUrl: __string = null,
    Tags: __mapOf__string = null,
    TranscodeProfileName: __string = null,
    VideoContentSourceUrl: __string = null
  ): PutPlaybackConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (AdDecisionServerUrl != null) __obj.updateDynamic("AdDecisionServerUrl")(AdDecisionServerUrl)
    if (CdnConfiguration != null) __obj.updateDynamic("CdnConfiguration")(CdnConfiguration)
    if (DashConfiguration != null) __obj.updateDynamic("DashConfiguration")(DashConfiguration)
    if (HlsConfiguration != null) __obj.updateDynamic("HlsConfiguration")(HlsConfiguration)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (PlaybackConfigurationArn != null) __obj.updateDynamic("PlaybackConfigurationArn")(PlaybackConfigurationArn)
    if (PlaybackEndpointPrefix != null) __obj.updateDynamic("PlaybackEndpointPrefix")(PlaybackEndpointPrefix)
    if (SessionInitializationEndpointPrefix != null) __obj.updateDynamic("SessionInitializationEndpointPrefix")(SessionInitializationEndpointPrefix)
    if (SlateAdUrl != null) __obj.updateDynamic("SlateAdUrl")(SlateAdUrl)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TranscodeProfileName != null) __obj.updateDynamic("TranscodeProfileName")(TranscodeProfileName)
    if (VideoContentSourceUrl != null) __obj.updateDynamic("VideoContentSourceUrl")(VideoContentSourceUrl)
    __obj.asInstanceOf[PutPlaybackConfigurationResponse]
  }
}

