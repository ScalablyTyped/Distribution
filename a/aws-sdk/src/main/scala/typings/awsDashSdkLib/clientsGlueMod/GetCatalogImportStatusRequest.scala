package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCatalogImportStatusRequest extends js.Object {
  /**
    * The ID of the catalog to migrate. Currently, this should be the AWS account ID.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
}

object GetCatalogImportStatusRequest {
  @scala.inline
  def apply(CatalogId: CatalogIdString = null): GetCatalogImportStatusRequest = {
    val __obj = js.Dynamic.literal()
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[GetCatalogImportStatusRequest]
  }
}

