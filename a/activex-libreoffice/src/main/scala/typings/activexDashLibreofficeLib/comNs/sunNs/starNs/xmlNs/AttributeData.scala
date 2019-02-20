package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs

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
  var Namespace: java.lang.String
  /**
    * the type of this XML attribute.
    *
    * For non validating parsers this must be CDATA.
    */
  var Type: java.lang.String
  /** the string value of this XML attribute. */
  var Value: java.lang.String
}

