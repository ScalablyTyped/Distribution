package typings
package aureliaDashBindingLib.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyObserver extends js.Object {
  /**
    * Subscribe to property change events.
    */
  def subscribe(callback: js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, scala.Unit]): Disposable
}

object PropertyObserver {
  @scala.inline
  def apply(
    subscribe: js.Function1[js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, scala.Unit], Disposable]
  ): PropertyObserver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subscribe")(subscribe)
    __obj.asInstanceOf[PropertyObserver]
  }
}

