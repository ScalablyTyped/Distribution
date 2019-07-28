package typings.activexDashLibreoffice.comNs.sunNs.starNs.javaNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** indicates that an operation involving Java (probably executing Java code) failed due to a wrong Java version. */
trait WrongJavaVersionException extends Exception {
  /** contains the Java version that has been detected, or is left empty if this is unknown. */
  var DetectedVersion: String
  /** contains the highest Java version for which the operation would succeed, or is left empty if this is unknown. */
  var HighestSupportedVersion: String
  /** contains the lowest Java version for which the operation would succeed, or is left empty if this is unknown. */
  var LowestSupportedVersion: String
}

object WrongJavaVersionException {
  @scala.inline
  def apply(
    Context: XInterface,
    DetectedVersion: String,
    HighestSupportedVersion: String,
    LowestSupportedVersion: String,
    Message: String
  ): WrongJavaVersionException = {
    val __obj = js.Dynamic.literal(Context = Context, DetectedVersion = DetectedVersion, HighestSupportedVersion = HighestSupportedVersion, LowestSupportedVersion = LowestSupportedVersion, Message = Message)
  
    __obj.asInstanceOf[WrongJavaVersionException]
  }
}

