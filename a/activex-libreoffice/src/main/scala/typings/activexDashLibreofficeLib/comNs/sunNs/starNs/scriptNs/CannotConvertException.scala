package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This exception is thrown to indicate that a type conversion can not be performed. */
trait CannotConvertException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** If the conversion of a method argument fails, this is the index of the value in the "IN" argument list. [optional] */
  var ArgumentIndex: scala.Double
  /** This member contains the class of the type to which the value should be converted. */
  var DestinationTypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  /** This member contains the reason that the conversion failed. Have a look at {@link FailReason} . */
  var Reason: scala.Double
}

