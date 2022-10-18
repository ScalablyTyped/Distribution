package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ACLPendingChanges extends StObject {
  
  /**
    * A list of users being added to the ACL
    */
  var UserNamesToAdd: js.UndefOr[UserNameList] = js.undefined
  
  /**
    * A list of user names being removed from the ACL
    */
  var UserNamesToRemove: js.UndefOr[UserNameList] = js.undefined
}
object ACLPendingChanges {
  
  inline def apply(): ACLPendingChanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ACLPendingChanges]
  }
  
  extension [Self <: ACLPendingChanges](x: Self) {
    
    inline def setUserNamesToAdd(value: UserNameList): Self = StObject.set(x, "UserNamesToAdd", value.asInstanceOf[js.Any])
    
    inline def setUserNamesToAddUndefined: Self = StObject.set(x, "UserNamesToAdd", js.undefined)
    
    inline def setUserNamesToAddVarargs(value: UserName*): Self = StObject.set(x, "UserNamesToAdd", js.Array(value*))
    
    inline def setUserNamesToRemove(value: UserNameList): Self = StObject.set(x, "UserNamesToRemove", value.asInstanceOf[js.Any])
    
    inline def setUserNamesToRemoveUndefined: Self = StObject.set(x, "UserNamesToRemove", js.undefined)
    
    inline def setUserNamesToRemoveVarargs(value: UserName*): Self = StObject.set(x, "UserNamesToRemove", js.Array(value*))
  }
}
