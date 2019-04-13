package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapActionDetail extends js.Object {
  /**
    * A description of the bootstrap action.
    */
  var BootstrapActionConfig: js.UndefOr[BootstrapActionConfig] = js.undefined
}

object BootstrapActionDetail {
  @scala.inline
  def apply(BootstrapActionConfig: BootstrapActionConfig = null): BootstrapActionDetail = {
    val __obj = js.Dynamic.literal()
    if (BootstrapActionConfig != null) __obj.updateDynamic("BootstrapActionConfig")(BootstrapActionConfig)
    __obj.asInstanceOf[BootstrapActionDetail]
  }
}

