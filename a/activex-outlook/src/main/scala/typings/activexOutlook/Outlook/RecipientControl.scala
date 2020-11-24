package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientControl extends js.Object {
  
  var BackColor: Double = js.native
  
  var Enabled: Double = js.native
  
  var Font: js.Any = js.native
  
  var ForeColor: Double = js.native
  
  @JSName("Outlook._RecipientControl_typekey")
  var OutlookDot_RecipientControl_typekey: RecipientControl = js.native
  
  var ReadOnly: Double = js.native
  
  var SpecialEffect: Double = js.native
}
object RecipientControl {
  
  @scala.inline
  def apply(
    BackColor: Double,
    Enabled: Double,
    Font: js.Any,
    ForeColor: Double,
    OutlookDot_RecipientControl_typekey: RecipientControl,
    ReadOnly: Double,
    SpecialEffect: Double
  ): RecipientControl = {
    val __obj = js.Dynamic.literal(BackColor = BackColor.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], SpecialEffect = SpecialEffect.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook._RecipientControl_typekey")(OutlookDot_RecipientControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientControl]
  }
  
  @scala.inline
  implicit class RecipientControlOps[Self <: RecipientControl] (val x: Self) extends AnyVal {
    
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
    def setBackColor(value: Double): Self = this.set("BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Double): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: js.Any): Self = this.set("Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeColor(value: Double): Self = this.set("ForeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDot_RecipientControl_typekey(value: RecipientControl): Self = this.set("Outlook._RecipientControl_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Double): Self = this.set("ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialEffect(value: Double): Self = this.set("SpecialEffect", value.asInstanceOf[js.Any])
  }
}
