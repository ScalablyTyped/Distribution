package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OwnerType extends js.Object {
  var displayName: String
  var id: String
}

object OwnerType {
  @scala.inline
  def apply(displayName: String, id: String): OwnerType = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OwnerType]
  }
}

