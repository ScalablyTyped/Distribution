package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data for metrics reports most likely.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVPlayerMetricsData extends StObject {
  
  /**
    * The length of the item. This is likely obtained from the session data ID com.apple.hls.feature.duration.
    */
  var featureDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * The start time of the item. It's unclear where this is derived from.
    */
  var featureStartTime: js.UndefOr[Double] = js.undefined
  
  /**
    * Unknown, but appears in the JS for TV+.
    */
  var rollInfo: js.UndefOr[String] = js.undefined
  
  /**
    * Unknown, but appears in the JS for TV+.
    */
  var skipInfo: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the up next item is displayed. This is derived from upNextPresentationTime.
    */
  var upNextStartTime: js.UndefOr[Double] = js.undefined
  
  /**
    * The time when this item is considiered watched. This seems to be the same as upNextStartTime.
    */
  var watchedTime: js.UndefOr[Double] = js.undefined
}
object ATVPlayerMetricsData {
  
  inline def apply(): ATVPlayerMetricsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ATVPlayerMetricsData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ATVPlayerMetricsData] (val x: Self) extends AnyVal {
    
    inline def setFeatureDuration(value: Double): Self = StObject.set(x, "featureDuration", value.asInstanceOf[js.Any])
    
    inline def setFeatureDurationUndefined: Self = StObject.set(x, "featureDuration", js.undefined)
    
    inline def setFeatureStartTime(value: Double): Self = StObject.set(x, "featureStartTime", value.asInstanceOf[js.Any])
    
    inline def setFeatureStartTimeUndefined: Self = StObject.set(x, "featureStartTime", js.undefined)
    
    inline def setRollInfo(value: String): Self = StObject.set(x, "rollInfo", value.asInstanceOf[js.Any])
    
    inline def setRollInfoUndefined: Self = StObject.set(x, "rollInfo", js.undefined)
    
    inline def setSkipInfo(value: String): Self = StObject.set(x, "skipInfo", value.asInstanceOf[js.Any])
    
    inline def setSkipInfoUndefined: Self = StObject.set(x, "skipInfo", js.undefined)
    
    inline def setUpNextStartTime(value: Double): Self = StObject.set(x, "upNextStartTime", value.asInstanceOf[js.Any])
    
    inline def setUpNextStartTimeUndefined: Self = StObject.set(x, "upNextStartTime", js.undefined)
    
    inline def setWatchedTime(value: Double): Self = StObject.set(x, "watchedTime", value.asInstanceOf[js.Any])
    
    inline def setWatchedTimeUndefined: Self = StObject.set(x, "watchedTime", js.undefined)
  }
}
