package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** broadcasts message in case transacted object is committed or reverted. */
@js.native
trait XTransactionBroadcaster extends XInterface {
  
  /** adds the specified listener to receive events about commits and reverts. */
  def addTransactionListener(aListener: XTransactionListener): Unit = js.native
  
  /** removes the specified listener. */
  def removeTransactionListener(aListener: XTransactionListener): Unit = js.native
}
object XTransactionBroadcaster {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addTransactionListener: XTransactionListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTransactionListener: XTransactionListener => Unit
  ): XTransactionBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addTransactionListener = js.Any.fromFunction1(addTransactionListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTransactionListener = js.Any.fromFunction1(removeTransactionListener))
    __obj.asInstanceOf[XTransactionBroadcaster]
  }
  
  @scala.inline
  implicit class XTransactionBroadcasterOps[Self <: XTransactionBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddTransactionListener(value: XTransactionListener => Unit): Self = this.set("addTransactionListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveTransactionListener(value: XTransactionListener => Unit): Self = this.set("removeTransactionListener", js.Any.fromFunction1(value))
  }
}
