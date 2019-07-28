package typings.awsDashLambda.awsDashLambdaMod

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
    val __obj = js.Dynamic.literal(appPackageName = appPackageName, appTitle = appTitle, appVersionCode = appVersionCode, appVersionName = appVersionName, installationId = installationId)
  
    __obj.asInstanceOf[ClientContextClient]
  }
}

