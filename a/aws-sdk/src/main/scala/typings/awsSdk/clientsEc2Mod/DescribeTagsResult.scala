package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTagsResult extends StObject {
  
  /**
    * The token to include in another request to get the next page of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagDescriptionList] = js.undefined
}
object DescribeTagsResult {
  
  inline def apply(): DescribeTagsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTagsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTagsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTags(value: TagDescriptionList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: TagDescription*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
