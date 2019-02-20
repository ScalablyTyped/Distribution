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

