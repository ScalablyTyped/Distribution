package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionSourceSettings extends StObject {
  
  /**
    * Settings for ancillary captions source.
    */
  var AncillarySourceSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.AncillarySourceSettings] = js.undefined
  
  /**
    * DVB Sub Source Settings
    */
  var DvbSubSourceSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.DvbSubSourceSettings] = js.undefined
  
  /**
    * Settings for embedded captions Source
    */
  var EmbeddedSourceSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.EmbeddedSourceSettings] = js.undefined
  
  /**
    * If your input captions are SCC, SMI, SRT, STL, TTML, WebVTT, or IMSC 1.1 in an xml file, specify the URI of the input caption source file. If your caption source is IMSC in an IMF package, use TrackSourceSettings instead of FileSoureSettings.
    */
  var FileSourceSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.FileSourceSettings] = js.undefined
  
  /**
    * Use Source (SourceType) to identify the format of your input captions. The service cannot auto-detect caption format.
    */
  var SourceType: js.UndefOr[CaptionSourceType] = js.undefined
  
  /**
    * Settings specific to Teletext caption sources, including Page number.
    */
  var TeletextSourceSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.TeletextSourceSettings] = js.undefined
  
  /**
    * Settings specific to caption sources that are specified by track number. Currently, this is only IMSC captions in an IMF package. If your caption source is IMSC 1.1 in a separate xml file, use FileSourceSettings instead of TrackSourceSettings.
    */
  var TrackSourceSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.TrackSourceSettings] = js.undefined
  
  /**
    * Settings specific to WebVTT sources in HLS alternative rendition group. Specify the properties (renditionGroupId, renditionName or renditionLanguageCode) to identify the unique subtitle track among the alternative rendition groups present in the HLS manifest. If no unique track is found, or multiple tracks match the specified properties, the job fails. If there is only one subtitle track in the rendition group, the settings can be left empty and the default subtitle track will be chosen. If your caption source is a sidecar file, use FileSourceSettings instead of WebvttHlsSourceSettings.
    */
  var WebvttHlsSourceSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.WebvttHlsSourceSettings] = js.undefined
}
object CaptionSourceSettings {
  
  inline def apply(): CaptionSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSourceSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CaptionSourceSettings] (val x: Self) extends AnyVal {
    
    inline def setAncillarySourceSettings(value: AncillarySourceSettings): Self = StObject.set(x, "AncillarySourceSettings", value.asInstanceOf[js.Any])
    
    inline def setAncillarySourceSettingsUndefined: Self = StObject.set(x, "AncillarySourceSettings", js.undefined)
    
    inline def setDvbSubSourceSettings(value: DvbSubSourceSettings): Self = StObject.set(x, "DvbSubSourceSettings", value.asInstanceOf[js.Any])
    
    inline def setDvbSubSourceSettingsUndefined: Self = StObject.set(x, "DvbSubSourceSettings", js.undefined)
    
    inline def setEmbeddedSourceSettings(value: EmbeddedSourceSettings): Self = StObject.set(x, "EmbeddedSourceSettings", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedSourceSettingsUndefined: Self = StObject.set(x, "EmbeddedSourceSettings", js.undefined)
    
    inline def setFileSourceSettings(value: FileSourceSettings): Self = StObject.set(x, "FileSourceSettings", value.asInstanceOf[js.Any])
    
    inline def setFileSourceSettingsUndefined: Self = StObject.set(x, "FileSourceSettings", js.undefined)
    
    inline def setSourceType(value: CaptionSourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    inline def setTeletextSourceSettings(value: TeletextSourceSettings): Self = StObject.set(x, "TeletextSourceSettings", value.asInstanceOf[js.Any])
    
    inline def setTeletextSourceSettingsUndefined: Self = StObject.set(x, "TeletextSourceSettings", js.undefined)
    
    inline def setTrackSourceSettings(value: TrackSourceSettings): Self = StObject.set(x, "TrackSourceSettings", value.asInstanceOf[js.Any])
    
    inline def setTrackSourceSettingsUndefined: Self = StObject.set(x, "TrackSourceSettings", js.undefined)
    
    inline def setWebvttHlsSourceSettings(value: WebvttHlsSourceSettings): Self = StObject.set(x, "WebvttHlsSourceSettings", value.asInstanceOf[js.Any])
    
    inline def setWebvttHlsSourceSettingsUndefined: Self = StObject.set(x, "WebvttHlsSourceSettings", js.undefined)
  }
}
