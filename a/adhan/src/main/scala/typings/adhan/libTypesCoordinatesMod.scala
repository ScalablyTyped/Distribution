package typings.adhan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesCoordinatesMod {
  
  @JSImport("adhan/lib/types/Coordinates", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Coordinates {
    def this(latitude: Double, longitude: Double) = this()
    
    /* CompleteClass */
    var latitude: Double = js.native
    
    /* CompleteClass */
    var longitude: Double = js.native
  }
  
  trait Coordinates extends StObject {
    
    var latitude: Double
    
    var longitude: Double
  }
  object Coordinates {
    
    inline def apply(latitude: Double, longitude: Double): Coordinates = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coordinates]
    }
    
    extension [Self <: Coordinates](x: Self) {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
}
