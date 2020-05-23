package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageMediaInfo
  extends JSONSupport
     with MediaInfo {
  /**
    * Refresh interval of the layer in minutes. Non-zero value indicates automatic layer refresh at the specified interval. Value of `0` indicates auto refresh is not enabled. If the property does not exist, it is equivalent to having a value of `0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html#refreshInterval)
    */
  var refreshInterval: Double
  /**
    * The type of popup element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html#type)
    *
    * @default image
    */
  val `type`: String
  /**
    * Defines the value format of the image media element and how the images should be retrieved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html#value)
    */
  var value: ImageMediaInfoValue
}

object ImageMediaInfo {
  @scala.inline
  def apply(
    caption: String,
    refreshInterval: Double,
    title: String,
    toJSON: () => js.Any,
    `type`: String,
    value: ImageMediaInfoValue
  ): ImageMediaInfo = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], refreshInterval = refreshInterval.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMediaInfo]
  }
}

