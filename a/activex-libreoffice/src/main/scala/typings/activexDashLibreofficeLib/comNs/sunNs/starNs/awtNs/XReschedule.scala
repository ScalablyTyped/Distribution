package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link XReschedule} interface can be used to give control to the main thread to allow events processing.
  * @deprecated DeprecatedThis interface was only implemented in an intermediate developer release anyway.
  * @since OOo 2.0
  */
trait XReschedule
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Allow the main thread to process some events. */
  def reschedule(): scala.Unit
}

