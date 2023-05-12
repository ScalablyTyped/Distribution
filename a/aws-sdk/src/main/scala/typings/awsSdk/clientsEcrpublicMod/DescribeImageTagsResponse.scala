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
    * The nextToken value to include in a future DescribeImageTags request. When the results of a DescribeImageTags request exceed maxResults, you can use this value to retrieve the next page of results. If there are no more results to return, this value is null.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeImageTagsResponse {
  
  inline def apply(): DescribeImageTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImageTagsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeImageTagsResponse] (val x: Self) extends AnyVal {
    
    inline def setImageTagDetails(value: ImageTagDetailList): Self = StObject.set(x, "imageTagDetails", value.asInstanceOf[js.Any])
    
    inline def setImageTagDetailsUndefined: Self = StObject.set(x, "imageTagDetails", js.undefined)
    
    inline def setImageTagDetailsVarargs(value: ImageTagDetail*): Self = StObject.set(x, "imageTagDetails", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
