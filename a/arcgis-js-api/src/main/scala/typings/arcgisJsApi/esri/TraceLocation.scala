package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`starting-point`
import typings.arcgisJsApi.arcgisJsApiStrings.barrier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraceLocation
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The globalId (UUID) of the feature to start or stop the trace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceLocation.html#globalId)
    */
  var globalId: String = js.native
  
  /**
    * This indicates whether this barrier starting location should be skipped (filtered) when a trace attempts to find upstream controllers.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceLocation.html#isFilterBarrier)
    */
  var isFilterBarrier: Boolean = js.native
  
  /**
    * This double parameter of value of 0-1 indicates a percentage along the line of where the trace location is placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceLocation.html#percentAlong)
    */
  var percentAlong: Double = js.native
  
  /**
    * The terminal Id to place the starting location at.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceLocation.html#terminalId)
    */
  var terminalId: Double = js.native
  
  /**
    * The type of the trace location; `starting-point` defines where the trace should start and `barrier` defines where the trace should stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceLocation.html#type)
    */
  var `type`: `starting-point` | barrier = js.native
}
