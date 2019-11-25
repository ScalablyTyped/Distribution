package typings.atApolloReactDashCommon.libContextApolloContextMod

import typings.apolloDashClient.apolloDashClientMod.default
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloContextValue extends js.Object {
  var client: js.UndefOr[default[js.Object]] = js.undefined
  var renderPromises: js.UndefOr[Record[_, _]] = js.undefined
}

object ApolloContextValue {
  @scala.inline
  def apply(client: default[js.Object] = null, renderPromises: Record[_, _] = null): ApolloContextValue = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (renderPromises != null) __obj.updateDynamic("renderPromises")(renderPromises.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloContextValue]
  }
}

