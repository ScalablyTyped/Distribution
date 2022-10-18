package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImageTagsResponse extends StObject {
  
  /**
    * The image tag details for the images in the requested repository.
    */
  var imageTagDetails: js.UndefOr[ImageTagDetailList] = js.undefined
  
  /**
    * The nextToken value to include in a future DescribeImageTags request. When the results of a DescribeImageTags request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeImageTagsResponse {
  
  inline def apply(): DescribeImageTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImageTagsResponse]
  }
  
  extension [Self <: DescribeImageTagsResponse](x: Self) {
    
    inline def setImageTagDetails(value: ImageTagDetailList): Self = StObject.set(x, "imageTagDetails", value.asInstanceOf[js.Any])
    
    inline def setImageTagDetailsUndefined: Self = StObject.set(x, "imageTagDetails", js.undefined)
    
    inline def setImageTagDetailsVarargs(value: ImageTagDetail*): Self = StObject.set(x, "imageTagDetails", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
