package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLifecyclePolicyPreviewResponse extends StObject {
  
  /**
    * The JSON lifecycle policy text.
    */
  var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined
  
  /**
    * The nextToken value to include in a future GetLifecyclePolicyPreview request. When the results of a GetLifecyclePolicyPreview request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The results of the lifecycle policy preview request.
    */
  var previewResults: js.UndefOr[LifecyclePolicyPreviewResultList] = js.undefined
  
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  
  /**
    * The status of the lifecycle policy preview request.
    */
  var status: js.UndefOr[LifecyclePolicyPreviewStatus] = js.undefined
  
  /**
    * The list of images that is returned as a result of the action.
    */
  var summary: js.UndefOr[LifecyclePolicyPreviewSummary] = js.undefined
}
object GetLifecyclePolicyPreviewResponse {
  
  inline def apply(): GetLifecyclePolicyPreviewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLifecyclePolicyPreviewResponse]
  }
  
  extension [Self <: GetLifecyclePolicyPreviewResponse](x: Self) {
    
    inline def setLifecyclePolicyText(value: LifecyclePolicyText): Self = StObject.set(x, "lifecyclePolicyText", value.asInstanceOf[js.Any])
    
    inline def setLifecyclePolicyTextUndefined: Self = StObject.set(x, "lifecyclePolicyText", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPreviewResults(value: LifecyclePolicyPreviewResultList): Self = StObject.set(x, "previewResults", value.asInstanceOf[js.Any])
    
    inline def setPreviewResultsUndefined: Self = StObject.set(x, "previewResults", js.undefined)
    
    inline def setPreviewResultsVarargs(value: LifecyclePolicyPreviewResult*): Self = StObject.set(x, "previewResults", js.Array(value*))
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    
    inline def setStatus(value: LifecyclePolicyPreviewStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSummary(value: LifecyclePolicyPreviewSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
