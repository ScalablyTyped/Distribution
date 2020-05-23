package typings.apolloProtobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToArray[T] extends js.Object {
  def toArray(): js.Array[T]
}

object ToArray {
  @scala.inline
  def apply[T](toArray: () => js.Array[T]): ToArray[T] = {
    val __obj = js.Dynamic.literal(toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[ToArray[T]]
  }
}

