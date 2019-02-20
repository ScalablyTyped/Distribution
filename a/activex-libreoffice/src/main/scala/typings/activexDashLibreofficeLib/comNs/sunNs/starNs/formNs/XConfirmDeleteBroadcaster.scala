package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides the possibility of receiving an event for confirming deletions of rows in a {@link com.sun.star.form.component.DataForm} .
  * @see XConfirmDeleteListener
  */
trait XConfirmDeleteBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * remembers the specified listener to receive an event for confirming deletions
    *
    * {@link XConfirmDeleteListener.confirmDelete()} is called before a deletion is performed. You may use the event to write your own confirmation
    * messages.
    * @param aListener the listener to add.
    * @see com.sun.star.form.XConfirmDeleteListener
    */
  def addConfirmDeleteListener(aListener: XConfirmDeleteListener): scala.Unit
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    * @see com.sun.star.form.XConfirmDeleteListener
    */
  def removeConfirmDeleteListener(aListener: XConfirmDeleteListener): scala.Unit
}

