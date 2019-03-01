package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This exception can be thrown in case specified state can not be reached. */
trait UnreachableStateException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** The current state of the object. */
  var CurrentState: scala.Double
  /** The state that could not be reached. */
  var NextState: scala.Double
}

object UnreachableStateException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    CurrentState: scala.Double,
    Message: java.lang.String,
    NextState: scala.Double
  ): UnreachableStateException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("CurrentState")(CurrentState)
    __obj.updateDynamic("Message")(Message)
    __obj.updateDynamic("NextState")(NextState)
    __obj.asInstanceOf[UnreachableStateException]
  }
}

