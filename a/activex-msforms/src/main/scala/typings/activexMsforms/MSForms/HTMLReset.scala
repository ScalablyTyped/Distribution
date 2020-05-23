package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLReset extends js.Object {
  var Caption: String
  var HTMLName: String
  var HTMLType: String
  @JSName("MSForms.HTMLReset_typekey")
  var MSFormsDotHTMLReset_typekey: HTMLReset
}

object HTMLReset {
  @scala.inline
  def apply(Caption: String, HTMLName: String, HTMLType: String, MSFormsDotHTMLReset_typekey: HTMLReset): HTMLReset = {
    val __obj = js.Dynamic.literal(Caption = Caption.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLReset_typekey")(MSFormsDotHTMLReset_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLReset]
  }
}

