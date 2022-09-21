package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlkDateControl extends StObject {
  
  var AutoSize: Boolean
  
  var AutoWordSelect: Boolean
  
  var BackColor: OLE_COLOR
  
  var BackStyle: OlBackStyle
  
  var Date: VarDate
  
  def DropDown(): Unit
  
  var Enabled: Boolean
  
  var EnterFieldBehavior: OlEnterFieldBehavior
  
  val Font: StdFont
  
  var ForeColor: OLE_COLOR
  
  var HideSelection: Boolean
  
  var Locked: Boolean
  
  var MouseIcon: StdPicture
  
  var MousePointer: OlMousePointer
  
  /* private */ @JSName("Outlook.OlkDateControl_typekey")
  var OutlookDotOlkDateControl_typekey: OlkDateControl
  
  var ShowNoneButton: Boolean
  
  var Text: String
  
  var TextAlign: OlTextAlign
  
  var Value: Any
}
object OlkDateControl {
  
  inline def apply(
    AutoSize: Boolean,
    AutoWordSelect: Boolean,
    BackColor: OLE_COLOR,
    BackStyle: OlBackStyle,
    Date: VarDate,
    DropDown: () => Unit,
    Enabled: Boolean,
    EnterFieldBehavior: OlEnterFieldBehavior,
    Font: StdFont,
    ForeColor: OLE_COLOR,
    HideSelection: Boolean,
    Locked: Boolean,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkDateControl_typekey: OlkDateControl,
    ShowNoneButton: Boolean,
    Text: String,
    TextAlign: OlTextAlign,
    Value: Any
  ): OlkDateControl = {
    val __obj = js.Dynamic.literal(AutoSize = AutoSize.asInstanceOf[js.Any], AutoWordSelect = AutoWordSelect.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], DropDown = js.Any.fromFunction0(DropDown), Enabled = Enabled.asInstanceOf[js.Any], EnterFieldBehavior = EnterFieldBehavior.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], HideSelection = HideSelection.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], ShowNoneButton = ShowNoneButton.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkDateControl_typekey")(OutlookDotOlkDateControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkDateControl]
  }
  
  extension [Self <: OlkDateControl](x: Self) {
    
    inline def setAutoSize(value: Boolean): Self = StObject.set(x, "AutoSize", value.asInstanceOf[js.Any])
    
    inline def setAutoWordSelect(value: Boolean): Self = StObject.set(x, "AutoWordSelect", value.asInstanceOf[js.Any])
    
    inline def setBackColor(value: OLE_COLOR): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    inline def setBackStyle(value: OlBackStyle): Self = StObject.set(x, "BackStyle", value.asInstanceOf[js.Any])
    
    inline def setDate(value: VarDate): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setDropDown(value: () => Unit): Self = StObject.set(x, "DropDown", js.Any.fromFunction0(value))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnterFieldBehavior(value: OlEnterFieldBehavior): Self = StObject.set(x, "EnterFieldBehavior", value.asInstanceOf[js.Any])
    
    inline def setFont(value: StdFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setForeColor(value: OLE_COLOR): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    inline def setHideSelection(value: Boolean): Self = StObject.set(x, "HideSelection", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    inline def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    inline def setMousePointer(value: OlMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotOlkDateControl_typekey(value: OlkDateControl): Self = StObject.set(x, "Outlook.OlkDateControl_typekey", value.asInstanceOf[js.Any])
    
    inline def setShowNoneButton(value: Boolean): Self = StObject.set(x, "ShowNoneButton", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: OlTextAlign): Self = StObject.set(x, "TextAlign", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
