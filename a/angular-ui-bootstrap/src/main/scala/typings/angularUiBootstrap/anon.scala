package typings.angularUiBootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Date extends StObject {
    
    var date: js.UndefOr[String] = js.undefined
    
    var `datetime-local`: js.UndefOr[String] = js.undefined
    
    var month: js.UndefOr[String] = js.undefined
  }
  object Date {
    
    inline def apply(): Date = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Date]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def `setDatetime-local`(value: String): Self = StObject.set(x, "datetime-local", value.asInstanceOf[js.Any])
      
      inline def `setDatetime-localUndefined`: Self = StObject.set(x, "datetime-local", js.undefined)
      
      inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    }
  }
}
