package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFileSystemAssociationsInput extends StObject {
  
  var GatewayARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
  
  /**
    * The maximum number of file system associations to return in the response. If present, Limit must be an integer with a value greater than zero. Optional.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.undefined
  
  /**
    * Opaque pagination token returned from a previous ListFileSystemAssociations operation. If present, Marker specifies where to continue the list from after a previous call to ListFileSystemAssociations. Optional.
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.Marker] = js.undefined
}
object ListFileSystemAssociationsInput {
  
  inline def apply(): ListFileSystemAssociationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFileSystemAssociationsInput]
  }
  
  extension [Self <: ListFileSystemAssociationsInput](x: Self) {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    inline def setLimit(value: PositiveIntObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
