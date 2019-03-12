package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is implemented by objects that can be linked to a {@link MasterPage} .
  * @see DrawPage
  */
trait XMasterPageTarget
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the {@link MasterPage} linked to this object. */
  var MasterPage: XDrawPage
  /** @returns the {@link MasterPage} linked to this object. */
  def getMasterPage(): XDrawPage
  /**
    * links a {@link MasterPage} to this object.
    * @param xMasterPage the {@link MasterPage} that is linked to this object
    */
  def setMasterPage(xMasterPage: XDrawPage): scala.Unit
}

object XMasterPageTarget {
  @scala.inline
  def apply(
    MasterPage: XDrawPage,
    acquire: () => scala.Unit,
    getMasterPage: () => XDrawPage,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setMasterPage: XDrawPage => scala.Unit
  ): XMasterPageTarget = {
    val __obj = js.Dynamic.literal(MasterPage = MasterPage, acquire = js.Any.fromFunction0(acquire), getMasterPage = js.Any.fromFunction0(getMasterPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setMasterPage = js.Any.fromFunction1(setMasterPage))
  
    __obj.asInstanceOf[XMasterPageTarget]
  }
}

