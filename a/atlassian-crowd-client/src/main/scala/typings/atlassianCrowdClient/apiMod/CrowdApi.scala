package typings.atlassianCrowdClient.apiMod

import typings.atlassianCrowdClient.settingsMod.Settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrowdApi extends js.Object {
  
  def log(args: js.Any*): Unit = js.native
  
  def request(method: String, path: String): js.Promise[_] = js.native
  def request(method: String, path: String, data: js.Any): js.Promise[_] = js.native
  
  var settings: Settings = js.native
}
