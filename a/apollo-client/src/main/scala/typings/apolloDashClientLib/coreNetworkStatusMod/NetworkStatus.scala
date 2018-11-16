package typings
package apolloDashClientLib.coreNetworkStatusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkStatus extends js.Object

@JSImport("apollo-client/core/networkStatus", "NetworkStatus")
@js.native
object NetworkStatus extends js.Object {
  @js.native
  sealed trait error
    extends apolloDashClientLib.coreNetworkStatusMod.NetworkStatus
  
  @js.native
  sealed trait fetchMore
    extends apolloDashClientLib.coreNetworkStatusMod.NetworkStatus
  
  @js.native
  sealed trait loading
    extends apolloDashClientLib.coreNetworkStatusMod.NetworkStatus
  
  @js.native
  sealed trait poll
    extends apolloDashClientLib.coreNetworkStatusMod.NetworkStatus
  
  @js.native
  sealed trait ready
    extends apolloDashClientLib.coreNetworkStatusMod.NetworkStatus
  
  @js.native
  sealed trait refetch
    extends apolloDashClientLib.coreNetworkStatusMod.NetworkStatus
  
  @js.native
  sealed trait setVariables
    extends apolloDashClientLib.coreNetworkStatusMod.NetworkStatus
  
  /* 8 */ val error: error with scala.Double = js.native
  /* 3 */ val fetchMore: fetchMore with scala.Double = js.native
  /* 1 */ val loading: loading with scala.Double = js.native
  /* 6 */ val poll: poll with scala.Double = js.native
  /* 7 */ val ready: ready with scala.Double = js.native
  /* 4 */ val refetch: refetch with scala.Double = js.native
  /* 2 */ val setVariables: setVariables with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[apolloDashClientLib.coreNetworkStatusMod.NetworkStatus with scala.Double] = js.native
}

