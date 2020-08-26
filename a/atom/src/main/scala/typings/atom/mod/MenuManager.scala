package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuManager extends js.Object {
  /** Adds the given items to the application menu. */
  def add(items: js.Array[MenuOptions]): Disposable = js.native
  /** Refreshes the currently visible menu. */
  def update(): Unit = js.native
}

object MenuManager {
  @scala.inline
  def apply(add: js.Array[MenuOptions] => Disposable, update: () => Unit): MenuManager = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[MenuManager]
  }
  @scala.inline
  implicit class MenuManagerOps[Self <: MenuManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: js.Array[MenuOptions] => Disposable): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
  
}

