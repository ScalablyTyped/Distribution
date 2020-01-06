package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLayersResult extends js.Object {
  /**
    * An array of Layer objects that describe the layers.
    */
  var Layers: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.Layers] = js.native
}

object DescribeLayersResult {
  @scala.inline
  def apply(Layers: Layers = null): DescribeLayersResult = {
    val __obj = js.Dynamic.literal()
    if (Layers != null) __obj.updateDynamic("Layers")(Layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLayersResult]
  }
}

