package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourcesResponse extends StObject {
  
  /**
    * A list of ResourceTagSets containing tags associated with the specified resources.
    */
  var ResourceTagSets: ResourceTagSetList
}
object ListTagsForResourcesResponse {
  
  inline def apply(ResourceTagSets: ResourceTagSetList): ListTagsForResourcesResponse = {
    val __obj = js.Dynamic.literal(ResourceTagSets = ResourceTagSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourcesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForResourcesResponse] (val x: Self) extends AnyVal {
    
    inline def setResourceTagSets(value: ResourceTagSetList): Self = StObject.set(x, "ResourceTagSets", value.asInstanceOf[js.Any])
    
    inline def setResourceTagSetsVarargs(value: ResourceTagSet*): Self = StObject.set(x, "ResourceTagSets", js.Array(value*))
  }
}
