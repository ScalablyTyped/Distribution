package typings.agilite.agiliteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgiliteConfig extends js.Object {
  var apiKey: js.UndefOr[String] = js.undefined
  var apiServerUrl: js.UndefOr[String] = js.undefined
  var teamId: js.UndefOr[String] = js.undefined
}

object AgiliteConfig {
  @scala.inline
  def apply(apiKey: String = null, apiServerUrl: String = null, teamId: String = null): AgiliteConfig = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (apiServerUrl != null) __obj.updateDynamic("apiServerUrl")(apiServerUrl)
    if (teamId != null) __obj.updateDynamic("teamId")(teamId)
    __obj.asInstanceOf[AgiliteConfig]
  }
}

