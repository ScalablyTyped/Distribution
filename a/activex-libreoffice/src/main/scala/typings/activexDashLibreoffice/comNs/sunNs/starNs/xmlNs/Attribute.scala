package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A struct to keep information of an element's attribute. */
trait Attribute extends js.Object {
  /** the attribute name */
  var Name: String
  /** the attribute namespace URL */
  var NamespaceURL: String
  /** the attribute value */
  var Value: String
}

object Attribute {
  @scala.inline
  def apply(Name: String, NamespaceURL: String, Value: String): Attribute = {
    val __obj = js.Dynamic.literal(Name = Name, NamespaceURL = NamespaceURL, Value = Value)
  
    __obj.asInstanceOf[Attribute]
  }
}

