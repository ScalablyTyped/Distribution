package typings.adhan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesTimeComponentsMod {
  
  @JSImport("adhan/lib/types/TimeComponents", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TimeComponents {
    def this(num: Double) = this()
    
    /* CompleteClass */
    var hours: Double = js.native
    
    /* CompleteClass */
    var minutes: Double = js.native
    
    /* CompleteClass */
    var seconds: Double = js.native
    
    /* CompleteClass */
    override def utcDate(year: Double, month: Double, date: Double): js.Date = js.native
  }
  
  trait TimeComponents extends StObject {
    
    var hours: Double
    
    var minutes: Double
    
    var seconds: Double
    
    def utcDate(year: Double, month: Double, date: Double): js.Date
  }
  object TimeComponents {
    
    inline def apply(hours: Double, minutes: Double, seconds: Double, utcDate: (Double, Double, Double) => js.Date): TimeComponents = {
      val __obj = js.Dynamic.literal(hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], utcDate = js.Any.fromFunction3(utcDate))
      __obj.asInstanceOf[TimeComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeComponents] (val x: Self) extends AnyVal {
      
      inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setUtcDate(value: (Double, Double, Double) => js.Date): Self = StObject.set(x, "utcDate", js.Any.fromFunction3(value))
    }
  }
}
