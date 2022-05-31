package typings.adhan

import typings.adhan.mod.AdhanCalculationMethod
import typings.adhan.mod.AdhanDate
import typings.adhan.mod.AdhanMath
import typings.adhan.mod.Parameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object adhan {
    
    @JSGlobal("adhan.CalculationMethod")
    @js.native
    val CalculationMethod: AdhanCalculationMethod = js.native
    
    @JSGlobal("adhan.Coordinates")
    @js.native
    class Coordinates protected ()
      extends typings.adhan.mod.Coordinates {
      def this(longitude: Double, latitude: Double) = this()
    }
    
    @JSGlobal("adhan.Date")
    @js.native
    val Date: AdhanDate = js.native
    
    @JSGlobal("adhan.HighLatitudeRule")
    @js.native
    object HighLatitudeRule extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.adhan.mod.HighLatitudeRule & Double] = js.native
      
      /* 0 */ val MiddleOfTheNight: typings.adhan.mod.HighLatitudeRule.MiddleOfTheNight & Double = js.native
      
      /* 1 */ val SeventhOfTheNight: typings.adhan.mod.HighLatitudeRule.SeventhOfTheNight & Double = js.native
      
      /* 2 */ val TwilightAngle: typings.adhan.mod.HighLatitudeRule.TwilightAngle & Double = js.native
    }
    
    @JSGlobal("adhan.Madhab")
    @js.native
    object Madhab extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.adhan.mod.Madhab & Double] = js.native
      
      /* 0 */ val Hanafi: typings.adhan.mod.Madhab.Hanafi & Double = js.native
      
      /* 1 */ val Shafi: typings.adhan.mod.Madhab.Shafi & Double = js.native
    }
    
    @JSGlobal("adhan.Math")
    @js.native
    val Math: AdhanMath = js.native
    
    @JSGlobal("adhan.PrayerTimes")
    @js.native
    class PrayerTimes protected ()
      extends typings.adhan.mod.PrayerTimes {
      def this(coordinates: typings.adhan.mod.Coordinates, date: typings.std.Date, params: Parameter) = this()
    }
  }
}
