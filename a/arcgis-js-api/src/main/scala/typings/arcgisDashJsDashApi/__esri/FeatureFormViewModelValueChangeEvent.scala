package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureFormViewModelValueChangeEvent extends js.Object {
  var feature: Graphic
  var fieldName: String
  var layer: FeatureLayer
  var valid: Boolean
  var value: Double | String | js.Any
}

object FeatureFormViewModelValueChangeEvent {
  @scala.inline
  def apply(
    feature: Graphic,
    fieldName: String,
    layer: FeatureLayer,
    valid: Boolean,
    value: Double | String | js.Any
  ): FeatureFormViewModelValueChangeEvent = {
    val __obj = js.Dynamic.literal(feature = feature, fieldName = fieldName, layer = layer, valid = valid, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeatureFormViewModelValueChangeEvent]
  }
}

