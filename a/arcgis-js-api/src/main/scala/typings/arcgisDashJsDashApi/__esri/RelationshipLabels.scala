package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationshipLabels extends Object {
  /**
    * The label corresponding with the bottom corner of the legend if the focus is set to `HH`. This describes values that are considered low in both field 1 and field 2 (LL).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipLabels)
    */
  var bottom: String
  /**
    * The label corresponding with the left corner of the legend (if the focus is set to `HH`). This describes features where the value of field 1 is high and the value of field 2 is low (HL).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipLabels)
    */
  var left: String
  /**
    * The label corresponding with the right corner of the legend (if the focus is set to `HH`). This describes features where the value of field 2 is high and the value of field 1 is low (LH).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipLabels)
    */
  var right: String
  /**
    * The label corresponding with the top corner of the legend if the focus is set to `HH`. This describes values that are considered high in both field 1 and field 2 (HH).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipLabels)
    */
  var top: String
}

object RelationshipLabels {
  @scala.inline
  def apply(
    bottom: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    left: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    right: String,
    top: String
  ): RelationshipLabels = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), left = left.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RelationshipLabels]
  }
}

