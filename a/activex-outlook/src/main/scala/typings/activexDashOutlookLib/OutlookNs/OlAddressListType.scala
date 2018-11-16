package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlAddressListType extends js.Object

@JSGlobal("Outlook.OlAddressListType")
@js.native
object OlAddressListType extends js.Object {
  @js.native
  sealed trait olCustomAddressList
    extends activexDashOutlookLib.OutlookNs.OlAddressListType
  
  @js.native
  sealed trait olExchangeContainer
    extends activexDashOutlookLib.OutlookNs.OlAddressListType
  
  @js.native
  sealed trait olExchangeGlobalAddressList
    extends activexDashOutlookLib.OutlookNs.OlAddressListType
  
  @js.native
  sealed trait olOutlookAddressList
    extends activexDashOutlookLib.OutlookNs.OlAddressListType
  
  @js.native
  sealed trait olOutlookLdapAddressList
    extends activexDashOutlookLib.OutlookNs.OlAddressListType
  
  /* 4 */ val olCustomAddressList: olCustomAddressList with scala.Double = js.native
  /* 1 */ val olExchangeContainer: olExchangeContainer with scala.Double = js.native
  /* 0 */ val olExchangeGlobalAddressList: olExchangeGlobalAddressList with scala.Double = js.native
  /* 2 */ val olOutlookAddressList: olOutlookAddressList with scala.Double = js.native
  /* 3 */ val olOutlookLdapAddressList: olOutlookLdapAddressList with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlAddressListType with scala.Double] = js.native
}

