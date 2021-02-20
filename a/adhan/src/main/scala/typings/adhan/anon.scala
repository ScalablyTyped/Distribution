package typings.adhan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Asr extends StObject {
    
    var asr: Double = js.native
    
    var dhuhr: Double = js.native
    
    var fajr: Double = js.native
    
    var isha: Double = js.native
    
    var maghrib: Double = js.native
    
    var sunrise: Double = js.native
  }
  object Asr {
    
    @scala.inline
    def apply(asr: Double, dhuhr: Double, fajr: Double, isha: Double, maghrib: Double, sunrise: Double): Asr = {
      val __obj = js.Dynamic.literal(asr = asr.asInstanceOf[js.Any], dhuhr = dhuhr.asInstanceOf[js.Any], fajr = fajr.asInstanceOf[js.Any], isha = isha.asInstanceOf[js.Any], maghrib = maghrib.asInstanceOf[js.Any], sunrise = sunrise.asInstanceOf[js.Any])
      __obj.asInstanceOf[Asr]
    }
    
    @scala.inline
    implicit class AsrMutableBuilder[Self <: Asr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsr(value: Double): Self = StObject.set(x, "asr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDhuhr(value: Double): Self = StObject.set(x, "dhuhr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFajr(value: Double): Self = StObject.set(x, "fajr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsha(value: Double): Self = StObject.set(x, "isha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaghrib(value: Double): Self = StObject.set(x, "maghrib", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSunrise(value: Double): Self = StObject.set(x, "sunrise", value.asInstanceOf[js.Any])
    }
  }
}
