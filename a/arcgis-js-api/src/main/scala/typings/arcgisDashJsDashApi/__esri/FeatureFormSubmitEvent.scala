package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureFormSubmitEvent extends js.Object {
  var invalid: js.Array[String]
  var valid: js.Array[String]
  var values: js.Any
}

object FeatureFormSubmitEvent {
  @scala.inline
  def apply(invalid: js.Array[String], valid: js.Array[String], values: js.Any): FeatureFormSubmitEvent = {
    val __obj = js.Dynamic.literal(invalid = invalid, valid = valid, values = values)
  
    __obj.asInstanceOf[FeatureFormSubmitEvent]
  }
}

