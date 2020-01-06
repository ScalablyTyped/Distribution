package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchSchemasRequest extends js.Object {
  var Keywords: __string = js.native
  var Limit: js.UndefOr[__integer] = js.native
  var NextToken: js.UndefOr[__string] = js.native
  var RegistryName: __string = js.native
}

object SearchSchemasRequest {
  @scala.inline
  def apply(Keywords: __string, RegistryName: __string, Limit: Int | Double = null, NextToken: __string = null): SearchSchemasRequest = {
    val __obj = js.Dynamic.literal(Keywords = Keywords.asInstanceOf[js.Any], RegistryName = RegistryName.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSchemasRequest]
  }
}

