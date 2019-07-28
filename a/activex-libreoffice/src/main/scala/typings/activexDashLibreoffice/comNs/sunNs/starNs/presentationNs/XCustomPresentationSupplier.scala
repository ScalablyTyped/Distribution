package typings.activexDashLibreoffice.comNs.sunNs.starNs.presentationNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * must be supported to provide access to customized presentations of a presentation document.
  * @see XCustomPresentation
  * @see XCustomPresentationAccess
  */
trait XCustomPresentationSupplier extends XInterface {
  /** @returns the {@link CustomPresentation} . */
  val CustomPresentations: XNameContainer
  /** @returns the {@link CustomPresentation} . */
  def getCustomPresentations(): XNameContainer
}

object XCustomPresentationSupplier {
  @scala.inline
  def apply(
    CustomPresentations: XNameContainer,
    acquire: () => Unit,
    getCustomPresentations: () => XNameContainer,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCustomPresentationSupplier = {
    val __obj = js.Dynamic.literal(CustomPresentations = CustomPresentations, acquire = js.Any.fromFunction0(acquire), getCustomPresentations = js.Any.fromFunction0(getCustomPresentations), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCustomPresentationSupplier]
  }
}

