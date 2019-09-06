package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionControls extends js.Object {
  /**
    * A SsmControls object.
    */
  var SsmControls: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.SsmControls] = js.undefined
}

object ExecutionControls {
  @scala.inline
  def apply(SsmControls: SsmControls = null): ExecutionControls = {
    val __obj = js.Dynamic.literal()
    if (SsmControls != null) __obj.updateDynamic("SsmControls")(SsmControls)
    __obj.asInstanceOf[ExecutionControls]
  }
}

