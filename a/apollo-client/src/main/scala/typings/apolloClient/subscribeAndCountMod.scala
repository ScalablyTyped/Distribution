package typings.apolloClient

import typings.apolloClient.observableMod.Subscription
import typings.apolloClient.observableQueryMod.ObservableQuery
import typings.apolloClient.typesMod.ApolloQueryResult
import typings.apolloClient.typesMod.OperationVariables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/util/subscribeAndCount", JSImport.Namespace)
@js.native
object subscribeAndCountMod extends js.Object {
  def default(
    done: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.DoneCallback */ js.Any,
    observable: ObservableQuery[_, OperationVariables],
    cb: js.Function2[/* handleCount */ Double, /* result */ ApolloQueryResult[_], _]
  ): Subscription = js.native
}

