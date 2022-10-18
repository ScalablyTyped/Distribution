package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImageBuildersResult extends StObject {
  
  /**
    * Information about the image builders.
    */
  var ImageBuilders: js.UndefOr[ImageBuilderList] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeImageBuildersResult {
  
  inline def apply(): DescribeImageBuildersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImageBuildersResult]
  }
  
  extension [Self <: DescribeImageBuildersResult](x: Self) {
    
    inline def setImageBuilders(value: ImageBuilderList): Self = StObject.set(x, "ImageBuilders", value.asInstanceOf[js.Any])
    
    inline def setImageBuildersUndefined: Self = StObject.set(x, "ImageBuilders", js.undefined)
    
    inline def setImageBuildersVarargs(value: ImageBuilder*): Self = StObject.set(x, "ImageBuilders", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
