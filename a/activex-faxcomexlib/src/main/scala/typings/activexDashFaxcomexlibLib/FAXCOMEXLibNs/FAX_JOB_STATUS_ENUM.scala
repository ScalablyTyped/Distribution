package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FAX_JOB_STATUS_ENUM extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("FAXCOMEXLib.FAX_JOB_STATUS_ENUM")
@js.native
object FAX_JOB_STATUS_ENUM extends js.Object {
  @js.native
  sealed trait fjsCANCELED
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_STATUS_ENUM
  
  @js.native
  sealed trait fjsCANCELING
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_STATUS_ENUM
  
  @js.native
  sealed trait fjsCOMPLETED
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_STATUS_ENUM
  
  @js.native
  sealed trait fjsFAILED
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_STATUS_ENUM
  
  @js.native
  sealed trait fjsINPROGRESS
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_STATUS_ENUM
  
  @js.native
  sealed trait fjsNOLINE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_STATUS_ENUM
  
  @js.native
  sealed trait fjsPAUSED
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_STATUS_ENUM
  
  @js.native
  sealed trait fjsPENDING
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_STATUS_ENUM
  
  @js.native
  sealed trait fjsRETRIES_EXCEEDED
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_STATUS_ENUM
  
  @js.native
  sealed trait fjsRETRYING
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_STATUS_ENUM
  
  @js.native
  sealed trait fjsROUTING
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_STATUS_ENUM
  
  /* 512 */ val fjsCANCELED: fjsCANCELED with scala.Double = js.native
  /* 1024 */ val fjsCANCELING: fjsCANCELING with scala.Double = js.native
  /* 256 */ val fjsCOMPLETED: fjsCOMPLETED with scala.Double = js.native
  /* 8 */ val fjsFAILED: fjsFAILED with scala.Double = js.native
  /* 2 */ val fjsINPROGRESS: fjsINPROGRESS with scala.Double = js.native
  /* 32 */ val fjsNOLINE: fjsNOLINE with scala.Double = js.native
  /* 16 */ val fjsPAUSED: fjsPAUSED with scala.Double = js.native
  /* 1 */ val fjsPENDING: fjsPENDING with scala.Double = js.native
  /* 128 */ val fjsRETRIES_EXCEEDED: fjsRETRIES_EXCEEDED with scala.Double = js.native
  /* 64 */ val fjsRETRYING: fjsRETRYING with scala.Double = js.native
  /* 2048 */ val fjsROUTING: fjsROUTING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_JOB_STATUS_ENUM with scala.Double] = js.native
}

