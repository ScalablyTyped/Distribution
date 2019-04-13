package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserDefinedFunctionRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the function to be deleted is located. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The name of the catalog database where the function is located.
    */
  var DatabaseName: NameString
  /**
    * The name of the function definition to be deleted.
    */
  var FunctionName: NameString
}

object DeleteUserDefinedFunctionRequest {
  @scala.inline
  def apply(DatabaseName: NameString, FunctionName: NameString, CatalogId: CatalogIdString = null): DeleteUserDefinedFunctionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, FunctionName = FunctionName)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    __obj.asInstanceOf[DeleteUserDefinedFunctionRequest]
  }
}

