package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLDOMAttribute extends js.Object {
  @JSName("MSHTML.IHTMLDOMAttribute_typekey")
  var MSHTMLDotIHTMLDOMAttribute_typekey: IHTMLDOMAttribute
  val nodeName: String
  var nodeValue: js.Any
  val specified: Boolean
}

object IHTMLDOMAttribute {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLDOMAttribute_typekey: IHTMLDOMAttribute,
    nodeName: String,
    nodeValue: js.Any,
    specified: Boolean
  ): IHTMLDOMAttribute = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], specified = specified.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLDOMAttribute_typekey")(MSHTMLDotIHTMLDOMAttribute_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLDOMAttribute]
  }
}

