package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTagsOutput extends StObject {
  
  /**
    * The ID of the ML object from which tags were deleted.
    */
  var ResourceId: js.UndefOr[EntityId] = js.undefined
  
  /**
    * The type of the ML object from which tags were deleted.
    */
  var ResourceType: js.UndefOr[TaggableResourceType] = js.undefined
}
object DeleteTagsOutput {
  
  inline def apply(): DeleteTagsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTagsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTagsOutput] (val x: Self) extends AnyVal {
    
    inline def setResourceId(value: EntityId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: TaggableResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
