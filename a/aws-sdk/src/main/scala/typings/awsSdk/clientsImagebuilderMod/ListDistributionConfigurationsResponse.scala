package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDistributionConfigurationsResponse extends StObject {
  
  /**
    * The list of distributions.
    */
  var distributionConfigurationSummaryList: js.UndefOr[DistributionConfigurationSummaryList] = js.undefined
  
  /**
    * The next token used for paginated responses. When this field isn't empty, there are additional elements that the service has'ot included in this request. Use this token with the next request to retrieve additional objects.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object ListDistributionConfigurationsResponse {
  
  inline def apply(): ListDistributionConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDistributionConfigurationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDistributionConfigurationsResponse] (val x: Self) extends AnyVal {
    
    inline def setDistributionConfigurationSummaryList(value: DistributionConfigurationSummaryList): Self = StObject.set(x, "distributionConfigurationSummaryList", value.asInstanceOf[js.Any])
    
    inline def setDistributionConfigurationSummaryListUndefined: Self = StObject.set(x, "distributionConfigurationSummaryList", js.undefined)
    
    inline def setDistributionConfigurationSummaryListVarargs(value: DistributionConfigurationSummary*): Self = StObject.set(x, "distributionConfigurationSummaryList", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
