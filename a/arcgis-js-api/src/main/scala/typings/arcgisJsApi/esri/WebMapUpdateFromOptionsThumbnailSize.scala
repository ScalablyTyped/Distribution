package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebMapUpdateFromOptionsThumbnailSize extends Object {
  /**
    * The height of the thumbnail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var height: Double = js.native
  /**
    * The width of the thumbnail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var width: Double = js.native
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
  @scala.inline
  implicit class WebMapUpdateFromOptionsThumbnailSizeOps[Self <: WebMapUpdateFromOptionsThumbnailSize] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

