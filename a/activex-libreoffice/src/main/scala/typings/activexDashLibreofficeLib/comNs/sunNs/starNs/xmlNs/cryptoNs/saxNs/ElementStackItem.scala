package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A struct to keep a startElement/endElement SAX event. */
trait ElementStackItem extends js.Object {
  /** the name of the element */
  var elementName: java.lang.String
  /** whether it is a startElement event */
  var isStartElementEvent: scala.Boolean
  /** attribute list for a startElement event */
  var xAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XAttributeList
}

object ElementStackItem {
  @scala.inline
  def apply(
    elementName: java.lang.String,
    isStartElementEvent: scala.Boolean,
    xAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XAttributeList
  ): ElementStackItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("elementName")(elementName)
    __obj.updateDynamic("isStartElementEvent")(isStartElementEvent)
    __obj.updateDynamic("xAttributes")(xAttributes)
    __obj.asInstanceOf[ElementStackItem]
  }
}

