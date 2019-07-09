package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditingInfo
  extends stdLib.Object {
  /**
    * Indicates the last time the layer was edited. This value gets updated every time the layer's data is edited or when any of its properties change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditingInfo)
    */
  var lastEditDate: stdLib.Date
}

object EditingInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    lastEditDate: stdLib.Date,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): EditingInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), lastEditDate = lastEditDate, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[EditingInfo]
  }
}

