package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImageBuildersResult extends StObject {
  
  /**
    * Information about the image builders.
    */
  var ImageBuilders: js.UndefOr[ImageBuilderList] = js.native
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeImageBuildersResult {
  
  @scala.inline
  def apply(): DescribeImageBuildersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImageBuildersResult]
  }
  
  @scala.inline
  implicit class DescribeImageBuildersResultMutableBuilder[Self <: DescribeImageBuildersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageBuilders(value: ImageBuilderList): Self = StObject.set(x, "ImageBuilders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBuildersUndefined: Self = StObject.set(x, "ImageBuilders", js.undefined)
    
    @scala.inline
    def setImageBuildersVarargs(value: ImageBuilder*): Self = StObject.set(x, "ImageBuilders", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
