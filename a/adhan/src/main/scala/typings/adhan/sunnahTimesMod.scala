package typings.adhan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sunnahTimesMod {
  
  @JSImport("adhan/lib/types/SunnahTimes", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SunnahTimes {
    def this(prayerTimes: typings.adhan.prayerTimesMod.default) = this()
    
    /* CompleteClass */
    var lastThirdOfTheNight: js.Date = js.native
    
    /* CompleteClass */
    var middleOfTheNight: js.Date = js.native
  }
  
  trait SunnahTimes extends StObject {
    
    var lastThirdOfTheNight: js.Date
    
    var middleOfTheNight: js.Date
  }
  object SunnahTimes {
    
    inline def apply(lastThirdOfTheNight: js.Date, middleOfTheNight: js.Date): SunnahTimes = {
      val __obj = js.Dynamic.literal(lastThirdOfTheNight = lastThirdOfTheNight.asInstanceOf[js.Any], middleOfTheNight = middleOfTheNight.asInstanceOf[js.Any])
      __obj.asInstanceOf[SunnahTimes]
    }
    
    extension [Self <: SunnahTimes](x: Self) {
      
      inline def setLastThirdOfTheNight(value: js.Date): Self = StObject.set(x, "lastThirdOfTheNight", value.asInstanceOf[js.Any])
      
      inline def setMiddleOfTheNight(value: js.Date): Self = StObject.set(x, "middleOfTheNight", value.asInstanceOf[js.Any])
    }
  }
}
