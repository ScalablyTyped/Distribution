package typings
package aureliaDashBindingLib.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalCollectionObserver extends js.Object {
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

