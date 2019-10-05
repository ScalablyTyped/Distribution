package typings.asana.asanaMod.resources.Tasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FollowersParams extends js.Object {
  var followers: js.Array[Double | String]
}

object FollowersParams {
  @scala.inline
  def apply(followers: js.Array[Double | String]): FollowersParams = {
    val __obj = js.Dynamic.literal(followers = followers)
  
    __obj.asInstanceOf[FollowersParams]
  }
}

