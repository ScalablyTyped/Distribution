package typings.awsSdk.clientsAccountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRegionsResponse extends StObject {
  
  /**
    * If there is more data to be returned, this will be populated. It should be passed into the next-token request parameter of list-regions.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * This is a list of Regions for a given account, or if the filtered parameter was used, a list of Regions that match the filter criteria set in the filter parameter.
    */
  var Regions: js.UndefOr[RegionOptList] = js.undefined
}
object ListRegionsResponse {
  
  inline def apply(): ListRegionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRegionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRegions(value: RegionOptList): Self = StObject.set(x, "Regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "Regions", js.undefined)
    
    inline def setRegionsVarargs(value: Region*): Self = StObject.set(x, "Regions", js.Array(value*))
  }
}
