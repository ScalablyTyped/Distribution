package typings.asana.mod.resources.Tasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FollowersParams extends js.Object {
  
  var followers: js.Array[Double | String] = js.native
}
object FollowersParams {
  
  @scala.inline
  def apply(followers: js.Array[Double | String]): FollowersParams = {
    val __obj = js.Dynamic.literal(followers = followers.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowersParams]
  }
  
  @scala.inline
  implicit class FollowersParamsOps[Self <: FollowersParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFollowersVarargs(value: (Double | String)*): Self = this.set("followers", js.Array(value :_*))
    
    @scala.inline
    def setFollowers(value: js.Array[Double | String]): Self = this.set("followers", value.asInstanceOf[js.Any])
  }
}
