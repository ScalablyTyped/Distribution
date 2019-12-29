package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebMapUpdateFromOptionsThumbnailSize extends Object {
  /**
    * The height of the thumbnail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var height: Double
  /**
    * The width of the thumbnail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var width: Double
}

object WebMapUpdateFromOptionsThumbnailSize {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    height: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    width: Double
  ): WebMapUpdateFromOptionsThumbnailSize = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), height = height.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebMapUpdateFromOptionsThumbnailSize]
  }
}

