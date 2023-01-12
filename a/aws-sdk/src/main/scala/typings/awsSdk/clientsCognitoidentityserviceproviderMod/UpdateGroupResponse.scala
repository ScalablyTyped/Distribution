package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGroupResponse extends StObject {
  
  /**
    * The group object for the group.
    */
  var Group: js.UndefOr[GroupType] = js.undefined
}
object UpdateGroupResponse {
  
  inline def apply(): UpdateGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: GroupType): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
