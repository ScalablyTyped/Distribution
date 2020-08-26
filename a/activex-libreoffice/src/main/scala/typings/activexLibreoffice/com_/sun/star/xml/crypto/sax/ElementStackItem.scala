package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.com_.sun.star.xml.sax.XAttributeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A struct to keep a startElement/endElement SAX event. */
@js.native
trait ElementStackItem extends js.Object {
  /** the name of the element */
  var elementName: String = js.native
  /** whether it is a startElement event */
  var isStartElementEvent: Boolean = js.native
  /** attribute list for a startElement event */
  var xAttributes: XAttributeList = js.native
}

object ElementStackItem {
  @scala.inline
  def apply(elementName: String, isStartElementEvent: Boolean, xAttributes: XAttributeList): ElementStackItem = {
    val __obj = js.Dynamic.literal(elementName = elementName.asInstanceOf[js.Any], isStartElementEvent = isStartElementEvent.asInstanceOf[js.Any], xAttributes = xAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementStackItem]
  }
  @scala.inline
  implicit class ElementStackItemOps[Self <: ElementStackItem] (val x: Self) extends AnyVal {
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
    def setElementName(value: String): Self = this.set("elementName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsStartElementEvent(value: Boolean): Self = this.set("isStartElementEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setXAttributes(value: XAttributeList): Self = this.set("xAttributes", value.asInstanceOf[js.Any])
  }
  
}

