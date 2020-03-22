package typings.antd.formListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  def add(): Unit
  def move(from: Double, to: Double): Unit
  def remove(index: Double): Unit
}

object Operation {
  @scala.inline
  def apply(add: () => Unit, move: (Double, Double) => Unit, remove: Double => Unit): Operation = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction0(add), move = js.Any.fromFunction2(move), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[Operation]
  }
}

