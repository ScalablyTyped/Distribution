package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCodeSigningConfigsRequest extends StObject {
  
  /**
    * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of items to return.
    */
  var MaxItems: js.UndefOr[MaxListItems] = js.undefined
}
object ListCodeSigningConfigsRequest {
  
  inline def apply(): ListCodeSigningConfigsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCodeSigningConfigsRequest]
  }
  
  extension [Self <: ListCodeSigningConfigsRequest](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: MaxListItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
