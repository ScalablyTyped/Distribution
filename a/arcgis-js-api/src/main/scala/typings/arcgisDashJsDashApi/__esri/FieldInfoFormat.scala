package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`day-short-month-year-long-time-24`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`day-short-month-year-long-time`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`day-short-month-year-short-time-24`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`day-short-month-year-short-time`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`day-short-month-year`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`long-date-long-time-24`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`long-date-long-time`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`long-date-short-time-24`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`long-date-short-time`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`long-date`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`long-month-day-year-long-time-24`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`long-month-day-year-long-time`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`long-month-day-year-short-time-24`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`long-month-day-year-short-time`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`long-month-day-year`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`long-month-year`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`short-date-le-long-time-24`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`short-date-le-long-time`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`short-date-le-short-time-24`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`short-date-le-short-time`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`short-date-le`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`short-date-long-time-24`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`short-date-long-time`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`short-date-short-time`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`short-date`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`short-month-year`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.default
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldInfoFormat
  extends Accessor
     with JSONSupport {
  /**
    * Used only with `Date` fields. Specifies how the date should appear in a popup.  **Possible Values**
    *
    * | **Format** |**Date Formatting**  |
    * |-------     | ----------------------  |
    * | **default**  | 12/31/1969, 19:00 |
    * | **short-date** | 12/31/1969   |
    * | **short-date-short-time** | 12/31/1969, 7:00 PM |
    * | **short-date-long-time** | 12/31/1969, 7:00:00 PM |
    * | **short-date-long-time-24** | 12/31/1969, 19:00:00 |
    * | **short-date-le** | 12/31/1969 |
    * | **short-date-le-short-time** | 12/31/1969, 7:00 PM |
    * | **short-date-le-short-time-24** | 12/31/1969, 19:00 |
    * | **short-date-le-long-time** | 12/31/1969, 7:00:00 PM |
    * | **short-date-le-long-time-24** | 12/31/1969, 19:00:0 |
    * | **long-month-day-year** | December 31, 1969 |
    * | **long-month-day-year-short-time** | December 31, 1969, 7:00 PM |
    * | **long-month-day-year-short-time-24** | December 31, 1969, 19:00 |
    * | **long-month-day-year-long-time** | December 31, 1969, 7:00:00 PM |
    * | **long-month-day-year-long-time-24** | December 31, 1969, 19:00:00 |
    * | **day-short-month-year** | Dec 31, 1969 |
    * | **day-short-month-year-short-time** | Dec 31, 1969, 7:00 PM |
    * | **day-short-month-year-short-time-24** | Dec 31, 1969, 19:00 |
    * | **day-short-month-year-long-time** | Dec 31, 1969, 7:00:00 PM |
    * | **day-short-month-year-long-time-24** | Dec 31, 1969, 19:00:00 |
    * | **long-date** | Wednesday, December 31, 1969 |
    * | **long-date-short-time** | Wednesday, December 31, 1969, 7:00 PM |
    * | **long-date-short-time-24** | Wednesday, December 31, 1969, 19:00 |
    * | **long-date-long-time** | Wednesday, December 31, 1969, 7:00:00 PM |
    * | **long-date-long-time-24** | Wednesday, December 31, 1969, 19:00:00 |
    * | **long-month-year** | December 1969 |
    * | **short-month-year** | Dec 1969 |
    * | **year** | 1969 |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-FieldInfoFormat.html#dateFormat)
    */
  var dateFormat: default | `short-date` | `short-date-short-time` | `short-date-long-time` | `short-date-long-time-24` | `short-date-le` | `short-date-le-short-time` | `short-date-le-short-time-24` | `short-date-le-long-time` | `short-date-le-long-time-24` | `long-month-day-year` | `long-month-day-year-short-time` | `long-month-day-year-short-time-24` | `long-month-day-year-long-time` | `long-month-day-year-long-time-24` | `day-short-month-year` | `day-short-month-year-short-time` | `day-short-month-year-short-time-24` | `day-short-month-year-long-time` | `day-short-month-year-long-time-24` | `long-date` | `long-date-short-time` | `long-date-short-time-24` | `long-date-long-time` | `long-date-long-time-24` | `long-month-year` | `short-month-year` | year = js.native
  /**
    * Used only with `Number` fields. A value of `true` indicates the number should have a digit (or thousands) separator when the value appears in popups. A value of `false` means that no separator will be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-FieldInfoFormat.html#digitSeparator)
    *
    * @default false
    */
  var digitSeparator: Boolean = js.native
  /**
    * Used only with `Number` fields to specify the number of supported decimal places that should appear in popups. Any places beyond this value are rounded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-FieldInfoFormat.html#places)
    */
  var places: Double = js.native
}

@JSGlobal("__esri.FieldInfoFormat")
@js.native
object FieldInfoFormat extends TopLevel[FieldInfoFormatConstructor]

