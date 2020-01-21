package typings.angularCommon.angularCommonTestingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockPlatformLocationConfig extends js.Object {
  var appBaseHref: js.UndefOr[String] = js.undefined
  var startUrl: js.UndefOr[String] = js.undefined
}

object MockPlatformLocationConfig {
  @scala.inline
  def apply(appBaseHref: String = null, startUrl: String = null): MockPlatformLocationConfig = {
    val __obj = js.Dynamic.literal()
    if (appBaseHref != null) __obj.updateDynamic("appBaseHref")(appBaseHref.asInstanceOf[js.Any])
    if (startUrl != null) __obj.updateDynamic("startUrl")(startUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockPlatformLocationConfig]
  }
}

