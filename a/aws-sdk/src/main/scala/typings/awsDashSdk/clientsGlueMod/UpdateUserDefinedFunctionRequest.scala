package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserDefinedFunctionRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the function to be updated is located. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the catalog database where the function to be updated is located.
    */
  var DatabaseName: NameString = js.native
  /**
    * A FunctionInput object that redefines the function in the Data Catalog.
    */
  var FunctionInput: UserDefinedFunctionInput = js.native
  /**
    * The name of the function.
    */
  var FunctionName: NameString = js.native
}

object UpdateUserDefinedFunctionRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    FunctionInput: UserDefinedFunctionInput,
    FunctionName: NameString,
    CatalogId: CatalogIdString = null
  ): UpdateUserDefinedFunctionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], FunctionInput = FunctionInput.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserDefinedFunctionRequest]
  }
}

