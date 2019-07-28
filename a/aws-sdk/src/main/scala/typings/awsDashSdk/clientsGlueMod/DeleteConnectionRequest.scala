package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteConnectionRequest extends js.Object {
  /**
    * The ID of the Data Catalog in which the connection resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The name of the connection to delete.
    */
  var ConnectionName: NameString
}

object DeleteConnectionRequest {
  @scala.inline
  def apply(ConnectionName: NameString, CatalogId: CatalogIdString = null): DeleteConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionName = ConnectionName)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[DeleteConnectionRequest]
  }
}

