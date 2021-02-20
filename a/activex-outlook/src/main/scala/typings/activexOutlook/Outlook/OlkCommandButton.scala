package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlkCommandButton extends StObject {
  
  var Accelerator: String = js.native
  
  var AutoSize: Boolean = js.native
  
  var Caption: String = js.native
  
  var DisplayDropArrow: Boolean = js.native
  
  var Enabled: Boolean = js.native
  
  val Font: StdFont = js.native
  
  var MouseIcon: StdPicture = js.native
  
  var MousePointer: OlMousePointer = js.native
  
  @JSName("Outlook.OlkCommandButton_typekey")
  var OutlookDotOlkCommandButton_typekey: OlkCommandButton = js.native
  
  var Picture: StdPicture = js.native
  
  var PictureAlignment: OlPictureAlignment = js.native
  
  var TextAlign: OlTextAlign = js.native
  
  var WordWrap: Boolean = js.native
}
object OlkCommandButton {
  
  @scala.inline
  def apply(
    Accelerator: String,
    AutoSize: Boolean,
    Caption: String,
    DisplayDropArrow: Boolean,
    Enabled: Boolean,
    Font: StdFont,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkCommandButton_typekey: OlkCommandButton,
    Picture: StdPicture,
    PictureAlignment: OlPictureAlignment,
    TextAlign: OlTextAlign,
    WordWrap: Boolean
  ): OlkCommandButton = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], DisplayDropArrow = DisplayDropArrow.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], PictureAlignment = PictureAlignment.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkCommandButton_typekey")(OutlookDotOlkCommandButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkCommandButton]
  }
  
  @scala.inline
  implicit class OlkCommandButtonMutableBuilder[Self <: OlkCommandButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerator(value: String): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSize(value: Boolean): Self = StObject.set(x, "AutoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDropArrow(value: Boolean): Self = StObject.set(x, "DisplayDropArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: StdFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousePointer(value: OlMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotOlkCommandButton_typekey(value: OlkCommandButton): Self = StObject.set(x, "Outlook.OlkCommandButton_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicture(value: StdPicture): Self = StObject.set(x, "Picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureAlignment(value: OlPictureAlignment): Self = StObject.set(x, "PictureAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: OlTextAlign): Self = StObject.set(x, "TextAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrap(value: Boolean): Self = StObject.set(x, "WordWrap", value.asInstanceOf[js.Any])
  }
}
