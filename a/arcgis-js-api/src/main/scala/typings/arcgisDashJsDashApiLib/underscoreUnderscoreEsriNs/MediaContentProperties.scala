package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaContentProperties extends ContentProperties {
  /**
    * Contains the media elements representing images or charts to display within the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html). This can be an individual chart or image element, or an array containing a combination of any of these types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html#mediaInfos)
    */
  var mediaInfos: js.UndefOr[
    BarChartMediaInfoProperties | ColumnChartMediaInfoProperties | ImageMediaInfoProperties | LineChartMediaInfoProperties | PieChartMediaInfoProperties | js.Array[_]
  ] = js.undefined
}

object MediaContentProperties {
  @scala.inline
  def apply(
    mediaInfos: BarChartMediaInfoProperties | ColumnChartMediaInfoProperties | ImageMediaInfoProperties | LineChartMediaInfoProperties | PieChartMediaInfoProperties | js.Array[_] = null
  ): MediaContentProperties = {
    val __obj = js.Dynamic.literal()
    if (mediaInfos != null) __obj.updateDynamic("mediaInfos")(mediaInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaContentProperties]
  }
}

