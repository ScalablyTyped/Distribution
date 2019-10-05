package typings.arcgisDashJsDashApi.esriPopupContentLineChartMediaInfoMod

import typings.arcgisDashJsDashApi.__esri.ChartMediaInfoValue
import typings.arcgisDashJsDashApi.__esri.LineChartMediaInfo
import typings.arcgisDashJsDashApi.__esri.LineChartMediaInfoProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/popup/content/LineChartMediaInfo", JSImport.Namespace)
@js.native
/**
  * A `LineChartMediaInfo` is a type of chart media element that represents a line chart displayed within a popup.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-LineChartMediaInfo.html)
  */
class Class () extends LineChartMediaInfo {
  def this(properties: LineChartMediaInfoProperties) = this()
  /**
    * Defines a caption for the media.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#caption)
    */
  /* CompleteClass */
  override var caption: String = js.native
  /**
    * The title of the media element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#title)
    */
  /* CompleteClass */
  override var title: String = js.native
  /**
    * Indicates the type of chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-LineChartMediaInfo.html#type)
    *
    * @default line-chart
    */
  /* CompleteClass */
  override val `type`: String = js.native
  /**
    * Defines the chart value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-ChartMediaInfo.html#value)
    */
  /* CompleteClass */
  override var value: ChartMediaInfoValue = js.native
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

