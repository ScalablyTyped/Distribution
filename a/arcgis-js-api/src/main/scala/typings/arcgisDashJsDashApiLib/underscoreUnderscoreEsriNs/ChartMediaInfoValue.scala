package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartMediaInfoValue
  extends Accessor
     with JSONSupport {
  /**
    * An array of strings, with each string containing the name of a field to display in the chart.
    * > In order to work with related fields within a chart, the fields must also be set in the  [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#fields)
    */
  var fields: js.Array[java.lang.String] = js.native
  /**
    * A string containing the name of a field. The values of all fields in the chart will be normalized (divided) by the value of this field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#normalizeField)
    */
  var normalizeField: java.lang.String = js.native
  /**
    * An array of [ChartMediaInfoValueSeries](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValueSeries.html) objects which provide information of x/y data data that is plotted in a chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#series)
    */
  var series: js.Array[ChartMediaInfoValueSeries] = js.native
  /**
    * String value indicating the tooltip for a chart specified from another field. This field is needed when related records are not used. It is used for showing tooltips from another field in the same layer or related layer/table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ChartMediaInfoValue.html#tooltipField)
    */
  var tooltipField: java.lang.String = js.native
}

@JSGlobal("__esri.ChartMediaInfoValue")
@js.native
class ChartMediaInfoValueCls () extends ChartMediaInfoValue {
  def this(properties: ChartMediaInfoValueProperties) = this()
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

