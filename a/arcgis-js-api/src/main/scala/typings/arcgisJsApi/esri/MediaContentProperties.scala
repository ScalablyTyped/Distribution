package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaContentProperties extends ContentProperties {
  /**
    * Contains the media elements representing images or charts to display within the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html). This can be an individual chart or image element, or an array containing a combination of any of these types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html#mediaInfos)
    */
  var mediaInfos: js.UndefOr[
    BarChartMediaInfoProperties | ColumnChartMediaInfoProperties | ImageMediaInfoProperties | LineChartMediaInfoProperties | PieChartMediaInfoProperties | js.Array[_]
  ] = js.native
}

object MediaContentProperties {
  @scala.inline
  def apply(): MediaContentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContentProperties]
  }
  @scala.inline
  implicit class MediaContentPropertiesOps[Self <: MediaContentProperties] (val x: Self) extends AnyVal {
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
    def setMediaInfosVarargs(value: js.Any*): Self = this.set("mediaInfos", js.Array(value :_*))
    @scala.inline
    def setMediaInfos(
      value: BarChartMediaInfoProperties | ColumnChartMediaInfoProperties | ImageMediaInfoProperties | LineChartMediaInfoProperties | PieChartMediaInfoProperties | js.Array[_]
    ): Self = this.set("mediaInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaInfos: Self = this.set("mediaInfos", js.undefined)
  }
  
}

