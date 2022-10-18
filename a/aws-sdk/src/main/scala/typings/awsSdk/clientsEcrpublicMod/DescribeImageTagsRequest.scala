package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImageTagsRequest extends StObject {
  
  /**
    * The maximum number of repository results returned by DescribeImageTags in paginated output. When this parameter is used, DescribeImageTags only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another DescribeImageTags request with the returned nextToken value. This value can be between 1 and 1000. If this parameter is not used, then DescribeImageTags returns up to 100 results and a nextToken value, if applicable. This option cannot be used when you specify images with imageIds.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated DescribeImageTags request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return. This option cannot be used when you specify images with imageIds.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The AWS account ID associated with the public registry that contains the repository in which to describe images. If you do not specify a registry, the default public registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The name of the repository that contains the image tag details to describe.
    */
  var repositoryName: RepositoryName
}
object DescribeImageTagsRequest {
  
  inline def apply(repositoryName: RepositoryName): DescribeImageTagsRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImageTagsRequest]
  }
  
  extension [Self <: DescribeImageTagsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
