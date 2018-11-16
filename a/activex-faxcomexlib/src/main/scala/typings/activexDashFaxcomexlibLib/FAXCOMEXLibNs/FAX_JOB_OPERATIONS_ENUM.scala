package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FAX_JOB_OPERATIONS_ENUM extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("FAXCOMEXLib.FAX_JOB_OPERATIONS_ENUM")
@js.native
object FAX_JOB_OPERATIONS_ENUM extends js.Object {
  @js.native
  sealed trait fjoDELETE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_OPERATIONS_ENUM
  
  @js.native
  sealed trait fjoPAUSE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_OPERATIONS_ENUM
  
  @js.native
  sealed trait fjoRECIPIENT_INFO
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_OPERATIONS_ENUM
  
  @js.native
  sealed trait fjoRESTART
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_OPERATIONS_ENUM
  
  @js.native
  sealed trait fjoRESUME
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_OPERATIONS_ENUM
  
  @js.native
  sealed trait fjoSENDER_INFO
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_OPERATIONS_ENUM
  
  @js.native
  sealed trait fjoVIEW
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_OPERATIONS_ENUM
  
  /* 16 */ val fjoDELETE: fjoDELETE with scala.Double = js.native
  /* 2 */ val fjoPAUSE: fjoPAUSE with scala.Double = js.native
  /* 32 */ val fjoRECIPIENT_INFO: fjoRECIPIENT_INFO with scala.Double = js.native
  /* 8 */ val fjoRESTART: fjoRESTART with scala.Double = js.native
  /* 4 */ val fjoRESUME: fjoRESUME with scala.Double = js.native
  /* 64 */ val fjoSENDER_INFO: fjoSENDER_INFO with scala.Double = js.native
  /* 1 */ val fjoVIEW: fjoVIEW with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_OPERATIONS_ENUM with scala.Double
  ] = js.native
}

