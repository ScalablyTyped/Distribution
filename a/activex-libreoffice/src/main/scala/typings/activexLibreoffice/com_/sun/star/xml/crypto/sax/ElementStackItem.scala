package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.com_.sun.star.xml.sax.XAttributeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A struct to keep a startElement/endElement SAX event. */
trait ElementStackItem extends js.Object {
  /** the name of the element */
  var elementName: String
  /** whether it is a startElement event */
  var isStartElementEvent: Boolean
  /** attribute list for a startElement event */
  var xAttributes: XAttributeList
}

object ElementStackItem {
  @scala.inline
  def apply(elementName: String, isStartElementEvent: Boolean, xAttributes: XAttributeList): ElementStackItem = {
    val __obj = js.Dynamic.literal(elementName = elementName.asInstanceOf[js.Any], isStartElementEvent = isStartElementEvent.asInstanceOf[js.Any], xAttributes = xAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementStackItem]
  }
}

