package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTapePoolsOutput extends StObject {
  
  /**
    * A string that indicates the position at which to begin the returned list of tape pools. Use the marker in your next request to continue pagination of tape pools. If there are no more tape pools to list, this element does not appear in the response body. 
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.Marker] = js.undefined
  
  /**
    * An array of PoolInfo objects, where each object describes a single custom tape pool. If there are no custom tape pools, the PoolInfos is an empty array. 
    */
  var PoolInfos: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.PoolInfos] = js.undefined
}
object ListTapePoolsOutput {
  
  inline def apply(): ListTapePoolsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTapePoolsOutput]
  }
  
  extension [Self <: ListTapePoolsOutput](x: Self) {
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setPoolInfos(value: PoolInfos): Self = StObject.set(x, "PoolInfos", value.asInstanceOf[js.Any])
    
    inline def setPoolInfosUndefined: Self = StObject.set(x, "PoolInfos", js.undefined)
    
    inline def setPoolInfosVarargs(value: PoolInfo*): Self = StObject.set(x, "PoolInfos", js.Array(value*))
  }
}
