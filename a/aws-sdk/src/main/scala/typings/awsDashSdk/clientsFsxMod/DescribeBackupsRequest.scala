package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBackupsRequest extends js.Object {
  /**
    * (Optional) IDs of the backups you want to retrieve (String). This overrides any filters. If any IDs are not found, BackupNotFound will be thrown.
    */
  var BackupIds: js.UndefOr[typings.awsDashSdk.clientsFsxMod.BackupIds] = js.native
  /**
    * (Optional) Filters structure. Supported names are file-system-id and backup-type.
    */
  var Filters: js.UndefOr[typings.awsDashSdk.clientsFsxMod.Filters] = js.native
  /**
    * (Optional) Maximum number of backups to return in the response (integer). This parameter value must be greater than 0. The number of items that Amazon FSx returns is the minimum of the MaxResults parameter specified in the request and the service's internal maximum number of items per page.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsFsxMod.MaxResults] = js.native
  /**
    * (Optional) Opaque pagination token returned from a previous DescribeBackups operation (String). If a token present, the action continues the list from where the returning call left off.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsFsxMod.NextToken] = js.native
}

object DescribeBackupsRequest {
  @scala.inline
  def apply(
    BackupIds: BackupIds = null,
    Filters: Filters = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): DescribeBackupsRequest = {
    val __obj = js.Dynamic.literal()
    if (BackupIds != null) __obj.updateDynamic("BackupIds")(BackupIds.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBackupsRequest]
  }
}

