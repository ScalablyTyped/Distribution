package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLImage extends js.Object {
  var Action: String
  var Encoding: String
  var HTMLName: String
  var HTMLType: String
  @JSName("MSForms.HTMLImage_typekey")
  var MSFormsDotHTMLImage_typekey: HTMLImage
  var Method: String
  var Source: String
}

object HTMLImage {
  @scala.inline
  def apply(
    Action: String,
    Encoding: String,
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLImage_typekey: HTMLImage,
    Method: String,
    Source: String
  ): HTMLImage = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], Method = Method.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLImage_typekey")(MSFormsDotHTMLImage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLImage]
  }
}

