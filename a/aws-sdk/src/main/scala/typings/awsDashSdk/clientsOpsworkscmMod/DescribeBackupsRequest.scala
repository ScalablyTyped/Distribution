package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBackupsRequest extends js.Object {
  /**
    * Describes a single backup. 
    */
  var BackupId: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.BackupId] = js.undefined
  /**
    * This is not currently implemented for DescribeBackups requests.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.MaxResults] = js.undefined
  /**
    * This is not currently implemented for DescribeBackups requests.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.NextToken] = js.undefined
  /**
    * Returns backups for the server with the specified ServerName. 
    */
  var ServerName: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.ServerName] = js.undefined
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
    if (BackupId != null) __obj.updateDynamic("BackupId")(BackupId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ServerName != null) __obj.updateDynamic("ServerName")(ServerName)
    __obj.asInstanceOf[DescribeBackupsRequest]
  }
}

