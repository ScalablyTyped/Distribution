package typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Locale specific data, for example, separators, quotation marks.
  * @see XLocaleData for links to DTD of XML locale data files.
  */
trait LocaleDataItem extends js.Object {
  var LongDateDayOfWeekSeparator: String
  var LongDateDaySeparator: String
  var LongDateMonthSeparator: String
  var LongDateYearSeparator: String
  var dateSeparator: String
  var decimalSeparator: String
  var doubleQuotationEnd: String
  var doubleQuotationStart: String
  var listSeparator: String
  var measurementSystem: String
  var quotationEnd: String
  var quotationStart: String
  var thousandSeparator: String
  var time100SecSeparator: String
  var timeAM: String
  var timePM: String
  var timeSeparator: String
  var unoID: String
}

object LocaleDataItem {
  @scala.inline
  def apply(
    LongDateDayOfWeekSeparator: String,
    LongDateDaySeparator: String,
    LongDateMonthSeparator: String,
    LongDateYearSeparator: String,
    dateSeparator: String,
    decimalSeparator: String,
    doubleQuotationEnd: String,
    doubleQuotationStart: String,
    listSeparator: String,
    measurementSystem: String,
    quotationEnd: String,
    quotationStart: String,
    thousandSeparator: String,
    time100SecSeparator: String,
    timeAM: String,
    timePM: String,
    timeSeparator: String,
    unoID: String
  ): LocaleDataItem = {
    val __obj = js.Dynamic.literal(LongDateDayOfWeekSeparator = LongDateDayOfWeekSeparator, LongDateDaySeparator = LongDateDaySeparator, LongDateMonthSeparator = LongDateMonthSeparator, LongDateYearSeparator = LongDateYearSeparator, dateSeparator = dateSeparator, decimalSeparator = decimalSeparator, doubleQuotationEnd = doubleQuotationEnd, doubleQuotationStart = doubleQuotationStart, listSeparator = listSeparator, measurementSystem = measurementSystem, quotationEnd = quotationEnd, quotationStart = quotationStart, thousandSeparator = thousandSeparator, time100SecSeparator = time100SecSeparator, timeAM = timeAM, timePM = timePM, timeSeparator = timeSeparator, unoID = unoID)
  
    __obj.asInstanceOf[LocaleDataItem]
  }
}

