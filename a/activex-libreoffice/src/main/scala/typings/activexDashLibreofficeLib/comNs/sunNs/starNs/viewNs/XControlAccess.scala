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

object XControlAccess {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getControl: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XControlAccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getControl")(getControl)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XControlAccess]
  }
}

