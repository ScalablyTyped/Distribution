package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampRange extends StObject {
  
  /**
    * The minimum value of the timestamp range.
    */
  var beginDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum value of the timestamp range.
    */
  var endDate: js.UndefOr[js.Date] = js.undefined
}
object TimestampRange {
  
  inline def apply(): TimestampRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimestampRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimestampRange] (val x: Self) extends AnyVal {
    
    inline def setBeginDate(value: js.Date): Self = StObject.set(x, "beginDate", value.asInstanceOf[js.Any])
    
    inline def setBeginDateUndefined: Self = StObject.set(x, "beginDate", js.undefined)
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
  }
}
