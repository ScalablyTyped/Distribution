package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlStoreType extends js.Object

@JSGlobal("Outlook.OlStoreType")
@js.native
object OlStoreType extends js.Object {
  @js.native
  sealed trait olStoreANSI
    extends activexDashOutlookLib.OutlookNs.OlStoreType
  
  @js.native
  sealed trait olStoreDefault
    extends activexDashOutlookLib.OutlookNs.OlStoreType
  
  @js.native
  sealed trait olStoreUnicode
    extends activexDashOutlookLib.OutlookNs.OlStoreType
  
  /* 3 */ val olStoreANSI: olStoreANSI with scala.Double = js.native
  /* 1 */ val olStoreDefault: olStoreDefault with scala.Double = js.native
  /* 2 */ val olStoreUnicode: olStoreUnicode with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlStoreType with scala.Double] = js.native
}

