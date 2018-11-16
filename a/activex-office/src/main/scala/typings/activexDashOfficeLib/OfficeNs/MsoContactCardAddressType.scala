package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoContactCardAddressType extends js.Object

@JSGlobal("Office.MsoContactCardAddressType")
@js.native
object MsoContactCardAddressType extends js.Object {
  @js.native
  sealed trait msoContactCardAddressTypeIM
    extends activexDashOfficeLib.OfficeNs.MsoContactCardAddressType
  
  @js.native
  sealed trait msoContactCardAddressTypeOutlook
    extends activexDashOfficeLib.OfficeNs.MsoContactCardAddressType
  
  @js.native
  sealed trait msoContactCardAddressTypeSMTP
    extends activexDashOfficeLib.OfficeNs.MsoContactCardAddressType
  
  @js.native
  sealed trait msoContactCardAddressTypeUnknown
    extends activexDashOfficeLib.OfficeNs.MsoContactCardAddressType
  
  /* 3 */ val msoContactCardAddressTypeIM: msoContactCardAddressTypeIM with scala.Double = js.native
  /* 1 */ val msoContactCardAddressTypeOutlook: msoContactCardAddressTypeOutlook with scala.Double = js.native
  /* 2 */ val msoContactCardAddressTypeSMTP: msoContactCardAddressTypeSMTP with scala.Double = js.native
  /* 0 */ val msoContactCardAddressTypeUnknown: msoContactCardAddressTypeUnknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoContactCardAddressType with scala.Double] = js.native
}

