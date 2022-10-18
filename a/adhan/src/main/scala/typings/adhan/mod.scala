package typings.adhan

import typings.adhan.adhanStrings.Dubai
import typings.adhan.adhanStrings.Egyptian
import typings.adhan.adhanStrings.Karachi
import typings.adhan.adhanStrings.Kuwait
import typings.adhan.adhanStrings.MoonsightingCommittee
import typings.adhan.adhanStrings.MuslimWorldLeague
import typings.adhan.adhanStrings.NorthAmerica
import typings.adhan.adhanStrings.Other
import typings.adhan.adhanStrings.Qatar
import typings.adhan.adhanStrings.Singapore
import typings.adhan.adhanStrings.Tehran
import typings.adhan.adhanStrings.Turkey
import typings.adhan.adhanStrings.UmmAlQura
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
import typings.adhan.libTypesCalculationParametersMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("adhan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object CalculationMethod {
    
    @JSImport("adhan", "CalculationMethod")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Dubai(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("Dubai")().asInstanceOf[default]
    
    inline def Egyptian(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("Egyptian")().asInstanceOf[default]
    
    inline def Karachi(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("Karachi")().asInstanceOf[default]
    
    inline def Kuwait(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("Kuwait")().asInstanceOf[default]
    
    inline def MoonsightingCommittee(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("MoonsightingCommittee")().asInstanceOf[default]
    
    inline def MuslimWorldLeague(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("MuslimWorldLeague")().asInstanceOf[default]
    
    inline def NorthAmerica(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("NorthAmerica")().asInstanceOf[default]
    
    inline def Other(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("Other")().asInstanceOf[default]
    
    inline def Qatar(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("Qatar")().asInstanceOf[default]
    
    inline def Singapore(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("Singapore")().asInstanceOf[default]
    
    inline def Tehran(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("Tehran")().asInstanceOf[default]
    
    inline def Turkey(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("Turkey")().asInstanceOf[default]
    
    inline def UmmAlQura(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("UmmAlQura")().asInstanceOf[default]
  }
  
  @JSImport("adhan", "CalculationParameters")
  @js.native
  open class CalculationParameters () extends default {
    def this(method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Double
    ) = this()
    def this(method: Null, fajrAngle: Double) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Double,
      ishaAngle: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Unit,
      ishaAngle: Double
    ) = this()
    def this(method: Null, fajrAngle: Double, ishaAngle: Double) = this()
    def this(method: Null, fajrAngle: Unit, ishaAngle: Double) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Double,
      ishaAngle: Double,
      ishaInterval: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Double,
      ishaAngle: Unit,
      ishaInterval: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Unit,
      ishaAngle: Double,
      ishaInterval: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Unit,
      ishaAngle: Unit,
      ishaInterval: Double
    ) = this()
    def this(method: Null, fajrAngle: Double, ishaAngle: Double, ishaInterval: Double) = this()
    def this(method: Null, fajrAngle: Double, ishaAngle: Unit, ishaInterval: Double) = this()
    def this(method: Null, fajrAngle: Unit, ishaAngle: Double, ishaInterval: Double) = this()
    def this(method: Null, fajrAngle: Unit, ishaAngle: Unit, ishaInterval: Double) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Double,
      ishaAngle: Double,
      ishaInterval: Double,
      maghribAngle: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Double,
      ishaAngle: Double,
      ishaInterval: Unit,
      maghribAngle: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Double,
      ishaAngle: Unit,
      ishaInterval: Double,
      maghribAngle: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Double,
      ishaAngle: Unit,
      ishaInterval: Unit,
      maghribAngle: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Unit,
      ishaAngle: Double,
      ishaInterval: Double,
      maghribAngle: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Unit,
      ishaAngle: Double,
      ishaInterval: Unit,
      maghribAngle: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Unit,
      ishaAngle: Unit,
      ishaInterval: Double,
      maghribAngle: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Unit,
      ishaAngle: Unit,
      ishaInterval: Unit,
      maghribAngle: Double
    ) = this()
    def this(method: Null, fajrAngle: Double, ishaAngle: Double, ishaInterval: Double, maghribAngle: Double) = this()
    def this(method: Null, fajrAngle: Double, ishaAngle: Double, ishaInterval: Unit, maghribAngle: Double) = this()
    def this(method: Null, fajrAngle: Double, ishaAngle: Unit, ishaInterval: Double, maghribAngle: Double) = this()
    def this(method: Null, fajrAngle: Double, ishaAngle: Unit, ishaInterval: Unit, maghribAngle: Double) = this()
    def this(method: Null, fajrAngle: Unit, ishaAngle: Double, ishaInterval: Double, maghribAngle: Double) = this()
    def this(method: Null, fajrAngle: Unit, ishaAngle: Double, ishaInterval: Unit, maghribAngle: Double) = this()
    def this(method: Null, fajrAngle: Unit, ishaAngle: Unit, ishaInterval: Double, maghribAngle: Double) = this()
    def this(method: Null, fajrAngle: Unit, ishaAngle: Unit, ishaInterval: Unit, maghribAngle: Double) = this()
  }
  
  @JSImport("adhan", "Coordinates")
  @js.native
  open class Coordinates protected ()
    extends typings.adhan.libTypesCoordinatesMod.default {
    def this(latitude: Double, longitude: Double) = this()
  }
  
  object HighLatitudeRule {
    
    @JSImport("adhan", "HighLatitudeRule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("adhan", "HighLatitudeRule.MiddleOfTheNight")
    @js.native
    val MiddleOfTheNight: middleofthenight = js.native
    
    @JSImport("adhan", "HighLatitudeRule.SeventhOfTheNight")
    @js.native
    val SeventhOfTheNight: seventhofthenight = js.native
    
    @JSImport("adhan", "HighLatitudeRule.TwilightAngle")
    @js.native
    val TwilightAngle: twilightangle = js.native
    
    inline def recommended(coordinates: typings.adhan.libTypesCoordinatesMod.default): middleofthenight | seventhofthenight = ^.asInstanceOf[js.Dynamic].applyDynamic("recommended")(coordinates.asInstanceOf[js.Any]).asInstanceOf[middleofthenight | seventhofthenight]
  }
  
  object Madhab {
    
    @JSImport("adhan", "Madhab.Hanafi")
    @js.native
    val Hanafi: hanafi = js.native
    
    @JSImport("adhan", "Madhab.Shafi")
    @js.native
    val Shafi: shafi = js.native
  }
  
  object PolarCircleResolution {
    
    @JSImport("adhan", "PolarCircleResolution.AqrabBalad")
    @js.native
    val AqrabBalad: typings.adhan.adhanStrings.AqrabBalad = js.native
    
    @JSImport("adhan", "PolarCircleResolution.AqrabYaum")
    @js.native
    val AqrabYaum: typings.adhan.adhanStrings.AqrabYaum = js.native
    
    @JSImport("adhan", "PolarCircleResolution.Unresolved")
    @js.native
    val Unresolved: typings.adhan.adhanStrings.Unresolved = js.native
  }
  
  object Prayer {
    
    @JSImport("adhan", "Prayer.Asr")
    @js.native
    val Asr: asr = js.native
    
    @JSImport("adhan", "Prayer.Dhuhr")
    @js.native
    val Dhuhr: dhuhr = js.native
    
    @JSImport("adhan", "Prayer.Fajr")
    @js.native
    val Fajr: fajr = js.native
    
    @JSImport("adhan", "Prayer.Isha")
    @js.native
    val Isha: isha = js.native
    
    @JSImport("adhan", "Prayer.Maghrib")
    @js.native
    val Maghrib: maghrib = js.native
    
    @JSImport("adhan", "Prayer.None")
    @js.native
    val None: none = js.native
    
    @JSImport("adhan", "Prayer.Sunrise")
    @js.native
    val Sunrise: sunrise = js.native
  }
  
  @JSImport("adhan", "PrayerTimes")
  @js.native
  open class PrayerTimes protected ()
    extends typings.adhan.libTypesPrayerTimesMod.default {
    def this(
      coordinates: typings.adhan.libTypesCoordinatesMod.default,
      date: js.Date,
      calculationParameters: default
    ) = this()
  }
  
  inline def Qibla(coordinates: typings.adhan.libTypesCoordinatesMod.default): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Qibla")(coordinates.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  object Rounding {
    
    @JSImport("adhan", "Rounding.Nearest")
    @js.native
    val Nearest: nearest = js.native
    
    @JSImport("adhan", "Rounding.None")
    @js.native
    val None: none = js.native
    
    @JSImport("adhan", "Rounding.Up")
    @js.native
    val Up: up = js.native
  }
  
  object Shafaq {
    
    @JSImport("adhan", "Shafaq.Abyad")
    @js.native
    val Abyad: abyad = js.native
    
    @JSImport("adhan", "Shafaq.Ahmer")
    @js.native
    val Ahmer: ahmer = js.native
    
    @JSImport("adhan", "Shafaq.General")
    @js.native
    val General: general = js.native
  }
  
  @JSImport("adhan", "SunnahTimes")
  @js.native
  open class SunnahTimes protected ()
    extends typings.adhan.libTypesSunnahTimesMod.default {
    def this(prayerTimes: typings.adhan.libTypesPrayerTimesMod.default) = this()
  }
}
