package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceSetSummary extends StObject {
  
  /**
    * A description of the resource set.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsFmsMod.Description] = js.undefined
  
  /**
    * A unique identifier for the resource set. This ID is returned in the responses to create and list commands. You provide it to operations like update and delete.
    */
  var Id: js.UndefOr[Base62Id] = js.undefined
  
  /**
    * The last time that the resource set was changed.
    */
  var LastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The descriptive name of the resource set. You can't change the name of a resource set after you create it.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsFmsMod.Name] = js.undefined
  
  /**
    * Indicates whether the resource set is in or out of an admin's Region scope.    ACTIVE - The administrator can manage and delete the resource set.    OUT_OF_ADMIN_SCOPE - The administrator can view the resource set, but they can't edit or delete the resource set. Existing protections stay in place. Any new resource that come into scope of the resource set won't be protected.  
    */
  var ResourceSetStatus: js.UndefOr[typings.awsSdk.clientsFmsMod.ResourceSetStatus] = js.undefined
}
object ResourceSetSummary {
  
  inline def apply(): ResourceSetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceSetSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceSetSummary] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: Base62Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResourceSetStatus(value: ResourceSetStatus): Self = StObject.set(x, "ResourceSetStatus", value.asInstanceOf[js.Any])
    
    inline def setResourceSetStatusUndefined: Self = StObject.set(x, "ResourceSetStatus", js.undefined)
  }
}
