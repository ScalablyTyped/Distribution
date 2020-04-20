package typings.arcgisJsApi.esri

import typings.std.Date
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditingInfo extends Object {
  /**
    * Indicates the last time the layer was edited. This value gets updated every time the layer's data is edited or when any of its properties change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditingInfo)
    */
  var lastEditDate: Date
}

object EditingInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    lastEditDate: Date,
    propertyIsEnumerable: PropertyKey => Boolean
  ): EditingInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), lastEditDate = lastEditDate.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[EditingInfo]
  }
}

