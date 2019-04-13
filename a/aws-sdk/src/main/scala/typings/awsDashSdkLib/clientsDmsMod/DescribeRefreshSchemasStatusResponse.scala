package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRefreshSchemasStatusResponse extends js.Object {
  /**
    * The status of the schema.
    */
  var RefreshSchemasStatus: js.UndefOr[RefreshSchemasStatus] = js.undefined
}

object DescribeRefreshSchemasStatusResponse {
  @scala.inline
  def apply(RefreshSchemasStatus: RefreshSchemasStatus = null): DescribeRefreshSchemasStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (RefreshSchemasStatus != null) __obj.updateDynamic("RefreshSchemasStatus")(RefreshSchemasStatus)
    __obj.asInstanceOf[DescribeRefreshSchemasStatusResponse]
  }
}

