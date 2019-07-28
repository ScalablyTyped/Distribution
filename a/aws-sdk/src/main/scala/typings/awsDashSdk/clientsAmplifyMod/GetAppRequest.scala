package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAppRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId
}

object GetAppRequest {
  @scala.inline
  def apply(appId: AppId): GetAppRequest = {
    val __obj = js.Dynamic.literal(appId = appId)
  
    __obj.asInstanceOf[GetAppRequest]
  }
}

