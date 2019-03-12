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
    acquire: () => scala.Unit,
    end: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    rehearseTimings: () => scala.Unit,
    release: () => scala.Unit,
    start: () => scala.Unit
  ): XPresentation = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), end = js.Any.fromFunction0(end), queryInterface = js.Any.fromFunction1(queryInterface), rehearseTimings = js.Any.fromFunction0(rehearseTimings), release = js.Any.fromFunction0(release), start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[XPresentation]
  }
}

