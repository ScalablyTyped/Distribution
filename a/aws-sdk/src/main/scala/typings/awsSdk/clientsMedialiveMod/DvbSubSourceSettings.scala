package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DvbSubSourceSettings extends StObject {
  
  /**
    * If you will configure a WebVTT caption description that references this caption selector, use this field to
  provide the language to consider when translating the image-based source to text.
    */
  var OcrLanguage: js.UndefOr[DvbSubOcrLanguage] = js.undefined
  
  /**
    * When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the source content. Unused for DVB-Sub passthrough. All DVB-Sub content is passed through, regardless of selectors.
    */
  var Pid: js.UndefOr[integerMin1] = js.undefined
}
object DvbSubSourceSettings {
  
  inline def apply(): DvbSubSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DvbSubSourceSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DvbSubSourceSettings] (val x: Self) extends AnyVal {
    
    inline def setOcrLanguage(value: DvbSubOcrLanguage): Self = StObject.set(x, "OcrLanguage", value.asInstanceOf[js.Any])
    
    inline def setOcrLanguageUndefined: Self = StObject.set(x, "OcrLanguage", js.undefined)
    
    inline def setPid(value: integerMin1): Self = StObject.set(x, "Pid", value.asInstanceOf[js.Any])
    
    inline def setPidUndefined: Self = StObject.set(x, "Pid", js.undefined)
  }
}
