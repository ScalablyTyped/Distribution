package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functionality to notify listeners of data changes.
  *
  * The concrete semantics of a change (i.e. the conditions for when a change event is fired) must be specified in the service description of the
  * providing service.
  * @see XChangeListener
  */
trait XChangeBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds the specified listener to receive the "changed" event.
    * @param aListener the listener to add.
    * @see com.sun.star.form.XChangeListener
    */
  def addChangeListener(aListener: XChangeListener): scala.Unit
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    * @see com.sun.star.form.XChangeListener
    */
  def removeChangeListener(aListener: XChangeListener): scala.Unit
}

object XChangeBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addChangeListener: js.Function1[XChangeListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChangeListener: js.Function1[XChangeListener, scala.Unit]
  ): XChangeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire, addChangeListener = addChangeListener, queryInterface = queryInterface, release = release, removeChangeListener = removeChangeListener)
  
    __obj.asInstanceOf[XChangeBroadcaster]
  }
}

