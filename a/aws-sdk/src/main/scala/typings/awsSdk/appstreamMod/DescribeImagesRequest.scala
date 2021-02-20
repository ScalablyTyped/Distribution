package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImagesRequest extends StObject {
  
  /**
    * The ARNs of the public, private, and shared images to describe.
    */
  var Arns: js.UndefOr[ArnList] = js.native
  
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[DescribeImagesMaxResults] = js.native
  
  /**
    * The names of the public or private images to describe.
    */
  var Names: js.UndefOr[StringList] = js.native
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The type of image (public, private, or shared) to describe. 
    */
  var Type: js.UndefOr[VisibilityType] = js.native
}
object DescribeImagesRequest {
  
  @scala.inline
  def apply(): DescribeImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImagesRequest]
  }
  
  @scala.inline
  implicit class DescribeImagesRequestMutableBuilder[Self <: DescribeImagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArns(value: ArnList): Self = StObject.set(x, "Arns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnsUndefined: Self = StObject.set(x, "Arns", js.undefined)
    
    @scala.inline
    def setArnsVarargs(value: Arn*): Self = StObject.set(x, "Arns", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: DescribeImagesMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNames(value: StringList): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setType(value: VisibilityType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
