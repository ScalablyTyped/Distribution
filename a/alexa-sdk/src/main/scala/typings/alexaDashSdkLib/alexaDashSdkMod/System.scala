package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait System extends js.Object {
  var apiAccessToken: java.lang.String
  var apiEndpoint: java.lang.String
  var application: Application
  var device: js.Any
  var user: SessionUser
}

object System {
  @scala.inline
  def apply(
    apiAccessToken: java.lang.String,
    apiEndpoint: java.lang.String,
    application: Application,
    device: js.Any,
    user: SessionUser
  ): System = {
    val __obj = js.Dynamic.literal(apiAccessToken = apiAccessToken, apiEndpoint = apiEndpoint, application = application, device = device, user = user)
  
    __obj.asInstanceOf[System]
  }
}

