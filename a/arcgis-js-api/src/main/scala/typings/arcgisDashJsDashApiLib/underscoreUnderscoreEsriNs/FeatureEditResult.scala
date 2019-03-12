package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureEditResult
  extends stdLib.Object {
  /**
    * If the edit failed, the edit result includes an error.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#FeatureEditResult)
    */
  var error: FeatureEditResultError
  /**
    * Object Id of the feature that was edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#FeatureEditResult)
    */
  var objectId: scala.Double
}

object FeatureEditResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    error: FeatureEditResultError,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    objectId: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): FeatureEditResult = {
    val __obj = js.Dynamic.literal(constructor = constructor, error = error, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), objectId = objectId, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[FeatureEditResult]
  }
}

