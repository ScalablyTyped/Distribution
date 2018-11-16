package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FAX_SCHEDULE_TYPE_ENUM extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("FAXCOMEXLib.FAX_SCHEDULE_TYPE_ENUM")
@js.native
object FAX_SCHEDULE_TYPE_ENUM extends js.Object {
  @js.native
  sealed trait fstDISCOUNT_PERIOD
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SCHEDULE_TYPE_ENUM
  
  @js.native
  sealed trait fstNOW
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SCHEDULE_TYPE_ENUM
  
  @js.native
  sealed trait fstSPECIFIC_TIME
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SCHEDULE_TYPE_ENUM
  
  /* 2 */ val fstDISCOUNT_PERIOD: fstDISCOUNT_PERIOD with scala.Double = js.native
  /* 0 */ val fstNOW: fstNOW with scala.Double = js.native
  /* 1 */ val fstSPECIFIC_TIME: fstSPECIFIC_TIME with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SCHEDULE_TYPE_ENUM with scala.Double] = js.native
}

