package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value
  extends Accessor
     with JSONSupport {
  /**
    * An array of strings, with each string containing the name of a field to display in the chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart-Value.html#fields)
    */
  var fields: js.Array[java.lang.String] = js.native
  /**
    * A string containing the name of a field. The values of all fields in the chart will be normalized (divided) by the value of this field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart-Value.html#normalizeField)
    */
  var normalizeField: java.lang.String = js.native
  /**
    * An array of [Series](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart-Series.html) objects which provide information of x/y data data that is plotted in a chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart-Value.html#series)
    */
  var series: js.Array[Series] = js.native
  /**
    * Used for chart values. Defines a new Dojo theme, only valid for chart types. View the [Dojox Charting Theme Preview](https://download.dojotoolkit.org/release-1.10.0/dojo-release-1.10.0/dojox/charting/tests/theme_preview.html) to see some of the theme options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart-Value.html#theme)
    */
  var theme: java.lang.String = js.native
  /**
    * String value indicating the tooltip for a chart specified from another field. This field is needed when related records are not used. It is used for showing tooltips from another field in the same layer or related layer/table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart-Value.html#tooltipField)
    */
  var tooltipField: java.lang.String = js.native
}

@JSGlobal("__esri.Value")
@js.native
class ValueCls () extends Value {
  def this(properties: ValueProperties) = this()
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

