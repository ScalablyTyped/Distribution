package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDOMProcessingInstruction extends js.Object {
  @JSName("MSHTML.IDOMProcessingInstruction_typekey")
  var MSHTMLDotIDOMProcessingInstruction_typekey: IDOMProcessingInstruction
  var data: String
  val target: String
}

object IDOMProcessingInstruction {
  @scala.inline
  def apply(
    MSHTMLDotIDOMProcessingInstruction_typekey: IDOMProcessingInstruction,
    data: String,
    target: String
  ): IDOMProcessingInstruction = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IDOMProcessingInstruction_typekey")(MSHTMLDotIDOMProcessingInstruction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMProcessingInstruction]
  }
}

