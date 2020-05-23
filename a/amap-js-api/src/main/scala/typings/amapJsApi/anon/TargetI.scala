package typings.amapJsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetI[I] extends js.Object {
  var target: I
}

object TargetI {
  @scala.inline
  def apply[I](target: I): TargetI[I] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetI[I]]
  }
}

