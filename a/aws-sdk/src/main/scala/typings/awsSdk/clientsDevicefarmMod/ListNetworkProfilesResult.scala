package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNetworkProfilesResult extends StObject {
  
  /**
    * A list of the available network profiles.
    */
  var networkProfiles: js.UndefOr[NetworkProfiles] = js.undefined
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListNetworkProfilesResult {
  
  inline def apply(): ListNetworkProfilesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNetworkProfilesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListNetworkProfilesResult] (val x: Self) extends AnyVal {
    
    inline def setNetworkProfiles(value: NetworkProfiles): Self = StObject.set(x, "networkProfiles", value.asInstanceOf[js.Any])
    
    inline def setNetworkProfilesUndefined: Self = StObject.set(x, "networkProfiles", js.undefined)
    
    inline def setNetworkProfilesVarargs(value: NetworkProfile*): Self = StObject.set(x, "networkProfiles", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
