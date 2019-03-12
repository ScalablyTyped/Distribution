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

object Settings {
  @scala.inline
  def apply(
    application: atlassianDashCrowdDashClientLib.Anon_NamePassword,
    baseUrl: java.lang.String,
    attributesEncoder: /* obj */ js.Any => java.lang.String = null,
    attributesParser: /* json */ java.lang.String => _ = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    nesting: js.UndefOr[scala.Boolean] = js.undefined,
    sessionTimeout: scala.Int | scala.Double = null
  ): Settings = {
    val __obj = js.Dynamic.literal(application = application, baseUrl = baseUrl)
    if (attributesEncoder != null) __obj.updateDynamic("attributesEncoder")(js.Any.fromFunction1(attributesEncoder))
    if (attributesParser != null) __obj.updateDynamic("attributesParser")(js.Any.fromFunction1(attributesParser))
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(nesting)) __obj.updateDynamic("nesting")(nesting)
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

