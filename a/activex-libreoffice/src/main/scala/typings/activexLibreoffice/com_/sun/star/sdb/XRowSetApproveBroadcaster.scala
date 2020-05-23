package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the possibility of reviving an event before changing the content of a row set. */
trait XRowSetApproveBroadcaster extends XInterface {
  /** adds the specified listener to receive the events "approveCursorMove", "approveRowChange", and "appproveRowSetChange". */
  def addRowSetApproveListener(listener: XRowSetApproveListener): Unit
  /** removes the specified listener. */
  def removeRowSetApproveListener(listener: XRowSetApproveListener): Unit
}

object XRowSetApproveBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addRowSetApproveListener: XRowSetApproveListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeRowSetApproveListener: XRowSetApproveListener => Unit
  ): XRowSetApproveBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addRowSetApproveListener = js.Any.fromFunction1(addRowSetApproveListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeRowSetApproveListener = js.Any.fromFunction1(removeRowSetApproveListener))
    __obj.asInstanceOf[XRowSetApproveBroadcaster]
  }
}

