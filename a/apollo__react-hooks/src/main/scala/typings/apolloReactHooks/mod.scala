package typings.apolloReactHooks

import typings.apolloClient.mod.default
import typings.apolloReactCommon.apolloConsumerMod.ApolloConsumerProps
import typings.apolloReactCommon.apolloContextMod.ApolloContextValue
import typings.apolloReactCommon.apolloProviderMod.ApolloProviderProps
import typings.apolloReactCommon.typesMod.QueryResult
import typings.apolloReactHooks.typesMod.LazyQueryHookOptions
import typings.apolloReactHooks.typesMod.MutationHookOptions
import typings.apolloReactHooks.typesMod.MutationTuple
import typings.apolloReactHooks.typesMod.QueryHookOptions
import typings.apolloReactHooks.typesMod.QueryLazyOptions
import typings.apolloReactHooks.typesMod.SubscriptionHookOptions
import typings.graphql.astMod.DocumentNode
import typings.react.mod.Context
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RenderPromises ()
    extends typings.apolloReactHooks.renderPromisesMod.RenderPromises
  
  val ApolloConsumer: FC[ApolloConsumerProps] = js.native
  val ApolloProvider: FC[ApolloProviderProps[js.Any]] = js.native
  def getApolloContext(): Context[ApolloContextValue] = js.native
  def resetApolloContext(): Unit = js.native
  def useApolloClient(): default[js.Object] = js.native
  def useLazyQuery[TData, TVariables](query: DocumentNode): js.Tuple2[
    js.Function1[/* options */ js.UndefOr[QueryLazyOptions[TVariables]], Unit], 
    QueryResult[TData, TVariables]
  ] = js.native
  def useLazyQuery[TData, TVariables](query: DocumentNode, options: LazyQueryHookOptions[TData, TVariables]): js.Tuple2[
    js.Function1[/* options */ js.UndefOr[QueryLazyOptions[TVariables]], Unit], 
    QueryResult[TData, TVariables]
  ] = js.native
  def useMutation[TData, TVariables](mutation: DocumentNode): MutationTuple[TData, TVariables] = js.native
  def useMutation[TData, TVariables](mutation: DocumentNode, options: MutationHookOptions[TData, TVariables]): MutationTuple[TData, TVariables] = js.native
  def useQuery[TData, TVariables](query: DocumentNode): QueryResult[TData, TVariables] = js.native
  def useQuery[TData, TVariables](query: DocumentNode, options: QueryHookOptions[TData, TVariables]): QueryResult[TData, TVariables] = js.native
  def useSubscription[TData, TVariables](subscription: DocumentNode): AnonDataError[TVariables, TData] = js.native
  def useSubscription[TData, TVariables](subscription: DocumentNode, options: SubscriptionHookOptions[TData, TVariables]): AnonDataError[TVariables, TData] = js.native
}

