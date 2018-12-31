package typings
package apolloDashReactLib.libApolloProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloProvider
  extends reactLib.reactMod.Component[ProviderProps, js.Any, js.Any] {
  var client: apolloDashClientLib.apolloDashClientMod.default[
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for TCacheShape */ _
  ] = js.native
  var store: reduxLib.reduxMod.Store[_, reduxLib.reduxMod.AnyAction] = js.native
  def getChildContext(): apolloDashReactLib.Anon_ClientStoreDefault = js.native
}

