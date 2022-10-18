package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mp4Settings extends StObject {
  
  /**
    * Specify this setting only when your output will be consumed by a downstream repackaging workflow that is sensitive to very small duration differences between video and audio. For this situation, choose Match video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with silence or trims them to ensure that the total duration of each audio stream is at least as long as the total duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
    */
  var AudioDuration: js.UndefOr[CmfcAudioDuration] = js.undefined
  
  /**
    * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
    */
  var CslgAtom: js.UndefOr[Mp4CslgAtom] = js.undefined
  
  /**
    * Ignore this setting unless compliance to the CTTS box version specification matters in your workflow. Specify a value of 1 to set your CTTS box version to 1 and make your output compliant with the specification. When you specify a value of 1, you must also set CSLG atom (cslgAtom) to the value INCLUDE. Keep the default value 0 to set your CTTS box version to 0. This can provide backward compatibility for some players and packagers.
    */
  var CttsVersion: js.UndefOr[integerMin0Max1] = js.undefined
  
  /**
    * Inserts a free-space box immediately after the moov box.
    */
  var FreeSpaceBox: js.UndefOr[Mp4FreeSpaceBox] = js.undefined
  
  /**
    * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
    */
  var MoovPlacement: js.UndefOr[Mp4MoovPlacement] = js.undefined
  
  /**
    * Overrides the "Major Brand" field in the output file. Usually not necessary to specify.
    */
  var Mp4MajorBrand: js.UndefOr[string] = js.undefined
}
object Mp4Settings {
  
  inline def apply(): Mp4Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mp4Settings]
  }
  
  extension [Self <: Mp4Settings](x: Self) {
    
    inline def setAudioDuration(value: CmfcAudioDuration): Self = StObject.set(x, "AudioDuration", value.asInstanceOf[js.Any])
    
    inline def setAudioDurationUndefined: Self = StObject.set(x, "AudioDuration", js.undefined)
    
    inline def setCslgAtom(value: Mp4CslgAtom): Self = StObject.set(x, "CslgAtom", value.asInstanceOf[js.Any])
    
    inline def setCslgAtomUndefined: Self = StObject.set(x, "CslgAtom", js.undefined)
    
    inline def setCttsVersion(value: integerMin0Max1): Self = StObject.set(x, "CttsVersion", value.asInstanceOf[js.Any])
    
    inline def setCttsVersionUndefined: Self = StObject.set(x, "CttsVersion", js.undefined)
    
    inline def setFreeSpaceBox(value: Mp4FreeSpaceBox): Self = StObject.set(x, "FreeSpaceBox", value.asInstanceOf[js.Any])
    
    inline def setFreeSpaceBoxUndefined: Self = StObject.set(x, "FreeSpaceBox", js.undefined)
    
    inline def setMoovPlacement(value: Mp4MoovPlacement): Self = StObject.set(x, "MoovPlacement", value.asInstanceOf[js.Any])
    
    inline def setMoovPlacementUndefined: Self = StObject.set(x, "MoovPlacement", js.undefined)
    
    inline def setMp4MajorBrand(value: string): Self = StObject.set(x, "Mp4MajorBrand", value.asInstanceOf[js.Any])
    
    inline def setMp4MajorBrandUndefined: Self = StObject.set(x, "Mp4MajorBrand", js.undefined)
  }
}
