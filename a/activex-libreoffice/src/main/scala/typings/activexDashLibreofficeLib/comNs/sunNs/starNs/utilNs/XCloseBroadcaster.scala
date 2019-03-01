package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * broadcasts each tried closing of an object to all interest listener
  *
  * The called object for closing must post the closing events immediately and before any internal cancel operations will be started. If a listener
  * disagree with that it should throw a {@link CloseVetoException} and called function {@link XCloseable.close()} must be broken immediately. It's not
  * allowed to catch it inside the close() request. If no listener nor internal processes hinder the object on closing all listeners get a notification
  * about real closing.
  * @see
  */
trait XCloseBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds the specified listener to receive or have a veto for "close" events
    * @param Listener the listener which is interest on closing events
    */
  def addCloseListener(Listener: XCloseListener): scala.Unit
  /**
    * removes the specified listener
    * @param Listener the listener which isn't interest on closing events any longer
    */
  def removeCloseListener(Listener: XCloseListener): scala.Unit
}

object XCloseBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addCloseListener: js.Function1[XCloseListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeCloseListener: js.Function1[XCloseListener, scala.Unit]
  ): XCloseBroadcaster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addCloseListener")(addCloseListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeCloseListener")(removeCloseListener)
    __obj.asInstanceOf[XCloseBroadcaster]
  }
}

