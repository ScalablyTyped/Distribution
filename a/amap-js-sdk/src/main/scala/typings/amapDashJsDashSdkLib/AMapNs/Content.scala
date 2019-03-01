package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
}

object Content {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String): Content = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Content]
  }
}

