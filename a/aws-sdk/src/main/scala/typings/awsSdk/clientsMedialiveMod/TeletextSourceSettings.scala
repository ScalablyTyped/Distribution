package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeletextSourceSettings extends StObject {
  
  /**
    * Optionally defines a region where TTML style captions will be displayed
    */
  var OutputRectangle: js.UndefOr[CaptionRectangle] = js.undefined
  
  /**
    * Specifies the teletext page number within the data stream from which to extract captions. Range of 0x100 (256) to 0x8FF (2303). Unused for passthrough. Should be specified as a hexadecimal string with no "0x" prefix.
    */
  var PageNumber: js.UndefOr[string] = js.undefined
}
object TeletextSourceSettings {
  
  inline def apply(): TeletextSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeletextSourceSettings]
  }
  
  extension [Self <: TeletextSourceSettings](x: Self) {
    
    inline def setOutputRectangle(value: CaptionRectangle): Self = StObject.set(x, "OutputRectangle", value.asInstanceOf[js.Any])
    
    inline def setOutputRectangleUndefined: Self = StObject.set(x, "OutputRectangle", js.undefined)
    
    inline def setPageNumber(value: string): Self = StObject.set(x, "PageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "PageNumber", js.undefined)
  }
}
