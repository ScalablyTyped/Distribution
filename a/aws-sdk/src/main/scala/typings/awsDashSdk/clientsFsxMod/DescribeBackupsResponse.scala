package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBackupsResponse extends js.Object {
  /**
    * Any array of backups.
    */
  var Backups: js.UndefOr[typings.awsDashSdk.clientsFsxMod.Backups] = js.undefined
  /**
    * This is present if there are more backups than returned in the response (String). You can use the NextToken value in the later request to fetch the backups. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsFsxMod.NextToken] = js.undefined
}

object DescribeBackupsResponse {
  @scala.inline
  def apply(Backups: Backups = null, NextToken: NextToken = null): DescribeBackupsResponse = {
    val __obj = js.Dynamic.literal()
    if (Backups != null) __obj.updateDynamic("Backups")(Backups)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeBackupsResponse]
  }
}

