package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is thrown in order to transport an error to Basic.
  * @since OOo 2.0
  */
trait BasicErrorException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** The error code. */
  var ErrorCode: scala.Double
  /** Specifies the argument which is used in the localized error message for the placeholder. */
  var ErrorMessageArgument: java.lang.String
}

