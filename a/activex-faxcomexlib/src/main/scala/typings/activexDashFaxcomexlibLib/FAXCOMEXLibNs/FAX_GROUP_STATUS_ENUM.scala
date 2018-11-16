package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FAX_GROUP_STATUS_ENUM extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("FAXCOMEXLib.FAX_GROUP_STATUS_ENUM")
@js.native
object FAX_GROUP_STATUS_ENUM extends js.Object {
  @js.native
  sealed trait fgsALL_DEV_NOT_VALID
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_GROUP_STATUS_ENUM
  
  @js.native
  sealed trait fgsALL_DEV_VALID
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_GROUP_STATUS_ENUM
  
  @js.native
  sealed trait fgsEMPTY
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_GROUP_STATUS_ENUM
  
  @js.native
  sealed trait fgsSOME_DEV_NOT_VALID
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_GROUP_STATUS_ENUM
  
  /* 2 */ val fgsALL_DEV_NOT_VALID: fgsALL_DEV_NOT_VALID with scala.Double = js.native
  /* 0 */ val fgsALL_DEV_VALID: fgsALL_DEV_VALID with scala.Double = js.native
  /* 1 */ val fgsEMPTY: fgsEMPTY with scala.Double = js.native
  /* 3 */ val fgsSOME_DEV_NOT_VALID: fgsSOME_DEV_NOT_VALID with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_GROUP_STATUS_ENUM with scala.Double] = js.native
}

