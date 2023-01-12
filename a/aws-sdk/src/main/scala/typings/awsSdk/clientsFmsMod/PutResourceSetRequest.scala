package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourceSetRequest extends StObject {
  
  /**
    * Details about the resource set to be created or updated.&gt;
    */
  var ResourceSet: typings.awsSdk.clientsFmsMod.ResourceSet
  
  /**
    * Retrieves the tags associated with the specified resource set. Tags are key:value pairs that you can use to categorize and manage your resources, for purposes like billing. For example, you might set the tag key to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each Amazon Web Services resource, up to 50 tags for a resource.
    */
  var TagList: js.UndefOr[typings.awsSdk.clientsFmsMod.TagList] = js.undefined
}
object PutResourceSetRequest {
  
  inline def apply(ResourceSet: ResourceSet): PutResourceSetRequest = {
    val __obj = js.Dynamic.literal(ResourceSet = ResourceSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourceSetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutResourceSetRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceSet(value: ResourceSet): Self = StObject.set(x, "ResourceSet", value.asInstanceOf[js.Any])
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value*))
  }
}
