package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFormatRule extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  var Enabled: Boolean
  var Filter: String
  var Font: ViewFont
  var Name: String
  @JSName("Outlook.AutoFormatRule_typekey")
  var OutlookDotAutoFormatRule_typekey: AutoFormatRule
  val Parent: js.Any
  val Session: NameSpace
  val Standard: Boolean
}

object AutoFormatRule {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Enabled: Boolean,
    Filter: String,
    Font: ViewFont,
    Name: String,
    OutlookDotAutoFormatRule_typekey: AutoFormatRule,
    Parent: js.Any,
    Session: NameSpace,
    Standard: Boolean
  ): AutoFormatRule = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AutoFormatRule_typekey")(OutlookDotAutoFormatRule_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFormatRule]
  }
}

