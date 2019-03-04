package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributionItem
  extends stdLib.Object {
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
  var text: java.lang.String
}

object AttributionItem {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    layer: Layer,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    text: java.lang.String
  ): AttributionItem = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, layer = layer, propertyIsEnumerable = propertyIsEnumerable, text = text)
  
    __obj.asInstanceOf[AttributionItem]
  }
}

