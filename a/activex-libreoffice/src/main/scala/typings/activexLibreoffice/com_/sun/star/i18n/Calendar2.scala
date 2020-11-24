package typings.activexLibreoffice.com_.sun.star.i18n

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link Calendar} items as returned in a sequence by {@link XLocaleData3.getAllCalendars2()} .
  *
  * Similar to {@link com.sun.star.i18n.Calendar} this provides additional members with a sequence of possessive (genitive case) and partitive case month
  * names for locales that use them, for example Slavic locales. If a locale does not provide the possessive form in {@link GenitiveMonths} , the names
  * are identical to the nominative case nouns in {@link Calendar.Months} . If a locale does not provide the partitive case in {@link PartitiveMonths} ,
  * the names are identical to {@link GenitiveMonths} .
  *
  * The sequences are of type {@link com.sun.star.i18n.CalendarItem2} instead of {@link com.sun.star.i18n.CalendarItem} , with the additional NarrowName
  * member.
  * @see XLocaleData for links to DTD of XML locale data files.
  * @since LibreOffice 3.5
  */
@js.native
trait Calendar2 extends js.Object {
  
  var Days: SafeArray[CalendarItem2] = js.native
  
  var Default: Boolean = js.native
  
  var Eras: SafeArray[CalendarItem2] = js.native
  
  var GenitiveMonths: SafeArray[CalendarItem2] = js.native
  
  var MinimumNumberOfDaysForFirstWeek: Double = js.native
  
  var Months: SafeArray[CalendarItem2] = js.native
  
  var Name: String = js.native
  
  var PartitiveMonths: SafeArray[CalendarItem2] = js.native
  
  var StartOfWeek: String = js.native
}
object Calendar2 {
  
  @scala.inline
  def apply(
    Days: SafeArray[CalendarItem2],
    Default: Boolean,
    Eras: SafeArray[CalendarItem2],
    GenitiveMonths: SafeArray[CalendarItem2],
    MinimumNumberOfDaysForFirstWeek: Double,
    Months: SafeArray[CalendarItem2],
    Name: String,
    PartitiveMonths: SafeArray[CalendarItem2],
    StartOfWeek: String
  ): Calendar2 = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], Eras = Eras.asInstanceOf[js.Any], GenitiveMonths = GenitiveMonths.asInstanceOf[js.Any], MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PartitiveMonths = PartitiveMonths.asInstanceOf[js.Any], StartOfWeek = StartOfWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar2]
  }
  
  @scala.inline
  implicit class Calendar2Ops[Self <: Calendar2] (val x: Self) extends AnyVal {
    
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
    def setDays(value: SafeArray[CalendarItem2]): Self = this.set("Days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("Default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEras(value: SafeArray[CalendarItem2]): Self = this.set("Eras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenitiveMonths(value: SafeArray[CalendarItem2]): Self = this.set("GenitiveMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumNumberOfDaysForFirstWeek(value: Double): Self = this.set("MinimumNumberOfDaysForFirstWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonths(value: SafeArray[CalendarItem2]): Self = this.set("Months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitiveMonths(value: SafeArray[CalendarItem2]): Self = this.set("PartitiveMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOfWeek(value: String): Self = this.set("StartOfWeek", value.asInstanceOf[js.Any])
  }
}
