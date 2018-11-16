package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FAX_ACCESS_RIGHTS_ENUM extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("FAXCOMEXLib.FAX_ACCESS_RIGHTS_ENUM")
@js.native
object FAX_ACCESS_RIGHTS_ENUM extends js.Object {
  @js.native
  sealed trait farMANAGE_CONFIG
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM
  
  @js.native
  sealed trait farMANAGE_IN_ARCHIVE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM
  
  @js.native
  sealed trait farMANAGE_JOBS
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM
  
  @js.native
  sealed trait farMANAGE_OUT_ARCHIVE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM
  
  @js.native
  sealed trait farQUERY_CONFIG
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM
  
  @js.native
  sealed trait farQUERY_IN_ARCHIVE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM
  
  @js.native
  sealed trait farQUERY_JOBS
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM
  
  @js.native
  sealed trait farQUERY_OUT_ARCHIVE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM
  
  @js.native
  sealed trait farSUBMIT_HIGH
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM
  
  @js.native
  sealed trait farSUBMIT_LOW
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM
  
  @js.native
  sealed trait farSUBMIT_NORMAL
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM
  
  /* 64 */ val farMANAGE_CONFIG: farMANAGE_CONFIG with scala.Double = js.native
  /* 256 */ val farMANAGE_IN_ARCHIVE: farMANAGE_IN_ARCHIVE with scala.Double = js.native
  /* 16 */ val farMANAGE_JOBS: farMANAGE_JOBS with scala.Double = js.native
  /* 1024 */ val farMANAGE_OUT_ARCHIVE: farMANAGE_OUT_ARCHIVE with scala.Double = js.native
  /* 32 */ val farQUERY_CONFIG: farQUERY_CONFIG with scala.Double = js.native
  /* 128 */ val farQUERY_IN_ARCHIVE: farQUERY_IN_ARCHIVE with scala.Double = js.native
  /* 8 */ val farQUERY_JOBS: farQUERY_JOBS with scala.Double = js.native
  /* 512 */ val farQUERY_OUT_ARCHIVE: farQUERY_OUT_ARCHIVE with scala.Double = js.native
  /* 4 */ val farSUBMIT_HIGH: farSUBMIT_HIGH with scala.Double = js.native
  /* 1 */ val farSUBMIT_LOW: farSUBMIT_LOW with scala.Double = js.native
  /* 2 */ val farSUBMIT_NORMAL: farSUBMIT_NORMAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_ACCESS_RIGHTS_ENUM with scala.Double] = js.native
}

