package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImagesResponse extends StObject {
  
  /**
    * A list of ImageDetail objects that contain data about the image.
    */
  var imageDetails: js.UndefOr[ImageDetailList] = js.undefined
  
  /**
    * The nextToken value to include in a future DescribeImages request. When the results of a DescribeImages request exceed maxResults, you can use this value to retrieve the next page of results. If there are no more results to return, this value is null.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeImagesResponse {
  
  inline def apply(): DescribeImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImagesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeImagesResponse] (val x: Self) extends AnyVal {
    
    inline def setImageDetails(value: ImageDetailList): Self = StObject.set(x, "imageDetails", value.asInstanceOf[js.Any])
    
    inline def setImageDetailsUndefined: Self = StObject.set(x, "imageDetails", js.undefined)
    
    inline def setImageDetailsVarargs(value: ImageDetail*): Self = StObject.set(x, "imageDetails", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
