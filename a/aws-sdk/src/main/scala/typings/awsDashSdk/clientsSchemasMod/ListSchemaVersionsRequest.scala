package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSchemaVersionsRequest extends js.Object {
  var Limit: js.UndefOr[__integer] = js.native
  var NextToken: js.UndefOr[__string] = js.native
  var RegistryName: __string = js.native
  var SchemaName: __string = js.native
}

object ListSchemaVersionsRequest {
  @scala.inline
  def apply(
    RegistryName: __string,
    SchemaName: __string,
    Limit: Int | Double = null,
    NextToken: __string = null
  ): ListSchemaVersionsRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemaVersionsRequest]
  }
}

