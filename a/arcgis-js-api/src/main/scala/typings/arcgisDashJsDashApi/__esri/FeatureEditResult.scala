package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureEditResult extends Object {
  /**
    * If the edit failed, the edit result includes an error.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#FeatureEditResult)
    */
  var error: FeatureEditResultError
  /**
    * The globalId of the feature or the attachment that was edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#FeatureEditResult)
    */
  var globalId: String
  /**
    * The objectId of the feature or the attachmentId of the attachment that was edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#FeatureEditResult)
    */
  var objectId: Double
}

object FeatureEditResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    error: FeatureEditResultError,
    globalId: String,
    hasOwnProperty: PropertyKey => Boolean,
    objectId: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FeatureEditResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], globalId = globalId.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), objectId = objectId.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[FeatureEditResult]
  }
}

