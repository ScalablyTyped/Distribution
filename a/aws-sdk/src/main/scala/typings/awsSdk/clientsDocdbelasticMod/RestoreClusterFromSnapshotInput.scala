package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreClusterFromSnapshotInput extends StObject {
  
  /**
    * The name of the Elastic DocumentDB cluster.
    */
  var clusterName: String
  
  /**
    * The KMS key identifier to use to encrypt the new Elastic DocumentDB cluster. The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias instead of the ARN as the KMS encryption key. If an encryption key is not specified here, Elastic DocumentDB uses the default encryption key that KMS creates for your account. Your account has a different default encryption key for each Amazon Region.
    */
  var kmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The arn of the Elastic DocumentDB snapshot.
    */
  var snapshotArn: String
  
  /**
    * The Amazon EC2 subnet IDs for the Elastic DocumentDB cluster.
    */
  var subnetIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * A list of the tag names to be assigned to the restored DB cluster, in the form of an array of key-value pairs in which the key is the tag name and the value is the key value.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * A list of EC2 VPC security groups to associate with the Elastic DocumentDB cluster.
    */
  var vpcSecurityGroupIds: js.UndefOr[StringList] = js.undefined
}
object RestoreClusterFromSnapshotInput {
  
  inline def apply(clusterName: String, snapshotArn: String): RestoreClusterFromSnapshotInput = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], snapshotArn = snapshotArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreClusterFromSnapshotInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreClusterFromSnapshotInput] (val x: Self) extends AnyVal {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setSnapshotArn(value: String): Self = StObject.set(x, "snapshotArn", value.asInstanceOf[js.Any])
    
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
