package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupInput extends StObject {
  
  /**
    * The name or the ARN of the resource group to retrieve.
    */
  var Group: js.UndefOr[GroupString] = js.undefined
  
  /**
    * Deprecated - don't use this parameter. Use Group instead.
    */
  var GroupName: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.GroupName] = js.undefined
}
object GetGroupInput {
  
  inline def apply(): GetGroupInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGroupInput] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: GroupString): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
