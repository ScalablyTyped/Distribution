package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
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
  implicit class XTransactionBroadcasterMutableBuilder[Self <: XTransactionBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddTransactionListener(value: XTransactionListener => Unit): Self = StObject.set(x, "addTransactionListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveTransactionListener(value: XTransactionListener => Unit): Self = StObject.set(x, "removeTransactionListener", js.Any.fromFunction1(value))
  }
}
