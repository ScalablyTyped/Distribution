package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchOrchestratorFilter extends js.Object {
  /**
    * The key for the filter.
    */
  var Key: js.UndefOr[PatchOrchestratorFilterKey] = js.undefined
  /**
    * The value for the filter.
    */
  var Values: js.UndefOr[PatchOrchestratorFilterValues] = js.undefined
}

object PatchOrchestratorFilter {
  @scala.inline
  def apply(Key: PatchOrchestratorFilterKey = null, Values: PatchOrchestratorFilterValues = null): PatchOrchestratorFilter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[PatchOrchestratorFilter]
  }
}

