package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForStreamOutput extends StObject {
  
  /**
    * If you specify this parameter and the result of a ListTags call is truncated, the response includes a token that you can use in the next request to fetch the next set of tags.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.NextToken] = js.undefined
  
  /**
    * A map of tag keys and values associated with the specified stream.
    */
  var Tags: js.UndefOr[ResourceTags] = js.undefined
}
object ListTagsForStreamOutput {
  
  inline def apply(): ListTagsForStreamOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForStreamOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForStreamOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTags(value: ResourceTags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
