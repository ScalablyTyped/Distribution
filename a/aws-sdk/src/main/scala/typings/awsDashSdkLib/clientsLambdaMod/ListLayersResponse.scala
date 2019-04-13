package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLayersResponse extends js.Object {
  /**
    * A list of function layers.
    */
  var Layers: js.UndefOr[LayersList] = js.undefined
  /**
    * A pagination token returned when the response doesn't contain all layers.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
}

object ListLayersResponse {
  @scala.inline
  def apply(Layers: LayersList = null, NextMarker: String = null): ListLayersResponse = {
    val __obj = js.Dynamic.literal()
    if (Layers != null) __obj.updateDynamic("Layers")(Layers)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[ListLayersResponse]
  }
}

