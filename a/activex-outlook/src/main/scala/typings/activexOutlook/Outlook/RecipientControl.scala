package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientControl extends js.Object {
  var BackColor: Double
  var Enabled: Double
  var Font: js.Any
  var ForeColor: Double
  @JSName("Outlook._RecipientControl_typekey")
  var OutlookDot_RecipientControl_typekey: RecipientControl
  var ReadOnly: Double
  var SpecialEffect: Double
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
}

