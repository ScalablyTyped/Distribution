package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FAX_LOG_LEVEL_ENUM extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("FAXCOMEXLib.FAX_LOG_LEVEL_ENUM")
@js.native
object FAX_LOG_LEVEL_ENUM extends js.Object {
  @js.native
  sealed trait fllMAX
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_LOG_LEVEL_ENUM
  
  @js.native
  sealed trait fllMED
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_LOG_LEVEL_ENUM
  
  @js.native
  sealed trait fllMIN
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_LOG_LEVEL_ENUM
  
  @js.native
  sealed trait fllNONE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_LOG_LEVEL_ENUM
  
  /* 3 */ val fllMAX: fllMAX with scala.Double = js.native
  /* 2 */ val fllMED: fllMED with scala.Double = js.native
  /* 1 */ val fllMIN: fllMIN with scala.Double = js.native
  /* 0 */ val fllNONE: fllNONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_LOG_LEVEL_ENUM with scala.Double] = js.native
}

