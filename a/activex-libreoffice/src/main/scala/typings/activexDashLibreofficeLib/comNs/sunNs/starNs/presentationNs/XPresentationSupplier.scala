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

object XPresentationSupplier {
  @scala.inline
  def apply(
    Presentation: XPresentation,
    acquire: () => scala.Unit,
    getPresentation: () => XPresentation,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XPresentationSupplier = {
    val __obj = js.Dynamic.literal(Presentation = Presentation, acquire = js.Any.fromFunction0(acquire), getPresentation = js.Any.fromFunction0(getPresentation), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XPresentationSupplier]
  }
}

