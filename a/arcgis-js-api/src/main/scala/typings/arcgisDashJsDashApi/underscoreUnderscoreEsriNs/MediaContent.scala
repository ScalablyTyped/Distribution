package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaContent
  extends Content
     with typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.contentNs.Content
     with contentContent {
  /**
    * Contains the media elements representing images or charts to display within the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html). This can be an individual chart or image element, or an array containing a combination of any of these types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html#mediaInfos)
    */
  var mediaInfos: BarChartMediaInfo | ColumnChartMediaInfo | ImageMediaInfo | LineChartMediaInfo | PieChartMediaInfo | js.Array[_] = js.native
}

@JSGlobal("__esri.MediaContent")
@js.native
/**
  * A `MediaContent` popup element contains an individual or array of chart and/or image media elements to display within a popup's content.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html)
  */
class MediaContentCls () extends MediaContent {
  def this(properties: MediaContentProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

