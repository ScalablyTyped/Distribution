package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditCheckConfiguration extends js.Object {
  /**
    * True if this audit check is enabled for this account.
    */
  var enabled: js.UndefOr[Enabled] = js.undefined
}

object AuditCheckConfiguration {
  @scala.inline
  def apply(enabled: js.UndefOr[Enabled] = js.undefined): AuditCheckConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[AuditCheckConfiguration]
  }
}

