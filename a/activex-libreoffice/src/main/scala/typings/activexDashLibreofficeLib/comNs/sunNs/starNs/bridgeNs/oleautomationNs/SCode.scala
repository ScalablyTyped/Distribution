package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.oleautomationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the UNO representation of the Automation type SCODE.
  *
  * A `SCODE` is used to express errors in Automation. In UNO it could be represented by a `long` and therefore a typedef from `long` to a particular
  * error type would do. But a typedef cannot be expressed in all language bindings. In the case where no typedefs are supported the actual type is used.
  * That is, a typedef'd error type would be represented as `int` in Java. The information that the `int` is an error type is lost.
  *
  * When calling Automation objects from UNO the distinction between error type and `long` is important. Therefore the Scode is declared as struct.
  * @since OOo 1.1.2
  */
trait SCode extends js.Object {
  var Value: scala.Double
}

