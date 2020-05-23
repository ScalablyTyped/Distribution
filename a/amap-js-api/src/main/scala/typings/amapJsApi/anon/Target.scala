package typings.amapJsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target[I] extends js.Object {
  var target: I
}

object Target {
  @scala.inline
  def apply[I](target: I): Target[I] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target[I]]
  }
}

