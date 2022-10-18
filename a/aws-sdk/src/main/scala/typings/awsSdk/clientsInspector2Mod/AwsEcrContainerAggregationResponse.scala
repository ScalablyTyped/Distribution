package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcrContainerAggregationResponse extends StObject {
  
  /**
    * The Amazon Web Services account ID of the account that owns the container.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The architecture of the container.
    */
  var architecture: js.UndefOr[String] = js.undefined
  
  /**
    * The SHA value of the container image.
    */
  var imageSha: js.UndefOr[String] = js.undefined
  
  /**
    * The container image stags.
    */
  var imageTags: js.UndefOr[StringList] = js.undefined
  
  /**
    * The container repository.
    */
  var repository: js.UndefOr[String] = js.undefined
  
  /**
    * The resource ID of the container.
    */
  var resourceId: NonEmptyString
  
  /**
    * The number of finding by severity.
    */
  var severityCounts: js.UndefOr[SeverityCounts] = js.undefined
}
object AwsEcrContainerAggregationResponse {
  
  inline def apply(resourceId: NonEmptyString): AwsEcrContainerAggregationResponse = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsEcrContainerAggregationResponse]
  }
  
  extension [Self <: AwsEcrContainerAggregationResponse](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setImageSha(value: String): Self = StObject.set(x, "imageSha", value.asInstanceOf[js.Any])
    
    inline def setImageShaUndefined: Self = StObject.set(x, "imageSha", js.undefined)
    
    inline def setImageTags(value: StringList): Self = StObject.set(x, "imageTags", value.asInstanceOf[js.Any])
    
    inline def setImageTagsUndefined: Self = StObject.set(x, "imageTags", js.undefined)
    
    inline def setImageTagsVarargs(value: NonEmptyString*): Self = StObject.set(x, "imageTags", js.Array(value*))
    
    inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setResourceId(value: NonEmptyString): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setSeverityCounts(value: SeverityCounts): Self = StObject.set(x, "severityCounts", value.asInstanceOf[js.Any])
    
    inline def setSeverityCountsUndefined: Self = StObject.set(x, "severityCounts", js.undefined)
  }
}
