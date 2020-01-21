package typings.apolloReact.apolloProviderMod

import typings.apolloReact.AnonClientStore
import typings.react.mod.Component
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloProvider
  extends Component[ProviderProps, js.Any, js.Any] {
  var client: typings.apolloClient.mod.default[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for TCacheShape */ _
  ] = js.native
  var store: Store[_, AnyAction] = js.native
  def getChildContext(): AnonClientStore = js.native
}

