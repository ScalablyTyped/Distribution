package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributionItem extends Object {
  /**
    * The layer that has the attribution text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html#AttributionItem)
    */
  var layer: Layer
  /**
    * The attribution text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html#AttributionItem)
    */
  var text: String
}

object AttributionItem {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: Layer,
    propertyIsEnumerable: PropertyKey => Boolean,
    text: String
  ): AttributionItem = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), text = text)
  
    __obj.asInstanceOf[AttributionItem]
  }
}

