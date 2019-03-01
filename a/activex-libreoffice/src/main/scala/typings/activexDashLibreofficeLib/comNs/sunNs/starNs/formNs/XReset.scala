package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functionality to reset components to some default values.
  *
  * The semantics of **default value** depends on the providing service.
  */
trait XReset
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds the specified listener to receive events related to resetting the component.
    * @param aListener the listener to add.
    */
  def addResetListener(aListener: XResetListener): scala.Unit
  /**
    * removes the specified listener
    * @param aListener the listener to remove
    */
  def removeResetListener(aListener: XResetListener): scala.Unit
  /** resets a component to some default value. */
  def reset(): scala.Unit
}

object XReset {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addResetListener: js.Function1[XResetListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeResetListener: js.Function1[XResetListener, scala.Unit],
    reset: js.Function0[scala.Unit]
  ): XReset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addResetListener")(addResetListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeResetListener")(removeResetListener)
    __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[XReset]
  }
}

