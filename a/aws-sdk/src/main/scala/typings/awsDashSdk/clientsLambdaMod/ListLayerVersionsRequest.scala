package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLayerVersionsRequest extends js.Object {
  /**
    * A runtime identifier. For example, go1.x.
    */
  var CompatibleRuntime: js.UndefOr[Runtime] = js.undefined
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typings.awsDashSdk.clientsLambdaMod.LayerName
  /**
    * A pagination token returned by a previous call.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of versions to return.
    */
  var MaxItems: js.UndefOr[MaxLayerListItems] = js.undefined
}

object ListLayerVersionsRequest {
  @scala.inline
  def apply(
    LayerName: LayerName,
    CompatibleRuntime: Runtime = null,
    Marker: String = null,
    MaxItems: Int | Double = null
  ): ListLayerVersionsRequest = {
    val __obj = js.Dynamic.literal(LayerName = LayerName)
    if (CompatibleRuntime != null) __obj.updateDynamic("CompatibleRuntime")(CompatibleRuntime.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLayerVersionsRequest]
  }
}

