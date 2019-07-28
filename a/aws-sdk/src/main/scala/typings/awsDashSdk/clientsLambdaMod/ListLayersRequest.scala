package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLayersRequest extends js.Object {
  /**
    * A runtime identifier. For example, go1.x.
    */
  var CompatibleRuntime: js.UndefOr[Runtime] = js.undefined
  /**
    * A pagination token returned by a previous call.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of layers to return.
    */
  var MaxItems: js.UndefOr[MaxLayerListItems] = js.undefined
}

object ListLayersRequest {
  @scala.inline
  def apply(
    CompatibleRuntime: Runtime = null,
    Marker: String = null,
    MaxItems: js.UndefOr[MaxLayerListItems] = js.undefined
  ): ListLayersRequest = {
    val __obj = js.Dynamic.literal()
    if (CompatibleRuntime != null) __obj.updateDynamic("CompatibleRuntime")(CompatibleRuntime.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems)
    __obj.asInstanceOf[ListLayersRequest]
  }
}

