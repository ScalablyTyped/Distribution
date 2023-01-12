package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceResponse extends StObject {
  
  /**
    * A ResourceTagSet containing tags associated with the specified resource.
    */
  var ResourceTagSet: typings.awsSdk.clientsRoute53Mod.ResourceTagSet
}
object ListTagsForResourceResponse {
  
  inline def apply(ResourceTagSet: ResourceTagSet): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal(ResourceTagSet = ResourceTagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForResourceResponse] (val x: Self) extends AnyVal {
    
    inline def setResourceTagSet(value: ResourceTagSet): Self = StObject.set(x, "ResourceTagSet", value.asInstanceOf[js.Any])
  }
}
