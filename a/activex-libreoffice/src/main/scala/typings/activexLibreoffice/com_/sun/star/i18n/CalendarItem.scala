package typings.activexLibreoffice.com_.sun.star.i18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One entry in a calendar, for example, a day of week or a month or an era.
  *
  * A sequence of CalendarItems is contained in {@link Calendar.Days} , {@link Calendar.Months} , {@link Calendar.Eras}
  */
trait CalendarItem extends StObject {
  
  var AbbrevName: String
  
  var FullName: String
  
  /** A unique ID for an entry of this type, usually the lower case abbreviated English name, for example, **"sun"** for Sunday. */
  var ID: String
}
object CalendarItem {
  
  inline def apply(AbbrevName: String, FullName: String, ID: String): CalendarItem = {
    val __obj = js.Dynamic.literal(AbbrevName = AbbrevName.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarItem]
  }
  
  extension [Self <: CalendarItem](x: Self) {
    
    inline def setAbbrevName(value: String): Self = StObject.set(x, "AbbrevName", value.asInstanceOf[js.Any])
    
    inline def setFullName(value: String): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
  }
}
