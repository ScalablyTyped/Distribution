package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSourceSettings extends StObject {
  
  /**
    * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
    */
  var Convert608To708: js.UndefOr[FileSourceConvert608To708] = js.undefined
  
  /**
    * Ignore this setting unless your input captions format is SCC. To have the service compensate for differing frame rates between your input captions and input video, specify the frame rate of the captions file. Specify this value as a fraction. When you work directly in your JSON job specification, use the settings framerateNumerator and framerateDenominator. For example, you might specify 24 / 1 for 24 fps, 25 / 1 for 25 fps, 24000 / 1001 for 23.976 fps, or 30000 / 1001 for 29.97 fps.
    */
  var Framerate: js.UndefOr[CaptionSourceFramerate] = js.undefined
  
  /**
    * External caption file used for loading captions. Accepted file extensions are 'scc', 'ttml', 'dfxp', 'stl', 'srt', 'xml', 'smi', 'webvtt', and 'vtt'.
    */
  var SourceFile: js.UndefOr[
    stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIVttVTTWebvttWEBVTTHttpsSccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIVttVTTWebvttWEBVTT
  ] = js.undefined
  
  /**
    * Optional. Use this setting when you need to adjust the sync between your sidecar captions and your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/time-delta-use-cases.html. Enter a positive or negative number to modify the times in the captions file. For example, type 15 to add 15 seconds to all the times in the captions file. Type -5 to subtract 5 seconds from the times in the captions file. You can optionally specify your time delta in milliseconds instead of seconds. When you do so, set the related setting, Time delta units (TimeDeltaUnits) to Milliseconds (MILLISECONDS). Note that, when you specify a time delta for timecode-based caption sources, such as SCC and STL, and your time delta isn't a multiple of the input frame rate, MediaConvert snaps the captions to the nearest frame. For example, when your input video frame rate is 25 fps and you specify 1010ms for time delta, MediaConvert delays your captions by 1000 ms.
    */
  var TimeDelta: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.undefined
  
  /**
    * When you use the setting Time delta (TimeDelta) to adjust the sync between your sidecar captions and your video, use this setting to specify the units for the delta that you specify. When you don't specify a value for Time delta units (TimeDeltaUnits), MediaConvert uses seconds by default.
    */
  var TimeDeltaUnits: js.UndefOr[FileSourceTimeDeltaUnits] = js.undefined
}
object FileSourceSettings {
  
  inline def apply(): FileSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSourceSettings]
  }
  
  extension [Self <: FileSourceSettings](x: Self) {
    
    inline def setConvert608To708(value: FileSourceConvert608To708): Self = StObject.set(x, "Convert608To708", value.asInstanceOf[js.Any])
    
    inline def setConvert608To708Undefined: Self = StObject.set(x, "Convert608To708", js.undefined)
    
    inline def setFramerate(value: CaptionSourceFramerate): Self = StObject.set(x, "Framerate", value.asInstanceOf[js.Any])
    
    inline def setFramerateUndefined: Self = StObject.set(x, "Framerate", js.undefined)
    
    inline def setSourceFile(
      value: stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIVttVTTWebvttWEBVTTHttpsSccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIVttVTTWebvttWEBVTT
    ): Self = StObject.set(x, "SourceFile", value.asInstanceOf[js.Any])
    
    inline def setSourceFileUndefined: Self = StObject.set(x, "SourceFile", js.undefined)
    
    inline def setTimeDelta(value: integerMinNegative2147483648Max2147483647): Self = StObject.set(x, "TimeDelta", value.asInstanceOf[js.Any])
    
    inline def setTimeDeltaUndefined: Self = StObject.set(x, "TimeDelta", js.undefined)
    
    inline def setTimeDeltaUnits(value: FileSourceTimeDeltaUnits): Self = StObject.set(x, "TimeDeltaUnits", value.asInstanceOf[js.Any])
    
    inline def setTimeDeltaUnitsUndefined: Self = StObject.set(x, "TimeDeltaUnits", js.undefined)
  }
}
