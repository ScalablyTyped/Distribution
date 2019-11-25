package typings.aliDashOss

import typings.aliDashOss.aliDashOssMod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var res: NormalSuccessResponse
}

object Anon_Name {
  @scala.inline
  def apply(name: String, res: NormalSuccessResponse): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Name]
  }
}

