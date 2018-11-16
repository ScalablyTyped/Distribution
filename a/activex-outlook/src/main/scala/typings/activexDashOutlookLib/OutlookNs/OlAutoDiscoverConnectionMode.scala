package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlAutoDiscoverConnectionMode extends js.Object

@JSGlobal("Outlook.OlAutoDiscoverConnectionMode")
@js.native
object OlAutoDiscoverConnectionMode extends js.Object {
  @js.native
  sealed trait olAutoDiscoverConnectionExternal
    extends activexDashOutlookLib.OutlookNs.OlAutoDiscoverConnectionMode
  
  @js.native
  sealed trait olAutoDiscoverConnectionInternal
    extends activexDashOutlookLib.OutlookNs.OlAutoDiscoverConnectionMode
  
  @js.native
  sealed trait olAutoDiscoverConnectionInternalDomain
    extends activexDashOutlookLib.OutlookNs.OlAutoDiscoverConnectionMode
  
  @js.native
  sealed trait olAutoDiscoverConnectionUnknown
    extends activexDashOutlookLib.OutlookNs.OlAutoDiscoverConnectionMode
  
  /* 1 */ val olAutoDiscoverConnectionExternal: olAutoDiscoverConnectionExternal with scala.Double = js.native
  /* 2 */ val olAutoDiscoverConnectionInternal: olAutoDiscoverConnectionInternal with scala.Double = js.native
  /* 3 */ val olAutoDiscoverConnectionInternalDomain: olAutoDiscoverConnectionInternalDomain with scala.Double = js.native
  /* 0 */ val olAutoDiscoverConnectionUnknown: olAutoDiscoverConnectionUnknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlAutoDiscoverConnectionMode with scala.Double] = js.native
}

