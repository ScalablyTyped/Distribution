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

