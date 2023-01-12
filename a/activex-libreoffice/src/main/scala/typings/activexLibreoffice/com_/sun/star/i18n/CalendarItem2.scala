package typings.activexLibreoffice.com_.sun.star.i18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One entry in a calendar, for example, a day of week or a month or an era.
  *
  * Derived from {@link com.sun.star.i18n.CalendarItem} this provides an additional member for narrow names.
  * @since LibreOffice 3.5
  */
trait CalendarItem2
  extends StObject
     with CalendarItem {
  
  /** The narrow name, for example, **"S"** for Sunday or **"J"** for January. */
  var NarrowName: String
}
object CalendarItem2 {
  
  inline def apply(AbbrevName: String, FullName: String, ID: String, NarrowName: String): CalendarItem2 = {
    val __obj = js.Dynamic.literal(AbbrevName = AbbrevName.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], NarrowName = NarrowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarItem2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarItem2] (val x: Self) extends AnyVal {
    
    inline def setNarrowName(value: String): Self = StObject.set(x, "NarrowName", value.asInstanceOf[js.Any])
  }
}
