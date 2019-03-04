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
    acquire: js.Function0[scala.Unit],
    getMasterPage: js.Function0[XDrawPage],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setMasterPage: js.Function1[XDrawPage, scala.Unit]
  ): XMasterPageTarget = {
    val __obj = js.Dynamic.literal(MasterPage = MasterPage, acquire = acquire, getMasterPage = getMasterPage, queryInterface = queryInterface, release = release, setMasterPage = setMasterPage)
  
    __obj.asInstanceOf[XMasterPageTarget]
  }
}

