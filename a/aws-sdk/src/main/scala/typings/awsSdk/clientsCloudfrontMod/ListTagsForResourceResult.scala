package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceResult extends StObject {
  
  /**
    * A complex type that contains zero or more Tag elements.
    */
  var Tags: typings.awsSdk.clientsCloudfrontMod.Tags
}
object ListTagsForResourceResult {
  
  inline def apply(Tags: Tags): ListTagsForResourceResult = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForResourceResult] (val x: Self) extends AnyVal {
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
