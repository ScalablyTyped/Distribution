package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlkFrameHeader extends StObject {
  
  var Alignment: OlAlignment = js.native
  
  var Caption: String = js.native
  
  var Enabled: Boolean = js.native
  
  val Font: StdFont = js.native
  
  var ForeColor: OLE_COLOR = js.native
  
  var MouseIcon: StdPicture = js.native
  
  var MousePointer: OlMousePointer = js.native
  
  @JSName("Outlook.OlkFrameHeader_typekey")
  var OutlookDotOlkFrameHeader_typekey: OlkFrameHeader = js.native
}
object OlkFrameHeader {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class OlkFrameHeaderMutableBuilder[Self <: OlkFrameHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: OlAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: StdFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeColor(value: OLE_COLOR): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousePointer(value: OlMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotOlkFrameHeader_typekey(value: OlkFrameHeader): Self = StObject.set(x, "Outlook.OlkFrameHeader_typekey", value.asInstanceOf[js.Any])
  }
}
