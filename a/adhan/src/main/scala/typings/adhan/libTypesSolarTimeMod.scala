package typings.adhan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesSolarTimeMod {
  
  @JSImport("adhan/lib/types/SolarTime", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SolarTime {
    def this(date: js.Date, coordinates: typings.adhan.libTypesCoordinatesMod.default) = this()
    
    /* CompleteClass */
    override def afternoon(shadowLength: Double): Double = js.native
    
    /* CompleteClass */
    var approxTransit: Double = js.native
    
    /* CompleteClass */
    override def hourAngle(angle: Double, afterTransit: Boolean): Double = js.native
    
    /* CompleteClass */
    var nextSolar: typings.adhan.libTypesSolarCoordinatesMod.default = js.native
    
    /* CompleteClass */
    var observer: typings.adhan.libTypesCoordinatesMod.default = js.native
    
    /* CompleteClass */
    var prevSolar: typings.adhan.libTypesSolarCoordinatesMod.default = js.native
    
    /* CompleteClass */
    var solar: typings.adhan.libTypesSolarCoordinatesMod.default = js.native
    
    /* CompleteClass */
    var sunrise: Double = js.native
    
    /* CompleteClass */
    var sunset: Double = js.native
    
    /* CompleteClass */
    var transit: Double = js.native
  }
  
  trait SolarTime extends StObject {
    
    def afternoon(shadowLength: Double): Double
    
    var approxTransit: Double
    
    def hourAngle(angle: Double, afterTransit: Boolean): Double
    
    var nextSolar: typings.adhan.libTypesSolarCoordinatesMod.default
    
    var observer: typings.adhan.libTypesCoordinatesMod.default
    
    var prevSolar: typings.adhan.libTypesSolarCoordinatesMod.default
    
    var solar: typings.adhan.libTypesSolarCoordinatesMod.default
    
    var sunrise: Double
    
    var sunset: Double
    
    var transit: Double
  }
  object SolarTime {
    
    inline def apply(
      afternoon: Double => Double,
      approxTransit: Double,
      hourAngle: (Double, Boolean) => Double,
      nextSolar: typings.adhan.libTypesSolarCoordinatesMod.default,
      observer: typings.adhan.libTypesCoordinatesMod.default,
      prevSolar: typings.adhan.libTypesSolarCoordinatesMod.default,
      solar: typings.adhan.libTypesSolarCoordinatesMod.default,
      sunrise: Double,
      sunset: Double,
      transit: Double
    ): SolarTime = {
      val __obj = js.Dynamic.literal(afternoon = js.Any.fromFunction1(afternoon), approxTransit = approxTransit.asInstanceOf[js.Any], hourAngle = js.Any.fromFunction2(hourAngle), nextSolar = nextSolar.asInstanceOf[js.Any], observer = observer.asInstanceOf[js.Any], prevSolar = prevSolar.asInstanceOf[js.Any], solar = solar.asInstanceOf[js.Any], sunrise = sunrise.asInstanceOf[js.Any], sunset = sunset.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any])
      __obj.asInstanceOf[SolarTime]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SolarTime] (val x: Self) extends AnyVal {
      
      inline def setAfternoon(value: Double => Double): Self = StObject.set(x, "afternoon", js.Any.fromFunction1(value))
      
      inline def setApproxTransit(value: Double): Self = StObject.set(x, "approxTransit", value.asInstanceOf[js.Any])
      
      inline def setHourAngle(value: (Double, Boolean) => Double): Self = StObject.set(x, "hourAngle", js.Any.fromFunction2(value))
      
      inline def setNextSolar(value: typings.adhan.libTypesSolarCoordinatesMod.default): Self = StObject.set(x, "nextSolar", value.asInstanceOf[js.Any])
      
      inline def setObserver(value: typings.adhan.libTypesCoordinatesMod.default): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
      
      inline def setPrevSolar(value: typings.adhan.libTypesSolarCoordinatesMod.default): Self = StObject.set(x, "prevSolar", value.asInstanceOf[js.Any])
      
      inline def setSolar(value: typings.adhan.libTypesSolarCoordinatesMod.default): Self = StObject.set(x, "solar", value.asInstanceOf[js.Any])
      
      inline def setSunrise(value: Double): Self = StObject.set(x, "sunrise", value.asInstanceOf[js.Any])
      
      inline def setSunset(value: Double): Self = StObject.set(x, "sunset", value.asInstanceOf[js.Any])
      
      inline def setTransit(value: Double): Self = StObject.set(x, "transit", value.asInstanceOf[js.Any])
    }
  }
}
