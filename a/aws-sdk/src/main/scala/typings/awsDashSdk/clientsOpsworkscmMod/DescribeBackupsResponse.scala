package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBackupsResponse extends js.Object {
  /**
    * Contains the response to a DescribeBackups request. 
    */
  var Backups: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.Backups] = js.native
  /**
    * This is not currently implemented for DescribeBackups requests.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeBackupsResponse {
  @scala.inline
  def apply(Backups: Backups = null, NextToken: String = null): DescribeBackupsResponse = {
    val __obj = js.Dynamic.literal()
    if (Backups != null) __obj.updateDynamic("Backups")(Backups.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBackupsResponse]
  }
}

