package typings.apolloDashClient

import typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/core/networkStatus", JSImport.Namespace)
@js.native
object coreNetworkStatusMod extends js.Object {
  @js.native
  sealed trait NetworkStatus extends js.Object
  
  def isNetworkRequestInFlight(networkStatus: NetworkStatus): Boolean = js.native
  @js.native
  object NetworkStatus extends js.Object {
    @js.native
    sealed trait error extends NetworkStatus
    
    @js.native
    sealed trait fetchMore extends NetworkStatus
    
    @js.native
    sealed trait loading extends NetworkStatus
    
    @js.native
    sealed trait poll extends NetworkStatus
    
    @js.native
    sealed trait ready extends NetworkStatus
    
    @js.native
    sealed trait refetch extends NetworkStatus
    
    @js.native
    sealed trait setVariables extends NetworkStatus
    
    /* 8 */ val error: typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus.error with Double = js.native
    /* 3 */ val fetchMore: typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus.fetchMore with Double = js.native
    /* 1 */ val loading: typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus.loading with Double = js.native
    /* 6 */ val poll: typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus.poll with Double = js.native
    /* 7 */ val ready: typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus.ready with Double = js.native
    /* 4 */ val refetch: typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus.refetch with Double = js.native
    /* 2 */ val setVariables: typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus.setVariables with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NetworkStatus with Double] = js.native
  }
  
}

