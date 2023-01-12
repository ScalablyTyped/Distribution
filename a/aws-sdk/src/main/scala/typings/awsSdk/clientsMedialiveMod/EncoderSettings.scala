package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncoderSettings extends StObject {
  
  var AudioDescriptions: listOfAudioDescription
  
  /**
    * Settings for ad avail blanking.
    */
  var AvailBlanking: js.UndefOr[typings.awsSdk.clientsMedialiveMod.AvailBlanking] = js.undefined
  
  /**
    * Event-wide configuration settings for ad avail insertion.
    */
  var AvailConfiguration: js.UndefOr[typings.awsSdk.clientsMedialiveMod.AvailConfiguration] = js.undefined
  
  /**
    * Settings for blackout slate.
    */
  var BlackoutSlate: js.UndefOr[typings.awsSdk.clientsMedialiveMod.BlackoutSlate] = js.undefined
  
  /**
    * Settings for caption decriptions
    */
  var CaptionDescriptions: js.UndefOr[listOfCaptionDescription] = js.undefined
  
  /**
    * Feature Activations
    */
  var FeatureActivations: js.UndefOr[typings.awsSdk.clientsMedialiveMod.FeatureActivations] = js.undefined
  
  /**
    * Configuration settings that apply to the event as a whole.
    */
  var GlobalConfiguration: js.UndefOr[typings.awsSdk.clientsMedialiveMod.GlobalConfiguration] = js.undefined
  
  /**
    * Settings for motion graphics.
    */
  var MotionGraphicsConfiguration: js.UndefOr[typings.awsSdk.clientsMedialiveMod.MotionGraphicsConfiguration] = js.undefined
  
  /**
    * Nielsen configuration settings.
    */
  var NielsenConfiguration: js.UndefOr[typings.awsSdk.clientsMedialiveMod.NielsenConfiguration] = js.undefined
  
  var OutputGroups: listOfOutputGroup
  
  /**
    * Contains settings used to acquire and adjust timecode information from inputs.
    */
  var TimecodeConfig: typings.awsSdk.clientsMedialiveMod.TimecodeConfig
  
  var VideoDescriptions: listOfVideoDescription
}
object EncoderSettings {
  
  inline def apply(
    AudioDescriptions: listOfAudioDescription,
    OutputGroups: listOfOutputGroup,
    TimecodeConfig: TimecodeConfig,
    VideoDescriptions: listOfVideoDescription
  ): EncoderSettings = {
    val __obj = js.Dynamic.literal(AudioDescriptions = AudioDescriptions.asInstanceOf[js.Any], OutputGroups = OutputGroups.asInstanceOf[js.Any], TimecodeConfig = TimecodeConfig.asInstanceOf[js.Any], VideoDescriptions = VideoDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncoderSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncoderSettings] (val x: Self) extends AnyVal {
    
    inline def setAudioDescriptions(value: listOfAudioDescription): Self = StObject.set(x, "AudioDescriptions", value.asInstanceOf[js.Any])
    
    inline def setAudioDescriptionsVarargs(value: AudioDescription*): Self = StObject.set(x, "AudioDescriptions", js.Array(value*))
    
    inline def setAvailBlanking(value: AvailBlanking): Self = StObject.set(x, "AvailBlanking", value.asInstanceOf[js.Any])
    
    inline def setAvailBlankingUndefined: Self = StObject.set(x, "AvailBlanking", js.undefined)
    
    inline def setAvailConfiguration(value: AvailConfiguration): Self = StObject.set(x, "AvailConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAvailConfigurationUndefined: Self = StObject.set(x, "AvailConfiguration", js.undefined)
    
    inline def setBlackoutSlate(value: BlackoutSlate): Self = StObject.set(x, "BlackoutSlate", value.asInstanceOf[js.Any])
    
    inline def setBlackoutSlateUndefined: Self = StObject.set(x, "BlackoutSlate", js.undefined)
    
    inline def setCaptionDescriptions(value: listOfCaptionDescription): Self = StObject.set(x, "CaptionDescriptions", value.asInstanceOf[js.Any])
    
    inline def setCaptionDescriptionsUndefined: Self = StObject.set(x, "CaptionDescriptions", js.undefined)
    
    inline def setCaptionDescriptionsVarargs(value: CaptionDescription*): Self = StObject.set(x, "CaptionDescriptions", js.Array(value*))
    
    inline def setFeatureActivations(value: FeatureActivations): Self = StObject.set(x, "FeatureActivations", value.asInstanceOf[js.Any])
    
    inline def setFeatureActivationsUndefined: Self = StObject.set(x, "FeatureActivations", js.undefined)
    
    inline def setGlobalConfiguration(value: GlobalConfiguration): Self = StObject.set(x, "GlobalConfiguration", value.asInstanceOf[js.Any])
    
    inline def setGlobalConfigurationUndefined: Self = StObject.set(x, "GlobalConfiguration", js.undefined)
    
    inline def setMotionGraphicsConfiguration(value: MotionGraphicsConfiguration): Self = StObject.set(x, "MotionGraphicsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMotionGraphicsConfigurationUndefined: Self = StObject.set(x, "MotionGraphicsConfiguration", js.undefined)
    
    inline def setNielsenConfiguration(value: NielsenConfiguration): Self = StObject.set(x, "NielsenConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNielsenConfigurationUndefined: Self = StObject.set(x, "NielsenConfiguration", js.undefined)
    
    inline def setOutputGroups(value: listOfOutputGroup): Self = StObject.set(x, "OutputGroups", value.asInstanceOf[js.Any])
    
    inline def setOutputGroupsVarargs(value: OutputGroup*): Self = StObject.set(x, "OutputGroups", js.Array(value*))
    
    inline def setTimecodeConfig(value: TimecodeConfig): Self = StObject.set(x, "TimecodeConfig", value.asInstanceOf[js.Any])
    
    inline def setVideoDescriptions(value: listOfVideoDescription): Self = StObject.set(x, "VideoDescriptions", value.asInstanceOf[js.Any])
    
    inline def setVideoDescriptionsVarargs(value: VideoDescription*): Self = StObject.set(x, "VideoDescriptions", js.Array(value*))
  }
}
