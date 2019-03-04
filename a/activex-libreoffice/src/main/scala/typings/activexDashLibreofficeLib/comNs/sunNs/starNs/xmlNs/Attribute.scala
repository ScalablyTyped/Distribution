package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A struct to keep information of an element's attribute. */
trait Attribute extends js.Object {
  /** the attribute name */
  var Name: java.lang.String
  /** the attribute namespace URL */
  var NamespaceURL: java.lang.String
  /** the attribute value */
  var Value: java.lang.String
}

object Attribute {
  @scala.inline
  def apply(Name: java.lang.String, NamespaceURL: java.lang.String, Value: java.lang.String): Attribute = {
    val __obj = js.Dynamic.literal(Name = Name, NamespaceURL = NamespaceURL, Value = Value)
  
    __obj.asInstanceOf[Attribute]
  }
}

