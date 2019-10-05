package typings.atApolloReactDashHooks

import typings.apolloDashClient.apolloDashClientMod.default
import typings.atApolloReactDashCommon.libContextApolloConsumerMod.ApolloConsumerProps
import typings.atApolloReactDashCommon.libContextApolloContextMod.ApolloContextValue
import typings.atApolloReactDashCommon.libContextApolloProviderMod.ApolloProviderProps
import typings.atApolloReactDashCommon.libTypesTypesMod.QueryResult
import typings.atApolloReactDashHooks.libTypesMod.LazyQueryHookOptions
import typings.atApolloReactDashHooks.libTypesMod.MutationHookOptions
import typings.atApolloReactDashHooks.libTypesMod.MutationTuple
import typings.atApolloReactDashHooks.libTypesMod.QueryHookOptions
import typings.atApolloReactDashHooks.libTypesMod.QueryLazyOptions
import typings.atApolloReactDashHooks.libTypesMod.SubscriptionHookOptions
import typings.graphql.languageAstMod.DocumentNode
import typings.react.reactMod.Context
import typings.react.reactMod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks", JSImport.Namespace)
@js.native
object atApolloReactDashHooksMod extends js.Object {
  @js.native
  class RenderPromises ()
    extends typings.atApolloReactDashHooks.libSsrRenderPromisesMod.RenderPromises
  
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
  def useSubscription[TData, TVariables](subscription: DocumentNode): Anon_Data[TVariables, TData] = js.native
  def useSubscription[TData, TVariables](subscription: DocumentNode, options: SubscriptionHookOptions[TData, TVariables]): Anon_Data[TVariables, TData] = js.native
}

