package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to notify a toolbar controller about events
  * @see com.sun.star.frame.ToolbarController
  * @since OOo 2.0
  */
trait XToolbarControllerListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * gets called to notify a controller that a toolbar function has been selected.
    * @param aToolbarRes a string which identifies the toolbar where the function has been selected.
    * @param aCommand a string which identifies the function that has been selected.  This notification is normally used to implement the toolbar button/sub-t
    */
  def functionSelected(aToolbarRes: java.lang.String, aCommand: java.lang.String): scala.Unit
}

object XToolbarControllerListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    functionSelected: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XToolbarControllerListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, functionSelected = functionSelected, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XToolbarControllerListener]
  }
}

