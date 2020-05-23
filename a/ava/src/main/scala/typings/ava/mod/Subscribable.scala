package typings.ava.mod

import typings.ava.anon.Complete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscribable extends js.Object {
  def subscribe(observer: Complete): Unit
}

object Subscribable {
  @scala.inline
  def apply(subscribe: Complete => Unit): Subscribable = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[Subscribable]
  }
}

