package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAppRequest extends js.Object {
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId = js.native
}

object DeleteAppRequest {
  @scala.inline
  def apply(appId: AppId): DeleteAppRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppRequest]
  }
  @scala.inline
  implicit class DeleteAppRequestOps[Self <: DeleteAppRequest] (val x: Self) extends AnyVal {
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
    def setAppId(value: AppId): Self = this.set("appId", value.asInstanceOf[js.Any])
  }
  
}

