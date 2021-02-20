package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlkTimeControl extends StObject {
  
  var AutoSize: Boolean = js.native
  
  var AutoWordSelect: Boolean = js.native
  
  var BackColor: OLE_COLOR = js.native
  
  var BackStyle: OlBackStyle = js.native
  
  def DropDown(): Unit = js.native
  
  var Enabled: Boolean = js.native
  
  var EnterFieldBehavior: OlEnterFieldBehavior = js.native
  
  val Font: StdFont = js.native
  
  var ForeColor: OLE_COLOR = js.native
  
  var HideSelection: Boolean = js.native
  
  var IntervalTime: VarDate = js.native
  
  var Locked: Boolean = js.native
  
  var MouseIcon: StdPicture = js.native
  
  var MousePointer: OlMousePointer = js.native
  
  @JSName("Outlook.OlkTimeControl_typekey")
  var OutlookDotOlkTimeControl_typekey: OlkTimeControl = js.native
  
  var ReferenceTime: VarDate = js.native
  
  var Style: OlTimeStyle = js.native
  
  var Text: String = js.native
  
  var TextAlign: OlTextAlign = js.native
  
  var Time: VarDate = js.native
  
  var Value: js.Any = js.native
}
object OlkTimeControl {
  
  @scala.inline
  def apply(
    AutoSize: Boolean,
    AutoWordSelect: Boolean,
    BackColor: OLE_COLOR,
    BackStyle: OlBackStyle,
    DropDown: () => Unit,
    Enabled: Boolean,
    EnterFieldBehavior: OlEnterFieldBehavior,
    Font: StdFont,
    ForeColor: OLE_COLOR,
    HideSelection: Boolean,
    IntervalTime: VarDate,
    Locked: Boolean,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkTimeControl_typekey: OlkTimeControl,
    ReferenceTime: VarDate,
    Style: OlTimeStyle,
    Text: String,
    TextAlign: OlTextAlign,
    Time: VarDate,
    Value: js.Any
  ): OlkTimeControl = {
    val __obj = js.Dynamic.literal(AutoSize = AutoSize.asInstanceOf[js.Any], AutoWordSelect = AutoWordSelect.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], DropDown = js.Any.fromFunction0(DropDown), Enabled = Enabled.asInstanceOf[js.Any], EnterFieldBehavior = EnterFieldBehavior.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], HideSelection = HideSelection.asInstanceOf[js.Any], IntervalTime = IntervalTime.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], ReferenceTime = ReferenceTime.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkTimeControl_typekey")(OutlookDotOlkTimeControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkTimeControl]
  }
  
  @scala.inline
  implicit class OlkTimeControlMutableBuilder[Self <: OlkTimeControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSize(value: Boolean): Self = StObject.set(x, "AutoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoWordSelect(value: Boolean): Self = StObject.set(x, "AutoWordSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackColor(value: OLE_COLOR): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackStyle(value: OlBackStyle): Self = StObject.set(x, "BackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDown(value: () => Unit): Self = StObject.set(x, "DropDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterFieldBehavior(value: OlEnterFieldBehavior): Self = StObject.set(x, "EnterFieldBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: StdFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeColor(value: OLE_COLOR): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideSelection(value: Boolean): Self = StObject.set(x, "HideSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalTime(value: VarDate): Self = StObject.set(x, "IntervalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousePointer(value: OlMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotOlkTimeControl_typekey(value: OlkTimeControl): Self = StObject.set(x, "Outlook.OlkTimeControl_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceTime(value: VarDate): Self = StObject.set(x, "ReferenceTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: OlTimeStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: OlTextAlign): Self = StObject.set(x, "TextAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: VarDate): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
