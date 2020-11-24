package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.mapkit.Directions.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The mode of transportation, distance, and travel time estimates for a single destination.
  */
@js.native
trait EtaResult extends js.Object {
  
  /**
    * The route distance in meters.
    */
  var distance: Double = js.native
  
  /**
    * The estimated travel time in seconds, including estimated delays due to traffic.
    */
  var expectedTravelTime: Double = js.native
  
  /**
    * The estimated travel time in seconds, excluding estimated delays for traffic.
    */
  var staticTravelTime: Double = js.native
  
  /**
    * The mode of transportation used to estimate the arrival time.
    */
  var transportType: Transport = js.native
}
object EtaResult {
  
  @scala.inline
  def apply(distance: Double, expectedTravelTime: Double, staticTravelTime: Double, transportType: Transport): EtaResult = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], expectedTravelTime = expectedTravelTime.asInstanceOf[js.Any], staticTravelTime = staticTravelTime.asInstanceOf[js.Any], transportType = transportType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EtaResult]
  }
  
  @scala.inline
  implicit class EtaResultOps[Self <: EtaResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedTravelTime(value: Double): Self = this.set("expectedTravelTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticTravelTime(value: Double): Self = this.set("staticTravelTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportType(value: Transport): Self = this.set("transportType", value.asInstanceOf[js.Any])
  }
}
