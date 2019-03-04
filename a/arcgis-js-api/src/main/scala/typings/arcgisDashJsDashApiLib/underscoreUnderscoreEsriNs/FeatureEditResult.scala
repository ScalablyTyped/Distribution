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
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    objectId: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): FeatureEditResult = {
    val __obj = js.Dynamic.literal(constructor = constructor, error = error, hasOwnProperty = hasOwnProperty, objectId = objectId, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[FeatureEditResult]
  }
}

