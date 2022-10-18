package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupResponse extends StObject {
  
  /**
    * The group object for the group.
    */
  var Group: js.UndefOr[GroupType] = js.undefined
}
object GetGroupResponse {
  
  inline def apply(): GetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupResponse]
  }
  
  extension [Self <: GetGroupResponse](x: Self) {
    
    inline def setGroup(value: GroupType): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
