package typings
package angularDashFeatureDashFlagsLib.angularMod.featureflagsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureFlagsProvider extends js.Object {
  def setInitialFlags(flags: js.Array[FlagData]): scala.Unit
}

object FeatureFlagsProvider {
  @scala.inline
  def apply(setInitialFlags: js.Function1[js.Array[FlagData], scala.Unit]): FeatureFlagsProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setInitialFlags")(setInitialFlags)
    __obj.asInstanceOf[FeatureFlagsProvider]
  }
}

