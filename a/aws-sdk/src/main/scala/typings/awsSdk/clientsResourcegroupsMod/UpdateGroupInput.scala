package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGroupInput extends StObject {
  
  /**
    * The new description that you want to update the resource group with. Descriptions can contain letters, numbers, hyphens, underscores, periods, and spaces.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.Description] = js.undefined
  
  /**
    * The name or the ARN of the resource group to modify.
    */
  var Group: js.UndefOr[GroupString] = js.undefined
  
  /**
    * Don't use this parameter. Use Group instead.
    */
  var GroupName: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.GroupName] = js.undefined
}
object UpdateGroupInput {
  
  inline def apply(): UpdateGroupInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGroupInput]
  }
  
  extension [Self <: UpdateGroupInput](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGroup(value: GroupString): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
