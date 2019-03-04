package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.javaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** indicates that an operation involving Java (probably executing Java code) failed due to a wrong Java version. */
trait WrongJavaVersionException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** contains the Java version that has been detected, or is left empty if this is unknown. */
  var DetectedVersion: java.lang.String
  /** contains the highest Java version for which the operation would succeed, or is left empty if this is unknown. */
  var HighestSupportedVersion: java.lang.String
  /** contains the lowest Java version for which the operation would succeed, or is left empty if this is unknown. */
  var LowestSupportedVersion: java.lang.String
}

object WrongJavaVersionException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    DetectedVersion: java.lang.String,
    HighestSupportedVersion: java.lang.String,
    LowestSupportedVersion: java.lang.String,
    Message: java.lang.String
  ): WrongJavaVersionException = {
    val __obj = js.Dynamic.literal(Context = Context, DetectedVersion = DetectedVersion, HighestSupportedVersion = HighestSupportedVersion, LowestSupportedVersion = LowestSupportedVersion, Message = Message)
  
    __obj.asInstanceOf[WrongJavaVersionException]
  }
}

