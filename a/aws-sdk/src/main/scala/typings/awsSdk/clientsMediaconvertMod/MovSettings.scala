package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MovSettings extends StObject {
  
  /**
    * When enabled, include 'clap' atom if appropriate for the video output settings.
    */
  var ClapAtom: js.UndefOr[MovClapAtom] = js.undefined
  
  /**
    * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
    */
  var CslgAtom: js.UndefOr[MovCslgAtom] = js.undefined
  
  /**
    * When set to XDCAM, writes MPEG2 video streams into the QuickTime file using XDCAM fourcc codes. This increases compatibility with Apple editors and players, but may decrease compatibility with other players. Only applicable when the video codec is MPEG2.
    */
  var Mpeg2FourCCControl: js.UndefOr[MovMpeg2FourCCControl] = js.undefined
  
  /**
    * Unless you need Omneon compatibility: Keep the default value, None. To make this output compatible with Omneon: Choose Omneon. When you do, MediaConvert increases the length of the 'elst' edit list atom. Note that this might cause file rejections when a recipient of the output file doesn't expect this extra padding.
    */
  var PaddingControl: js.UndefOr[MovPaddingControl] = js.undefined
  
  /**
    * Always keep the default value (SELF_CONTAINED) for this setting.
    */
  var Reference: js.UndefOr[MovReference] = js.undefined
}
object MovSettings {
  
  inline def apply(): MovSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MovSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MovSettings] (val x: Self) extends AnyVal {
    
    inline def setClapAtom(value: MovClapAtom): Self = StObject.set(x, "ClapAtom", value.asInstanceOf[js.Any])
    
    inline def setClapAtomUndefined: Self = StObject.set(x, "ClapAtom", js.undefined)
    
    inline def setCslgAtom(value: MovCslgAtom): Self = StObject.set(x, "CslgAtom", value.asInstanceOf[js.Any])
    
    inline def setCslgAtomUndefined: Self = StObject.set(x, "CslgAtom", js.undefined)
    
    inline def setMpeg2FourCCControl(value: MovMpeg2FourCCControl): Self = StObject.set(x, "Mpeg2FourCCControl", value.asInstanceOf[js.Any])
    
    inline def setMpeg2FourCCControlUndefined: Self = StObject.set(x, "Mpeg2FourCCControl", js.undefined)
    
    inline def setPaddingControl(value: MovPaddingControl): Self = StObject.set(x, "PaddingControl", value.asInstanceOf[js.Any])
    
    inline def setPaddingControlUndefined: Self = StObject.set(x, "PaddingControl", js.undefined)
    
    inline def setReference(value: MovReference): Self = StObject.set(x, "Reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "Reference", js.undefined)
  }
}
