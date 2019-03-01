package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to register listeners which are called whenever an accessibility event (see {@link AccessibleEventObject} ) occurs.
  * @see AccessibleEventObject
  * @see XAccessibleEventListener
  * @since OOo 1.1.2
  */
trait XAccessibleEventBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** registers the given {@link XAccessibleEventListener} . */
  def addAccessibleEventListener(xListener: XAccessibleEventListener): scala.Unit
  /** unregisters the given {@link XAccessibleEventListener} . */
  def removeAccessibleEventListener(xListener: XAccessibleEventListener): scala.Unit
}

object XAccessibleEventBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addAccessibleEventListener: js.Function1[XAccessibleEventListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeAccessibleEventListener: js.Function1[XAccessibleEventListener, scala.Unit]
  ): XAccessibleEventBroadcaster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addAccessibleEventListener")(addAccessibleEventListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeAccessibleEventListener")(removeAccessibleEventListener)
    __obj.asInstanceOf[XAccessibleEventBroadcaster]
  }
}

