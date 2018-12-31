package typings
package atlassianDashCrowdDashClientLib.settingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  val application: atlassianDashCrowdDashClientLib.Anon_NamePassword
  val attributesEncoder: js.UndefOr[js.Function1[/* obj */ js.Any, java.lang.String]] = js.undefined
  val attributesParser: js.UndefOr[js.Function1[/* json */ java.lang.String, _]] = js.undefined
  val baseUrl: java.lang.String
  val debug: js.UndefOr[scala.Boolean] = js.undefined
  val nesting: js.UndefOr[scala.Boolean] = js.undefined
  val sessionTimeout: js.UndefOr[scala.Double] = js.undefined
}

