package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlkCheckBox extends StObject {
  
  var Accelerator: String
  
  var Alignment: OlAlignment
  
  var BackColor: OLE_COLOR
  
  var BackStyle: OlBackStyle
  
  var Caption: String
  
  var Enabled: Boolean
  
  val Font: StdFont
  
  var ForeColor: OLE_COLOR
  
  var MouseIcon: StdPicture
  
  var MousePointer: OlMousePointer
  
  @JSName("Outlook.OlkCheckBox_typekey")
  var OutlookDotOlkCheckBox_typekey: OlkCheckBox
  
  var TripleState: Boolean
  
  var Value: js.Any
  
  var WordWrap: Boolean
}
object OlkCheckBox {
  
  @scala.inline
  def apply(
    Accelerator: String,
    Alignment: OlAlignment,
    BackColor: OLE_COLOR,
    BackStyle: OlBackStyle,
    Caption: String,
    Enabled: Boolean,
    Font: StdFont,
    ForeColor: OLE_COLOR,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkCheckBox_typekey: OlkCheckBox,
    TripleState: Boolean,
    Value: js.Any,
    WordWrap: Boolean
  ): OlkCheckBox = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], Alignment = Alignment.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], TripleState = TripleState.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkCheckBox_typekey")(OutlookDotOlkCheckBox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkCheckBox]
  }
  
  @scala.inline
  implicit class OlkCheckBoxMutableBuilder[Self <: OlkCheckBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerator(value: String): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignment(value: OlAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackColor(value: OLE_COLOR): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackStyle(value: OlBackStyle): Self = StObject.set(x, "BackStyle", value.asInstanceOf[js.Any])
    
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
    def setOutlookDotOlkCheckBox_typekey(value: OlkCheckBox): Self = StObject.set(x, "Outlook.OlkCheckBox_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTripleState(value: Boolean): Self = StObject.set(x, "TripleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrap(value: Boolean): Self = StObject.set(x, "WordWrap", value.asInstanceOf[js.Any])
  }
}
