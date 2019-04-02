package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineChartMediaInfo
  extends JSONSupport
     with MediaInfo
     with ChartMediaInfo {
  /**
    * Indicates the type of chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-LineChartMediaInfo.html#type)
    *
    * @default line-chart
    */
  val `type`: java.lang.String
}

@JSGlobal("__esri.LineChartMediaInfo")
@js.native
/**
  * A `LineChartMediaInfo` is a type of chart media element that represents a line chart displayed within a popup.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-LineChartMediaInfo.html)
  */
class LineChartMediaInfoCls () extends LineChartMediaInfo {
  def this(properties: LineChartMediaInfoProperties) = this()
  /**
    * Defines a caption for the media.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#caption)
    */
  /* CompleteClass */
  override var caption: java.lang.String = js.native
  /**
    * The title of the media element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#title)
    */
  /* CompleteClass */
  override var title: java.lang.String = js.native
  /**
    * Indicates the type of chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-LineChartMediaInfo.html#type)
    *
    * @default line-chart
    */
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
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

object LineChartMediaInfo {
  @scala.inline
  def apply(
    caption: java.lang.String,
    clone: () => LineChartMediaInfo,
    title: java.lang.String,
    toJSON: () => js.Any,
    `type`: java.lang.String,
    value: ChartMediaInfoValue
  ): LineChartMediaInfo = {
    val __obj = js.Dynamic.literal(caption = caption, clone = js.Any.fromFunction0(clone), title = title, toJSON = js.Any.fromFunction0(toJSON), value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LineChartMediaInfo]
  }
}

