package typings.arcgisDashJsDashApi.esriPopupContentPieChartMediaInfoMod

import typings.arcgisDashJsDashApi.__esri.ChartMediaInfoValue
import typings.arcgisDashJsDashApi.__esri.PieChartMediaInfo
import typings.arcgisDashJsDashApi.__esri.PieChartMediaInfoProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/popup/content/PieChartMediaInfo", JSImport.Namespace)
@js.native
/**
  * A `PieChartMediaInfo` is a type of chart media element that represents a pie chart displayed within a popup.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-PieChartMediaInfo.html)
  */
class Class () extends PieChartMediaInfo {
  def this(properties: PieChartMediaInfoProperties) = this()
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-PieChartMediaInfo.html#type)
    *
    * @default pie-chart
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
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

