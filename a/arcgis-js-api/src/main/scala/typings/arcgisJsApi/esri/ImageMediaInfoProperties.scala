package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageMediaInfoProperties extends MediaInfoProperties {
  /**
    * Refresh interval of the layer in minutes. Non-zero value indicates automatic layer refresh at the specified interval. Value of `0` indicates auto refresh is not enabled. If the property does not exist, it is equivalent to having a value of `0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html#refreshInterval)
    */
  var refreshInterval: js.UndefOr[Double] = js.native
  /**
    * Defines the value format of the image media element and how the images should be retrieved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html#value)
    */
  var value: js.UndefOr[ImageMediaInfoValueProperties] = js.native
}

object ImageMediaInfoProperties {
  @scala.inline
  def apply(): ImageMediaInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageMediaInfoProperties]
  }
  @scala.inline
  implicit class ImageMediaInfoPropertiesOps[Self <: ImageMediaInfoProperties] (val x: Self) extends AnyVal {
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
    def deleteRefreshInterval: Self = this.set("refreshInterval", js.undefined)
    @scala.inline
    def setValue(value: ImageMediaInfoValueProperties): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

