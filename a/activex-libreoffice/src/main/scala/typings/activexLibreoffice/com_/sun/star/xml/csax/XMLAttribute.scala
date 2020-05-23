package typings.activexLibreoffice.com_.sun.star.xml.csax

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
    val __obj = js.Dynamic.literal(sName = sName.asInstanceOf[js.Any], sValue = sValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLAttribute]
  }
}

