package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLSubmit extends js.Object {
  var Action: String
  var Caption: String
  var Encoding: String
  var HTMLName: String
  var HTMLType: String
  @JSName("MSForms.HTMLSubmit_typekey")
  var MSFormsDotHTMLSubmit_typekey: HTMLSubmit
  var Method: String
}

object HTMLSubmit {
  @scala.inline
  def apply(
    Action: String,
    Caption: String,
    Encoding: String,
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLSubmit_typekey: HTMLSubmit,
    Method: String
  ): HTMLSubmit = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], Method = Method.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLSubmit_typekey")(MSFormsDotHTMLSubmit_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLSubmit]
  }
}

