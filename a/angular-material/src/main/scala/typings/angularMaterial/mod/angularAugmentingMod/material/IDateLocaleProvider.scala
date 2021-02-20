package typings.angularMaterial.mod.angularAugmentingMod.material

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDateLocaleProvider extends StObject {
  
  var dates: js.Array[String] = js.native
  
  var days: js.Array[String] = js.native
  
  var firstDayOfWeek: Double = js.native
  
  def formatDate(date: Date): String = js.native
  
  def monthHeaderFormatter(date: Date): String = js.native
  
  var months: js.Array[String] = js.native
  
  var msgCalendar: String = js.native
  
  var msgOpenCalendar: String = js.native
  
  def parseDate(dateString: String): Date = js.native
  
  var shortDays: js.Array[String] = js.native
  
  var shortMonths: js.Array[String] = js.native
  
  def weekNumberFormatter(weekNumber: Double): String = js.native
}
object IDateLocaleProvider {
  
  @scala.inline
  def apply(
    dates: js.Array[String],
    days: js.Array[String],
    firstDayOfWeek: Double,
    formatDate: Date => String,
    monthHeaderFormatter: Date => String,
    months: js.Array[String],
    msgCalendar: String,
    msgOpenCalendar: String,
    parseDate: String => Date,
    shortDays: js.Array[String],
    shortMonths: js.Array[String],
    weekNumberFormatter: Double => String
  ): IDateLocaleProvider = {
    val __obj = js.Dynamic.literal(dates = dates.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], formatDate = js.Any.fromFunction1(formatDate), monthHeaderFormatter = js.Any.fromFunction1(monthHeaderFormatter), months = months.asInstanceOf[js.Any], msgCalendar = msgCalendar.asInstanceOf[js.Any], msgOpenCalendar = msgOpenCalendar.asInstanceOf[js.Any], parseDate = js.Any.fromFunction1(parseDate), shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any], weekNumberFormatter = js.Any.fromFunction1(weekNumberFormatter))
    __obj.asInstanceOf[IDateLocaleProvider]
  }
  
  @scala.inline
  implicit class IDateLocaleProviderMutableBuilder[Self <: IDateLocaleProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDates(value: js.Array[String]): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatesVarargs(value: String*): Self = StObject.set(x, "dates", js.Array(value :_*))
    
    @scala.inline
    def setDays(value: js.Array[String]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysVarargs(value: String*): Self = StObject.set(x, "days", js.Array(value :_*))
    
    @scala.inline
    def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatDate(value: Date => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMonthHeaderFormatter(value: Date => String): Self = StObject.set(x, "monthHeaderFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
    
    @scala.inline
    def setMsgCalendar(value: String): Self = StObject.set(x, "msgCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgOpenCalendar(value: String): Self = StObject.set(x, "msgOpenCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseDate(value: String => Date): Self = StObject.set(x, "parseDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShortDays(value: js.Array[String]): Self = StObject.set(x, "shortDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDaysVarargs(value: String*): Self = StObject.set(x, "shortDays", js.Array(value :_*))
    
    @scala.inline
    def setShortMonths(value: js.Array[String]): Self = StObject.set(x, "shortMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortMonthsVarargs(value: String*): Self = StObject.set(x, "shortMonths", js.Array(value :_*))
    
    @scala.inline
    def setWeekNumberFormatter(value: Double => String): Self = StObject.set(x, "weekNumberFormatter", js.Any.fromFunction1(value))
  }
}
