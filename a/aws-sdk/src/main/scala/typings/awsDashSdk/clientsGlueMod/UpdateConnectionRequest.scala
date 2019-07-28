package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConnectionRequest extends js.Object {
  /**
    * The ID of the Data Catalog in which the connection resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * A ConnectionInput object that redefines the connection in question.
    */
  var ConnectionInput: typings.awsDashSdk.clientsGlueMod.ConnectionInput
  /**
    * The name of the connection definition to update.
    */
  var Name: NameString
}

object UpdateConnectionRequest {
  @scala.inline
  def apply(ConnectionInput: ConnectionInput, Name: NameString, CatalogId: CatalogIdString = null): UpdateConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionInput = ConnectionInput, Name = Name)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[UpdateConnectionRequest]
  }
}

