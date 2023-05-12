package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateInterval extends StObject {
  
  /**
    *  End Date Time (UTC). RFC 3339 format : 'yyyy-MM-dd'T'HH:mm:ss.SSSZZ'. 
    */
  var endDateTime: js.UndefOr[ValidatedDateTime] = js.undefined
  
  /**
    *  A JSON object containing start and date time (UTC). Date and time format is RFC 3339 : 'yyyy-MM-dd'T'HH:mm:ss.SSSZZ'. 
    */
  var startDateTime: js.UndefOr[ValidatedDateTime] = js.undefined
}
object DateInterval {
  
  inline def apply(): DateInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateInterval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateInterval] (val x: Self) extends AnyVal {
    
    inline def setEndDateTime(value: ValidatedDateTime): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setStartDateTime(value: ValidatedDateTime): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
  }
}
