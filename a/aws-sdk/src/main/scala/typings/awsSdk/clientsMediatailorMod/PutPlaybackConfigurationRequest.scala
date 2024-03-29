package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutPlaybackConfigurationRequest extends StObject {
  
  /**
    * The URL for the ad decision server (ADS). This includes the specification of static parameters and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed when calling the ADS. Alternately, for testing you can provide a static VAST URL. The maximum length is 25,000 characters.
    */
  var AdDecisionServerUrl: js.UndefOr[_String] = js.undefined
  
  /**
    * The configuration for avail suppression, also known as ad suppression. For more information about ad suppression, see Ad Suppression.
    */
  var AvailSuppression: js.UndefOr[typings.awsSdk.clientsMediatailorMod.AvailSuppression] = js.undefined
  
  /**
    * The configuration for bumpers. Bumpers are short audio or video clips that play at the start or before the end of an ad break. To learn more about bumpers, see Bumpers.
    */
  var Bumper: js.UndefOr[typings.awsSdk.clientsMediatailorMod.Bumper] = js.undefined
  
  /**
    * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment management.
    */
  var CdnConfiguration: js.UndefOr[typings.awsSdk.clientsMediatailorMod.CdnConfiguration] = js.undefined
  
  /**
    * The player parameters and aliases used as dynamic variables during session initialization. For more information, see Domain Variables.
    */
  var ConfigurationAliases: js.UndefOr[ConfigurationAliasesRequest] = js.undefined
  
  /**
    * The configuration for DASH content.
    */
  var DashConfiguration: js.UndefOr[DashConfigurationForPut] = js.undefined
  
  /**
    * The configuration for pre-roll ad insertion.
    */
  var LivePreRollConfiguration: js.UndefOr[typings.awsSdk.clientsMediatailorMod.LivePreRollConfiguration] = js.undefined
  
  /**
    * The configuration for manifest processing rules. Manifest processing rules enable customization of the personalized manifests created by MediaTailor.
    */
  var ManifestProcessingRules: js.UndefOr[typings.awsSdk.clientsMediatailorMod.ManifestProcessingRules] = js.undefined
  
  /**
    * The identifier for the playback configuration.
    */
  var Name: _String
  
  /**
    * Defines the maximum duration of underfilled ad time (in seconds) allowed in an ad break. If the duration of underfilled ad time exceeds the personalization threshold, then the personalization of the ad break is abandoned and the underlying content is shown. This feature applies to ad replacement in live and VOD streams, rather than ad insertion, because it relies on an underlying content stream. For more information about ad break behavior, including ad replacement and insertion, see Ad Behavior in AWS Elemental MediaTailor.
    */
  var PersonalizationThresholdSeconds: js.UndefOr[integerMin1] = js.undefined
  
  /**
    * The URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional for non-VPAID configurations. For VPAID, the slate is required because MediaTailor provides it in the slots that are designated for dynamic ad content. The slate must be a high-quality asset that contains both audio and video.
    */
  var SlateAdUrl: js.UndefOr[_String] = js.undefined
  
  /**
    * The tags to assign to the playback configuration. Tags are key-value pairs that you can associate with Amazon resources to help with organization, access control, and cost tracking. For more information, see Tagging AWS Elemental MediaTailor Resources.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
  
  /**
    * The name that is used to associate this playback configuration with a custom transcode profile. This overrides the dynamic transcoding defaults of MediaTailor. Use this only if you have already set up custom profiles with the help of AWS Support.
    */
  var TranscodeProfileName: js.UndefOr[_String] = js.undefined
  
  /**
    * The URL prefix for the parent manifest for the stream, minus the asset ID. The maximum length is 512 characters.
    */
  var VideoContentSourceUrl: js.UndefOr[_String] = js.undefined
}
object PutPlaybackConfigurationRequest {
  
  inline def apply(Name: _String): PutPlaybackConfigurationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPlaybackConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutPlaybackConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setAdDecisionServerUrl(value: _String): Self = StObject.set(x, "AdDecisionServerUrl", value.asInstanceOf[js.Any])
    
    inline def setAdDecisionServerUrlUndefined: Self = StObject.set(x, "AdDecisionServerUrl", js.undefined)
    
    inline def setAvailSuppression(value: AvailSuppression): Self = StObject.set(x, "AvailSuppression", value.asInstanceOf[js.Any])
    
    inline def setAvailSuppressionUndefined: Self = StObject.set(x, "AvailSuppression", js.undefined)
    
    inline def setBumper(value: Bumper): Self = StObject.set(x, "Bumper", value.asInstanceOf[js.Any])
    
    inline def setBumperUndefined: Self = StObject.set(x, "Bumper", js.undefined)
    
    inline def setCdnConfiguration(value: CdnConfiguration): Self = StObject.set(x, "CdnConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCdnConfigurationUndefined: Self = StObject.set(x, "CdnConfiguration", js.undefined)
    
    inline def setConfigurationAliases(value: ConfigurationAliasesRequest): Self = StObject.set(x, "ConfigurationAliases", value.asInstanceOf[js.Any])
    
    inline def setConfigurationAliasesUndefined: Self = StObject.set(x, "ConfigurationAliases", js.undefined)
    
    inline def setDashConfiguration(value: DashConfigurationForPut): Self = StObject.set(x, "DashConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDashConfigurationUndefined: Self = StObject.set(x, "DashConfiguration", js.undefined)
    
    inline def setLivePreRollConfiguration(value: LivePreRollConfiguration): Self = StObject.set(x, "LivePreRollConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLivePreRollConfigurationUndefined: Self = StObject.set(x, "LivePreRollConfiguration", js.undefined)
    
    inline def setManifestProcessingRules(value: ManifestProcessingRules): Self = StObject.set(x, "ManifestProcessingRules", value.asInstanceOf[js.Any])
    
    inline def setManifestProcessingRulesUndefined: Self = StObject.set(x, "ManifestProcessingRules", js.undefined)
    
    inline def setName(value: _String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPersonalizationThresholdSeconds(value: integerMin1): Self = StObject.set(x, "PersonalizationThresholdSeconds", value.asInstanceOf[js.Any])
    
    inline def setPersonalizationThresholdSecondsUndefined: Self = StObject.set(x, "PersonalizationThresholdSeconds", js.undefined)
    
    inline def setSlateAdUrl(value: _String): Self = StObject.set(x, "SlateAdUrl", value.asInstanceOf[js.Any])
    
    inline def setSlateAdUrlUndefined: Self = StObject.set(x, "SlateAdUrl", js.undefined)
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTranscodeProfileName(value: _String): Self = StObject.set(x, "TranscodeProfileName", value.asInstanceOf[js.Any])
    
    inline def setTranscodeProfileNameUndefined: Self = StObject.set(x, "TranscodeProfileName", js.undefined)
    
    inline def setVideoContentSourceUrl(value: _String): Self = StObject.set(x, "VideoContentSourceUrl", value.asInstanceOf[js.Any])
    
    inline def setVideoContentSourceUrlUndefined: Self = StObject.set(x, "VideoContentSourceUrl", js.undefined)
  }
}
