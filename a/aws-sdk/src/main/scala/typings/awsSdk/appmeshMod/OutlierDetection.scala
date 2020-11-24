package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlierDetection extends js.Object {
  
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
  implicit class OutlierDetectionOps[Self <: OutlierDetection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseEjectionDuration(value: Duration): Self = this.set("baseEjectionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Duration): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxEjectionPercent(value: OutlierDetectionMaxEjectionPercent): Self = this.set("maxEjectionPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxServerErrors(value: OutlierDetectionMaxServerErrors): Self = this.set("maxServerErrors", value.asInstanceOf[js.Any])
  }
}
