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

object XReschedule {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    reschedule: js.Function0[scala.Unit]
  ): XReschedule = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, reschedule = reschedule)
  
    __obj.asInstanceOf[XReschedule]
  }
}

