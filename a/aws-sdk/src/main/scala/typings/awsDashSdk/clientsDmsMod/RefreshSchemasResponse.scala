package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshSchemasResponse extends js.Object {
  /**
    * The status of the refreshed schema.
    */
  var RefreshSchemasStatus: js.UndefOr[typings.awsDashSdk.clientsDmsMod.RefreshSchemasStatus] = js.native
}

object RefreshSchemasResponse {
  @scala.inline
  def apply(RefreshSchemasStatus: RefreshSchemasStatus = null): RefreshSchemasResponse = {
    val __obj = js.Dynamic.literal()
    if (RefreshSchemasStatus != null) __obj.updateDynamic("RefreshSchemasStatus")(RefreshSchemasStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshSchemasResponse]
  }
}

