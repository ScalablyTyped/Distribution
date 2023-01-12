package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDateLocaleProvider extends StObject {
  
  var dates: js.Array[String]
  
  var days: js.Array[String]
  
  var firstDayOfWeek: Double
  
  def formatDate(date: js.Date): String
  
  def monthHeaderFormatter(date: js.Date): String
  
  var months: js.Array[String]
  
  var msgCalendar: String
  
  var msgOpenCalendar: String
  
  def parseDate(dateString: String): js.Date
  
  var shortDays: js.Array[String]
  
  var shortMonths: js.Array[String]
  
  def weekNumberFormatter(weekNumber: Double): String
}
object IDateLocaleProvider {
  
  inline def apply(
    dates: js.Array[String],
    days: js.Array[String],
    firstDayOfWeek: Double,
    formatDate: js.Date => String,
    monthHeaderFormatter: js.Date => String,
    months: js.Array[String],
    msgCalendar: String,
    msgOpenCalendar: String,
    parseDate: String => js.Date,
    shortDays: js.Array[String],
    shortMonths: js.Array[String],
    weekNumberFormatter: Double => String
  ): IDateLocaleProvider = {
    val __obj = js.Dynamic.literal(dates = dates.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], formatDate = js.Any.fromFunction1(formatDate), monthHeaderFormatter = js.Any.fromFunction1(monthHeaderFormatter), months = months.asInstanceOf[js.Any], msgCalendar = msgCalendar.asInstanceOf[js.Any], msgOpenCalendar = msgOpenCalendar.asInstanceOf[js.Any], parseDate = js.Any.fromFunction1(parseDate), shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any], weekNumberFormatter = js.Any.fromFunction1(weekNumberFormatter))
    __obj.asInstanceOf[IDateLocaleProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDateLocaleProvider] (val x: Self) extends AnyVal {
    
    inline def setDates(value: js.Array[String]): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
    
    inline def setDatesVarargs(value: String*): Self = StObject.set(x, "dates", js.Array(value*))
    
    inline def setDays(value: js.Array[String]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysVarargs(value: String*): Self = StObject.set(x, "days", js.Array(value*))
    
    inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setFormatDate(value: js.Date => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction1(value))
    
    inline def setMonthHeaderFormatter(value: js.Date => String): Self = StObject.set(x, "monthHeaderFormatter", js.Any.fromFunction1(value))
    
    inline def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value*))
    
    inline def setMsgCalendar(value: String): Self = StObject.set(x, "msgCalendar", value.asInstanceOf[js.Any])
    
    inline def setMsgOpenCalendar(value: String): Self = StObject.set(x, "msgOpenCalendar", value.asInstanceOf[js.Any])
    
    inline def setParseDate(value: String => js.Date): Self = StObject.set(x, "parseDate", js.Any.fromFunction1(value))
    
    inline def setShortDays(value: js.Array[String]): Self = StObject.set(x, "shortDays", value.asInstanceOf[js.Any])
    
    inline def setShortDaysVarargs(value: String*): Self = StObject.set(x, "shortDays", js.Array(value*))
    
    inline def setShortMonths(value: js.Array[String]): Self = StObject.set(x, "shortMonths", value.asInstanceOf[js.Any])
    
    inline def setShortMonthsVarargs(value: String*): Self = StObject.set(x, "shortMonths", js.Array(value*))
    
    inline def setWeekNumberFormatter(value: Double => String): Self = StObject.set(x, "weekNumberFormatter", js.Any.fromFunction1(value))
  }
}
