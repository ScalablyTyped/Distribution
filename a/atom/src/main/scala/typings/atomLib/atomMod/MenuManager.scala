package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuManager extends js.Object {
  /** Adds the given items to the application menu. */
  def add(items: js.Array[MenuOptions]): Disposable
  /** Refreshes the currently visible menu. */
  def update(): scala.Unit
}

object MenuManager {
  @scala.inline
  def apply(add: js.Function1[js.Array[MenuOptions], Disposable], update: js.Function0[scala.Unit]): MenuManager = {
    val __obj = js.Dynamic.literal(add = add, update = update)
  
    __obj.asInstanceOf[MenuManager]
  }
}

