package typings.amapJsApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTarget[I] extends js.Object {
  var target: I
}

object AnonTarget {
  @scala.inline
  def apply[I](target: I): AnonTarget[I] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTarget[I]]
  }
}

