package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FAX_ACCESS_RIGHTS_ENUM_2 extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("FAXCOMEXLib.FAX_ACCESS_RIGHTS_ENUM_2")
@js.native
object FAX_ACCESS_RIGHTS_ENUM_2 extends js.Object {
  @js.native
  sealed trait far2MANAGE_ARCHIVES
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM_2
  
  @js.native
  sealed trait far2MANAGE_CONFIG
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM_2
  
  @js.native
  sealed trait far2MANAGE_OUT_JOBS
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM_2
  
  @js.native
  sealed trait far2MANAGE_RECEIVE_FOLDER
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM_2
  
  @js.native
  sealed trait far2QUERY_ARCHIVES
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM_2
  
  @js.native
  sealed trait far2QUERY_CONFIG
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM_2
  
  @js.native
  sealed trait far2QUERY_OUT_JOBS
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM_2
  
  @js.native
  sealed trait far2SUBMIT_HIGH
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM_2
  
  @js.native
  sealed trait far2SUBMIT_LOW
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM_2
  
  @js.native
  sealed trait far2SUBMIT_NORMAL
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM_2
  
  /* 256 */ val far2MANAGE_ARCHIVES: far2MANAGE_ARCHIVES with scala.Double = js.native
  /* 64 */ val far2MANAGE_CONFIG: far2MANAGE_CONFIG with scala.Double = js.native
  /* 16 */ val far2MANAGE_OUT_JOBS: far2MANAGE_OUT_JOBS with scala.Double = js.native
  /* 512 */ val far2MANAGE_RECEIVE_FOLDER: far2MANAGE_RECEIVE_FOLDER with scala.Double = js.native
  /* 128 */ val far2QUERY_ARCHIVES: far2QUERY_ARCHIVES with scala.Double = js.native
  /* 32 */ val far2QUERY_CONFIG: far2QUERY_CONFIG with scala.Double = js.native
  /* 8 */ val far2QUERY_OUT_JOBS: far2QUERY_OUT_JOBS with scala.Double = js.native
  /* 4 */ val far2SUBMIT_HIGH: far2SUBMIT_HIGH with scala.Double = js.native
  /* 1 */ val far2SUBMIT_LOW: far2SUBMIT_LOW with scala.Double = js.native
  /* 2 */ val far2SUBMIT_NORMAL: far2SUBMIT_NORMAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM_2 with scala.Double
  ] = js.native
}

