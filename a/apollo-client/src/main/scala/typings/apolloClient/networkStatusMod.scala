package typings.apolloClient

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/core/networkStatus", JSImport.Namespace)
@js.native
object networkStatusMod extends js.Object {
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NetworkStatus with Double] = js.native
    /* 8 */ @js.native
    object error extends TopLevel[error with Double]
    
    /* 3 */ @js.native
    object fetchMore extends TopLevel[fetchMore with Double]
    
    /* 1 */ @js.native
    object loading extends TopLevel[loading with Double]
    
    /* 6 */ @js.native
    object poll extends TopLevel[poll with Double]
    
    /* 7 */ @js.native
    object ready extends TopLevel[ready with Double]
    
    /* 4 */ @js.native
    object refetch extends TopLevel[refetch with Double]
    
    /* 2 */ @js.native
    object setVariables extends TopLevel[setVariables with Double]
    
  }
  
}

