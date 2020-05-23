package typings.activexLibreoffice.com_.sun.star.xml

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
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], NamespaceURL = NamespaceURL.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
}

