package typings.activexLibreoffice.com_.sun.star.i18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Locale specific data, for example, separators, quotation marks.
  * @see XLocaleData for links to DTD of XML locale data files.
  */
@js.native
trait LocaleDataItem extends StObject {
  
  var LongDateDayOfWeekSeparator: String = js.native
  
  var LongDateDaySeparator: String = js.native
  
  var LongDateMonthSeparator: String = js.native
  
  var LongDateYearSeparator: String = js.native
  
  var dateSeparator: String = js.native
  
  var decimalSeparator: String = js.native
  
  var doubleQuotationEnd: String = js.native
  
  var doubleQuotationStart: String = js.native
  
  var listSeparator: String = js.native
  
  var measurementSystem: String = js.native
  
  var quotationEnd: String = js.native
  
  var quotationStart: String = js.native
  
  var thousandSeparator: String = js.native
  
  var time100SecSeparator: String = js.native
  
  var timeAM: String = js.native
  
  var timePM: String = js.native
  
  var timeSeparator: String = js.native
  
  var unoID: String = js.native
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
  
  @scala.inline
  implicit class LocaleDataItemMutableBuilder[Self <: LocaleDataItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateSeparator(value: String): Self = StObject.set(x, "dateSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleQuotationEnd(value: String): Self = StObject.set(x, "doubleQuotationEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleQuotationStart(value: String): Self = StObject.set(x, "doubleQuotationStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSeparator(value: String): Self = StObject.set(x, "listSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDateDayOfWeekSeparator(value: String): Self = StObject.set(x, "LongDateDayOfWeekSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDateDaySeparator(value: String): Self = StObject.set(x, "LongDateDaySeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDateMonthSeparator(value: String): Self = StObject.set(x, "LongDateMonthSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDateYearSeparator(value: String): Self = StObject.set(x, "LongDateYearSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurementSystem(value: String): Self = StObject.set(x, "measurementSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotationEnd(value: String): Self = StObject.set(x, "quotationEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotationStart(value: String): Self = StObject.set(x, "quotationStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThousandSeparator(value: String): Self = StObject.set(x, "thousandSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime100SecSeparator(value: String): Self = StObject.set(x, "time100SecSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeAM(value: String): Self = StObject.set(x, "timeAM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePM(value: String): Self = StObject.set(x, "timePM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeparator(value: String): Self = StObject.set(x, "timeSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnoID(value: String): Self = StObject.set(x, "unoID", value.asInstanceOf[js.Any])
  }
}
