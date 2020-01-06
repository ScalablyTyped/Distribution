package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterRequest extends js.Object {
  /**
    * The type of HSM to use in the cluster. Currently the only allowed value is hsm1.medium.
    */
  var HsmType: typings.awsDashSdk.clientsCloudhsmv2Mod.HsmType = js.native
  /**
    * The identifier (ID) of the cluster backup to restore. Use this value to restore the cluster from a backup instead of creating a new cluster. To find the backup ID, use DescribeBackups.
    */
  var SourceBackupId: js.UndefOr[BackupId] = js.native
  /**
    * The identifiers (IDs) of the subnets where you are creating the cluster. You must specify at least one subnet. If you specify multiple subnets, they must meet the following criteria:   All subnets must be in the same virtual private cloud (VPC).   You can specify only one subnet per Availability Zone.  
    */
  var SubnetIds: typings.awsDashSdk.clientsCloudhsmv2Mod.SubnetIds = js.native
}

object CreateClusterRequest {
  @scala.inline
  def apply(HsmType: HsmType, SubnetIds: SubnetIds, SourceBackupId: BackupId = null): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(HsmType = HsmType.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    if (SourceBackupId != null) __obj.updateDynamic("SourceBackupId")(SourceBackupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterRequest]
  }
}

