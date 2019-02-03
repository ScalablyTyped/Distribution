package typings
package aureliaDashBindingLib.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalCollectionObserver extends js.Object {
  /**
    * This will flush the change records of this observer and call any subscribers if applicable.
    */
  def flushChangeRecords(): scala.Unit = js.native
  /**
    * Get a length observer for this collection.
    */
  def getLengthObserver(): js.Any = js.native
  /**
    * Reset the observer to the passed collection and call any subscribers with changes between the current collection and the reset collection.
    * @param oldCollection 
    */
  def reset(oldCollection: js.Array[_]): scala.Unit = js.native
  def reset(oldCollection: stdLib.Map[_, _]): scala.Unit = js.native
  def reset(oldCollection: stdLib.Set[_]): scala.Unit = js.native
  /**
    * Subscribe to collection mutation events with a callback function.
    */
  def subscribe(callback: js.Function1[/* changeRecords */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Subscribe a callable object to collection mutation events.
    * @param context A value to be passed to the callable object's call function when collection mutation occurs.
    * @param callable A callable object.
    */
  def subscribe(context: js.Any, callable: Callable): scala.Unit = js.native
  /**
    * Unsubscribes a callback function from collection mutation changes.
    */
  def unsubscribe(callback: js.Function1[/* changeRecords */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Unsubscribes a callable object from collection mutation events.
    * @param context A value to be passed to the callable object's call function when collection mutation occurs.
    * @param callable A callable object.
    */
  def unsubscribe(context: js.Any, callable: Callable): scala.Unit = js.native
}

