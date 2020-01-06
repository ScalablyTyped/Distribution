package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLayerVersionsResponse extends js.Object {
  /**
    * A list of versions.
    */
  var LayerVersions: js.UndefOr[LayerVersionsList] = js.native
  /**
    * A pagination token returned when the response doesn't contain all versions.
    */
  var NextMarker: js.UndefOr[String] = js.native
}

object ListLayerVersionsResponse {
  @scala.inline
  def apply(LayerVersions: LayerVersionsList = null, NextMarker: String = null): ListLayerVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (LayerVersions != null) __obj.updateDynamic("LayerVersions")(LayerVersions.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLayerVersionsResponse]
  }
}

