package typings
package asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FollowersParams extends js.Object {
  var followers: js.Array[scala.Double | java.lang.String]
}

object FollowersParams {
  @scala.inline
  def apply(followers: js.Array[scala.Double | java.lang.String]): FollowersParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("followers")(followers)
    __obj.asInstanceOf[FollowersParams]
  }
}

