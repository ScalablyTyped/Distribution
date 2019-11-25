package typings.aliDashOss

import typings.aliDashOss.aliDashOssMod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowEmpty extends js.Object {
  var allowEmpty: Boolean
  var referers: js.Array[String]
  var res: NormalSuccessResponse
}

object Anon_AllowEmpty {
  @scala.inline
  def apply(allowEmpty: Boolean, referers: js.Array[String], res: NormalSuccessResponse): Anon_AllowEmpty = {
    val __obj = js.Dynamic.literal(allowEmpty = allowEmpty.asInstanceOf[js.Any], referers = referers.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AllowEmpty]
  }
}

