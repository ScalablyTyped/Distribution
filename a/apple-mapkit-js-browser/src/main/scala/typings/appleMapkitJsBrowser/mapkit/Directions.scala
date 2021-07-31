package typings.appleMapkitJsBrowser.mapkit

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a directions object with options that you may provide.
  */
trait Directions extends StObject {
  
  /**
    * Cancels a previous request for route directions.
    *
    * @param id The ID returned by a call to route.
    */
  def cancel(id: Double): Boolean
  
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
  ): Double
  
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
  ): Double
}
object Directions {
  
  @scala.inline
  def apply(
    cancel: Double => Boolean,
    eta: (EtaRequestOptions, js.Function2[/* error */ Error | Null, /* data */ EtaResponse, Unit]) => Double,
    route: (DirectionsRequest, js.Function2[/* error */ Error | Null, /* data */ DirectionsResponse, Unit]) => Double
  ): Directions = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), eta = js.Any.fromFunction2(eta), route = js.Any.fromFunction2(route))
    __obj.asInstanceOf[Directions]
  }
  
  @js.native
  sealed trait Transport extends StObject
  /**
    * The modes of transportation.
    */
  @JSGlobal("mapkit.Directions.Transport")
  @js.native
  object Transport extends StObject {
    
    /**
      * A constant identifying the mode of transportation as driving.
      */
    @js.native
    sealed trait Automobile
      extends StObject
         with Transport
    
    /**
      * A constant identifying the mode of transportation as walking.
      */
    @js.native
    sealed trait Walking
      extends StObject
         with Transport
  }
  
  @scala.inline
  implicit class DirectionsMutableBuilder[Self <: Directions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Double => Boolean): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEta(
      value: (EtaRequestOptions, js.Function2[/* error */ Error | Null, /* data */ EtaResponse, Unit]) => Double
    ): Self = StObject.set(x, "eta", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRoute(
      value: (DirectionsRequest, js.Function2[/* error */ Error | Null, /* data */ DirectionsResponse, Unit]) => Double
    ): Self = StObject.set(x, "route", js.Any.fromFunction2(value))
  }
}
