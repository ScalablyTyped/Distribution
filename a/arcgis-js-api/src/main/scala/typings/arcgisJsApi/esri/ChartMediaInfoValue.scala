package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartMediaInfoValue
  extends Accessor
     with JSONSupport {
  /**
    * An array of strings, with each string containing the name of a field to display in the chart.
    * > In order to work with related fields within a chart, the fields must either be set as a [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) element in the [PopupTemplate's content](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content) or as [popupTemplate.fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos) property outside of the PopupTemplate's content.
    * > Set the [popupTemplate.fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos) property for any fields that need to have number formatting for chart/text elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#fields)
    */
  var fields: js.Array[String] = js.native
  /**
    * A string containing the name of a field. The values of all fields in the chart will be normalized (divided) by the value of this field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#normalizeField)
    */
  var normalizeField: String = js.native
  /**
    * An array of [ChartMediaInfoValueSeries](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValueSeries.html) objects which provide information of x/y data data that is plotted in a chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#series)
    */
  var series: js.Array[ChartMediaInfoValueSeries] = js.native
  /**
    * String value indicating the tooltip for a chart specified from another field. It is used for showing tooltips from another field in the same layer or related layer/table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#tooltipField)
    */
  var tooltipField: String = js.native
}

@JSGlobal("__esri.ChartMediaInfoValue")
@js.native
object ChartMediaInfoValue extends TopLevel[ChartMediaInfoValueConstructor]

