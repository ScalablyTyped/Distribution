package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserDefinedFunctionRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the function to be retrieved is located. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the catalog database where the function is located.
    */
  var DatabaseName: NameString = js.native
  /**
    * The name of the function.
    */
  var FunctionName: NameString = js.native
}

object GetUserDefinedFunctionRequest {
  @scala.inline
  def apply(DatabaseName: NameString, FunctionName: NameString, CatalogId: CatalogIdString = null): GetUserDefinedFunctionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserDefinedFunctionRequest]
  }
}

