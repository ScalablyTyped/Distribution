package typings.apolloDashClient

import typings.apolloDashClient.coreObservableQueryMod.ObservableQuery
import typings.apolloDashClient.coreTypesMod.ApolloQueryResult
import typings.apolloDashClient.coreTypesMod.OperationVariables
import typings.apolloDashClient.utilObservableMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/util/subscribeAndCount", JSImport.Namespace)
@js.native
object utilSubscribeAndCountMod extends js.Object {
  def default(
    done: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.DoneCallback */ js.Any,
    observable: ObservableQuery[_, OperationVariables],
    cb: js.Function2[/* handleCount */ Double, /* result */ ApolloQueryResult[_], _]
  ): Subscription = js.native
}

