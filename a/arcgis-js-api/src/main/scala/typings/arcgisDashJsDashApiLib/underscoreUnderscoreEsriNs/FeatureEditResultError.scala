package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureEditResultError
  extends stdLib.Object {
  /**
    * Message describing the error.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#FeatureEditResult)
    */
  var message: java.lang.String
  /**
    * Error name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#FeatureEditResult)
    */
  var name: java.lang.String
}

object FeatureEditResultError {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    message: java.lang.String,
    name: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): FeatureEditResultError = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, message = message, name = name, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[FeatureEditResultError]
  }
}

