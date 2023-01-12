package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutlierDetection extends StObject {
  
  /**
    * The base amount of time for which a host is ejected.
    */
  var baseEjectionDuration: Duration
  
  /**
    * The time interval between ejection sweep analysis.
    */
  var interval: Duration
  
  /**
    * Maximum percentage of hosts in load balancing pool for upstream service that can be ejected. Will eject at least one host regardless of the value.
    */
  var maxEjectionPercent: OutlierDetectionMaxEjectionPercent
  
  /**
    * Number of consecutive 5xx errors required for ejection. 
    */
  var maxServerErrors: OutlierDetectionMaxServerErrors
}
object OutlierDetection {
  
  inline def apply(
    baseEjectionDuration: Duration,
    interval: Duration,
    maxEjectionPercent: OutlierDetectionMaxEjectionPercent,
    maxServerErrors: OutlierDetectionMaxServerErrors
  ): OutlierDetection = {
    val __obj = js.Dynamic.literal(baseEjectionDuration = baseEjectionDuration.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], maxEjectionPercent = maxEjectionPercent.asInstanceOf[js.Any], maxServerErrors = maxServerErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlierDetection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutlierDetection] (val x: Self) extends AnyVal {
    
    inline def setBaseEjectionDuration(value: Duration): Self = StObject.set(x, "baseEjectionDuration", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: Duration): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setMaxEjectionPercent(value: OutlierDetectionMaxEjectionPercent): Self = StObject.set(x, "maxEjectionPercent", value.asInstanceOf[js.Any])
    
    inline def setMaxServerErrors(value: OutlierDetectionMaxServerErrors): Self = StObject.set(x, "maxServerErrors", value.asInstanceOf[js.Any])
  }
}
