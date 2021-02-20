package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsOutput extends StObject {
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * To help organize your resources, you can assign your own metadata to the resources you create. Each tag is a key-value pair.
    */
  var Tags: js.UndefOr[typings.awsSdk.backupMod.Tags] = js.native
}
object ListTagsOutput {
  
  @scala.inline
  def apply(): ListTagsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsOutput]
  }
  
  @scala.inline
  implicit class ListTagsOutputMutableBuilder[Self <: ListTagsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
