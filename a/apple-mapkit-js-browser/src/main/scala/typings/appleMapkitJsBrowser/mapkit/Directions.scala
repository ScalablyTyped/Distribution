package typings.appleMapkitJsBrowser.mapkit

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a directions object with options that you may provide.
  */
@js.native
trait Directions extends js.Object {
  
  /**
    * Cancels a previous request for route directions.
    *
    * @param id The ID returned by a call to route.
    */
  def cancel(id: Double): Boolean = js.native
  
  /**
    * Retrieves estimated arrival times to up to 10 destinations from a single starting point.
    *
    * @param request An EtaRequestOptions object that specifies details for the server to provide estimated arrival times at one or more destinations.
    * @param callback A callback function that receives the estimated time response object, returned asynchronously.
    * @return A request ID, which you can pass to cancel to abort a pending request.
    */
  def eta(
    request: EtaRequestOptions,
    callback: js.Function2[/* error */ Error | Null, /* data */ EtaResponse, Unit]
  ): Double = js.native
  
  /**
    * Retrieves directions and estimated travel time for the specified start
    * and end points.
    *
    * @param request DirectionsRequest object that specifies details for the
    * directions you want to retrieve.
    * @param callback A callback function that receives the directions,
    * returned asynchronously.
    * @return A request ID, which you can pass to cancel to abort a pending request.
    */
  def route(
    request: DirectionsRequest,
    callback: js.Function2[/* error */ Error | Null, /* data */ DirectionsResponse, Unit]
  ): Double = js.native
}
@JSGlobal("mapkit.Directions")
@js.native
object Directions extends js.Object {
  
  @js.native
  sealed trait Transport extends js.Object
  /**
    * The modes of transportation.
    */
  @js.native
  object Transport extends js.Object {
    
    /**
      * A constant identifying the mode of transportation as driving.
      */
    @js.native
    sealed trait Automobile extends Transport
    
    /**
      * A constant identifying the mode of transportation as walking.
      */
    @js.native
    sealed trait Walking extends Transport
  }
}
