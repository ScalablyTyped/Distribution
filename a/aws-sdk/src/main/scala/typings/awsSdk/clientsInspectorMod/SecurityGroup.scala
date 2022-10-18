package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGroup extends StObject {
  
  /**
    * The ID of the security group.
    */
  var groupId: js.UndefOr[Text] = js.undefined
  
  /**
    * The name of the security group.
    */
  var groupName: js.UndefOr[Text] = js.undefined
}
object SecurityGroup {
  
  inline def apply(): SecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroup]
  }
  
  extension [Self <: SecurityGroup](x: Self) {
    
    inline def setGroupId(value: Text): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setGroupName(value: Text): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
  }
}
