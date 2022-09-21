package typings.aureliaBinding.mod

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalCollectionObserver extends StObject {
  
  /**
    * This will flush the change records of this observer and call any subscribers if applicable.
    */
  def flushChangeRecords(): Unit = js.native
  
  /**
    * Get a length observer for this collection.
    */
  def getLengthObserver(): Any = js.native
  
  /**
    * Reset the observer to the passed collection and call any subscribers with changes between the current collection and the reset collection.
    * @param oldCollection 
    */
  def reset(oldCollection: js.Array[Any]): Unit = js.native
  def reset(oldCollection: Map[Any, Any]): Unit = js.native
  def reset(oldCollection: Set[Any]): Unit = js.native
  
  /**
    * Subscribe to collection mutation events with a callback function.
    */
  def subscribe(callback: js.Function1[/* changeRecords */ Any, Unit]): Unit = js.native
  /**
    * Subscribe a callable object to collection mutation events.
    * @param context A value to be passed to the callable object's call function when collection mutation occurs.
    * @param callable A callable object.
    */
  def subscribe(context: Any, callable: Callable): Unit = js.native
  
  /**
    * Unsubscribes a callback function from collection mutation changes.
    */
  def unsubscribe(callback: js.Function1[/* changeRecords */ Any, Unit]): Unit = js.native
  /**
    * Unsubscribes a callable object from collection mutation events.
    * @param context A value to be passed to the callable object's call function when collection mutation occurs.
    * @param callable A callable object.
    */
  def unsubscribe(context: Any, callable: Callable): Unit = js.native
}
