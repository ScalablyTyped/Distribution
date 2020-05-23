package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.media
import typings.arcgisJsApi.esri.content.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaContent
  extends Content_
     with Content
     with contentContent {
  /**
    * Contains the media elements representing images or charts to display within the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html). This can be an individual chart or image element, or an array containing a combination of any of these types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html#mediaInfos)
    */
  var mediaInfos: BarChartMediaInfo | ColumnChartMediaInfo | ImageMediaInfo | LineChartMediaInfo | PieChartMediaInfo | js.Array[_] = js.native
  /**
    * The type of popup element displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html#type)
    *
    * @default media
    */
  @JSName("type")
  val type_MediaContent: media = js.native
}

