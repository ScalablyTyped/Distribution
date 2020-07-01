package typings.apolloServerTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fauxpaque[T] extends js.Object {
  var __fauxpaque: T
}

object Fauxpaque {
  @scala.inline
  def apply[T](__fauxpaque: T): Fauxpaque[T] = {
    val __obj = js.Dynamic.literal(__fauxpaque = __fauxpaque.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fauxpaque[T]]
  }
}

