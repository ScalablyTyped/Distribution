package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSchemaExtensionsRequest extends js.Object {
  /**
    * The identifier of the directory from which to retrieve the schema extension information.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId
  /**
    * The maximum number of items to return.
    */
  var Limit: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.Limit] = js.undefined
  /**
    * The ListSchemaExtensions.NextToken value from a previous call to ListSchemaExtensions. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
}

object ListSchemaExtensionsRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, Limit: Int | Double = null, NextToken: NextToken = null): ListSchemaExtensionsRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListSchemaExtensionsRequest]
  }
}

