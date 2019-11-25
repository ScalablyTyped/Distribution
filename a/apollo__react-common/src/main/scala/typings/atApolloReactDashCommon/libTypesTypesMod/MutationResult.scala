package typings.atApolloReactDashCommon.libTypesTypesMod

import typings.apolloDashClient.apolloDashClientMod.ApolloError
import typings.apolloDashClient.apolloDashClientMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationResult[TData] extends js.Object {
  var called: Boolean
  var client: js.UndefOr[default[js.Object]] = js.undefined
  var data: js.UndefOr[TData] = js.undefined
  var error: js.UndefOr[ApolloError] = js.undefined
  var loading: Boolean
}

object MutationResult {
  @scala.inline
  def apply[TData](
    called: Boolean,
    loading: Boolean,
    client: default[js.Object] = null,
    data: TData = null,
    error: ApolloError = null
  ): MutationResult[TData] = {
    val __obj = js.Dynamic.literal(called = called.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult[TData]]
  }
}

