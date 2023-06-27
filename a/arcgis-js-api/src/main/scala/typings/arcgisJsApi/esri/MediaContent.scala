package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.media
import typings.arcgisJsApi.esri.content.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaContent
  extends StObject
     with Content_
     with Content
     with contentContent {
  
  /**
  		 * Index of the current active media within the popup's media content.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html#activeMediaInfoIndex)
  		 */
  var activeMediaInfoIndex: String = js.native
  
  /**
  		 * Describes the media's content in detail.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html#description)
  		 */
  var description: String = js.native
  
  /**
  		 * Contains the media elements representing images or charts to display within the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html#mediaInfos)
  		 */
  var mediaInfos: BarChartMediaInfo | ColumnChartMediaInfo | ImageMediaInfo | LineChartMediaInfo | PieChartMediaInfo | js.Array[Any] = js.native
  
  /**
  		 * Heading indicating what the media's content represents.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html#title)
  		 */
  var title: String = js.native
  
  /**
  		 * The type of popup element displayed.
  		 *
  		 * @default media
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html#type)
  		 */
  @JSName("type")
  val type_MediaContent: media = js.native
}
