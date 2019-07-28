package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** store the type and value of an XML attribute inside a XNameContainer */
trait AttributeData extends js.Object {
  /**
    * the namespace of this XML attribute.
    *
    * This string can be empty if you are not using namespaces.
    */
  var Namespace: String
  /**
    * the type of this XML attribute.
    *
    * For non validating parsers this must be CDATA.
    */
  var Type: String
  /** the string value of this XML attribute. */
  var Value: String
}

object AttributeData {
  @scala.inline
  def apply(Namespace: String, Type: String, Value: String): AttributeData = {
    val __obj = js.Dynamic.literal(Namespace = Namespace, Type = Type, Value = Value)
  
    __obj.asInstanceOf[AttributeData]
  }
}

