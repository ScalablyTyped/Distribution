package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to attach script events given by a sequence of {@link ScriptEventDescriptor} structures to a given interface. */
trait XEventAttacher
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * registers the given "AllListener" object as a listener at the given interface by creating a suitable listener adapter and calling the "addListener"
    * method corresponding to the "ListenerType".
    */
  def attachListener(
    xTarget: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    xAllListener: XAllListener,
    aHelper: js.Any,
    aListenerType: java.lang.String,
    aAddListenerParam: java.lang.String
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener
  /**
    * registers an object as a listener at the given interface by creating a suitable listener adapter and calling the method which corresponds to the
    * listener type.
    *
    * Only the event corresponding to the given event method will be delegated to **xAllListener** .
    */
  def attachSingleEventListener(
    xTarget: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    xAllListener: XAllListener,
    aHelper: js.Any,
    aListenerType: java.lang.String,
    aAddListenerParam: java.lang.String,
    aEventMethod: java.lang.String
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener
  /**
    * removes a listener object as a listener from the given interface.
    *
    * This method can and should be used as a contrary method to the two attach methods.
    */
  def removeListener(
    xTarget: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    aListenerType: java.lang.String,
    aRemoveListenerParam: java.lang.String,
    xToRemoveListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener
  ): scala.Unit
}

object XEventAttacher {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    attachListener: (activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, XAllListener, js.Any, java.lang.String, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener,
    attachSingleEventListener: (activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, XAllListener, js.Any, java.lang.String, java.lang.String, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeListener: (activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, java.lang.String, java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener) => scala.Unit
  ): XEventAttacher = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), attachListener = js.Any.fromFunction5(attachListener), attachSingleEventListener = js.Any.fromFunction6(attachSingleEventListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListener = js.Any.fromFunction4(removeListener))
  
    __obj.asInstanceOf[XEventAttacher]
  }
}

