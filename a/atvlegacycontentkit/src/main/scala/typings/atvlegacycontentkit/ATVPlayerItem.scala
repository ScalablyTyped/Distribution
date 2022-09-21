package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the current item in the player. These seem to be entirely designed for, and used by Apple TV+, so have little relevance to other applications.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVPlayerItem extends StObject {
  
  /**
    * A list of advisory information about the item. This is basically detailed information about why the rating was accorded (e.g. specifying if the show has violance, sex scenes, bad language,
    * etc.).
    *
    * The formats for these are dependant on the country, so may vary. This is written from a New Zealand perspective and their rating systems.
    *
    * Again, this is very dependant on TV+ specific stuff, so isn't likely to be useful elsewhere.
    */
  var advisoryInfo: js.UndefOr[js.Array[ATVPlayerAdvisoryInfo]] = js.undefined
  
  /**
    * The duration of the item. Returns NaN if it is a live asset.
    */
  var duration: Double
  
  /**
    * How much of the asset has been played.
    */
  var elapsedTime: Double
  
  /**
    * Data for metrics.
    */
  var metricsData: js.UndefOr[ATVPlayerMetricsData] = js.undefined
  
  /**
    * Information about the content rating of the item.
    *
    * The formats for this are dependant on the country, so may vary. This is written from a New Zealand perspective and their rating systems.
    *
    * Again, this is very dependant on TV+ specific stuff, so isn't likely to be useful elsewhere.
    */
  var ratingsInfo: ATVPlayerRatingInfo
}
object ATVPlayerItem {
  
  inline def apply(duration: Double, elapsedTime: Double, ratingsInfo: ATVPlayerRatingInfo): ATVPlayerItem = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], ratingsInfo = ratingsInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATVPlayerItem]
  }
  
  extension [Self <: ATVPlayerItem](x: Self) {
    
    inline def setAdvisoryInfo(value: js.Array[ATVPlayerAdvisoryInfo]): Self = StObject.set(x, "advisoryInfo", value.asInstanceOf[js.Any])
    
    inline def setAdvisoryInfoUndefined: Self = StObject.set(x, "advisoryInfo", js.undefined)
    
    inline def setAdvisoryInfoVarargs(value: ATVPlayerAdvisoryInfo*): Self = StObject.set(x, "advisoryInfo", js.Array(value*))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    inline def setMetricsData(value: ATVPlayerMetricsData): Self = StObject.set(x, "metricsData", value.asInstanceOf[js.Any])
    
    inline def setMetricsDataUndefined: Self = StObject.set(x, "metricsData", js.undefined)
    
    inline def setRatingsInfo(value: ATVPlayerRatingInfo): Self = StObject.set(x, "ratingsInfo", value.asInstanceOf[js.Any])
  }
}
