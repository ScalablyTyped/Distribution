package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationshipLabels extends Object {
  /**
    * The label corresponding with the bottom corner of the legend if the focus is set to `HH`. This describes values that are considered low in both field 1 and field 2 (LL).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipLabels)
    */
  var bottom: String = js.native
  /**
    * The label corresponding with the left corner of the legend (if the focus is set to `HH`). This describes features where the value of field 1 is high and the value of field 2 is low (HL).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipLabels)
    */
  var left: String = js.native
  /**
    * The label corresponding with the right corner of the legend (if the focus is set to `HH`). This describes features where the value of field 2 is high and the value of field 1 is low (LH).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipLabels)
    */
  var right: String = js.native
  /**
    * The label corresponding with the top corner of the legend if the focus is set to `HH`. This describes values that are considered high in both field 1 and field 2 (HH).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipLabels)
    */
  var top: String = js.native
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
  @scala.inline
  implicit class RelationshipLabelsOps[Self <: RelationshipLabels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBottom(value: String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: String): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

