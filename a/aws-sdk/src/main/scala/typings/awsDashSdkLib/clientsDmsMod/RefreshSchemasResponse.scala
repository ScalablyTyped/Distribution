package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshSchemasResponse extends js.Object {
  /**
    * The status of the refreshed schema.
    */
  var RefreshSchemasStatus: js.UndefOr[RefreshSchemasStatus] = js.undefined
}

object RefreshSchemasResponse {
  @scala.inline
  def apply(RefreshSchemasStatus: RefreshSchemasStatus = null): RefreshSchemasResponse = {
    val __obj = js.Dynamic.literal()
    if (RefreshSchemasStatus != null) __obj.updateDynamic("RefreshSchemasStatus")(RefreshSchemasStatus)
    __obj.asInstanceOf[RefreshSchemasResponse]
  }
}

