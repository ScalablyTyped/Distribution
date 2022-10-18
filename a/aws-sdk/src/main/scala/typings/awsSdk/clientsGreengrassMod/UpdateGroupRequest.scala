package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGroupRequest extends StObject {
  
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string
  
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[string] = js.undefined
}
object UpdateGroupRequest {
  
  inline def apply(GroupId: string): UpdateGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGroupRequest]
  }
  
  extension [Self <: UpdateGroupRequest](x: Self) {
    
    inline def setGroupId(value: string): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
