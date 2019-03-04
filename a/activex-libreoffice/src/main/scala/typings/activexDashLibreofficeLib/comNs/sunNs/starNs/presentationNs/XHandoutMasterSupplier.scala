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
    acquire: js.Function0[scala.Unit],
    getHandoutMasterPage: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XHandoutMasterSupplier = {
    val __obj = js.Dynamic.literal(HandoutMasterPage = HandoutMasterPage, acquire = acquire, getHandoutMasterPage = getHandoutMasterPage, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XHandoutMasterSupplier]
  }
}

