package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** controls a presentation directly. This supplier will do this. */
trait XPresentationSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns an interface to control a presentation. */
  val Presentation: XPresentation
  /** @returns an interface to control a presentation. */
  def getPresentation(): XPresentation
}

