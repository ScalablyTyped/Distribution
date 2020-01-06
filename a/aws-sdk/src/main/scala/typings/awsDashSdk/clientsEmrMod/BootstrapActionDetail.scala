package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapActionDetail extends js.Object {
  /**
    * A description of the bootstrap action.
    */
  var BootstrapActionConfig: js.UndefOr[typings.awsDashSdk.clientsEmrMod.BootstrapActionConfig] = js.native
}

object BootstrapActionDetail {
  @scala.inline
  def apply(BootstrapActionConfig: BootstrapActionConfig = null): BootstrapActionDetail = {
    val __obj = js.Dynamic.literal()
    if (BootstrapActionConfig != null) __obj.updateDynamic("BootstrapActionConfig")(BootstrapActionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapActionDetail]
  }
}

