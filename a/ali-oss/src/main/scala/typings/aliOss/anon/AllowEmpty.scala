package typings.aliOss.anon

import typings.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowEmpty extends js.Object {
  var allowEmpty: Boolean
  var referers: js.Array[String]
  var res: NormalSuccessResponse
}

object AllowEmpty {
  @scala.inline
  def apply(allowEmpty: Boolean, referers: js.Array[String], res: NormalSuccessResponse): AllowEmpty = {
    val __obj = js.Dynamic.literal(allowEmpty = allowEmpty.asInstanceOf[js.Any], referers = referers.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowEmpty]
  }
}

