package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlkTimeControl extends js.Object {
  
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
  implicit class OlkTimeControlOps[Self <: OlkTimeControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoSize(value: Boolean): Self = this.set("AutoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoWordSelect(value: Boolean): Self = this.set("AutoWordSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackColor(value: OLE_COLOR): Self = this.set("BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackStyle(value: OlBackStyle): Self = this.set("BackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDown(value: () => Unit): Self = this.set("DropDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterFieldBehavior(value: OlEnterFieldBehavior): Self = this.set("EnterFieldBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: StdFont): Self = this.set("Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeColor(value: OLE_COLOR): Self = this.set("ForeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideSelection(value: Boolean): Self = this.set("HideSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalTime(value: VarDate): Self = this.set("IntervalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("Locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = this.set("MouseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousePointer(value: OlMousePointer): Self = this.set("MousePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotOlkTimeControl_typekey(value: OlkTimeControl): Self = this.set("Outlook.OlkTimeControl_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceTime(value: VarDate): Self = this.set("ReferenceTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: OlTimeStyle): Self = this.set("Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: OlTextAlign): Self = this.set("TextAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: VarDate): Self = this.set("Time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
