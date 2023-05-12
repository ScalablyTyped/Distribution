package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterSnapshot extends StObject {
  
  /**
    * The name of the Elastic DocumentDB cluster administrator.
    */
  var adminUserName: String
  
  /**
    * The arn of the Elastic DocumentDB cluster.
    */
  var clusterArn: String
  
  /**
    * The time when the Elastic DocumentDB cluster was created in Universal Coordinated Time (UTC).
    */
  var clusterCreationTime: String
  
  /**
    * The KMS key identifier to use to encrypt the Elastic DocumentDB cluster.
    */
  var kmsKeyId: String
  
  /**
    * The arn of the Elastic DocumentDB snapshot
    */
  var snapshotArn: String
  
  /**
    * The time when the Elastic DocumentDB snapshot was created in Universal Coordinated Time (UTC).
    */
  var snapshotCreationTime: String
  
  /**
    * The name of the Elastic DocumentDB snapshot.
    */
  var snapshotName: String
  
  /**
    * The status of the Elastic DocumentDB snapshot.
    */
  var status: Status
  
  /**
    * A list of the IDs of subnets associated with the DB cluster snapshot.
    */
  var subnetIds: StringList
  
  /**
    * A list of the IDs of the VPC security groups associated with the cluster snapshot.
    */
  var vpcSecurityGroupIds: StringList
}
object ClusterSnapshot {
  
  inline def apply(
    adminUserName: String,
    clusterArn: String,
    clusterCreationTime: String,
    kmsKeyId: String,
    snapshotArn: String,
    snapshotCreationTime: String,
    snapshotName: String,
    status: Status,
    subnetIds: StringList,
    vpcSecurityGroupIds: StringList
  ): ClusterSnapshot = {
    val __obj = js.Dynamic.literal(adminUserName = adminUserName.asInstanceOf[js.Any], clusterArn = clusterArn.asInstanceOf[js.Any], clusterCreationTime = clusterCreationTime.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], snapshotArn = snapshotArn.asInstanceOf[js.Any], snapshotCreationTime = snapshotCreationTime.asInstanceOf[js.Any], snapshotName = snapshotName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcSecurityGroupIds = vpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterSnapshot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterSnapshot] (val x: Self) extends AnyVal {
    
    inline def setAdminUserName(value: String): Self = StObject.set(x, "adminUserName", value.asInstanceOf[js.Any])
    
    inline def setClusterArn(value: String): Self = StObject.set(x, "clusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterCreationTime(value: String): Self = StObject.set(x, "clusterCreationTime", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotArn(value: String): Self = StObject.set(x, "snapshotArn", value.asInstanceOf[js.Any])
    
    inline def setSnapshotCreationTime(value: String): Self = StObject.set(x, "snapshotCreationTime", value.asInstanceOf[js.Any])
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubnetIds(value: StringList): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value*))
    
    inline def setVpcSecurityGroupIds(value: StringList): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value*))
  }
}
