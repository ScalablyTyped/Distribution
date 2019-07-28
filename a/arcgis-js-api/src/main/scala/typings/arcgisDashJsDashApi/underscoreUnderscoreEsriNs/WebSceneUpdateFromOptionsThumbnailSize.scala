package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSceneUpdateFromOptionsThumbnailSize extends Object {
  /**
    * the height of the thumbnail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom)
    */
  var height: Double
  /**
    * the width of the thumbnail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom)
    */
  var width: Double
}

object WebSceneUpdateFromOptionsThumbnailSize {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    height: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    width: Double
  ): WebSceneUpdateFromOptionsThumbnailSize = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), height = height, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), width = width)
  
    __obj.asInstanceOf[WebSceneUpdateFromOptionsThumbnailSize]
  }
}

