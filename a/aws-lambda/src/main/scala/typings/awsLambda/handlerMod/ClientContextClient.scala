package typings.awsLambda.handlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientContextClient extends js.Object {
  var appPackageName: String
  var appTitle: String
  var appVersionCode: String
  var appVersionName: String
  var installationId: String
}

object ClientContextClient {
  @scala.inline
  def apply(
    appPackageName: String,
    appTitle: String,
    appVersionCode: String,
    appVersionName: String,
    installationId: String
  ): ClientContextClient = {
    val __obj = js.Dynamic.literal(appPackageName = appPackageName.asInstanceOf[js.Any], appTitle = appTitle.asInstanceOf[js.Any], appVersionCode = appVersionCode.asInstanceOf[js.Any], appVersionName = appVersionName.asInstanceOf[js.Any], installationId = installationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientContextClient]
  }
}

