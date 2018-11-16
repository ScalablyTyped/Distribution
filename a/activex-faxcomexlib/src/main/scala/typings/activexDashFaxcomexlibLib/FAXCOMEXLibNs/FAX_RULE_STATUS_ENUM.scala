package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FAX_RULE_STATUS_ENUM extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("FAXCOMEXLib.FAX_RULE_STATUS_ENUM")
@js.native
object FAX_RULE_STATUS_ENUM extends js.Object {
  @js.native
  sealed trait frsALL_GROUP_DEV_NOT_VALID
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_RULE_STATUS_ENUM
  
  @js.native
  sealed trait frsBAD_DEVICE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_RULE_STATUS_ENUM
  
  @js.native
  sealed trait frsEMPTY_GROUP
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_RULE_STATUS_ENUM
  
  @js.native
  sealed trait frsSOME_GROUP_DEV_NOT_VALID
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_RULE_STATUS_ENUM
  
  @js.native
  sealed trait frsVALID
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_RULE_STATUS_ENUM
  
  /* 2 */ val frsALL_GROUP_DEV_NOT_VALID: frsALL_GROUP_DEV_NOT_VALID with scala.Double = js.native
  /* 4 */ val frsBAD_DEVICE: frsBAD_DEVICE with scala.Double = js.native
  /* 1 */ val frsEMPTY_GROUP: frsEMPTY_GROUP with scala.Double = js.native
  /* 3 */ val frsSOME_GROUP_DEV_NOT_VALID: frsSOME_GROUP_DEV_NOT_VALID with scala.Double = js.native
  /* 0 */ val frsVALID: frsVALID with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_RULE_STATUS_ENUM with scala.Double] = js.native
}

