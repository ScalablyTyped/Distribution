package typings.amapJsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type[N /* <: String */] extends js.Object {
  var `type`: N
}

object Type {
  @scala.inline
  def apply[N](`type`: N): Type[N] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[N]]
  }
}

