package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Output extends StObject {
  
  /**
    * (AudioDescriptions) contains groups of audio encoding settings organized by audio codec. Include one instance of (AudioDescriptions) per output. (AudioDescriptions) can contain multiple groups of encoding settings.
    */
  var AudioDescriptions: js.UndefOr[listOfAudioDescription] = js.undefined
  
  /**
    * (CaptionDescriptions) contains groups of captions settings. For each output that has captions, include one instance of (CaptionDescriptions). (CaptionDescriptions) can contain multiple groups of captions settings.
    */
  var CaptionDescriptions: js.UndefOr[listOfCaptionDescription] = js.undefined
  
  /**
    * Container specific settings.
    */
  var ContainerSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.ContainerSettings] = js.undefined
  
  /**
    * Use Extension (Extension) to specify the file extension for outputs in File output groups. If you do not specify a value, the service will use default extensions by container type as follows * MPEG-2 transport stream, m2ts * Quicktime, mov * MXF container, mxf * MPEG-4 container, mp4 * WebM container, webm * No Container, the service will use codec extensions (e.g. AAC, H265, H265, AC3)
    */
  var Extension: js.UndefOr[string] = js.undefined
  
  /**
    * Use Name modifier (NameModifier) to have the service add a string to the end of each output filename. You specify the base filename as part of your destination URI. When you create multiple outputs in the same output group, Name modifier (NameModifier) is required. Name modifier also accepts format identifiers. For DASH ISO outputs, if you use the format identifiers $Number$ or $Time$ in one output, you must use them in the same way in all outputs of the output group.
    */
  var NameModifier: js.UndefOr[stringMin1] = js.undefined
  
  /**
    * Specific settings for this type of output.
    */
  var OutputSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.OutputSettings] = js.undefined
  
  /**
    * Use Preset (Preset) to specify a preset for your transcoding settings. Provide the system or custom preset name. You can specify either Preset (Preset) or Container settings (ContainerSettings), but not both.
    */
  var Preset: js.UndefOr[stringMin0] = js.undefined
  
  /**
    * VideoDescription contains a group of video encoding settings. The specific video settings depend on the video codec that you choose for the property codec. Include one instance of VideoDescription per output.
    */
  var VideoDescription: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.VideoDescription] = js.undefined
}
object Output {
  
  inline def apply(): Output = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
    
    inline def setAudioDescriptions(value: listOfAudioDescription): Self = StObject.set(x, "AudioDescriptions", value.asInstanceOf[js.Any])
    
    inline def setAudioDescriptionsUndefined: Self = StObject.set(x, "AudioDescriptions", js.undefined)
    
    inline def setAudioDescriptionsVarargs(value: AudioDescription*): Self = StObject.set(x, "AudioDescriptions", js.Array(value*))
    
    inline def setCaptionDescriptions(value: listOfCaptionDescription): Self = StObject.set(x, "CaptionDescriptions", value.asInstanceOf[js.Any])
    
    inline def setCaptionDescriptionsUndefined: Self = StObject.set(x, "CaptionDescriptions", js.undefined)
    
    inline def setCaptionDescriptionsVarargs(value: CaptionDescription*): Self = StObject.set(x, "CaptionDescriptions", js.Array(value*))
    
    inline def setContainerSettings(value: ContainerSettings): Self = StObject.set(x, "ContainerSettings", value.asInstanceOf[js.Any])
    
    inline def setContainerSettingsUndefined: Self = StObject.set(x, "ContainerSettings", js.undefined)
    
    inline def setExtension(value: string): Self = StObject.set(x, "Extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "Extension", js.undefined)
    
    inline def setNameModifier(value: stringMin1): Self = StObject.set(x, "NameModifier", value.asInstanceOf[js.Any])
    
    inline def setNameModifierUndefined: Self = StObject.set(x, "NameModifier", js.undefined)
    
    inline def setOutputSettings(value: OutputSettings): Self = StObject.set(x, "OutputSettings", value.asInstanceOf[js.Any])
    
    inline def setOutputSettingsUndefined: Self = StObject.set(x, "OutputSettings", js.undefined)
    
    inline def setPreset(value: stringMin0): Self = StObject.set(x, "Preset", value.asInstanceOf[js.Any])
    
    inline def setPresetUndefined: Self = StObject.set(x, "Preset", js.undefined)
    
    inline def setVideoDescription(value: VideoDescription): Self = StObject.set(x, "VideoDescription", value.asInstanceOf[js.Any])
    
    inline def setVideoDescriptionUndefined: Self = StObject.set(x, "VideoDescription", js.undefined)
  }
}
