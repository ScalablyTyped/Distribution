package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the settings for number formatting. */
trait NumberFormatSettings
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** is set to indicate that a zero value should be formatted as an empty string. */
  var NoZero: scala.Boolean
  /**
    * specifies the date which is represented by the value 0.
    *
    * The most common value for this is 12/30/1899.
    */
  var NullDate: Date
  /** specifies the maximum number of decimals used for the standard number format ("General"). */
  var StandardDecimals: scala.Double
  /** specifies the first year to be generated from a two-digit year input. */
  var TwoDigitDateStart: scala.Double
}

