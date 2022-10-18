package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomEntityTypesResponse extends StObject {
  
  /**
    * A list of CustomEntityType objects representing custom patterns.
    */
  var CustomEntityTypes: js.UndefOr[typings.awsSdk.clientsGlueMod.CustomEntityTypes] = js.undefined
  
  /**
    * A pagination token, if more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListCustomEntityTypesResponse {
  
  inline def apply(): ListCustomEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomEntityTypesResponse]
  }
  
  extension [Self <: ListCustomEntityTypesResponse](x: Self) {
    
    inline def setCustomEntityTypes(value: CustomEntityTypes): Self = StObject.set(x, "CustomEntityTypes", value.asInstanceOf[js.Any])
    
    inline def setCustomEntityTypesUndefined: Self = StObject.set(x, "CustomEntityTypes", js.undefined)
    
    inline def setCustomEntityTypesVarargs(value: CustomEntityType*): Self = StObject.set(x, "CustomEntityTypes", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
