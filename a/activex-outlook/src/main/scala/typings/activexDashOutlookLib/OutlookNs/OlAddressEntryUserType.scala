package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlAddressEntryUserType extends js.Object

@JSGlobal("Outlook.OlAddressEntryUserType")
@js.native
object OlAddressEntryUserType extends js.Object {
  @js.native
  sealed trait olExchangeAgentAddressEntry
    extends activexDashOutlookLib.OutlookNs.OlAddressEntryUserType
  
  @js.native
  sealed trait olExchangeDistributionListAddressEntry
    extends activexDashOutlookLib.OutlookNs.OlAddressEntryUserType
  
  @js.native
  sealed trait olExchangeOrganizationAddressEntry
    extends activexDashOutlookLib.OutlookNs.OlAddressEntryUserType
  
  @js.native
  sealed trait olExchangePublicFolderAddressEntry
    extends activexDashOutlookLib.OutlookNs.OlAddressEntryUserType
  
  @js.native
  sealed trait olExchangeRemoteUserAddressEntry
    extends activexDashOutlookLib.OutlookNs.OlAddressEntryUserType
  
  @js.native
  sealed trait olExchangeUserAddressEntry
    extends activexDashOutlookLib.OutlookNs.OlAddressEntryUserType
  
  @js.native
  sealed trait olLdapAddressEntry
    extends activexDashOutlookLib.OutlookNs.OlAddressEntryUserType
  
  @js.native
  sealed trait olOtherAddressEntry
    extends activexDashOutlookLib.OutlookNs.OlAddressEntryUserType
  
  @js.native
  sealed trait olOutlookContactAddressEntry
    extends activexDashOutlookLib.OutlookNs.OlAddressEntryUserType
  
  @js.native
  sealed trait olOutlookDistributionListAddressEntry
    extends activexDashOutlookLib.OutlookNs.OlAddressEntryUserType
  
  @js.native
  sealed trait olSmtpAddressEntry
    extends activexDashOutlookLib.OutlookNs.OlAddressEntryUserType
  
  /* 3 */ val olExchangeAgentAddressEntry: olExchangeAgentAddressEntry with scala.Double = js.native
  /* 1 */ val olExchangeDistributionListAddressEntry: olExchangeDistributionListAddressEntry with scala.Double = js.native
  /* 4 */ val olExchangeOrganizationAddressEntry: olExchangeOrganizationAddressEntry with scala.Double = js.native
  /* 2 */ val olExchangePublicFolderAddressEntry: olExchangePublicFolderAddressEntry with scala.Double = js.native
  /* 5 */ val olExchangeRemoteUserAddressEntry: olExchangeRemoteUserAddressEntry with scala.Double = js.native
  /* 0 */ val olExchangeUserAddressEntry: olExchangeUserAddressEntry with scala.Double = js.native
  /* 20 */ val olLdapAddressEntry: olLdapAddressEntry with scala.Double = js.native
  /* 40 */ val olOtherAddressEntry: olOtherAddressEntry with scala.Double = js.native
  /* 10 */ val olOutlookContactAddressEntry: olOutlookContactAddressEntry with scala.Double = js.native
  /* 11 */ val olOutlookDistributionListAddressEntry: olOutlookDistributionListAddressEntry with scala.Double = js.native
  /* 30 */ val olSmtpAddressEntry: olSmtpAddressEntry with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlAddressEntryUserType with scala.Double] = js.native
}

