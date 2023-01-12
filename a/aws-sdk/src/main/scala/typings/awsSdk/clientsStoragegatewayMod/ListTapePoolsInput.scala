package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTapePoolsInput extends StObject {
  
  /**
    * An optional number limit for the tape pools in the list returned by this call.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.undefined
  
  /**
    * A string that indicates the position at which to begin the returned list of tape pools.
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.Marker] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of each of the custom tape pools you want to list. If you don't specify a custom tape pool ARN, the response lists all custom tape pools. 
    */
  var PoolARNs: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.PoolARNs] = js.undefined
}
object ListTapePoolsInput {
  
  inline def apply(): ListTapePoolsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTapePoolsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTapePoolsInput] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: PositiveIntObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setPoolARNs(value: PoolARNs): Self = StObject.set(x, "PoolARNs", value.asInstanceOf[js.Any])
    
    inline def setPoolARNsUndefined: Self = StObject.set(x, "PoolARNs", js.undefined)
    
    inline def setPoolARNsVarargs(value: PoolARN*): Self = StObject.set(x, "PoolARNs", js.Array(value*))
  }
}
