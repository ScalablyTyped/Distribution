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

