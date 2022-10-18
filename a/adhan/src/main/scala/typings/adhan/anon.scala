package typings.adhan

import typings.adhan.adhanStrings.AqrabYaum
import typings.adhan.adhanStrings.Unresolved
import typings.adhan.adhanStrings.abyad
import typings.adhan.adhanStrings.ahmer
import typings.adhan.adhanStrings.asr
import typings.adhan.adhanStrings.dhuhr
import typings.adhan.adhanStrings.fajr
import typings.adhan.adhanStrings.general
import typings.adhan.adhanStrings.hanafi
import typings.adhan.adhanStrings.isha
import typings.adhan.adhanStrings.maghrib
import typings.adhan.adhanStrings.middleofthenight
import typings.adhan.adhanStrings.nearest
import typings.adhan.adhanStrings.none
import typings.adhan.adhanStrings.seventhofthenight
import typings.adhan.adhanStrings.shafi
import typings.adhan.adhanStrings.sunrise
import typings.adhan.adhanStrings.twilightangle
import typings.adhan.adhanStrings.up
import typings.adhan.libTypesCoordinatesMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Abyad extends StObject {
    
    val Abyad: abyad
    
    val Ahmer: ahmer
    
    val General: general
  }
  object Abyad {
    
    inline def apply(): Abyad = {
      val __obj = js.Dynamic.literal(Abyad = "abyad", Ahmer = "ahmer", General = "general")
      __obj.asInstanceOf[Abyad]
    }
    
    extension [Self <: Abyad](x: Self) {
      
      inline def setAbyad(value: abyad): Self = StObject.set(x, "Abyad", value.asInstanceOf[js.Any])
      
      inline def setAhmer(value: ahmer): Self = StObject.set(x, "Ahmer", value.asInstanceOf[js.Any])
      
      inline def setGeneral(value: general): Self = StObject.set(x, "General", value.asInstanceOf[js.Any])
    }
  }
  
  trait AqrabBalad extends StObject {
    
    val AqrabBalad: typings.adhan.adhanStrings.AqrabBalad
    
    val AqrabYaum: typings.adhan.adhanStrings.AqrabYaum
    
    val Unresolved: typings.adhan.adhanStrings.Unresolved
  }
  object AqrabBalad {
    
    inline def apply(): AqrabBalad = {
      val __obj = js.Dynamic.literal(AqrabBalad = "AqrabBalad", AqrabYaum = "AqrabYaum", Unresolved = "Unresolved")
      __obj.asInstanceOf[AqrabBalad]
    }
    
    extension [Self <: AqrabBalad](x: Self) {
      
      inline def setAqrabBalad(value: typings.adhan.adhanStrings.AqrabBalad): Self = StObject.set(x, "AqrabBalad", value.asInstanceOf[js.Any])
      
      inline def setAqrabYaum(value: AqrabYaum): Self = StObject.set(x, "AqrabYaum", value.asInstanceOf[js.Any])
      
      inline def setUnresolved(value: Unresolved): Self = StObject.set(x, "Unresolved", value.asInstanceOf[js.Any])
    }
  }
  
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
  
  trait Coordinates extends StObject {
    
    var coordinates: default
    
    var date: js.Date
    
    var solarTime: typings.adhan.libTypesSolarTimeMod.default
    
    var tomorrow: js.Date
    
    var tomorrowSolarTime: typings.adhan.libTypesSolarTimeMod.default
  }
  object Coordinates {
    
    inline def apply(
      coordinates: default,
      date: js.Date,
      solarTime: typings.adhan.libTypesSolarTimeMod.default,
      tomorrow: js.Date,
      tomorrowSolarTime: typings.adhan.libTypesSolarTimeMod.default
    ): Coordinates = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], solarTime = solarTime.asInstanceOf[js.Any], tomorrow = tomorrow.asInstanceOf[js.Any], tomorrowSolarTime = tomorrowSolarTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coordinates]
    }
    
    extension [Self <: Coordinates](x: Self) {
      
      inline def setCoordinates(value: default): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setSolarTime(value: typings.adhan.libTypesSolarTimeMod.default): Self = StObject.set(x, "solarTime", value.asInstanceOf[js.Any])
      
      inline def setTomorrow(value: js.Date): Self = StObject.set(x, "tomorrow", value.asInstanceOf[js.Any])
      
      inline def setTomorrowSolarTime(value: typings.adhan.libTypesSolarTimeMod.default): Self = StObject.set(x, "tomorrowSolarTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dhuhr extends StObject {
    
    val Asr: asr
    
    val Dhuhr: dhuhr
    
    val Fajr: fajr
    
    val Isha: isha
    
    val Maghrib: maghrib
    
    val None: none
    
    val Sunrise: sunrise
  }
  object Dhuhr {
    
    inline def apply(): Dhuhr = {
      val __obj = js.Dynamic.literal(Asr = "asr", Dhuhr = "dhuhr", Fajr = "fajr", Isha = "isha", Maghrib = "maghrib", None = "none", Sunrise = "sunrise")
      __obj.asInstanceOf[Dhuhr]
    }
    
    extension [Self <: Dhuhr](x: Self) {
      
      inline def setAsr(value: asr): Self = StObject.set(x, "Asr", value.asInstanceOf[js.Any])
      
      inline def setDhuhr(value: dhuhr): Self = StObject.set(x, "Dhuhr", value.asInstanceOf[js.Any])
      
      inline def setFajr(value: fajr): Self = StObject.set(x, "Fajr", value.asInstanceOf[js.Any])
      
      inline def setIsha(value: isha): Self = StObject.set(x, "Isha", value.asInstanceOf[js.Any])
      
      inline def setMaghrib(value: maghrib): Self = StObject.set(x, "Maghrib", value.asInstanceOf[js.Any])
      
      inline def setNone(value: none): Self = StObject.set(x, "None", value.asInstanceOf[js.Any])
      
      inline def setSunrise(value: sunrise): Self = StObject.set(x, "Sunrise", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dubai extends StObject {
    
    def Dubai(): typings.adhan.libTypesCalculationParametersMod.default
    
    def Egyptian(): typings.adhan.libTypesCalculationParametersMod.default
    
    def Karachi(): typings.adhan.libTypesCalculationParametersMod.default
    
    def Kuwait(): typings.adhan.libTypesCalculationParametersMod.default
    
    def MoonsightingCommittee(): typings.adhan.libTypesCalculationParametersMod.default
    
    def MuslimWorldLeague(): typings.adhan.libTypesCalculationParametersMod.default
    
    def NorthAmerica(): typings.adhan.libTypesCalculationParametersMod.default
    
    def Other(): typings.adhan.libTypesCalculationParametersMod.default
    
    def Qatar(): typings.adhan.libTypesCalculationParametersMod.default
    
    def Singapore(): typings.adhan.libTypesCalculationParametersMod.default
    
    def Tehran(): typings.adhan.libTypesCalculationParametersMod.default
    
    def Turkey(): typings.adhan.libTypesCalculationParametersMod.default
    
    def UmmAlQura(): typings.adhan.libTypesCalculationParametersMod.default
  }
  object Dubai {
    
    inline def apply(
      Dubai: () => typings.adhan.libTypesCalculationParametersMod.default,
      Egyptian: () => typings.adhan.libTypesCalculationParametersMod.default,
      Karachi: () => typings.adhan.libTypesCalculationParametersMod.default,
      Kuwait: () => typings.adhan.libTypesCalculationParametersMod.default,
      MoonsightingCommittee: () => typings.adhan.libTypesCalculationParametersMod.default,
      MuslimWorldLeague: () => typings.adhan.libTypesCalculationParametersMod.default,
      NorthAmerica: () => typings.adhan.libTypesCalculationParametersMod.default,
      Other: () => typings.adhan.libTypesCalculationParametersMod.default,
      Qatar: () => typings.adhan.libTypesCalculationParametersMod.default,
      Singapore: () => typings.adhan.libTypesCalculationParametersMod.default,
      Tehran: () => typings.adhan.libTypesCalculationParametersMod.default,
      Turkey: () => typings.adhan.libTypesCalculationParametersMod.default,
      UmmAlQura: () => typings.adhan.libTypesCalculationParametersMod.default
    ): Dubai = {
      val __obj = js.Dynamic.literal(Dubai = js.Any.fromFunction0(Dubai), Egyptian = js.Any.fromFunction0(Egyptian), Karachi = js.Any.fromFunction0(Karachi), Kuwait = js.Any.fromFunction0(Kuwait), MoonsightingCommittee = js.Any.fromFunction0(MoonsightingCommittee), MuslimWorldLeague = js.Any.fromFunction0(MuslimWorldLeague), NorthAmerica = js.Any.fromFunction0(NorthAmerica), Other = js.Any.fromFunction0(Other), Qatar = js.Any.fromFunction0(Qatar), Singapore = js.Any.fromFunction0(Singapore), Tehran = js.Any.fromFunction0(Tehran), Turkey = js.Any.fromFunction0(Turkey), UmmAlQura = js.Any.fromFunction0(UmmAlQura))
      __obj.asInstanceOf[Dubai]
    }
    
    extension [Self <: Dubai](x: Self) {
      
      inline def setDubai(value: () => typings.adhan.libTypesCalculationParametersMod.default): Self = StObject.set(x, "Dubai", js.Any.fromFunction0(value))
      
      inline def setEgyptian(value: () => typings.adhan.libTypesCalculationParametersMod.default): Self = StObject.set(x, "Egyptian", js.Any.fromFunction0(value))
      
      inline def setKarachi(value: () => typings.adhan.libTypesCalculationParametersMod.default): Self = StObject.set(x, "Karachi", js.Any.fromFunction0(value))
      
      inline def setKuwait(value: () => typings.adhan.libTypesCalculationParametersMod.default): Self = StObject.set(x, "Kuwait", js.Any.fromFunction0(value))
      
      inline def setMoonsightingCommittee(value: () => typings.adhan.libTypesCalculationParametersMod.default): Self = StObject.set(x, "MoonsightingCommittee", js.Any.fromFunction0(value))
      
      inline def setMuslimWorldLeague(value: () => typings.adhan.libTypesCalculationParametersMod.default): Self = StObject.set(x, "MuslimWorldLeague", js.Any.fromFunction0(value))
      
      inline def setNorthAmerica(value: () => typings.adhan.libTypesCalculationParametersMod.default): Self = StObject.set(x, "NorthAmerica", js.Any.fromFunction0(value))
      
      inline def setOther(value: () => typings.adhan.libTypesCalculationParametersMod.default): Self = StObject.set(x, "Other", js.Any.fromFunction0(value))
      
      inline def setQatar(value: () => typings.adhan.libTypesCalculationParametersMod.default): Self = StObject.set(x, "Qatar", js.Any.fromFunction0(value))
      
      inline def setSingapore(value: () => typings.adhan.libTypesCalculationParametersMod.default): Self = StObject.set(x, "Singapore", js.Any.fromFunction0(value))
      
      inline def setTehran(value: () => typings.adhan.libTypesCalculationParametersMod.default): Self = StObject.set(x, "Tehran", js.Any.fromFunction0(value))
      
      inline def setTurkey(value: () => typings.adhan.libTypesCalculationParametersMod.default): Self = StObject.set(x, "Turkey", js.Any.fromFunction0(value))
      
      inline def setUmmAlQura(value: () => typings.adhan.libTypesCalculationParametersMod.default): Self = StObject.set(x, "UmmAlQura", js.Any.fromFunction0(value))
    }
  }
  
  trait Fajr extends StObject {
    
    var fajr: Double
    
    var isha: Double
  }
  object Fajr {
    
    inline def apply(fajr: Double, isha: Double): Fajr = {
      val __obj = js.Dynamic.literal(fajr = fajr.asInstanceOf[js.Any], isha = isha.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fajr]
    }
    
    extension [Self <: Fajr](x: Self) {
      
      inline def setFajr(value: Double): Self = StObject.set(x, "fajr", value.asInstanceOf[js.Any])
      
      inline def setIsha(value: Double): Self = StObject.set(x, "isha", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hanafi extends StObject {
    
    val Hanafi: hanafi
    
    val Shafi: shafi
  }
  object Hanafi {
    
    inline def apply(): Hanafi = {
      val __obj = js.Dynamic.literal(Hanafi = "hanafi", Shafi = "shafi")
      __obj.asInstanceOf[Hanafi]
    }
    
    extension [Self <: Hanafi](x: Self) {
      
      inline def setHanafi(value: hanafi): Self = StObject.set(x, "Hanafi", value.asInstanceOf[js.Any])
      
      inline def setShafi(value: shafi): Self = StObject.set(x, "Shafi", value.asInstanceOf[js.Any])
    }
  }
  
  trait MiddleOfTheNight extends StObject {
    
    val MiddleOfTheNight: middleofthenight
    
    val SeventhOfTheNight: seventhofthenight
    
    val TwilightAngle: twilightangle
    
    def recommended(coordinates: default): middleofthenight | seventhofthenight
  }
  object MiddleOfTheNight {
    
    inline def apply(recommended: default => middleofthenight | seventhofthenight): MiddleOfTheNight = {
      val __obj = js.Dynamic.literal(MiddleOfTheNight = "middleofthenight", SeventhOfTheNight = "seventhofthenight", TwilightAngle = "twilightangle", recommended = js.Any.fromFunction1(recommended))
      __obj.asInstanceOf[MiddleOfTheNight]
    }
    
    extension [Self <: MiddleOfTheNight](x: Self) {
      
      inline def setMiddleOfTheNight(value: middleofthenight): Self = StObject.set(x, "MiddleOfTheNight", value.asInstanceOf[js.Any])
      
      inline def setRecommended(value: default => middleofthenight | seventhofthenight): Self = StObject.set(x, "recommended", js.Any.fromFunction1(value))
      
      inline def setSeventhOfTheNight(value: seventhofthenight): Self = StObject.set(x, "SeventhOfTheNight", value.asInstanceOf[js.Any])
      
      inline def setTwilightAngle(value: twilightangle): Self = StObject.set(x, "TwilightAngle", value.asInstanceOf[js.Any])
    }
  }
  
  trait Nearest extends StObject {
    
    val Nearest: nearest
    
    val None: none
    
    val Up: up
  }
  object Nearest {
    
    inline def apply(): Nearest = {
      val __obj = js.Dynamic.literal(Nearest = "nearest", None = "none", Up = "up")
      __obj.asInstanceOf[Nearest]
    }
    
    extension [Self <: Nearest](x: Self) {
      
      inline def setNearest(value: nearest): Self = StObject.set(x, "Nearest", value.asInstanceOf[js.Any])
      
      inline def setNone(value: none): Self = StObject.set(x, "None", value.asInstanceOf[js.Any])
      
      inline def setUp(value: up): Self = StObject.set(x, "Up", value.asInstanceOf[js.Any])
    }
  }
}
