package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBackupsRequest extends js.Object {
  /**
    * Describes a single backup. 
    */
  var BackupId: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.BackupId] = js.native
  /**
    * This is not currently implemented for DescribeBackups requests.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.MaxResults] = js.native
  /**
    * This is not currently implemented for DescribeBackups requests.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.NextToken] = js.native
  /**
    * Returns backups for the server with the specified ServerName. 
    */
  var ServerName: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.ServerName] = js.native
}

object DescribeBackupsRequest {
  @scala.inline
  def apply(
    BackupId: BackupId = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    ServerName: ServerName = null
  ): DescribeBackupsRequest = {
    val __obj = js.Dynamic.literal()
    if (BackupId != null) __obj.updateDynamic("BackupId")(BackupId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ServerName != null) __obj.updateDynamic("ServerName")(ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBackupsRequest]
  }
}

