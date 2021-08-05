package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlkFrameHeader extends StObject {
  
  var Alignment: OlAlignment
  
  var Caption: String
  
  var Enabled: Boolean
  
  val Font: StdFont
  
  var ForeColor: OLE_COLOR
  
  var MouseIcon: StdPicture
  
  var MousePointer: OlMousePointer
  
  /* private */ @JSName("Outlook.OlkFrameHeader_typekey")
  var OutlookDotOlkFrameHeader_typekey: OlkFrameHeader
}
object OlkFrameHeader {
  
  inline def apply(
    Alignment: OlAlignment,
    Caption: String,
    Enabled: Boolean,
    Font: StdFont,
    ForeColor: OLE_COLOR,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkFrameHeader_typekey: OlkFrameHeader
  ): OlkFrameHeader = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkFrameHeader_typekey")(OutlookDotOlkFrameHeader_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkFrameHeader]
  }
  
  extension [Self <: OlkFrameHeader](x: Self) {
    
    inline def setAlignment(value: OlAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setFont(value: StdFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setForeColor(value: OLE_COLOR): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    inline def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    inline def setMousePointer(value: OlMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotOlkFrameHeader_typekey(value: OlkFrameHeader): Self = StObject.set(x, "Outlook.OlkFrameHeader_typekey", value.asInstanceOf[js.Any])
  }
}
