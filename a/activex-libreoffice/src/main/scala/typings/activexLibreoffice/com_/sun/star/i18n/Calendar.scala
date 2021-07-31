package typings.activexLibreoffice.com_.sun.star.i18n

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A calendar as returned in a sequence by {@link XLocaleData.getAllCalendars()} .
  * @see XLocaleData for links to DTD of XML locale data files.
  */
trait Calendar extends StObject {
  
  var Days: SafeArray[CalendarItem]
  
  var Default: Boolean
  
  var Eras: SafeArray[CalendarItem]
  
  var MinimumNumberOfDaysForFirstWeek: Double
  
  var Months: SafeArray[CalendarItem]
  
  var Name: String
  
  var StartOfWeek: String
}
object Calendar {
  
  @scala.inline
  def apply(
    Days: SafeArray[CalendarItem],
    Default: Boolean,
    Eras: SafeArray[CalendarItem],
    MinimumNumberOfDaysForFirstWeek: Double,
    Months: SafeArray[CalendarItem],
    Name: String,
    StartOfWeek: String
  ): Calendar = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], Eras = Eras.asInstanceOf[js.Any], MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], StartOfWeek = StartOfWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar]
  }
  
  @scala.inline
  implicit class CalendarMutableBuilder[Self <: Calendar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDays(value: SafeArray[CalendarItem]): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "Default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEras(value: SafeArray[CalendarItem]): Self = StObject.set(x, "Eras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumNumberOfDaysForFirstWeek(value: Double): Self = StObject.set(x, "MinimumNumberOfDaysForFirstWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonths(value: SafeArray[CalendarItem]): Self = StObject.set(x, "Months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOfWeek(value: String): Self = StObject.set(x, "StartOfWeek", value.asInstanceOf[js.Any])
  }
}
