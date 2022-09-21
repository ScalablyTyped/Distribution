package typings.adhan

import typings.adhan.adhanStrings.asr
import typings.adhan.adhanStrings.dhuhr
import typings.adhan.adhanStrings.fajr
import typings.adhan.adhanStrings.isha
import typings.adhan.adhanStrings.maghrib
import typings.adhan.adhanStrings.none
import typings.adhan.adhanStrings.sunrise
import typings.adhan.anon.Dhuhr
import typings.adhan.typeUtilsMod.ValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prayerTimesMod {
  
  @JSImport("adhan/lib/types/PrayerTimes", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PrayerTimes {
    def this(
      coordinates: typings.adhan.coordinatesMod.default,
      date: js.Date,
      calculationParameters: typings.adhan.calculationParametersMod.default
    ) = this()
  }
  
  @js.native
  trait PrayerTimes extends StObject {
    
    var asr: js.Date = js.native
    
    var calculationParameters: typings.adhan.calculationParametersMod.default = js.native
    
    var coordinates: typings.adhan.coordinatesMod.default = js.native
    
    def currentPrayer(): none | fajr | sunrise | dhuhr | asr | maghrib | isha = js.native
    def currentPrayer(date: js.Date): none | fajr | sunrise | dhuhr | asr | maghrib | isha = js.native
    
    var date: js.Date = js.native
    
    var dhuhr: js.Date = js.native
    
    var fajr: js.Date = js.native
    
    var isha: js.Date = js.native
    
    var maghrib: js.Date = js.native
    
    def nextPrayer(): none | fajr | sunrise | dhuhr | asr | maghrib | isha = js.native
    def nextPrayer(date: js.Date): none | fajr | sunrise | dhuhr | asr | maghrib | isha = js.native
    
    var sunrise: js.Date = js.native
    
    var sunset: js.Date = js.native
    
    def timeForPrayer(prayer: ValueOf[Dhuhr]): js.Date | Null = js.native
  }
}
