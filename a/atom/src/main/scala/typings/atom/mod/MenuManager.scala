package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuManager extends js.Object {
  /** Adds the given items to the application menu. */
  def add(items: js.Array[MenuOptions]): Disposable
  /** Refreshes the currently visible menu. */
  def update(): Unit
}

object MenuManager {
  @scala.inline
  def apply(add: js.Array[MenuOptions] => Disposable, update: () => Unit): MenuManager = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[MenuManager]
  }
}

