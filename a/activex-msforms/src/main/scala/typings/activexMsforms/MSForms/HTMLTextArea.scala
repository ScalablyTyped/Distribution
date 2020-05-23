package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLTextArea extends js.Object {
  var Columns: Double
  var HTMLName: String
  @JSName("MSForms.HTMLTextArea_typekey")
  var MSFormsDotHTMLTextArea_typekey: HTMLTextArea
  var Rows: Double
  var Value: String
  var WordWrap: String
}

object HTMLTextArea {
  @scala.inline
  def apply(
    Columns: Double,
    HTMLName: String,
    MSFormsDotHTMLTextArea_typekey: HTMLTextArea,
    Rows: Double,
    Value: String,
    WordWrap: String
  ): HTMLTextArea = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLTextArea_typekey")(MSFormsDotHTMLTextArea_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLTextArea]
  }
}

