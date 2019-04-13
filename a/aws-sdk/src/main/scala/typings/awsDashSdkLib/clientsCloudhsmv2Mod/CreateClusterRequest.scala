package typings
package awsDashSdkLib.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClusterRequest extends js.Object {
  /**
    * The type of HSM to use in the cluster. Currently the only allowed value is hsm1.medium.
    */
  var HsmType: awsDashSdkLib.clientsCloudhsmv2Mod.HsmType
  /**
    * The identifier (ID) of the cluster backup to restore. Use this value to restore the cluster from a backup instead of creating a new cluster. To find the backup ID, use DescribeBackups.
    */
  var SourceBackupId: js.UndefOr[BackupId] = js.undefined
  /**
    * The identifiers (IDs) of the subnets where you are creating the cluster. You must specify at least one subnet. If you specify multiple subnets, they must meet the following criteria:   All subnets must be in the same virtual private cloud (VPC).   You can specify only one subnet per Availability Zone.  
    */
  var SubnetIds: awsDashSdkLib.clientsCloudhsmv2Mod.SubnetIds
}

object CreateClusterRequest {
  @scala.inline
  def apply(HsmType: HsmType, SubnetIds: SubnetIds, SourceBackupId: BackupId = null): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(HsmType = HsmType, SubnetIds = SubnetIds)
    if (SourceBackupId != null) __obj.updateDynamic("SourceBackupId")(SourceBackupId)
    __obj.asInstanceOf[CreateClusterRequest]
  }
}

