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
    acquire: js.Function0[scala.Unit],
    getPresentation: js.Function0[XPresentation],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPresentationSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Presentation")(Presentation)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getPresentation")(getPresentation)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XPresentationSupplier]
  }
}

