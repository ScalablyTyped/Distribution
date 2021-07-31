package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the possibility of reviving an event before changing the content of a row set. */
trait XRowSetApproveBroadcaster
  extends StObject
     with XInterface {
  
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
  
  @scala.inline
  implicit class XRowSetApproveBroadcasterMutableBuilder[Self <: XRowSetApproveBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddRowSetApproveListener(value: XRowSetApproveListener => Unit): Self = StObject.set(x, "addRowSetApproveListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveRowSetApproveListener(value: XRowSetApproveListener => Unit): Self = StObject.set(x, "removeRowSetApproveListener", js.Any.fromFunction1(value))
  }
}
