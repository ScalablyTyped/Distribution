package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConnectionRequest extends js.Object {
  /**
    * The ID of the Data Catalog in which to create the connection. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * A ConnectionInput object defining the connection to create.
    */
  var ConnectionInput: typings.awsDashSdk.clientsGlueMod.ConnectionInput = js.native
}

object CreateConnectionRequest {
  @scala.inline
  def apply(ConnectionInput: ConnectionInput, CatalogId: CatalogIdString = null): CreateConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionInput = ConnectionInput.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionRequest]
  }
}

