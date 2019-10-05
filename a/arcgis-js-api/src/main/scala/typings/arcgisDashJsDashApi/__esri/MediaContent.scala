package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaContent
  extends Content
     with typings.arcgisDashJsDashApi.__esri.content.Content
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
object MediaContent extends TopLevel[MediaContentConstructor]

