package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the controls in a view.
  * @see com.sun.star.frame.XController
  */
trait XControlAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** is called to get the control from the specified control model. */
  def getControl(xModel: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl
}

