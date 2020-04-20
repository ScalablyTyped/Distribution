package typings.activexInterop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem[T] extends js.Object {
  def Item(index: js.Any): T
}

object AnonItem {
  @scala.inline
  def apply[T](Item: js.Any => T): AnonItem[T] = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[AnonItem[T]]
  }
}

