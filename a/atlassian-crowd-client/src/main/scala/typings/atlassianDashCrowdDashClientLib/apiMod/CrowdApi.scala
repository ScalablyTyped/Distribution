package typings
package atlassianDashCrowdDashClientLib.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrowdApi extends js.Object {
  var settings: atlassianDashCrowdDashClientLib.settingsMod.Settings = js.native
  def log(args: js.Any*): scala.Unit = js.native
  def request(method: java.lang.String, path: java.lang.String): stdLib.Promise[_] = js.native
  def request(method: java.lang.String, path: java.lang.String, data: js.Any): stdLib.Promise[_] = js.native
}

