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

