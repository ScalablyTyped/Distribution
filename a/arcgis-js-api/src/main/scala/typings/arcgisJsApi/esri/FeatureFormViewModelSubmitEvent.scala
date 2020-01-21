package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureFormViewModelSubmitEvent extends js.Object {
  var invalid: js.Array[String]
  var valid: js.Array[String]
  var values: js.Any
}

object FeatureFormViewModelSubmitEvent {
  @scala.inline
  def apply(invalid: js.Array[String], valid: js.Array[String], values: js.Any): FeatureFormViewModelSubmitEvent = {
    val __obj = js.Dynamic.literal(invalid = invalid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeatureFormViewModelSubmitEvent]
  }
}

