package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserDefinedFunctionRequest extends js.Object {
  /**
    * The ID of the Data Catalog in which to create the function. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The name of the catalog database in which to create the function.
    */
  var DatabaseName: NameString
  /**
    * A FunctionInput object that defines the function to create in the Data Catalog.
    */
  var FunctionInput: UserDefinedFunctionInput
}

object CreateUserDefinedFunctionRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    FunctionInput: UserDefinedFunctionInput,
    CatalogId: CatalogIdString = null
  ): CreateUserDefinedFunctionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, FunctionInput = FunctionInput)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[CreateUserDefinedFunctionRequest]
  }
}

