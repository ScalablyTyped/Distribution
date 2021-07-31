package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImagesResult extends StObject {
  
  /**
    * Information about the images.
    */
  var Images: js.UndefOr[ImageList] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeImagesResult {
  
  @scala.inline
  def apply(): DescribeImagesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImagesResult]
  }
  
  @scala.inline
  implicit class DescribeImagesResultMutableBuilder[Self <: DescribeImagesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImages(value: ImageList): Self = StObject.set(x, "Images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "Images", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: Image*): Self = StObject.set(x, "Images", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
