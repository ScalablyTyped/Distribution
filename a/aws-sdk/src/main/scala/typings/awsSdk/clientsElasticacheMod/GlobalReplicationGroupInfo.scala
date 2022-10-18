package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalReplicationGroupInfo extends StObject {
  
  /**
    * The name of the Global datastore
    */
  var GlobalReplicationGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The role of the replication group in a Global datastore. Can be primary or secondary.
    */
  var GlobalReplicationGroupMemberRole: js.UndefOr[String] = js.undefined
}
object GlobalReplicationGroupInfo {
  
  inline def apply(): GlobalReplicationGroupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalReplicationGroupInfo]
  }
  
  extension [Self <: GlobalReplicationGroupInfo](x: Self) {
    
    inline def setGlobalReplicationGroupId(value: String): Self = StObject.set(x, "GlobalReplicationGroupId", value.asInstanceOf[js.Any])
    
    inline def setGlobalReplicationGroupIdUndefined: Self = StObject.set(x, "GlobalReplicationGroupId", js.undefined)
    
    inline def setGlobalReplicationGroupMemberRole(value: String): Self = StObject.set(x, "GlobalReplicationGroupMemberRole", value.asInstanceOf[js.Any])
    
    inline def setGlobalReplicationGroupMemberRoleUndefined: Self = StObject.set(x, "GlobalReplicationGroupMemberRole", js.undefined)
  }
}
