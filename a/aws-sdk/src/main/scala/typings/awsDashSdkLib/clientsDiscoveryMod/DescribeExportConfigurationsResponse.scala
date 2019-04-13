package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeExportConfigurationsResponse extends js.Object {
  /**
    * 
    */
  var exportsInfo: js.UndefOr[ExportsInfo] = js.undefined
  /**
    * The token from the previous call to describe-export-tasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeExportConfigurationsResponse {
  @scala.inline
  def apply(exportsInfo: ExportsInfo = null, nextToken: NextToken = null): DescribeExportConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (exportsInfo != null) __obj.updateDynamic("exportsInfo")(exportsInfo)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeExportConfigurationsResponse]
  }
}

