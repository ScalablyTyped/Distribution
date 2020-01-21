package typings.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyObserver extends js.Object {
  /**
    * Subscribe to property change events.
    */
  def subscribe(callback: js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, Unit]): Disposable
}

object PropertyObserver {
  @scala.inline
  def apply(subscribe: js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, Unit] => Disposable): PropertyObserver = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
  
    __obj.asInstanceOf[PropertyObserver]
  }
}

