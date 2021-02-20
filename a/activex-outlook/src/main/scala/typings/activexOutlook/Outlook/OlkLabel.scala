package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlkLabel extends StObject {
  
  var Accelerator: String = js.native
  
  var AutoSize: Boolean = js.native
  
  var BackColor: OLE_COLOR = js.native
  
  var BackStyle: OlBackStyle = js.native
  
  var BorderStyle: OlBorderStyle = js.native
  
  var Caption: String = js.native
  
  var Enabled: Boolean = js.native
  
  val Font: StdFont = js.native
  
  var ForeColor: OLE_COLOR = js.native
  
  var MouseIcon: StdPicture = js.native
  
  var MousePointer: OlMousePointer = js.native
  
  @JSName("Outlook.OlkLabel_typekey")
  var OutlookDotOlkLabel_typekey: OlkLabel = js.native
  
  var TextAlign: OlTextAlign = js.native
  
  var UseHeaderColor: Boolean = js.native
  
  var Value: js.Any = js.native
  
  var WordWrap: Boolean = js.native
}
object OlkLabel {
  
  @scala.inline
  def apply(
    Accelerator: String,
    AutoSize: Boolean,
    BackColor: OLE_COLOR,
    BackStyle: OlBackStyle,
    BorderStyle: OlBorderStyle,
    Caption: String,
    Enabled: Boolean,
    Font: StdFont,
    ForeColor: OLE_COLOR,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkLabel_typekey: OlkLabel,
    TextAlign: OlTextAlign,
    UseHeaderColor: Boolean,
    Value: js.Any,
    WordWrap: Boolean
  ): OlkLabel = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], BorderStyle = BorderStyle.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], UseHeaderColor = UseHeaderColor.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkLabel_typekey")(OutlookDotOlkLabel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkLabel]
  }
  
  @scala.inline
  implicit class OlkLabelMutableBuilder[Self <: OlkLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerator(value: String): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSize(value: Boolean): Self = StObject.set(x, "AutoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackColor(value: OLE_COLOR): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackStyle(value: OlBackStyle): Self = StObject.set(x, "BackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyle(value: OlBorderStyle): Self = StObject.set(x, "BorderStyle", value.asInstanceOf[js.Any])
    
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
    def setOutlookDotOlkLabel_typekey(value: OlkLabel): Self = StObject.set(x, "Outlook.OlkLabel_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: OlTextAlign): Self = StObject.set(x, "TextAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHeaderColor(value: Boolean): Self = StObject.set(x, "UseHeaderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrap(value: Boolean): Self = StObject.set(x, "WordWrap", value.asInstanceOf[js.Any])
  }
}
