package typings.activexLibreoffice.com_.sun.star.i18n

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
    val __obj = js.Dynamic.literal(LongDateDayOfWeekSeparator = LongDateDayOfWeekSeparator.asInstanceOf[js.Any], LongDateDaySeparator = LongDateDaySeparator.asInstanceOf[js.Any], LongDateMonthSeparator = LongDateMonthSeparator.asInstanceOf[js.Any], LongDateYearSeparator = LongDateYearSeparator.asInstanceOf[js.Any], dateSeparator = dateSeparator.asInstanceOf[js.Any], decimalSeparator = decimalSeparator.asInstanceOf[js.Any], doubleQuotationEnd = doubleQuotationEnd.asInstanceOf[js.Any], doubleQuotationStart = doubleQuotationStart.asInstanceOf[js.Any], listSeparator = listSeparator.asInstanceOf[js.Any], measurementSystem = measurementSystem.asInstanceOf[js.Any], quotationEnd = quotationEnd.asInstanceOf[js.Any], quotationStart = quotationStart.asInstanceOf[js.Any], thousandSeparator = thousandSeparator.asInstanceOf[js.Any], time100SecSeparator = time100SecSeparator.asInstanceOf[js.Any], timeAM = timeAM.asInstanceOf[js.Any], timePM = timePM.asInstanceOf[js.Any], timeSeparator = timeSeparator.asInstanceOf[js.Any], unoID = unoID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleDataItem]
  }
}

