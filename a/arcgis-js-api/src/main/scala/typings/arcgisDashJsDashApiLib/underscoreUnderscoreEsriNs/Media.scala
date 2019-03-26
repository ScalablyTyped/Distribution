package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Media
  extends ContentElementContentElement
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.ContentElementNs.ContentElement
     with supportContentElementContentElement {
  /**
    * Contains the media elements representing images or charts to display within the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html). This can be an individual chart or image element, or an array containing a combination of any of these types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media.html#mediaInfos)
    */
  var mediaInfos: BarChart | ColumnChart | Image | LineChart | PieChart | js.Array[_] = js.native
}

@JSGlobal("__esri.Media")
@js.native
/**
  * A `MediaContentElement` represents an individual or array of [Media](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Media.html) elements to display within a popup's content. Examples of these types of media are [charts](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart.html) and/or [images](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Image.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media.html)
  */
class MediaCls () extends Media {
  def this(properties: MediaProperties) = this()
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

