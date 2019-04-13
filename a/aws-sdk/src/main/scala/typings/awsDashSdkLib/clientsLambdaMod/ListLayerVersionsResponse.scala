package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLayerVersionsResponse extends js.Object {
  /**
    * A list of versions.
    */
  var LayerVersions: js.UndefOr[LayerVersionsList] = js.undefined
  /**
    * A pagination token returned when the response doesn't contain all versions.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
}

object ListLayerVersionsResponse {
  @scala.inline
  def apply(LayerVersions: LayerVersionsList = null, NextMarker: String = null): ListLayerVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (LayerVersions != null) __obj.updateDynamic("LayerVersions")(LayerVersions)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[ListLayerVersionsResponse]
  }
}

