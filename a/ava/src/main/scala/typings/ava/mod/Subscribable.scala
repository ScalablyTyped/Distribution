package typings.ava.mod

import typings.ava.AnonComplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscribable extends js.Object {
  def subscribe(observer: AnonComplete): Unit
}

object Subscribable {
  @scala.inline
  def apply(subscribe: AnonComplete => Unit): Subscribable = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[Subscribable]
  }
}

