package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsResponse extends StObject {
  
  /**
    * When the list is truncated, this value is present and should be used for the NextToken parameter in a subsequent pagination request. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.acmpcaMod.NextToken] = js.undefined
  
  /**
    * The tags associated with your private CA.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ListTagsResponse {
  
  @scala.inline
  def apply(): ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsResponse]
  }
  
  @scala.inline
  implicit class ListTagsResponseMutableBuilder[Self <: ListTagsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
