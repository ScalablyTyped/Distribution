package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessControlConfigurationsRequest extends StObject {
  
  /**
    * The identifier of the index for the access control configuration.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
  
  /**
    * The maximum number of access control configurations to return.
    */
  var MaxResults: js.UndefOr[MaxResultsIntegerForListAccessControlConfigurationsRequest] = js.undefined
  
  /**
    * If the previous response was incomplete (because there's more data to retrieve), Amazon Kendra returns a pagination token in the response. You can use this pagination token to retrieve the next set of access control configurations.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListAccessControlConfigurationsRequest {
  
  inline def apply(IndexId: IndexId): ListAccessControlConfigurationsRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessControlConfigurationsRequest]
  }
  
  extension [Self <: ListAccessControlConfigurationsRequest](x: Self) {
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResultsIntegerForListAccessControlConfigurationsRequest): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
