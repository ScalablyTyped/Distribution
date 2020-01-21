package typings.amapJsApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTargetI[I] extends js.Object {
  var target: I
}

object AnonTargetI {
  @scala.inline
  def apply[I](target: I): AnonTargetI[I] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTargetI[I]]
  }
}

