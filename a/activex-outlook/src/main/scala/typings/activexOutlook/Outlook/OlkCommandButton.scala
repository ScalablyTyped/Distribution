package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlkCommandButton extends StObject {
  
  var Accelerator: String
  
  var AutoSize: Boolean
  
  var Caption: String
  
  var DisplayDropArrow: Boolean
  
  var Enabled: Boolean
  
  val Font: StdFont
  
  var MouseIcon: StdPicture
  
  var MousePointer: OlMousePointer
  
  /* private */ @JSName("Outlook.OlkCommandButton_typekey")
  var OutlookDotOlkCommandButton_typekey: OlkCommandButton
  
  var Picture: StdPicture
  
  var PictureAlignment: OlPictureAlignment
  
  var TextAlign: OlTextAlign
  
  var WordWrap: Boolean
}
object OlkCommandButton {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: OlkCommandButton] (val x: Self) extends AnyVal {
    
    inline def setAccelerator(value: String): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    inline def setAutoSize(value: Boolean): Self = StObject.set(x, "AutoSize", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setDisplayDropArrow(value: Boolean): Self = StObject.set(x, "DisplayDropArrow", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setFont(value: StdFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    inline def setMousePointer(value: OlMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotOlkCommandButton_typekey(value: OlkCommandButton): Self = StObject.set(x, "Outlook.OlkCommandButton_typekey", value.asInstanceOf[js.Any])
    
    inline def setPicture(value: StdPicture): Self = StObject.set(x, "Picture", value.asInstanceOf[js.Any])
    
    inline def setPictureAlignment(value: OlPictureAlignment): Self = StObject.set(x, "PictureAlignment", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: OlTextAlign): Self = StObject.set(x, "TextAlign", value.asInstanceOf[js.Any])
    
    inline def setWordWrap(value: Boolean): Self = StObject.set(x, "WordWrap", value.asInstanceOf[js.Any])
  }
}
