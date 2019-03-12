package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** returns the handout master page for this document */
trait XHandoutMasterSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the {@link DrawPage} . */
  val HandoutMasterPage: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage
  /** returns the {@link DrawPage} . */
  def getHandoutMasterPage(): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage
}

object XHandoutMasterSupplier {
  @scala.inline
  def apply(
    HandoutMasterPage: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage,
    acquire: () => scala.Unit,
    getHandoutMasterPage: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XHandoutMasterSupplier = {
    val __obj = js.Dynamic.literal(HandoutMasterPage = HandoutMasterPage, acquire = js.Any.fromFunction0(acquire), getHandoutMasterPage = js.Any.fromFunction0(getHandoutMasterPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XHandoutMasterSupplier]
  }
}

