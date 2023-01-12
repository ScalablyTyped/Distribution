package typings.awsSdk.clientsMwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceOutput extends StObject {
  
  /**
    * The key-value tag pairs associated to your environment. To learn more, see Tagging Amazon Web Services resources.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object ListTagsForResourceOutput {
  
  inline def apply(): ListTagsForResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForResourceOutput] (val x: Self) extends AnyVal {
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
