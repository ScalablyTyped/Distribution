package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides the possibility of receiving an event for configuration of parameters.
  *
  * Note that this interface provides exactly the same functionality as the {@link XDatabaseParameterBroadcaster} interface. It exists purely for
  * compatibility with the {@link com.sun.star.script.XEventAttacher.attachSingleEventListener()} : It expects the methods for adding and removing
  * listeners to follow a certain naming scheme, respective to the name of the listener which is being added/removed.
  * @see XDatabaseParameterBroadcaster
  * @see com.sun.star.script.XEventAttacher
  */
trait XDatabaseParameterBroadcaster2 extends XDatabaseParameterBroadcaster {
  /**
    * registers an {@link XDatabaseParameterListener}
    *
    * This method behaves exactly as the {@link XDatabaseParameterBroadcaster.addParameterListener()} method inherited from the base interface.
    */
  def addDatabaseParameterListener(aListener: XDatabaseParameterListener): scala.Unit
  /**
    * revokes an {@link XDatabaseParameterListener}
    *
    * This method behaves exactly as the {@link XDatabaseParameterBroadcaster.removeParameterListener()} method inherited from the base interface.
    */
  def removeDatabaseParameterListener(aListener: XDatabaseParameterListener): scala.Unit
}

object XDatabaseParameterBroadcaster2 {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addDatabaseParameterListener: js.Function1[XDatabaseParameterListener, scala.Unit],
    addParameterListener: js.Function1[XDatabaseParameterListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeDatabaseParameterListener: js.Function1[XDatabaseParameterListener, scala.Unit],
    removeParameterListener: js.Function1[XDatabaseParameterListener, scala.Unit]
  ): XDatabaseParameterBroadcaster2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addDatabaseParameterListener")(addDatabaseParameterListener)
    __obj.updateDynamic("addParameterListener")(addParameterListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeDatabaseParameterListener")(removeDatabaseParameterListener)
    __obj.updateDynamic("removeParameterListener")(removeParameterListener)
    __obj.asInstanceOf[XDatabaseParameterBroadcaster2]
  }
}

