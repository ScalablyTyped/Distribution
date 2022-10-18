package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFieldLevelEncryptionProfilesRequest extends StObject {
  
  /**
    * Use this when paginating results to indicate where to begin in your list of profiles. The results include profiles in the list that occur after the marker. To get the next page of results, set the Marker to the value of the NextMarker from the current page's response (which is also the ID of the last profile on that page). 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of field-level encryption profiles you want in the response body. 
    */
  var MaxItems: js.UndefOr[String] = js.undefined
}
object ListFieldLevelEncryptionProfilesRequest {
  
  inline def apply(): ListFieldLevelEncryptionProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFieldLevelEncryptionProfilesRequest]
  }
  
  extension [Self <: ListFieldLevelEncryptionProfilesRequest](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: String): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
