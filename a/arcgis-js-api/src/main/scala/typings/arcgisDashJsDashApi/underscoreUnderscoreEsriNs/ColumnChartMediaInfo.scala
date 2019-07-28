package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnChartMediaInfo
  extends JSONSupport
     with MediaInfo
     with ChartMediaInfo {
  /**
    * Indicates the type of chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ColumnChartMediaInfo.html#type)
    *
    * @default column-chart
    */
  val `type`: String
}

@JSGlobal("__esri.ColumnChartMediaInfo")
@js.native
/**
  * A `ColumnChartMediaInfo` is a type of chart media element that represents a column chart displayed within a popup.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ColumnChartMediaInfo.html)
  */
class ColumnChartMediaInfoCls () extends ColumnChartMediaInfo {
  def this(properties: ColumnChartMediaInfoProperties) = this()
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ColumnChartMediaInfo.html#type)
    *
    * @default column-chart
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

object ColumnChartMediaInfo {
  @scala.inline
  def apply(
    caption: String,
    clone: () => ColumnChartMediaInfo,
    title: String,
    toJSON: () => js.Any,
    `type`: String,
    value: ChartMediaInfoValue
  ): ColumnChartMediaInfo = {
    val __obj = js.Dynamic.literal(caption = caption, clone = js.Any.fromFunction0(clone), title = title, toJSON = js.Any.fromFunction0(toJSON), value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnChartMediaInfo]
  }
}

