package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterInput extends StObject {
  
  /**
    * The name of the Elastic DocumentDB cluster administrator.  Constraints:   Must be from 1 to 63 letters or numbers.   The first character must be a letter.   Cannot be a reserved word.  
    */
  var adminUserName: String
  
  /**
    * The password for the Elastic DocumentDB cluster administrator and can contain any printable ASCII characters.  Constraints:   Must contain from 8 to 100 characters.   Cannot contain a forward slash (/), double quote ("), or the "at" symbol (@).  
    */
  var adminUserPassword: Password
  
  /**
    * The authentication type for the Elastic DocumentDB cluster.
    */
  var authType: Auth
  
  /**
    * The client token for the Elastic DocumentDB cluster.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the new Elastic DocumentDB cluster. This parameter is stored as a lowercase string.  Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.    Example: my-cluster 
    */
  var clusterName: String
  
  /**
    * The KMS key identifier to use to encrypt the new Elastic DocumentDB cluster. The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias instead of the ARN as the KMS encryption key. If an encryption key is not specified, Elastic DocumentDB uses the default encryption key that KMS creates for your account. Your account has a different default encryption key for each Amazon Region.
    */
  var kmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).  Format: ddd:hh24:mi-ddd:hh24:mi   Default: a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services Region, occurring on a random day of the week.  Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun  Constraints: Minimum 30-minute window.
    */
  var preferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The capacity of each shard in the new Elastic DocumentDB cluster.
    */
  var shardCapacity: Integer
  
  /**
    * The number of shards to create in the new Elastic DocumentDB cluster.
    */
  var shardCount: Integer
  
  /**
    * The Amazon EC2 subnet IDs for the new Elastic DocumentDB cluster.
    */
  var subnetIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * The tags to be assigned to the new Elastic DocumentDB cluster.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * A list of EC2 VPC security groups to associate with the new Elastic DocumentDB cluster.
    */
  var vpcSecurityGroupIds: js.UndefOr[StringList] = js.undefined
}
object CreateClusterInput {
  
  inline def apply(
    adminUserName: String,
    adminUserPassword: Password,
    authType: Auth,
    clusterName: String,
    shardCapacity: Integer,
    shardCount: Integer
  ): CreateClusterInput = {
    val __obj = js.Dynamic.literal(adminUserName = adminUserName.asInstanceOf[js.Any], adminUserPassword = adminUserPassword.asInstanceOf[js.Any], authType = authType.asInstanceOf[js.Any], clusterName = clusterName.asInstanceOf[js.Any], shardCapacity = shardCapacity.asInstanceOf[js.Any], shardCount = shardCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateClusterInput] (val x: Self) extends AnyVal {
    
    inline def setAdminUserName(value: String): Self = StObject.set(x, "adminUserName", value.asInstanceOf[js.Any])
    
    inline def setAdminUserPassword(value: Password): Self = StObject.set(x, "adminUserPassword", value.asInstanceOf[js.Any])
    
    inline def setAuthType(value: Auth): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "preferredMaintenanceWindow", js.undefined)
    
    inline def setShardCapacity(value: Integer): Self = StObject.set(x, "shardCapacity", value.asInstanceOf[js.Any])
    
    inline def setShardCount(value: Integer): Self = StObject.set(x, "shardCount", value.asInstanceOf[js.Any])
    
    inline def setSubnetIds(value: StringList): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setVpcSecurityGroupIds(value: StringList): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
    
    inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value*))
  }
}
