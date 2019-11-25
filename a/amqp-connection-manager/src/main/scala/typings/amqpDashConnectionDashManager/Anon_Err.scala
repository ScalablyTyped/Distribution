package typings.amqpDashConnectionDashManager

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Err extends js.Object {
  var err: Error
}

object Anon_Err {
  @scala.inline
  def apply(err: Error): Anon_Err = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Err]
  }
}

