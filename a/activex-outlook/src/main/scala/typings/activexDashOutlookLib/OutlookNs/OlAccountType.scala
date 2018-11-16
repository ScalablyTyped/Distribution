package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlAccountType extends js.Object

@JSGlobal("Outlook.OlAccountType")
@js.native
object OlAccountType extends js.Object {
  @js.native
  sealed trait olExchange
    extends activexDashOutlookLib.OutlookNs.OlAccountType
  
  @js.native
  sealed trait olHttp
    extends activexDashOutlookLib.OutlookNs.OlAccountType
  
  @js.native
  sealed trait olImap
    extends activexDashOutlookLib.OutlookNs.OlAccountType
  
  @js.native
  sealed trait olOtherAccount
    extends activexDashOutlookLib.OutlookNs.OlAccountType
  
  @js.native
  sealed trait olPop3
    extends activexDashOutlookLib.OutlookNs.OlAccountType
  
  /* 0 */ val olExchange: olExchange with scala.Double = js.native
  /* 3 */ val olHttp: olHttp with scala.Double = js.native
  /* 1 */ val olImap: olImap with scala.Double = js.native
  /* 5 */ val olOtherAccount: olOtherAccount with scala.Double = js.native
  /* 2 */ val olPop3: olPop3 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlAccountType with scala.Double] = js.native
}

