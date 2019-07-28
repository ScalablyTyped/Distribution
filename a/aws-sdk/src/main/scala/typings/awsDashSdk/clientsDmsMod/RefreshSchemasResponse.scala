package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshSchemasResponse extends js.Object {
  /**
    * The status of the refreshed schema.
    */
  var RefreshSchemasStatus: js.UndefOr[typings.awsDashSdk.clientsDmsMod.RefreshSchemasStatus] = js.undefined
}

object RefreshSchemasResponse {
  @scala.inline
  def apply(RefreshSchemasStatus: RefreshSchemasStatus = null): RefreshSchemasResponse = {
    val __obj = js.Dynamic.literal()
    if (RefreshSchemasStatus != null) __obj.updateDynamic("RefreshSchemasStatus")(RefreshSchemasStatus)
    __obj.asInstanceOf[RefreshSchemasResponse]
  }
}

