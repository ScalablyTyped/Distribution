package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** With this interface you can control any object that implements a {@link Presentation} . */
trait XPresentation
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** The presentation is stopped and the full-screen mode will end. */
  def end(): scala.Unit
  /** Starts the presentation from the beginning and shows the actual running time to the user. */
  def rehearseTimings(): scala.Unit
  /** The presentation is shown in full-screen and started from the beginning. */
  def start(): scala.Unit
}

object XPresentation {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    end: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    rehearseTimings: js.Function0[scala.Unit],
    release: js.Function0[scala.Unit],
    start: js.Function0[scala.Unit]
  ): XPresentation = {
    val __obj = js.Dynamic.literal(acquire = acquire, end = end, queryInterface = queryInterface, rehearseTimings = rehearseTimings, release = release, start = start)
  
    __obj.asInstanceOf[XPresentation]
  }
}

