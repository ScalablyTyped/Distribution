package typings.apolloDashClient

import typings.apolloDashClient.apolloClientMod.ApolloClientOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client", JSImport.Namespace)
@js.native
object apolloDashClientMod extends js.Object {
  @js.native
  class ApolloClient[TCacheShape] protected ()
    extends typings.apolloDashClient.apolloClientMod.default[TCacheShape] {
    def this(options: ApolloClientOptions[TCacheShape]) = this()
  }
  
  @js.native
  class ApolloError protected ()
    extends typings.apolloDashClient.errorsApolloErrorMod.ApolloError {
    def this(hasGraphQLErrorsNetworkErrorErrorMessageExtraInfo: Anon_ErrorMessage) = this()
  }
  
  @js.native
  class ObservableQuery[TData, TVariables] protected ()
    extends typings.apolloDashClient.coreObservableQueryMod.ObservableQuery[TData, TVariables] {
    def this(hasQueryManagerOptionsShouldSubscribe: Anon_Options[TVariables]) = this()
  }
  
  @js.native
  class default[TCacheShape] protected ()
    extends typings.apolloDashClient.apolloClientMod.default[TCacheShape] {
    def this(options: ApolloClientOptions[TCacheShape]) = this()
  }
  
  def isApolloError(err: Error): /* is apollo-client.apollo-client/errors/ApolloError.ApolloError */ Boolean = js.native
  @js.native
  object FetchType extends js.Object {
    /* 1 */ val normal: typings.apolloDashClient.coreTypesMod.FetchType.normal with Double = js.native
    /* 3 */ val poll: typings.apolloDashClient.coreTypesMod.FetchType.poll with Double = js.native
    /* 2 */ val refetch: typings.apolloDashClient.coreTypesMod.FetchType.refetch with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.apolloDashClient.coreTypesMod.FetchType with Double] = js.native
  }
  
  @js.native
  object NetworkStatus extends js.Object {
    /* 8 */ val error: typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus.error with Double = js.native
    /* 3 */ val fetchMore: typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus.fetchMore with Double = js.native
    /* 1 */ val loading: typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus.loading with Double = js.native
    /* 6 */ val poll: typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus.poll with Double = js.native
    /* 7 */ val ready: typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus.ready with Double = js.native
    /* 4 */ val refetch: typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus.refetch with Double = js.native
    /* 2 */ val setVariables: typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus.setVariables with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus with Double] = js.native
  }
  
}

