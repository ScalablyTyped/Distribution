package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive events when a transacted object is committed or reverted. */
trait XTransactionListener
  extends StObject
     with XEventListener {
  
  /** is called after the object is committed. */
  def commited(aEvent: EventObject): Unit
  
  /** is called just before the object is committed. */
  def preCommit(aEvent: EventObject): Unit
  
  /** is called just before the object is reverted. */
  def preRevert(aEvent: EventObject): Unit
  
  /** is called after the object is reverted. */
  def reverted(aEvent: EventObject): Unit
}
object XTransactionListener {
  
  inline def apply(
    acquire: () => Unit,
    commited: EventObject => Unit,
    disposing: EventObject => Unit,
    preCommit: EventObject => Unit,
    preRevert: EventObject => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    reverted: EventObject => Unit
  ): XTransactionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), commited = js.Any.fromFunction1(commited), disposing = js.Any.fromFunction1(disposing), preCommit = js.Any.fromFunction1(preCommit), preRevert = js.Any.fromFunction1(preRevert), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reverted = js.Any.fromFunction1(reverted))
    __obj.asInstanceOf[XTransactionListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XTransactionListener] (val x: Self) extends AnyVal {
    
    inline def setCommited(value: EventObject => Unit): Self = StObject.set(x, "commited", js.Any.fromFunction1(value))
    
    inline def setPreCommit(value: EventObject => Unit): Self = StObject.set(x, "preCommit", js.Any.fromFunction1(value))
    
    inline def setPreRevert(value: EventObject => Unit): Self = StObject.set(x, "preRevert", js.Any.fromFunction1(value))
    
    inline def setReverted(value: EventObject => Unit): Self = StObject.set(x, "reverted", js.Any.fromFunction1(value))
  }
}
