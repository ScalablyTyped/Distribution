package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserDefinedFunctionRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the function to be updated is located. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The name of the catalog database where the function to be updated is located.
    */
  var DatabaseName: NameString
  /**
    * A FunctionInput object that re-defines the function in the Data Catalog.
    */
  var FunctionInput: UserDefinedFunctionInput
  /**
    * The name of the function.
    */
  var FunctionName: NameString
}

object UpdateUserDefinedFunctionRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    FunctionInput: UserDefinedFunctionInput,
    FunctionName: NameString,
    CatalogId: CatalogIdString = null
  ): UpdateUserDefinedFunctionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, FunctionInput = FunctionInput, FunctionName = FunctionName)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[UpdateUserDefinedFunctionRequest]
  }
}

