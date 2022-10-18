package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTapesInput extends StObject {
  
  /**
    * An optional number limit for the tapes in the list returned by this call.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.undefined
  
  /**
    * A string that indicates the position at which to begin the returned list of tapes.
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.Marker] = js.undefined
  
  var TapeARNs: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.TapeARNs] = js.undefined
}
object ListTapesInput {
  
  inline def apply(): ListTapesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTapesInput]
  }
  
  extension [Self <: ListTapesInput](x: Self) {
    
    inline def setLimit(value: PositiveIntObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setTapeARNs(value: TapeARNs): Self = StObject.set(x, "TapeARNs", value.asInstanceOf[js.Any])
    
    inline def setTapeARNsUndefined: Self = StObject.set(x, "TapeARNs", js.undefined)
    
    inline def setTapeARNsVarargs(value: TapeARN*): Self = StObject.set(x, "TapeARNs", js.Array(value*))
  }
}
