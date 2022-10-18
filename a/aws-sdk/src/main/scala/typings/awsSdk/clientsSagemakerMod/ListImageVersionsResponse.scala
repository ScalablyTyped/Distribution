package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImageVersionsResponse extends StObject {
  
  /**
    * A list of versions and their properties.
    */
  var ImageVersions: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ImageVersions] = js.undefined
  
  /**
    * A token for getting the next set of versions, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListImageVersionsResponse {
  
  inline def apply(): ListImageVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImageVersionsResponse]
  }
  
  extension [Self <: ListImageVersionsResponse](x: Self) {
    
    inline def setImageVersions(value: ImageVersions): Self = StObject.set(x, "ImageVersions", value.asInstanceOf[js.Any])
    
    inline def setImageVersionsUndefined: Self = StObject.set(x, "ImageVersions", js.undefined)
    
    inline def setImageVersionsVarargs(value: ImageVersion*): Self = StObject.set(x, "ImageVersions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
