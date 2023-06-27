package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`starting-point`
import typings.arcgisJsApi.arcgisJsApiStrings.barrier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraceLocationProperties extends StObject {
  
  /**
  		 * The globalId (UUID) of the feature to start or stop the trace.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceLocation.html#globalId)
  		 */
  var globalId: js.UndefOr[String] = js.undefined
  
  /**
  		 * This indicates whether this barrier starting location should be skipped (filtered) when a trace attempts to find upstream controllers.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceLocation.html#isFilterBarrier)
  		 */
  var isFilterBarrier: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * This double parameter of value of 0-1 indicates a percentage along the line of where the trace location is placed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceLocation.html#percentAlong)
  		 */
  var percentAlong: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The terminal Id to place the starting location at.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceLocation.html#terminalId)
  		 */
  var terminalId: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The type of the trace location; `starting-point` defines where the trace should start and `barrier` defines where the trace should stop.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceLocation.html#type)
  		 */
  var `type`: js.UndefOr[`starting-point` | barrier] = js.undefined
}
object TraceLocationProperties {
  
  inline def apply(): TraceLocationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceLocationProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TraceLocationProperties] (val x: Self) extends AnyVal {
    
    inline def setGlobalId(value: String): Self = StObject.set(x, "globalId", value.asInstanceOf[js.Any])
    
    inline def setGlobalIdUndefined: Self = StObject.set(x, "globalId", js.undefined)
    
    inline def setIsFilterBarrier(value: Boolean): Self = StObject.set(x, "isFilterBarrier", value.asInstanceOf[js.Any])
    
    inline def setIsFilterBarrierUndefined: Self = StObject.set(x, "isFilterBarrier", js.undefined)
    
    inline def setPercentAlong(value: Double): Self = StObject.set(x, "percentAlong", value.asInstanceOf[js.Any])
    
    inline def setPercentAlongUndefined: Self = StObject.set(x, "percentAlong", js.undefined)
    
    inline def setTerminalId(value: Double): Self = StObject.set(x, "terminalId", value.asInstanceOf[js.Any])
    
    inline def setTerminalIdUndefined: Self = StObject.set(x, "terminalId", js.undefined)
    
    inline def setType(value: `starting-point` | barrier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
