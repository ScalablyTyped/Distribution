package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationshipLabels
  extends stdLib.Object {
  /**
    * The label corresponding with the bottom corner of the legend if the focus is set to `HH`. This describes values that are considered low in both field 1 and field 2 (LL).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipLabels)
    */
  var bottom: java.lang.String
  /**
    * The label corresponding with the left corner of the legend (if the focus is set to `HH`). This describes features where the value of field 1 is high and the value of field 2 is low (HL).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipLabels)
    */
  var left: java.lang.String
  /**
    * The label corresponding with the right corner of the legend (if the focus is set to `HH`). This describes features where the value of field 2 is high and the value of field 1 is low (LH).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipLabels)
    */
  var right: java.lang.String
  /**
    * The label corresponding with the top corner of the legend if the focus is set to `HH`. This describes values that are considered high in both field 1 and field 2 (HH).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipLabels)
    */
  var top: java.lang.String
}

object RelationshipLabels {
  @scala.inline
  def apply(
    bottom: java.lang.String,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    left: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    right: java.lang.String,
    top: java.lang.String
  ): RelationshipLabels = {
    val __obj = js.Dynamic.literal(bottom = bottom, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), left = left, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), right = right, top = top)
  
    __obj.asInstanceOf[RelationshipLabels]
  }
}

