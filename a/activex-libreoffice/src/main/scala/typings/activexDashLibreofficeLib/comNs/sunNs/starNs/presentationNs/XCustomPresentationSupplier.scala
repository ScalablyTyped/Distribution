package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * must be supported to provide access to customized presentations of a presentation document.
  * @see XCustomPresentation
  * @see XCustomPresentationAccess
  */
trait XCustomPresentationSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the {@link CustomPresentation} . */
  val CustomPresentations: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /** @returns the {@link CustomPresentation} . */
  def getCustomPresentations(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
}

object XCustomPresentationSupplier {
  @scala.inline
  def apply(
    CustomPresentations: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    acquire: js.Function0[scala.Unit],
    getCustomPresentations: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCustomPresentationSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CustomPresentations")(CustomPresentations)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getCustomPresentations")(getCustomPresentations)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XCustomPresentationSupplier]
  }
}

