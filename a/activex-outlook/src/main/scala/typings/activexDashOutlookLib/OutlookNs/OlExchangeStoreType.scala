package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlExchangeStoreType extends js.Object

@JSGlobal("Outlook.OlExchangeStoreType")
@js.native
object OlExchangeStoreType extends js.Object {
  @js.native
  sealed trait olAdditionalExchangeMailbox
    extends activexDashOutlookLib.OutlookNs.OlExchangeStoreType
  
  @js.native
  sealed trait olExchangeMailbox
    extends activexDashOutlookLib.OutlookNs.OlExchangeStoreType
  
  @js.native
  sealed trait olExchangePublicFolder
    extends activexDashOutlookLib.OutlookNs.OlExchangeStoreType
  
  @js.native
  sealed trait olNotExchange
    extends activexDashOutlookLib.OutlookNs.OlExchangeStoreType
  
  @js.native
  sealed trait olPrimaryExchangeMailbox
    extends activexDashOutlookLib.OutlookNs.OlExchangeStoreType
  
  /* 4 */ val olAdditionalExchangeMailbox: olAdditionalExchangeMailbox with scala.Double = js.native
  /* 1 */ val olExchangeMailbox: olExchangeMailbox with scala.Double = js.native
  /* 2 */ val olExchangePublicFolder: olExchangePublicFolder with scala.Double = js.native
  /* 3 */ val olNotExchange: olNotExchange with scala.Double = js.native
  /* 0 */ val olPrimaryExchangeMailbox: olPrimaryExchangeMailbox with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlExchangeStoreType with scala.Double] = js.native
}

