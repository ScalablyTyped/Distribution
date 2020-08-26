package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageMediaInfo
  extends JSONSupport
     with MediaInfo {
  /**
    * Refresh interval of the layer in minutes. Non-zero value indicates automatic layer refresh at the specified interval. Value of `0` indicates auto refresh is not enabled. If the property does not exist, it is equivalent to having a value of `0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html#refreshInterval)
    */
  var refreshInterval: Double = js.native
  /**
    * The type of popup element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html#type)
    *
    * @default image
    */
  val `type`: String = js.native
  /**
    * Defines the value format of the image media element and how the images should be retrieved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html#value)
    */
  var value: ImageMediaInfoValue = js.native
}

object ImageMediaInfo {
  @scala.inline
  def apply(
    altText: String,
    caption: String,
    refreshInterval: Double,
    title: String,
    toJSON: () => js.Any,
    `type`: String,
    value: ImageMediaInfoValue
  ): ImageMediaInfo = {
    val __obj = js.Dynamic.literal(altText = altText.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], refreshInterval = refreshInterval.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMediaInfo]
  }
  @scala.inline
  implicit class ImageMediaInfoOps[Self <: ImageMediaInfo] (val x: Self) extends AnyVal {
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
    def setRefreshInterval(value: Double): Self = this.set("refreshInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: ImageMediaInfoValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

