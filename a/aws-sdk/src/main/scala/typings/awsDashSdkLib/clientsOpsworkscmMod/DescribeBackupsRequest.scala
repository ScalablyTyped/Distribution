package typings
package awsDashSdkLib.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBackupsRequest extends js.Object {
  /**
    * Describes a single backup. 
    */
  var BackupId: js.UndefOr[BackupId] = js.undefined
  /**
    * This is not currently implemented for DescribeBackups requests.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * This is not currently implemented for DescribeBackups requests.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Returns backups for the server with the specified ServerName. 
    */
  var ServerName: js.UndefOr[ServerName] = js.undefined
}

object DescribeBackupsRequest {
  @scala.inline
  def apply(
    BackupId: BackupId = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    ServerName: ServerName = null
  ): DescribeBackupsRequest = {
    val __obj = js.Dynamic.literal()
    if (BackupId != null) __obj.updateDynamic("BackupId")(BackupId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ServerName != null) __obj.updateDynamic("ServerName")(ServerName)
    __obj.asInstanceOf[DescribeBackupsRequest]
  }
}

