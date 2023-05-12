package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateClusterInput extends StObject {
  
  /**
    * The password for the Elastic DocumentDB cluster administrator. This password can contain any printable ASCII character except forward slash (/), double quote ("), or the "at" symbol (@).  Constraints: Must contain from 8 to 100 characters.
    */
  var adminUserPassword: js.UndefOr[Password] = js.undefined
  
  /**
    * The authentication type for the Elastic DocumentDB cluster.
    */
  var authType: js.UndefOr[Auth] = js.undefined
  
  /**
    * The client token for the Elastic DocumentDB cluster.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The arn of the Elastic DocumentDB cluster.
    */
  var clusterArn: String
  
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).  Format: ddd:hh24:mi-ddd:hh24:mi   Default: a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services Region, occurring on a random day of the week.  Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun  Constraints: Minimum 30-minute window.
    */
  var preferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The capacity of each shard in the Elastic DocumentDB cluster.
    */
  var shardCapacity: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of shards to create in the Elastic DocumentDB cluster.
    */
  var shardCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of shards to create in the Elastic DocumentDB cluster.
    */
  var subnetIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * A list of EC2 VPC security groups to associate with the new Elastic DocumentDB cluster.
    */
  var vpcSecurityGroupIds: js.UndefOr[StringList] = js.undefined
}
object UpdateClusterInput {
  
  inline def apply(clusterArn: String): UpdateClusterInput = {
    val __obj = js.Dynamic.literal(clusterArn = clusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateClusterInput] (val x: Self) extends AnyVal {
    
    inline def setAdminUserPassword(value: Password): Self = StObject.set(x, "adminUserPassword", value.asInstanceOf[js.Any])
    
    inline def setAdminUserPasswordUndefined: Self = StObject.set(x, "adminUserPassword", js.undefined)
    
    inline def setAuthType(value: Auth): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    inline def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setClusterArn(value: String): Self = StObject.set(x, "clusterArn", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "preferredMaintenanceWindow", js.undefined)
    
    inline def setShardCapacity(value: Integer): Self = StObject.set(x, "shardCapacity", value.asInstanceOf[js.Any])
    
    inline def setShardCapacityUndefined: Self = StObject.set(x, "shardCapacity", js.undefined)
    
    inline def setShardCount(value: Integer): Self = StObject.set(x, "shardCount", value.asInstanceOf[js.Any])
    
    inline def setShardCountUndefined: Self = StObject.set(x, "shardCount", js.undefined)
    
    inline def setSubnetIds(value: StringList): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value*))
    
    inline def setVpcSecurityGroupIds(value: StringList): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
    
    inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value*))
  }
}
