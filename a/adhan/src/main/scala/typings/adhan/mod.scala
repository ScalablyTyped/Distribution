package typings.adhan

import typings.adhan.anon.Asr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("adhan", "CalculationMethod")
  @js.native
  val CalculationMethod: AdhanCalculationMethod = js.native
  
  @JSImport("adhan", "Coordinates")
  @js.native
  class Coordinates protected () extends StObject {
    def this(longitude: Double, latitude: Double) = this()
    
    var latitude: Double = js.native
    
    var longitude: Double = js.native
  }
  
  @JSImport("adhan", "Date")
  @js.native
  val Date: AdhanDate = js.native
  
  @js.native
  sealed trait HighLatitudeRule extends StObject
  @JSImport("adhan", "HighLatitudeRule")
  @js.native
  object HighLatitudeRule extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HighLatitudeRule with Double] = js.native
    
    @js.native
    sealed trait MiddleOfTheNight extends HighLatitudeRule
    /* 0 */ val MiddleOfTheNight: typings.adhan.mod.HighLatitudeRule.MiddleOfTheNight with Double = js.native
    
    @js.native
    sealed trait SeventhOfTheNight extends HighLatitudeRule
    /* 1 */ val SeventhOfTheNight: typings.adhan.mod.HighLatitudeRule.SeventhOfTheNight with Double = js.native
    
    @js.native
    sealed trait TwilightAngle extends HighLatitudeRule
    /* 2 */ val TwilightAngle: typings.adhan.mod.HighLatitudeRule.TwilightAngle with Double = js.native
  }
  
  @js.native
  sealed trait Madhab extends StObject
  @JSImport("adhan", "Madhab")
  @js.native
  object Madhab extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Madhab with Double] = js.native
    
    @js.native
    sealed trait Hanafi extends Madhab
    /* 0 */ val Hanafi: typings.adhan.mod.Madhab.Hanafi with Double = js.native
    
    @js.native
    sealed trait Shafi extends Madhab
    /* 1 */ val Shafi: typings.adhan.mod.Madhab.Shafi with Double = js.native
  }
  
  @JSImport("adhan", "Math")
  @js.native
  val Math: AdhanMath = js.native
  
  @JSImport("adhan", "PrayerTimes")
  @js.native
  class PrayerTimes protected () extends StObject {
    def this(coordinates: Coordinates, date: typings.std.Date, params: Parameter) = this()
    
    var asr: typings.std.Date = js.native
    
    var dhuhr: typings.std.Date = js.native
    
    var fajr: typings.std.Date = js.native
    
    var isha: typings.std.Date = js.native
    
    var maghrib: typings.std.Date = js.native
    
    var sunrise: typings.std.Date = js.native
  }
  
  @js.native
  trait AdhanCalculationMethod extends StObject {
    
    def Dubai(): Parameter = js.native
    
    def Egyptian(): Parameter = js.native
    
    def Karachi(): Parameter = js.native
    
    def Kuwait(): Parameter = js.native
    
    def MoonsightingCommittee(): Parameter = js.native
    
    def MuslimWorldLeague(): Parameter = js.native
    
    def NorthAmerica(): Parameter = js.native
    
    def Other(): Parameter = js.native
    
    def Qatar(): Parameter = js.native
    
    def Singapore(): Parameter = js.native
    
    def UmmAlQura(): Parameter = js.native
  }
  object AdhanCalculationMethod {
    
    @scala.inline
    def apply(
      Dubai: () => Parameter,
      Egyptian: () => Parameter,
      Karachi: () => Parameter,
      Kuwait: () => Parameter,
      MoonsightingCommittee: () => Parameter,
      MuslimWorldLeague: () => Parameter,
      NorthAmerica: () => Parameter,
      Other: () => Parameter,
      Qatar: () => Parameter,
      Singapore: () => Parameter,
      UmmAlQura: () => Parameter
    ): AdhanCalculationMethod = {
      val __obj = js.Dynamic.literal(Dubai = js.Any.fromFunction0(Dubai), Egyptian = js.Any.fromFunction0(Egyptian), Karachi = js.Any.fromFunction0(Karachi), Kuwait = js.Any.fromFunction0(Kuwait), MoonsightingCommittee = js.Any.fromFunction0(MoonsightingCommittee), MuslimWorldLeague = js.Any.fromFunction0(MuslimWorldLeague), NorthAmerica = js.Any.fromFunction0(NorthAmerica), Other = js.Any.fromFunction0(Other), Qatar = js.Any.fromFunction0(Qatar), Singapore = js.Any.fromFunction0(Singapore), UmmAlQura = js.Any.fromFunction0(UmmAlQura))
      __obj.asInstanceOf[AdhanCalculationMethod]
    }
    
    @scala.inline
    implicit class AdhanCalculationMethodMutableBuilder[Self <: AdhanCalculationMethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDubai(value: () => Parameter): Self = StObject.set(x, "Dubai", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEgyptian(value: () => Parameter): Self = StObject.set(x, "Egyptian", js.Any.fromFunction0(value))
      
      @scala.inline
      def setKarachi(value: () => Parameter): Self = StObject.set(x, "Karachi", js.Any.fromFunction0(value))
      
      @scala.inline
      def setKuwait(value: () => Parameter): Self = StObject.set(x, "Kuwait", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMoonsightingCommittee(value: () => Parameter): Self = StObject.set(x, "MoonsightingCommittee", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMuslimWorldLeague(value: () => Parameter): Self = StObject.set(x, "MuslimWorldLeague", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNorthAmerica(value: () => Parameter): Self = StObject.set(x, "NorthAmerica", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOther(value: () => Parameter): Self = StObject.set(x, "Other", js.Any.fromFunction0(value))
      
      @scala.inline
      def setQatar(value: () => Parameter): Self = StObject.set(x, "Qatar", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSingapore(value: () => Parameter): Self = StObject.set(x, "Singapore", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUmmAlQura(value: () => Parameter): Self = StObject.set(x, "UmmAlQura", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait AdhanDate extends StObject {
    
    def dateByAddingDays(date: typings.std.Date, days: Double): String = js.native
    
    def dateByAddingHours(date: typings.std.Date, hours: Double): String = js.native
    
    def dateByAddingMinutes(date: typings.std.Date, minutes: Double): String = js.native
    
    def dateByAddingSeconds(date: typings.std.Date, seconds: Double): String = js.native
    
    def dayOfYear(date: typings.std.Date): String = js.native
    
    def formattedTime(prayerTime: typings.std.Date): String = js.native
    def formattedTime(prayerTime: typings.std.Date, offset: js.UndefOr[scala.Nothing], style: TimeMode): String = js.native
    def formattedTime(prayerTime: typings.std.Date, offset: Double): String = js.native
    def formattedTime(prayerTime: typings.std.Date, offset: Double, style: TimeMode): String = js.native
    
    def julianDate(date: typings.std.Date): String = js.native
    
    def roundedMinute(date: typings.std.Date): String = js.native
  }
  
  @js.native
  trait AdhanMath extends StObject {
    
    def degreesToRadians(degrees: Double): Double = js.native
    
    def normalizeToScale(number: Double, max: Double): Double = js.native
    
    def quadrantShiftAngle(angle: Double): Double = js.native
    
    def radiansToDegrees(radians: Double): Double = js.native
    
    def timeComponents(number: Double): Double = js.native
    
    def unwindAngle(angle: Double): Double = js.native
  }
  object AdhanMath {
    
    @scala.inline
    def apply(
      degreesToRadians: Double => Double,
      normalizeToScale: (Double, Double) => Double,
      quadrantShiftAngle: Double => Double,
      radiansToDegrees: Double => Double,
      timeComponents: Double => Double,
      unwindAngle: Double => Double
    ): AdhanMath = {
      val __obj = js.Dynamic.literal(degreesToRadians = js.Any.fromFunction1(degreesToRadians), normalizeToScale = js.Any.fromFunction2(normalizeToScale), quadrantShiftAngle = js.Any.fromFunction1(quadrantShiftAngle), radiansToDegrees = js.Any.fromFunction1(radiansToDegrees), timeComponents = js.Any.fromFunction1(timeComponents), unwindAngle = js.Any.fromFunction1(unwindAngle))
      __obj.asInstanceOf[AdhanMath]
    }
    
    @scala.inline
    implicit class AdhanMathMutableBuilder[Self <: AdhanMath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDegreesToRadians(value: Double => Double): Self = StObject.set(x, "degreesToRadians", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNormalizeToScale(value: (Double, Double) => Double): Self = StObject.set(x, "normalizeToScale", js.Any.fromFunction2(value))
      
      @scala.inline
      def setQuadrantShiftAngle(value: Double => Double): Self = StObject.set(x, "quadrantShiftAngle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRadiansToDegrees(value: Double => Double): Self = StObject.set(x, "radiansToDegrees", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTimeComponents(value: Double => Double): Self = StObject.set(x, "timeComponents", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnwindAngle(value: Double => Double): Self = StObject.set(x, "unwindAngle", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Parameter extends StObject {
    
    var adjustments: Asr = js.native
    
    var fajrAngle: Double = js.native
    
    var highLatitudeRule: HighLatitudeRule = js.native
    
    var ishaAngle: Double = js.native
    
    var ishaInterval: Double = js.native
    
    var madhab: Madhab = js.native
    
    val method: String = js.native
  }
  object Parameter {
    
    @scala.inline
    def apply(
      adjustments: Asr,
      fajrAngle: Double,
      highLatitudeRule: HighLatitudeRule,
      ishaAngle: Double,
      ishaInterval: Double,
      madhab: Madhab,
      method: String
    ): Parameter = {
      val __obj = js.Dynamic.literal(adjustments = adjustments.asInstanceOf[js.Any], fajrAngle = fajrAngle.asInstanceOf[js.Any], highLatitudeRule = highLatitudeRule.asInstanceOf[js.Any], ishaAngle = ishaAngle.asInstanceOf[js.Any], ishaInterval = ishaInterval.asInstanceOf[js.Any], madhab = madhab.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parameter]
    }
    
    @scala.inline
    implicit class ParameterMutableBuilder[Self <: Parameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustments(value: Asr): Self = StObject.set(x, "adjustments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFajrAngle(value: Double): Self = StObject.set(x, "fajrAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighLatitudeRule(value: HighLatitudeRule): Self = StObject.set(x, "highLatitudeRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIshaAngle(value: Double): Self = StObject.set(x, "ishaAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIshaInterval(value: Double): Self = StObject.set(x, "ishaInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMadhab(value: Madhab): Self = StObject.set(x, "madhab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.adhan.adhanStrings.`12h`
    - typings.adhan.adhanStrings.`24h`
  */
  trait TimeMode extends StObject
  object TimeMode {
    
    @scala.inline
    def `12h`: typings.adhan.adhanStrings.`12h` = "12h".asInstanceOf[typings.adhan.adhanStrings.`12h`]
    
    @scala.inline
    def `24h`: typings.adhan.adhanStrings.`24h` = "24h".asInstanceOf[typings.adhan.adhanStrings.`24h`]
  }
}
