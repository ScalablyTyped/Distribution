package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OwnerType extends js.Object {
  var displayName: java.lang.String
  var id: java.lang.String
}

object OwnerType {
  @scala.inline
  def apply(displayName: java.lang.String, id: java.lang.String): OwnerType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[OwnerType]
  }
}

