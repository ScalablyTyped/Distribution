package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateHsmConfigurationResult extends js.Object {
  var HsmConfiguration: js.UndefOr[HsmConfiguration] = js.undefined
}

object CreateHsmConfigurationResult {
  @scala.inline
  def apply(HsmConfiguration: HsmConfiguration = null): CreateHsmConfigurationResult = {
    val __obj = js.Dynamic.literal()
    if (HsmConfiguration != null) __obj.updateDynamic("HsmConfiguration")(HsmConfiguration)
    __obj.asInstanceOf[CreateHsmConfigurationResult]
  }
}

