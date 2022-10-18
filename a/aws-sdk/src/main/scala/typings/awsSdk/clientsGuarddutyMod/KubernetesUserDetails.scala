package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KubernetesUserDetails extends StObject {
  
  /**
    * The groups that include the user who called the Kubernetes API.
    */
  var Groups: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Groups] = js.undefined
  
  /**
    * The user ID of the user who called the Kubernetes API.
    */
  var Uid: js.UndefOr[String] = js.undefined
  
  /**
    * The username of the user who called the Kubernetes API.
    */
  var Username: js.UndefOr[String] = js.undefined
}
object KubernetesUserDetails {
  
  inline def apply(): KubernetesUserDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KubernetesUserDetails]
  }
  
  extension [Self <: KubernetesUserDetails](x: Self) {
    
    inline def setGroups(value: Groups): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setUid(value: String): Self = StObject.set(x, "Uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "Uid", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
