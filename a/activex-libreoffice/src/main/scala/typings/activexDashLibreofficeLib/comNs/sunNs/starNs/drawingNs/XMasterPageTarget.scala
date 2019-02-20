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

