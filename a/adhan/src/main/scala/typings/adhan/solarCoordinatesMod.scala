package typings.adhan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object solarCoordinatesMod {
  
  @JSImport("adhan/lib/types/SolarCoordinates", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SolarCoordinates {
    def this(julianDay: Double) = this()
    
    /* CompleteClass */
    var apparentSiderealTime: Double = js.native
    
    /* CompleteClass */
    var declination: Double = js.native
    
    /* CompleteClass */
    var rightAscension: Double = js.native
  }
  
  trait SolarCoordinates extends StObject {
    
    var apparentSiderealTime: Double
    
    var declination: Double
    
    var rightAscension: Double
  }
  object SolarCoordinates {
    
    inline def apply(apparentSiderealTime: Double, declination: Double, rightAscension: Double): SolarCoordinates = {
      val __obj = js.Dynamic.literal(apparentSiderealTime = apparentSiderealTime.asInstanceOf[js.Any], declination = declination.asInstanceOf[js.Any], rightAscension = rightAscension.asInstanceOf[js.Any])
      __obj.asInstanceOf[SolarCoordinates]
    }
    
    extension [Self <: SolarCoordinates](x: Self) {
      
      inline def setApparentSiderealTime(value: Double): Self = StObject.set(x, "apparentSiderealTime", value.asInstanceOf[js.Any])
      
      inline def setDeclination(value: Double): Self = StObject.set(x, "declination", value.asInstanceOf[js.Any])
      
      inline def setRightAscension(value: Double): Self = StObject.set(x, "rightAscension", value.asInstanceOf[js.Any])
    }
  }
}
