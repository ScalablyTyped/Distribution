package typings.angularFeatureFlags.mod.featureflags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureFlagsProvider extends js.Object {
  def setInitialFlags(flags: js.Array[FlagData]): Unit
}

object FeatureFlagsProvider {
  @scala.inline
  def apply(setInitialFlags: js.Array[FlagData] => Unit): FeatureFlagsProvider = {
    val __obj = js.Dynamic.literal(setInitialFlags = js.Any.fromFunction1(setInitialFlags))
    __obj.asInstanceOf[FeatureFlagsProvider]
  }
}

