package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTagsOutput extends StObject {
  
  /**
    * The ID of the tagged ML object.
    */
  var ResourceId: js.UndefOr[EntityId] = js.undefined
  
  /**
    * The type of the tagged ML object.
    */
  var ResourceType: js.UndefOr[TaggableResourceType] = js.undefined
  
  /**
    * A list of tags associated with the ML object.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object DescribeTagsOutput {
  
  inline def apply(): DescribeTagsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTagsOutput]
  }
  
  extension [Self <: DescribeTagsOutput](x: Self) {
    
    inline def setResourceId(value: EntityId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: TaggableResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
