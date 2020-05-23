package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLHidden extends js.Object {
  var HTMLName: String
  var HTMLType: String
  @JSName("MSForms.HTMLHidden_typekey")
  var MSFormsDotHTMLHidden_typekey: HTMLHidden
  var Value: String
}

object HTMLHidden {
  @scala.inline
  def apply(HTMLName: String, HTMLType: String, MSFormsDotHTMLHidden_typekey: HTMLHidden, Value: String): HTMLHidden = {
    val __obj = js.Dynamic.literal(HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLHidden_typekey")(MSFormsDotHTMLHidden_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLHidden]
  }
}

