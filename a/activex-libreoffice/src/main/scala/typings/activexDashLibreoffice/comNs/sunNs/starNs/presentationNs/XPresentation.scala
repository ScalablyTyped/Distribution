package typings.activexDashLibreoffice.comNs.sunNs.starNs.presentationNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** With this interface you can control any object that implements a {@link Presentation} . */
trait XPresentation extends XInterface {
  /** The presentation is stopped and the full-screen mode will end. */
  def end(): Unit
  /** Starts the presentation from the beginning and shows the actual running time to the user. */
  def rehearseTimings(): Unit
  /** The presentation is shown in full-screen and started from the beginning. */
  def start(): Unit
}

object XPresentation {
  @scala.inline
  def apply(
    acquire: () => Unit,
    end: () => Unit,
    queryInterface: `type` => js.Any,
    rehearseTimings: () => Unit,
    release: () => Unit,
    start: () => Unit
  ): XPresentation = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), end = js.Any.fromFunction0(end), queryInterface = js.Any.fromFunction1(queryInterface), rehearseTimings = js.Any.fromFunction0(rehearseTimings), release = js.Any.fromFunction0(release), start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[XPresentation]
  }
}

