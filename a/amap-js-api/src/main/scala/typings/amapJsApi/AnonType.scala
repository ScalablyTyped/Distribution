package typings.amapJsApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType[N /* <: String */] extends js.Object {
  var `type`: N
}

object AnonType {
  @scala.inline
  def apply[N /* <: String */](`type`: N): AnonType[N] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType[N]]
  }
}

