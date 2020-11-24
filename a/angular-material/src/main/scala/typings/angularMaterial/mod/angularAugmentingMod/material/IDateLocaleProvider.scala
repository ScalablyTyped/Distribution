package typings.angularMaterial.mod.angularAugmentingMod.material

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDateLocaleProvider extends js.Object {
  
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
  implicit class IDateLocaleProviderOps[Self <: IDateLocaleProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatesVarargs(value: String*): Self = this.set("dates", js.Array(value :_*))
    
    @scala.inline
    def setDates(value: js.Array[String]): Self = this.set("dates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysVarargs(value: String*): Self = this.set("days", js.Array(value :_*))
    
    @scala.inline
    def setDays(value: js.Array[String]): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDayOfWeek(value: Double): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatDate(value: Date => String): Self = this.set("formatDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMonthHeaderFormatter(value: Date => String): Self = this.set("monthHeaderFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMonthsVarargs(value: String*): Self = this.set("months", js.Array(value :_*))
    
    @scala.inline
    def setMonths(value: js.Array[String]): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgCalendar(value: String): Self = this.set("msgCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgOpenCalendar(value: String): Self = this.set("msgOpenCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseDate(value: String => Date): Self = this.set("parseDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShortDaysVarargs(value: String*): Self = this.set("shortDays", js.Array(value :_*))
    
    @scala.inline
    def setShortDays(value: js.Array[String]): Self = this.set("shortDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortMonthsVarargs(value: String*): Self = this.set("shortMonths", js.Array(value :_*))
    
    @scala.inline
    def setShortMonths(value: js.Array[String]): Self = this.set("shortMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekNumberFormatter(value: Double => String): Self = this.set("weekNumberFormatter", js.Any.fromFunction1(value))
  }
}
