package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FAX_JOB_TYPE_ENUM extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("FAXCOMEXLib.FAX_JOB_TYPE_ENUM")
@js.native
object FAX_JOB_TYPE_ENUM extends js.Object {
  @js.native
  sealed trait fjtRECEIVE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_TYPE_ENUM
  
  @js.native
  sealed trait fjtROUTING
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_TYPE_ENUM
  
  @js.native
  sealed trait fjtSEND
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_TYPE_ENUM
  
  /* 1 */ val fjtRECEIVE: fjtRECEIVE with scala.Double = js.native
  /* 2 */ val fjtROUTING: fjtROUTING with scala.Double = js.native
  /* 0 */ val fjtSEND: fjtSEND with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_TYPE_ENUM with scala.Double] = js.native
}

