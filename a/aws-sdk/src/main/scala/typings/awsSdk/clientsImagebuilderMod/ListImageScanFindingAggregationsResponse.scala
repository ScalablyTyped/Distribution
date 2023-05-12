package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImageScanFindingAggregationsResponse extends StObject {
  
  /**
    * The aggregation type specifies what type of key is used to group the image scan findings. Image Builder returns results based on the request filter. If you didn't specify a filter in the request, the type defaults to accountId.  Aggregation types    accountId   imageBuildVersionArn   imagePipelineArn   vulnerabilityId   Each aggregation includes counts by severity level for medium severity and higher level findings, plus a total for all of the findings for each key value.
    */
  var aggregationType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The next token used for paginated responses. When this field isn't empty, there are additional elements that the service has'ot included in this request. Use this token with the next request to retrieve additional objects.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * An array of image scan finding aggregations that match the filter criteria.
    */
  var responses: js.UndefOr[ImageScanFindingAggregationsList] = js.undefined
}
object ListImageScanFindingAggregationsResponse {
  
  inline def apply(): ListImageScanFindingAggregationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImageScanFindingAggregationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListImageScanFindingAggregationsResponse] (val x: Self) extends AnyVal {
    
    inline def setAggregationType(value: NonEmptyString): Self = StObject.set(x, "aggregationType", value.asInstanceOf[js.Any])
    
    inline def setAggregationTypeUndefined: Self = StObject.set(x, "aggregationType", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setResponses(value: ImageScanFindingAggregationsList): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: ImageScanFindingAggregation*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
