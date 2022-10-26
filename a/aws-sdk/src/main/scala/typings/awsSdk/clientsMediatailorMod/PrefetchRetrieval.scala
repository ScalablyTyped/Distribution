package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefetchRetrieval extends StObject {
  
  /**
    * The dynamic variables to use for substitution during prefetch requests to the ad decision server (ADS). You initially configure dynamic variables for the ADS URL when you set up your playback configuration. When you specify DynamicVariables for prefetch retrieval, MediaTailor includes the dynamic variables in the request to the ADS.
    */
  var DynamicVariables: js.UndefOr[mapOfString] = js.undefined
  
  /**
    * The time when prefetch retrieval ends for the ad break. Prefetching will be attempted for manifest requests that occur at or before this time.
    */
  var EndTime: js.Date
  
  /**
    * The time when prefetch retrievals can start for this break. Ad prefetching will be attempted for manifest requests that occur at or after this time. Defaults to the current time. If not specified, the prefetch retrieval starts as soon as possible.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object PrefetchRetrieval {
  
  inline def apply(EndTime: js.Date): PrefetchRetrieval = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefetchRetrieval]
  }
  
  extension [Self <: PrefetchRetrieval](x: Self) {
    
    inline def setDynamicVariables(value: mapOfString): Self = StObject.set(x, "DynamicVariables", value.asInstanceOf[js.Any])
    
    inline def setDynamicVariablesUndefined: Self = StObject.set(x, "DynamicVariables", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
