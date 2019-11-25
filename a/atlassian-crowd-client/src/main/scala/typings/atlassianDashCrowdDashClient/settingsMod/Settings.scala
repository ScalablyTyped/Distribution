package typings.atlassianDashCrowdDashClient.settingsMod

import typings.atlassianDashCrowdDashClient.Anon_NamePassword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  val application: Anon_NamePassword
  val attributesEncoder: js.UndefOr[js.Function1[/* obj */ js.Any, String]] = js.undefined
  val attributesParser: js.UndefOr[js.Function1[/* json */ String, _]] = js.undefined
  val baseUrl: String
  val debug: js.UndefOr[Boolean] = js.undefined
  val nesting: js.UndefOr[Boolean] = js.undefined
  val sessionTimeout: js.UndefOr[Double] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    application: Anon_NamePassword,
    baseUrl: String,
    attributesEncoder: /* obj */ js.Any => String = null,
    attributesParser: /* json */ String => _ = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    nesting: js.UndefOr[Boolean] = js.undefined,
    sessionTimeout: Int | Double = null
  ): Settings = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any])
    if (attributesEncoder != null) __obj.updateDynamic("attributesEncoder")(js.Any.fromFunction1(attributesEncoder))
    if (attributesParser != null) __obj.updateDynamic("attributesParser")(js.Any.fromFunction1(attributesParser))
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(nesting)) __obj.updateDynamic("nesting")(nesting.asInstanceOf[js.Any])
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

