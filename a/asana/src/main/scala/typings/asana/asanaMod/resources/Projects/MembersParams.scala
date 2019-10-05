package typings.asana.asanaMod.resources.Projects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembersParams extends js.Object {
  var members: js.Array[Double | String]
}

object MembersParams {
  @scala.inline
  def apply(members: js.Array[Double | String]): MembersParams = {
    val __obj = js.Dynamic.literal(members = members)
  
    __obj.asInstanceOf[MembersParams]
  }
}

