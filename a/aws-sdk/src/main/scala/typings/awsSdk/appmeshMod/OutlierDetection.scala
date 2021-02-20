package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlierDetection extends StObject {
  
  /**
    * The base amount of time for which a host is ejected.
    */
  var baseEjectionDuration: Duration = js.native
  
  /**
    * The time interval between ejection sweep analysis.
    */
  var interval: Duration = js.native
  
  /**
    * Maximum percentage of hosts in load balancing pool for upstream service that can be ejected. Will eject at least one host regardless of the value.
    */
  var maxEjectionPercent: OutlierDetectionMaxEjectionPercent = js.native
  
  /**
    * Number of consecutive 5xx errors required for ejection. 
    */
  var maxServerErrors: OutlierDetectionMaxServerErrors = js.native
}
object OutlierDetection {
  
  @scala.inline
  def apply(
    baseEjectionDuration: Duration,
    interval: Duration,
    maxEjectionPercent: OutlierDetectionMaxEjectionPercent,
    maxServerErrors: OutlierDetectionMaxServerErrors
  ): OutlierDetection = {
    val __obj = js.Dynamic.literal(baseEjectionDuration = baseEjectionDuration.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], maxEjectionPercent = maxEjectionPercent.asInstanceOf[js.Any], maxServerErrors = maxServerErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlierDetection]
  }
  
  @scala.inline
  implicit class OutlierDetectionMutableBuilder[Self <: OutlierDetection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseEjectionDuration(value: Duration): Self = StObject.set(x, "baseEjectionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Duration): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxEjectionPercent(value: OutlierDetectionMaxEjectionPercent): Self = StObject.set(x, "maxEjectionPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxServerErrors(value: OutlierDetectionMaxServerErrors): Self = StObject.set(x, "maxServerErrors", value.asInstanceOf[js.Any])
  }
}
