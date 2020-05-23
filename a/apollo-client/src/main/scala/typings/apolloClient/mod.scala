package typings.apolloClient

import typings.apolloClient.anon.ErrorMessage
import typings.apolloClient.anon.Options
import typings.apolloClient.apolloClientMod.ApolloClientOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ApolloClient[TCacheShape] protected ()
    extends typings.apolloClient.apolloClientMod.default[TCacheShape] {
    def this(options: ApolloClientOptions[TCacheShape]) = this()
  }
  
  @js.native
  class ApolloError protected ()
    extends typings.apolloClient.apolloErrorMod.ApolloError {
    def this(hasGraphQLErrorsNetworkErrorErrorMessageExtraInfo: ErrorMessage) = this()
  }
  
  @js.native
  class ObservableQuery[TData, TVariables] protected ()
    extends typings.apolloClient.observableQueryMod.ObservableQuery[TData, TVariables] {
    def this(hasQueryManagerOptionsShouldSubscribe: Options[TVariables]) = this()
  }
  
  @js.native
  class default[TCacheShape] protected ()
    extends typings.apolloClient.apolloClientMod.default[TCacheShape] {
    def this(options: ApolloClientOptions[TCacheShape]) = this()
  }
  
  def isApolloError(err: Error): /* is apollo-client.apollo-client/errors/ApolloError.ApolloError */ Boolean = js.native
  @js.native
  object FetchType extends js.Object {
    /* 1 */ val normal: typings.apolloClient.typesMod.FetchType.normal with Double = js.native
    /* 3 */ val poll: typings.apolloClient.typesMod.FetchType.poll with Double = js.native
    /* 2 */ val refetch: typings.apolloClient.typesMod.FetchType.refetch with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.apolloClient.typesMod.FetchType with Double] = js.native
  }
  
  @js.native
  object NetworkStatus extends js.Object {
    /* 8 */ val error: typings.apolloClient.networkStatusMod.NetworkStatus.error with Double = js.native
    /* 3 */ val fetchMore: typings.apolloClient.networkStatusMod.NetworkStatus.fetchMore with Double = js.native
    /* 1 */ val loading: typings.apolloClient.networkStatusMod.NetworkStatus.loading with Double = js.native
    /* 6 */ val poll: typings.apolloClient.networkStatusMod.NetworkStatus.poll with Double = js.native
    /* 7 */ val ready: typings.apolloClient.networkStatusMod.NetworkStatus.ready with Double = js.native
    /* 4 */ val refetch: typings.apolloClient.networkStatusMod.NetworkStatus.refetch with Double = js.native
    /* 2 */ val setVariables: typings.apolloClient.networkStatusMod.NetworkStatus.setVariables with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.apolloClient.networkStatusMod.NetworkStatus with Double] = js.native
  }
  
}

