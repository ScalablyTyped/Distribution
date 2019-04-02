package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditableItem
  extends stdLib.Object {
  /**
    * *Read-only* The feature layer associated with the editable item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#EditableItem)
    */
  var layer: FeatureLayer
  /**
    * *Read-only* The workflow type that this item supports. Can be either, `update` or `create`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#EditableItem)
    */
  var supports: java.lang.String
}

object EditableItem {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    layer: FeatureLayer,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    supports: java.lang.String
  ): EditableItem = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supports = supports)
  
    __obj.asInstanceOf[EditableItem]
  }
}

