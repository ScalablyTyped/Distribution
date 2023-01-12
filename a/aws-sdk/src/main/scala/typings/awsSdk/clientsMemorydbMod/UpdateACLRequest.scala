package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateACLRequest extends StObject {
  
  /**
    * The name of the Access Control List
    */
  var ACLName: String
  
  /**
    * The list of users to add to the Access Control List
    */
  var UserNamesToAdd: js.UndefOr[UserNameListInput] = js.undefined
  
  /**
    * The list of users to remove from the Access Control List
    */
  var UserNamesToRemove: js.UndefOr[UserNameListInput] = js.undefined
}
object UpdateACLRequest {
  
  inline def apply(ACLName: String): UpdateACLRequest = {
    val __obj = js.Dynamic.literal(ACLName = ACLName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateACLRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateACLRequest] (val x: Self) extends AnyVal {
    
    inline def setACLName(value: String): Self = StObject.set(x, "ACLName", value.asInstanceOf[js.Any])
    
    inline def setUserNamesToAdd(value: UserNameListInput): Self = StObject.set(x, "UserNamesToAdd", value.asInstanceOf[js.Any])
    
    inline def setUserNamesToAddUndefined: Self = StObject.set(x, "UserNamesToAdd", js.undefined)
    
    inline def setUserNamesToAddVarargs(value: UserName*): Self = StObject.set(x, "UserNamesToAdd", js.Array(value*))
    
    inline def setUserNamesToRemove(value: UserNameListInput): Self = StObject.set(x, "UserNamesToRemove", value.asInstanceOf[js.Any])
    
    inline def setUserNamesToRemoveUndefined: Self = StObject.set(x, "UserNamesToRemove", js.undefined)
    
    inline def setUserNamesToRemoveVarargs(value: UserName*): Self = StObject.set(x, "UserNamesToRemove", js.Array(value*))
  }
}
