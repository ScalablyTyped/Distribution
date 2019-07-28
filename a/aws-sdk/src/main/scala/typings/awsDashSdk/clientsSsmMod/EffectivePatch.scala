package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectivePatch extends js.Object {
  /**
    * Provides metadata for a patch, including information such as the KB ID, severity, classification and a URL for where more information can be obtained about the patch.
    */
  var Patch: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Patch] = js.undefined
  /**
    * The status of the patch in a patch baseline. This includes information about whether the patch is currently approved, due to be approved by a rule, explicitly approved, or explicitly rejected and the date the patch was or will be approved.
    */
  var PatchStatus: js.UndefOr[typings.awsDashSdk.clientsSsmMod.PatchStatus] = js.undefined
}

object EffectivePatch {
  @scala.inline
  def apply(Patch: Patch = null, PatchStatus: PatchStatus = null): EffectivePatch = {
    val __obj = js.Dynamic.literal()
    if (Patch != null) __obj.updateDynamic("Patch")(Patch)
    if (PatchStatus != null) __obj.updateDynamic("PatchStatus")(PatchStatus)
    __obj.asInstanceOf[EffectivePatch]
  }
}

