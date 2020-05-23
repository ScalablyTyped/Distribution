package typings.activexLibreoffice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sequence[T] extends js.Object {
  var typekey: sequence[T]
}

object sequence {
  @scala.inline
  def apply[T](typekey: sequence[T]): sequence[T] = {
    val __obj = js.Dynamic.literal(typekey = typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[sequence[T]]
  }
}

