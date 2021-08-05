package typings.adhan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Asr extends StObject {
    
    var asr: Double
    
    var dhuhr: Double
    
    var fajr: Double
    
    var isha: Double
    
    var maghrib: Double
    
    var sunrise: Double
  }
  object Asr {
    
    inline def apply(asr: Double, dhuhr: Double, fajr: Double, isha: Double, maghrib: Double, sunrise: Double): Asr = {
      val __obj = js.Dynamic.literal(asr = asr.asInstanceOf[js.Any], dhuhr = dhuhr.asInstanceOf[js.Any], fajr = fajr.asInstanceOf[js.Any], isha = isha.asInstanceOf[js.Any], maghrib = maghrib.asInstanceOf[js.Any], sunrise = sunrise.asInstanceOf[js.Any])
      __obj.asInstanceOf[Asr]
    }
    
    extension [Self <: Asr](x: Self) {
      
      inline def setAsr(value: Double): Self = StObject.set(x, "asr", value.asInstanceOf[js.Any])
      
      inline def setDhuhr(value: Double): Self = StObject.set(x, "dhuhr", value.asInstanceOf[js.Any])
      
      inline def setFajr(value: Double): Self = StObject.set(x, "fajr", value.asInstanceOf[js.Any])
      
      inline def setIsha(value: Double): Self = StObject.set(x, "isha", value.asInstanceOf[js.Any])
      
      inline def setMaghrib(value: Double): Self = StObject.set(x, "maghrib", value.asInstanceOf[js.Any])
      
      inline def setSunrise(value: Double): Self = StObject.set(x, "sunrise", value.asInstanceOf[js.Any])
    }
  }
}
