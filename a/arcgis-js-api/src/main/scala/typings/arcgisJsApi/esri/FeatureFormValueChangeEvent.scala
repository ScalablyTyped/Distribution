package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureFormValueChangeEvent extends js.Object {
  var feature: Graphic
  var fieldName: String
  var layer: FeatureLayer
  var valid: Boolean
  var value: Double | String | js.Any
}

object FeatureFormValueChangeEvent {
  @scala.inline
  def apply(
    feature: Graphic,
    fieldName: String,
    layer: FeatureLayer,
    valid: Boolean,
    value: Double | String | js.Any
  ): FeatureFormValueChangeEvent = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureFormValueChangeEvent]
  }
}

