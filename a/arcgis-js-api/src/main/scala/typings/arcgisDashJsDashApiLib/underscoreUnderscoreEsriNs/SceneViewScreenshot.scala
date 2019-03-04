package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewScreenshot
  extends stdLib.Object {
  /**
    * The raw RGBA image data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#Screenshot)
    */
  var data: stdLib.ImageData
  /**
    * A data url representing the screenshot.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#Screenshot)
    */
  var dataUrl: java.lang.String
}

object SceneViewScreenshot {
  @scala.inline
  def apply(
    constructor: js.Function,
    data: stdLib.ImageData,
    dataUrl: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): SceneViewScreenshot = {
    val __obj = js.Dynamic.literal(constructor = constructor, data = data, dataUrl = dataUrl, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[SceneViewScreenshot]
  }
}

