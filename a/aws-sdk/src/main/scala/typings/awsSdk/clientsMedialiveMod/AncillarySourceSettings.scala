package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AncillarySourceSettings extends StObject {
  
  /**
    * Specifies the number (1 to 4) of the captions channel you want to extract from the ancillary captions. If you plan to convert the ancillary captions to another format, complete this field. If you plan to choose Embedded as the captions destination in the output (to pass through all the channels in the ancillary captions), leave this field blank because MediaLive ignores the field.
    */
  var SourceAncillaryChannelNumber: js.UndefOr[integerMin1Max4] = js.undefined
}
object AncillarySourceSettings {
  
  inline def apply(): AncillarySourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AncillarySourceSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AncillarySourceSettings] (val x: Self) extends AnyVal {
    
    inline def setSourceAncillaryChannelNumber(value: integerMin1Max4): Self = StObject.set(x, "SourceAncillaryChannelNumber", value.asInstanceOf[js.Any])
    
    inline def setSourceAncillaryChannelNumberUndefined: Self = StObject.set(x, "SourceAncillaryChannelNumber", js.undefined)
  }
}
