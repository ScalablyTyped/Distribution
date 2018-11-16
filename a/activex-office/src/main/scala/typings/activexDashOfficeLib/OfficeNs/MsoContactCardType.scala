package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoContactCardType extends js.Object

@JSGlobal("Office.MsoContactCardType")
@js.native
object MsoContactCardType extends js.Object {
  @js.native
  sealed trait msoContactCardTypeEnterpriseContact
    extends activexDashOfficeLib.OfficeNs.MsoContactCardType
  
  @js.native
  sealed trait msoContactCardTypeEnterpriseGroup
    extends activexDashOfficeLib.OfficeNs.MsoContactCardType
  
  @js.native
  sealed trait msoContactCardTypePersonalContact
    extends activexDashOfficeLib.OfficeNs.MsoContactCardType
  
  @js.native
  sealed trait msoContactCardTypePersonalDistributionList
    extends activexDashOfficeLib.OfficeNs.MsoContactCardType
  
  @js.native
  sealed trait msoContactCardTypeUnknownContact
    extends activexDashOfficeLib.OfficeNs.MsoContactCardType
  
  /* 0 */ val msoContactCardTypeEnterpriseContact: msoContactCardTypeEnterpriseContact with scala.Double = js.native
  /* 3 */ val msoContactCardTypeEnterpriseGroup: msoContactCardTypeEnterpriseGroup with scala.Double = js.native
  /* 1 */ val msoContactCardTypePersonalContact: msoContactCardTypePersonalContact with scala.Double = js.native
  /* 4 */ val msoContactCardTypePersonalDistributionList: msoContactCardTypePersonalDistributionList with scala.Double = js.native
  /* 2 */ val msoContactCardTypeUnknownContact: msoContactCardTypeUnknownContact with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoContactCardType with scala.Double] = js.native
}

