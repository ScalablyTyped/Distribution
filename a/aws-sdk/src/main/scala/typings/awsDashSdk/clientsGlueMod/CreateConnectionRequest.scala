package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConnectionRequest extends js.Object {
  /**
    * The ID of the Data Catalog in which to create the connection. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * A ConnectionInput object defining the connection to create.
    */
  var ConnectionInput: typings.awsDashSdk.clientsGlueMod.ConnectionInput
}

object CreateConnectionRequest {
  @scala.inline
  def apply(ConnectionInput: ConnectionInput, CatalogId: CatalogIdString = null): CreateConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionInput = ConnectionInput)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[CreateConnectionRequest]
  }
}

