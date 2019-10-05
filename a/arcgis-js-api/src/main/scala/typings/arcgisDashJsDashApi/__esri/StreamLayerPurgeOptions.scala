package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamLayerPurgeOptions extends Object {
  /**
    * The maximum time in minutes that a feature should be kept. After this time, the feature is removed from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var age: Double
  /**
    * The maximum number of features to display. Excess features are purged from the beginning of the graphics array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var displayCount: Double
}

object StreamLayerPurgeOptions {
  @scala.inline
  def apply(
    age: Double,
    constructor: js.Function,
    displayCount: Double,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): StreamLayerPurgeOptions = {
    val __obj = js.Dynamic.literal(age = age, constructor = constructor, displayCount = displayCount, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[StreamLayerPurgeOptions]
  }
}

