package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectionRequest extends js.Object {
  /**
    * The ID of the Data Catalog in which the connection resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * Allows you to retrieve the connection metadata without returning the password. For instance, the AWS Glue console uses this flag to retrieve the connection, and does not display the password. Set this parameter when the caller might not have permission to use the AWS KMS key to decrypt the password, but it does have permission to access the rest of the connection properties.
    */
  var HidePassword: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the connection definition to retrieve.
    */
  var Name: NameString
}

object GetConnectionRequest {
  @scala.inline
  def apply(
    Name: NameString,
    CatalogId: CatalogIdString = null,
    HidePassword: js.UndefOr[scala.Boolean] = js.undefined
  ): GetConnectionRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    if (!js.isUndefined(HidePassword)) __obj.updateDynamic("HidePassword")(HidePassword)
    __obj.asInstanceOf[GetConnectionRequest]
  }
}

