package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ACL extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the ACL
    */
  var ARN: js.UndefOr[String] = js.undefined
  
  /**
    * A list of clusters associated with the ACL.
    */
  var Clusters: js.UndefOr[ACLClusterNameList] = js.undefined
  
  /**
    * The minimum engine version supported for the ACL
    */
  var MinimumEngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Access Control List
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * A list of updates being applied to the ACL.
    */
  var PendingChanges: js.UndefOr[ACLPendingChanges] = js.undefined
  
  /**
    * Indicates ACL status. Can be "creating", "active", "modifying", "deleting".
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The list of user names that belong to the ACL.
    */
  var UserNames: js.UndefOr[UserNameList] = js.undefined
}
object ACL {
  
  inline def apply(): ACL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ACL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ACL] (val x: Self) extends AnyVal {
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setClusters(value: ACLClusterNameList): Self = StObject.set(x, "Clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersUndefined: Self = StObject.set(x, "Clusters", js.undefined)
    
    inline def setClustersVarargs(value: String*): Self = StObject.set(x, "Clusters", js.Array(value*))
    
    inline def setMinimumEngineVersion(value: String): Self = StObject.set(x, "MinimumEngineVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumEngineVersionUndefined: Self = StObject.set(x, "MinimumEngineVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPendingChanges(value: ACLPendingChanges): Self = StObject.set(x, "PendingChanges", value.asInstanceOf[js.Any])
    
    inline def setPendingChangesUndefined: Self = StObject.set(x, "PendingChanges", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUserNames(value: UserNameList): Self = StObject.set(x, "UserNames", value.asInstanceOf[js.Any])
    
    inline def setUserNamesUndefined: Self = StObject.set(x, "UserNames", js.undefined)
    
    inline def setUserNamesVarargs(value: UserName*): Self = StObject.set(x, "UserNames", js.Array(value*))
  }
}
