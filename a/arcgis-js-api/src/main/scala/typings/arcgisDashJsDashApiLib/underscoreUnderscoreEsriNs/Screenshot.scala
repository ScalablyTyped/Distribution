package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Screenshot
  extends stdLib.Object {
  /**
    * The raw RGBA image data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#Screenshot)
    */
  var data: stdLib.ImageData
  /**
    * A data url representing the screenshot.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#Screenshot)
    */
  var dataUrl: java.lang.String
}

object Screenshot {
  @scala.inline
  def apply(
    constructor: js.Function,
    data: stdLib.ImageData,
    dataUrl: java.lang.String,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): Screenshot = {
    val __obj = js.Dynamic.literal(constructor = constructor, data = data, dataUrl = dataUrl, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[Screenshot]
  }
}

