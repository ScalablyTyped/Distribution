package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an [XSD compliant string type]{@link url="http://www.w3.org/TR/xmlschema-2/#string"} */
trait String extends XDataType {
  /**
    * specifies the length of the string
    *
    * Note that you cannot specify {@link Length} together with {@link MinLength} or {@link MaxLength} .
    */
  var Length: scala.Double
  /**
    * specifies the maximum length of the string
    *
    * Note that you cannot specify {@link MaxLength} together with {@link Length} .
    */
  var MaxLength: scala.Double
  /**
    * specifies the minimum length of the string
    *
    * Note that you cannot specify {@link MinLength} together with {@link Length} .
    */
  var MinLength: scala.Double
}

