package typings.ava.mod

import typings.ava.anon.Complete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscribable extends js.Object {
  def subscribe(observer: Complete): Unit = js.native
}

object Subscribable {
  @scala.inline
  def apply(subscribe: Complete => Unit): Subscribable = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[Subscribable]
  }
  @scala.inline
  implicit class SubscribableOps[Self <: Subscribable] (val x: Self) extends AnyVal {
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
    def setSubscribe(value: Complete => Unit): Self = this.set("subscribe", js.Any.fromFunction1(value))
  }
  
}

