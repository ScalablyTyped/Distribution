package typings.apolloReactCommon.apolloProviderMod

import typings.apolloClient.mod.default
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloProviderProps[TCache] extends js.Object {
  var children: ReactNode | js.Array[ReactNode] | Null
  var client: default[TCache]
}

object ApolloProviderProps {
  @scala.inline
  def apply[TCache](client: default[TCache], children: ReactNode | js.Array[ReactNode] = null): ApolloProviderProps[TCache] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloProviderProps[TCache]]
  }
}

