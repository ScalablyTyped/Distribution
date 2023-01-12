package typings.awsSdk.clientsHealthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeRange extends StObject {
  
  /**
    * The starting date and time of a time range.
    */
  var from: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ending date and time of a time range.
    */
  var to: js.UndefOr[js.Date] = js.undefined
}
object DateTimeRange {
  
  inline def apply(): DateTimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateTimeRange] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: js.Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTo(value: js.Date): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
