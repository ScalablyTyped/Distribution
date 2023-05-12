package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInfrastructureConfigurationsResponse extends StObject {
  
  /**
    * The list of infrastructure configurations.
    */
  var infrastructureConfigurationSummaryList: js.UndefOr[InfrastructureConfigurationSummaryList] = js.undefined
  
  /**
    * The next token used for paginated responses. When this field isn't empty, there are additional elements that the service has'ot included in this request. Use this token with the next request to retrieve additional objects.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object ListInfrastructureConfigurationsResponse {
  
  inline def apply(): ListInfrastructureConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInfrastructureConfigurationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInfrastructureConfigurationsResponse] (val x: Self) extends AnyVal {
    
    inline def setInfrastructureConfigurationSummaryList(value: InfrastructureConfigurationSummaryList): Self = StObject.set(x, "infrastructureConfigurationSummaryList", value.asInstanceOf[js.Any])
    
    inline def setInfrastructureConfigurationSummaryListUndefined: Self = StObject.set(x, "infrastructureConfigurationSummaryList", js.undefined)
    
    inline def setInfrastructureConfigurationSummaryListVarargs(value: InfrastructureConfigurationSummary*): Self = StObject.set(x, "infrastructureConfigurationSummaryList", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
