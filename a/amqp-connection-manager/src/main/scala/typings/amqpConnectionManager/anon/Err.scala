package typings.amqpConnectionManager.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Err extends js.Object {
  var err: Error
}

object Err {
  @scala.inline
  def apply(err: Error): Err = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
    __obj.asInstanceOf[Err]
  }
}

