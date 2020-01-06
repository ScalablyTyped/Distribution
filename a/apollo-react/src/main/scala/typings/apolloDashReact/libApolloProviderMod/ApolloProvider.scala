package typings.apolloDashReact.libApolloProviderMod

import typings.apolloDashReact.Anon_ClientStore
import typings.react.reactMod.Component
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloProvider
  extends Component[ProviderProps, js.Any, js.Any] {
  var client: typings.apolloDashClient.apolloDashClientMod.default[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for TCacheShape */ _
  ] = js.native
  var store: Store[_, AnyAction] = js.native
  def getChildContext(): Anon_ClientStore = js.native
}

