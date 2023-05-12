package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MpdSettings extends StObject {
  
  /**
    * Optional. Choose Include (INCLUDE) to have MediaConvert mark up your DASH manifest with  elements for embedded 608 captions. This markup isn't generally required, but some video players require it to discover and play embedded 608 captions. Keep the default value, Exclude (EXCLUDE), to leave these elements out. When you enable this setting, this is the markup that MediaConvert includes in your manifest: 
    */
  var AccessibilityCaptionHints: js.UndefOr[MpdAccessibilityCaptionHints] = js.undefined
  
  /**
    * Specify this setting only when your output will be consumed by a downstream repackaging workflow that is sensitive to very small duration differences between video and audio. For this situation, choose Match video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with silence or trims them to ensure that the total duration of each audio stream is at least as long as the total duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
    */
  var AudioDuration: js.UndefOr[MpdAudioDuration] = js.undefined
  
  /**
    * Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify sidecar captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single XML file in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format contained within fragmented MP4 files. This set of fragmented MP4 files is separate from your video and audio fragmented MP4 files.
    */
  var CaptionContainerType: js.UndefOr[MpdCaptionContainerType] = js.undefined
  
  /**
    * To include key-length-value metadata in this output: Set KLV metadata insertion to Passthrough. MediaConvert reads KLV metadata present in your input and writes each instance to a separate event message box in the output, according to MISB ST1910.1. To exclude this KLV metadata: Set KLV metadata insertion to None or leave blank.
    */
  var KlvMetadata: js.UndefOr[MpdKlvMetadata] = js.undefined
  
  /**
    * To add an InbandEventStream element in your output MPD manifest for each type of event message, set Manifest metadata signaling to Enabled. For ID3 event messages, the InbandEventStream element schemeIdUri will be same value that you specify for ID3 metadata scheme ID URI. For SCTE35 event messages, the InbandEventStream element schemeIdUri will be "urn:scte:scte35:2013:bin". To leave these elements out of your output MPD manifest, set Manifest metadata signaling to Disabled. To enable Manifest metadata signaling, you must also set SCTE-35 source to Passthrough, ESAM SCTE-35 to insert, or ID3 metadata (TimedMetadata) to Passthrough.
    */
  var ManifestMetadataSignaling: js.UndefOr[MpdManifestMetadataSignaling] = js.undefined
  
  /**
    * Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
    */
  var Scte35Esam: js.UndefOr[MpdScte35Esam] = js.undefined
  
  /**
    * Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want those SCTE-35 markers in this output.
    */
  var Scte35Source: js.UndefOr[MpdScte35Source] = js.undefined
  
  /**
    * To include ID3 metadata in this output: Set ID3 metadata (timedMetadata) to Passthrough (PASSTHROUGH). Specify this ID3 metadata in Custom ID3 metadata inserter (timedMetadataInsertion). MediaConvert writes each instance of ID3 metadata in a separate Event Message (eMSG) box. To exclude this ID3 metadata: Set ID3 metadata to None (NONE) or leave blank.
    */
  var TimedMetadata: js.UndefOr[MpdTimedMetadata] = js.undefined
  
  /**
    * Specify the event message box (eMSG) version for ID3 timed metadata in your output.
  For more information, see ISO/IEC 23009-1:2022 section 5.10.3.3.3 Syntax.
  Leave blank to use the default value Version 0.
  When you specify Version 1, you must also set ID3 metadata (timedMetadata) to Passthrough.
    */
  var TimedMetadataBoxVersion: js.UndefOr[MpdTimedMetadataBoxVersion] = js.undefined
  
  /**
    * Specify the event message box (eMSG) scheme ID URI (scheme_id_uri) for ID3 timed metadata in your output. For more information, see ISO/IEC 23009-1:2022 section 5.10.3.3.4 Semantics. Leave blank to use the default value: https://aomedia.org/emsg/ID3 When you specify a value for ID3 metadata scheme ID URI, you must also set ID3 metadata (timedMetadata) to Passthrough.
    */
  var TimedMetadataSchemeIdUri: js.UndefOr[stringMax1000] = js.undefined
  
  /**
    * Specify the event message box (eMSG) value for ID3 timed metadata in your output. For more information, see ISO/IEC 23009-1:2022 section 5.10.3.3.4 Semantics. When you specify a value for ID3 Metadata Value, you must also set ID3 metadata (timedMetadata) to Passthrough.
    */
  var TimedMetadataValue: js.UndefOr[stringMax1000] = js.undefined
}
object MpdSettings {
  
  inline def apply(): MpdSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MpdSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MpdSettings] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityCaptionHints(value: MpdAccessibilityCaptionHints): Self = StObject.set(x, "AccessibilityCaptionHints", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityCaptionHintsUndefined: Self = StObject.set(x, "AccessibilityCaptionHints", js.undefined)
    
    inline def setAudioDuration(value: MpdAudioDuration): Self = StObject.set(x, "AudioDuration", value.asInstanceOf[js.Any])
    
    inline def setAudioDurationUndefined: Self = StObject.set(x, "AudioDuration", js.undefined)
    
    inline def setCaptionContainerType(value: MpdCaptionContainerType): Self = StObject.set(x, "CaptionContainerType", value.asInstanceOf[js.Any])
    
    inline def setCaptionContainerTypeUndefined: Self = StObject.set(x, "CaptionContainerType", js.undefined)
    
    inline def setKlvMetadata(value: MpdKlvMetadata): Self = StObject.set(x, "KlvMetadata", value.asInstanceOf[js.Any])
    
    inline def setKlvMetadataUndefined: Self = StObject.set(x, "KlvMetadata", js.undefined)
    
    inline def setManifestMetadataSignaling(value: MpdManifestMetadataSignaling): Self = StObject.set(x, "ManifestMetadataSignaling", value.asInstanceOf[js.Any])
    
    inline def setManifestMetadataSignalingUndefined: Self = StObject.set(x, "ManifestMetadataSignaling", js.undefined)
    
    inline def setScte35Esam(value: MpdScte35Esam): Self = StObject.set(x, "Scte35Esam", value.asInstanceOf[js.Any])
    
    inline def setScte35EsamUndefined: Self = StObject.set(x, "Scte35Esam", js.undefined)
    
    inline def setScte35Source(value: MpdScte35Source): Self = StObject.set(x, "Scte35Source", value.asInstanceOf[js.Any])
    
    inline def setScte35SourceUndefined: Self = StObject.set(x, "Scte35Source", js.undefined)
    
    inline def setTimedMetadata(value: MpdTimedMetadata): Self = StObject.set(x, "TimedMetadata", value.asInstanceOf[js.Any])
    
    inline def setTimedMetadataBoxVersion(value: MpdTimedMetadataBoxVersion): Self = StObject.set(x, "TimedMetadataBoxVersion", value.asInstanceOf[js.Any])
    
    inline def setTimedMetadataBoxVersionUndefined: Self = StObject.set(x, "TimedMetadataBoxVersion", js.undefined)
    
    inline def setTimedMetadataSchemeIdUri(value: stringMax1000): Self = StObject.set(x, "TimedMetadataSchemeIdUri", value.asInstanceOf[js.Any])
    
    inline def setTimedMetadataSchemeIdUriUndefined: Self = StObject.set(x, "TimedMetadataSchemeIdUri", js.undefined)
    
    inline def setTimedMetadataUndefined: Self = StObject.set(x, "TimedMetadata", js.undefined)
    
    inline def setTimedMetadataValue(value: stringMax1000): Self = StObject.set(x, "TimedMetadataValue", value.asInstanceOf[js.Any])
    
    inline def setTimedMetadataValueUndefined: Self = StObject.set(x, "TimedMetadataValue", js.undefined)
  }
}
