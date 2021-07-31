package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.mapkit.Directions.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The mode of transportation, distance, and travel time estimates for a single destination.
  */
trait EtaResult extends StObject {
  
  /**
    * The route distance in meters.
    */
  var distance: Double
  
  /**
    * The estimated travel time in seconds, including estimated delays due to traffic.
    */
  var expectedTravelTime: Double
  
  /**
    * The estimated travel time in seconds, excluding estimated delays for traffic.
    */
  var staticTravelTime: Double
  
  /**
    * The mode of transportation used to estimate the arrival time.
    */
  var transportType: Transport
}
object EtaResult {
  
  @scala.inline
  def apply(distance: Double, expectedTravelTime: Double, staticTravelTime: Double, transportType: Transport): EtaResult = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], expectedTravelTime = expectedTravelTime.asInstanceOf[js.Any], staticTravelTime = staticTravelTime.asInstanceOf[js.Any], transportType = transportType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EtaResult]
  }
  
  @scala.inline
  implicit class EtaResultMutableBuilder[Self <: EtaResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedTravelTime(value: Double): Self = StObject.set(x, "expectedTravelTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticTravelTime(value: Double): Self = StObject.set(x, "staticTravelTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportType(value: Transport): Self = StObject.set(x, "transportType", value.asInstanceOf[js.Any])
  }
}
