package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlExchangeConnectionMode extends js.Object

@JSGlobal("Outlook.OlExchangeConnectionMode")
@js.native
object OlExchangeConnectionMode extends js.Object {
  @js.native
  sealed trait olCachedConnectedDrizzle
    extends activexDashOutlookLib.OutlookNs.OlExchangeConnectionMode
  
  @js.native
  sealed trait olCachedConnectedFull
    extends activexDashOutlookLib.OutlookNs.OlExchangeConnectionMode
  
  @js.native
  sealed trait olCachedConnectedHeaders
    extends activexDashOutlookLib.OutlookNs.OlExchangeConnectionMode
  
  @js.native
  sealed trait olCachedDisconnected
    extends activexDashOutlookLib.OutlookNs.OlExchangeConnectionMode
  
  @js.native
  sealed trait olCachedOffline
    extends activexDashOutlookLib.OutlookNs.OlExchangeConnectionMode
  
  @js.native
  sealed trait olDisconnected
    extends activexDashOutlookLib.OutlookNs.OlExchangeConnectionMode
  
  @js.native
  sealed trait olNoExchange
    extends activexDashOutlookLib.OutlookNs.OlExchangeConnectionMode
  
  @js.native
  sealed trait olOffline
    extends activexDashOutlookLib.OutlookNs.OlExchangeConnectionMode
  
  @js.native
  sealed trait olOnline
    extends activexDashOutlookLib.OutlookNs.OlExchangeConnectionMode
  
  /* 600 */ val olCachedConnectedDrizzle: olCachedConnectedDrizzle with scala.Double = js.native
  /* 700 */ val olCachedConnectedFull: olCachedConnectedFull with scala.Double = js.native
  /* 500 */ val olCachedConnectedHeaders: olCachedConnectedHeaders with scala.Double = js.native
  /* 400 */ val olCachedDisconnected: olCachedDisconnected with scala.Double = js.native
  /* 200 */ val olCachedOffline: olCachedOffline with scala.Double = js.native
  /* 300 */ val olDisconnected: olDisconnected with scala.Double = js.native
  /* 0 */ val olNoExchange: olNoExchange with scala.Double = js.native
  /* 100 */ val olOffline: olOffline with scala.Double = js.native
  /* 800 */ val olOnline: olOnline with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlExchangeConnectionMode with scala.Double] = js.native
}

