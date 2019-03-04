package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSceneUpdateFromOptionsThumbnailSize
  extends stdLib.Object {
  /**
    * the height of the thumbnail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom)
    */
  var height: scala.Double
  /**
    * the width of the thumbnail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom)
    */
  var width: scala.Double
}

object WebSceneUpdateFromOptionsThumbnailSize {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    height: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    width: scala.Double
  ): WebSceneUpdateFromOptionsThumbnailSize = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, height = height, propertyIsEnumerable = propertyIsEnumerable, width = width)
  
    __obj.asInstanceOf[WebSceneUpdateFromOptionsThumbnailSize]
  }
}

