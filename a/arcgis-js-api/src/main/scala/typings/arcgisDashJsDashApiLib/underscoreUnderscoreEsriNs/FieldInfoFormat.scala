package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldInfoFormat
  extends Accessor
     with JSONSupport {
  /**
    * Used only with `Date` fields. Specifies how the date should appear in a popup.  **Possible Values**: short-date | short-date-le | long-date | day-short-month-year | long-month-day-year | short-date-long-time | short-date-le-long-time | short-date-short-time | short-date-le-short-time | short-date-short-time-24 | short-date-le-short-time-24 | short-date-short-time-24 | short-date-le-short-time-24 | long-month-year | short-month-year | year
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-FieldInfoFormat.html#dateFormat)
    */
  var dateFormat: java.lang.String = js.native
  /**
    * Used only with `Number` fields. A value of `true` indicates the number should have a digit (or thousands) separator when the value appears in popups. A value of `false` means that no separator will be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-FieldInfoFormat.html#digitSeparator)
    *
    * @default false
    */
  var digitSeparator: scala.Boolean = js.native
  /**
    * Used only with `Number` fields to specify the number of supported decimal places that should appear in popups. Any places beyond this value are rounded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-FieldInfoFormat.html#places)
    */
  var places: scala.Double = js.native
}

@JSGlobal("__esri.FieldInfoFormat")
@js.native
/**
  * The `FieldInfoFormat` class is used with numerical or date fields to provide more detail about how the value should be displayed in a popup.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-FieldInfoFormat.html)
  */
class FieldInfoFormatCls () extends FieldInfoFormat {
  def this(properties: FieldInfoFormatProperties) = this()
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

