package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartMediaInfoValueProperties extends js.Object {
  /**
    * An array of strings, with each string containing the name of a field to display in the chart.
    * > In order to work with related fields within a chart, the fields must also be set in the  [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#fields)
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A string containing the name of a field. The values of all fields in the chart will be normalized (divided) by the value of this field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#normalizeField)
    */
  var normalizeField: js.UndefOr[String] = js.undefined
  /**
    * An array of [ChartMediaInfoValueSeries](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValueSeries.html) objects which provide information of x/y data data that is plotted in a chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#series)
    */
  var series: js.UndefOr[js.Array[ChartMediaInfoValueSeriesProperties]] = js.undefined
  /**
    * String value indicating the tooltip for a chart specified from another field. This field is needed when related records are not used. It is used for showing tooltips from another field in the same layer or related layer/table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#tooltipField)
    */
  var tooltipField: js.UndefOr[String] = js.undefined
}

object ChartMediaInfoValueProperties {
  @scala.inline
  def apply(
    fields: js.Array[String] = null,
    normalizeField: String = null,
    series: js.Array[ChartMediaInfoValueSeriesProperties] = null,
    tooltipField: String = null
  ): ChartMediaInfoValueProperties = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (normalizeField != null) __obj.updateDynamic("normalizeField")(normalizeField)
    if (series != null) __obj.updateDynamic("series")(series)
    if (tooltipField != null) __obj.updateDynamic("tooltipField")(tooltipField)
    __obj.asInstanceOf[ChartMediaInfoValueProperties]
  }
}

