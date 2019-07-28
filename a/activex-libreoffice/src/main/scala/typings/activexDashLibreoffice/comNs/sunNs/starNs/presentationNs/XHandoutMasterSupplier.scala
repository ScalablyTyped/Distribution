package typings.activexDashLibreoffice.comNs.sunNs.starNs.presentationNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XDrawPage
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** returns the handout master page for this document */
trait XHandoutMasterSupplier extends XInterface {
  /** returns the {@link DrawPage} . */
  val HandoutMasterPage: XDrawPage
  /** returns the {@link DrawPage} . */
  def getHandoutMasterPage(): XDrawPage
}

object XHandoutMasterSupplier {
  @scala.inline
  def apply(
    HandoutMasterPage: XDrawPage,
    acquire: () => Unit,
    getHandoutMasterPage: () => XDrawPage,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XHandoutMasterSupplier = {
    val __obj = js.Dynamic.literal(HandoutMasterPage = HandoutMasterPage, acquire = js.Any.fromFunction0(acquire), getHandoutMasterPage = js.Any.fromFunction0(getHandoutMasterPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XHandoutMasterSupplier]
  }
}

