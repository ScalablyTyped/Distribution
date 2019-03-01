package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Locale specific data, for example, separators, quotation marks.
  * @see XLocaleData for links to DTD of XML locale data files.
  */
trait LocaleDataItem extends js.Object {
  var LongDateDayOfWeekSeparator: java.lang.String
  var LongDateDaySeparator: java.lang.String
  var LongDateMonthSeparator: java.lang.String
  var LongDateYearSeparator: java.lang.String
  var dateSeparator: java.lang.String
  var decimalSeparator: java.lang.String
  var doubleQuotationEnd: java.lang.String
  var doubleQuotationStart: java.lang.String
  var listSeparator: java.lang.String
  var measurementSystem: java.lang.String
  var quotationEnd: java.lang.String
  var quotationStart: java.lang.String
  var thousandSeparator: java.lang.String
  var time100SecSeparator: java.lang.String
  var timeAM: java.lang.String
  var timePM: java.lang.String
  var timeSeparator: java.lang.String
  var unoID: java.lang.String
}

object LocaleDataItem {
  @scala.inline
  def apply(
    LongDateDayOfWeekSeparator: java.lang.String,
    LongDateDaySeparator: java.lang.String,
    LongDateMonthSeparator: java.lang.String,
    LongDateYearSeparator: java.lang.String,
    dateSeparator: java.lang.String,
    decimalSeparator: java.lang.String,
    doubleQuotationEnd: java.lang.String,
    doubleQuotationStart: java.lang.String,
    listSeparator: java.lang.String,
    measurementSystem: java.lang.String,
    quotationEnd: java.lang.String,
    quotationStart: java.lang.String,
    thousandSeparator: java.lang.String,
    time100SecSeparator: java.lang.String,
    timeAM: java.lang.String,
    timePM: java.lang.String,
    timeSeparator: java.lang.String,
    unoID: java.lang.String
  ): LocaleDataItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LongDateDayOfWeekSeparator")(LongDateDayOfWeekSeparator)
    __obj.updateDynamic("LongDateDaySeparator")(LongDateDaySeparator)
    __obj.updateDynamic("LongDateMonthSeparator")(LongDateMonthSeparator)
    __obj.updateDynamic("LongDateYearSeparator")(LongDateYearSeparator)
    __obj.updateDynamic("dateSeparator")(dateSeparator)
    __obj.updateDynamic("decimalSeparator")(decimalSeparator)
    __obj.updateDynamic("doubleQuotationEnd")(doubleQuotationEnd)
    __obj.updateDynamic("doubleQuotationStart")(doubleQuotationStart)
    __obj.updateDynamic("listSeparator")(listSeparator)
    __obj.updateDynamic("measurementSystem")(measurementSystem)
    __obj.updateDynamic("quotationEnd")(quotationEnd)
    __obj.updateDynamic("quotationStart")(quotationStart)
    __obj.updateDynamic("thousandSeparator")(thousandSeparator)
    __obj.updateDynamic("time100SecSeparator")(time100SecSeparator)
    __obj.updateDynamic("timeAM")(timeAM)
    __obj.updateDynamic("timePM")(timePM)
    __obj.updateDynamic("timeSeparator")(timeSeparator)
    __obj.updateDynamic("unoID")(unoID)
    __obj.asInstanceOf[LocaleDataItem]
  }
}

