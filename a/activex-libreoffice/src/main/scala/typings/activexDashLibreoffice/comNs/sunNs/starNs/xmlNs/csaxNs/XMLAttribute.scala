package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.csaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A struct to keep information of an element's attribute. */
trait XMLAttribute extends js.Object {
  /** the attribute name */
  var sName: String
  /** the attribute value */
  var sValue: String
}

object XMLAttribute {
  @scala.inline
  def apply(sName: String, sValue: String): XMLAttribute = {
    val __obj = js.Dynamic.literal(sName = sName, sValue = sValue)
  
    __obj.asInstanceOf[XMLAttribute]
  }
}

