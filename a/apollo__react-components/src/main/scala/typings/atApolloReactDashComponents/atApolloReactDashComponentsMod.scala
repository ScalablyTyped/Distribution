package typings.atApolloReactDashComponents

import typings.atApolloReactDashCommon.libContextApolloConsumerMod.ApolloConsumerProps
import typings.atApolloReactDashCommon.libContextApolloContextMod.ApolloContextValue
import typings.atApolloReactDashCommon.libContextApolloProviderMod.ApolloProviderProps
import typings.atApolloReactDashComponents.libTypesMod.MutationComponentOptions
import typings.atApolloReactDashComponents.libTypesMod.QueryComponentOptions
import typings.atApolloReactDashComponents.libTypesMod.SubscriptionComponentOptions
import typings.propDashTypes.propDashTypesMod.Requireable
import typings.propDashTypes.propDashTypesMod.Validator
import typings.react.reactMod.Context
import typings.react.reactMod.FC
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-components", JSImport.Namespace)
@js.native
object atApolloReactDashComponentsMod extends js.Object {
  val ApolloConsumer: FC[ApolloConsumerProps] = js.native
  val ApolloProvider: FC[ApolloProviderProps[js.Any]] = js.native
  def getApolloContext(): Context[ApolloContextValue] = js.native
  def resetApolloContext(): Unit = js.native
  @js.native
  object Mutation extends js.Object {
    def apply[TData, TVariables](props: MutationComponentOptions[TData, TVariables]): Element | Null = js.native
    @js.native
    object propTypes extends js.Object {
      var awaitRefetchQueries: Requireable[Boolean] = js.native
      var children: Validator[js.Function1[/* repeated */ _, _]] = js.native
      var fetchPolicy: Requireable[String] = js.native
      var mutation: Validator[js.Object] = js.native
      var onCompleted: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onError: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var optimisticResponse: Requireable[js.Object] = js.native
      var refetchQueries: Requireable[
            (js.Function1[/* repeated */ _, _]) | (js.Array[js.UndefOr[String | js.Object | Null]])
          ] = js.native
      var update: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var variables: Requireable[js.Object] = js.native
    }
    
  }
  
  @js.native
  object Query extends js.Object {
    def apply[TData, TVariables](props: QueryComponentOptions[TData, TVariables]): Element | Null = js.native
    @js.native
    object propTypes extends js.Object {
      var children: Validator[js.Function1[/* repeated */ _, _]] = js.native
      var client: Requireable[js.Object] = js.native
      var fetchPolicy: Requireable[String] = js.native
      var notifyOnNetworkStatusChange: Requireable[Boolean] = js.native
      var onCompleted: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onError: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var partialRefetch: Requireable[Boolean] = js.native
      var pollInterval: Requireable[Double] = js.native
      var query: Validator[js.Object] = js.native
      var returnPartialData: Requireable[Boolean] = js.native
      var ssr: Requireable[Boolean] = js.native
      var variables: Requireable[js.Object] = js.native
    }
    
  }
  
  @js.native
  object Subscription extends js.Object {
    def apply[TData, TVariables](props: SubscriptionComponentOptions[TData, TVariables]): Element | Null = js.native
    @js.native
    object propTypes extends js.Object {
      var children: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onSubscriptionComplete: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onSubscriptionData: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var shouldResubscribe: Requireable[Boolean | (js.Function1[/* repeated */ _, _])] = js.native
      var subscription: Validator[js.Object] = js.native
      var variables: Requireable[js.Object] = js.native
    }
    
  }
  
}

