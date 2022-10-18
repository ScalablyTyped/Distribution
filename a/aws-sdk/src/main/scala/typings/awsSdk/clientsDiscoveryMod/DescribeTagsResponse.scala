package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTagsResponse extends StObject {
  
  /**
    * The call returns a token. Use this token to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Depending on the input, this is a list of configuration items tagged with a specific tag, or a list of tags for a specific configuration item.
    */
  var tags: js.UndefOr[ConfigurationTagSet] = js.undefined
}
object DescribeTagsResponse {
  
  inline def apply(): DescribeTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTagsResponse]
  }
  
  extension [Self <: DescribeTagsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTags(value: ConfigurationTagSet): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: ConfigurationTag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
