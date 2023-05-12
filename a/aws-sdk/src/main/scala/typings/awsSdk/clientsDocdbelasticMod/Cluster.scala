package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  /**
    * The name of the Elastic DocumentDB cluster administrator.
    */
  var adminUserName: String
  
  /**
    * The authentication type for the Elastic DocumentDB cluster.
    */
  var authType: Auth
  
  /**
    * The arn of the Elastic DocumentDB cluster.
    */
  var clusterArn: String
  
  /**
    * The URL used to connect to the Elastic DocumentDB cluster.
    */
  var clusterEndpoint: String
  
  /**
    * The name of the Elastic DocumentDB cluster.
    */
  var clusterName: String
  
  /**
    * The time when the Elastic DocumentDB cluster was created in Universal Coordinated Time (UTC).
    */
  var createTime: String
  
  /**
    * The KMS key identifier to use to encrypt the Elastic DocumentDB cluster.
    */
  var kmsKeyId: String
  
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).  Format: ddd:hh24:mi-ddd:hh24:mi 
    */
  var preferredMaintenanceWindow: String
  
  /**
    * The capacity of each shard in the Elastic DocumentDB cluster.
    */
  var shardCapacity: Integer
  
  /**
    * The number of shards in the Elastic DocumentDB cluster.
    */
  var shardCount: Integer
  
  /**
    * The status of the Elastic DocumentDB cluster.
    */
  var status: Status
  
  /**
    * The Amazon EC2 subnet IDs for the Elastic DocumentDB cluster.
    */
  var subnetIds: StringList
  
  /**
    * A list of EC2 VPC security groups associated with this cluster.
    */
  var vpcSecurityGroupIds: StringList
}
object Cluster {
  
  inline def apply(
    adminUserName: String,
    authType: Auth,
    clusterArn: String,
    clusterEndpoint: String,
    clusterName: String,
    createTime: String,
    kmsKeyId: String,
    preferredMaintenanceWindow: String,
    shardCapacity: Integer,
    shardCount: Integer,
    status: Status,
    subnetIds: StringList,
    vpcSecurityGroupIds: StringList
  ): Cluster = {
    val __obj = js.Dynamic.literal(adminUserName = adminUserName.asInstanceOf[js.Any], authType = authType.asInstanceOf[js.Any], clusterArn = clusterArn.asInstanceOf[js.Any], clusterEndpoint = clusterEndpoint.asInstanceOf[js.Any], clusterName = clusterName.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], preferredMaintenanceWindow = preferredMaintenanceWindow.asInstanceOf[js.Any], shardCapacity = shardCapacity.asInstanceOf[js.Any], shardCount = shardCount.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcSecurityGroupIds = vpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cluster]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cluster] (val x: Self) extends AnyVal {
    
    inline def setAdminUserName(value: String): Self = StObject.set(x, "adminUserName", value.asInstanceOf[js.Any])
    
    inline def setAuthType(value: Auth): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    inline def setClusterArn(value: String): Self = StObject.set(x, "clusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterEndpoint(value: String): Self = StObject.set(x, "clusterEndpoint", value.asInstanceOf[js.Any])
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setShardCapacity(value: Integer): Self = StObject.set(x, "shardCapacity", value.asInstanceOf[js.Any])
    
    inline def setShardCount(value: Integer): Self = StObject.set(x, "shardCount", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubnetIds(value: StringList): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value*))
    
    inline def setVpcSecurityGroupIds(value: StringList): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value*))
  }
}
