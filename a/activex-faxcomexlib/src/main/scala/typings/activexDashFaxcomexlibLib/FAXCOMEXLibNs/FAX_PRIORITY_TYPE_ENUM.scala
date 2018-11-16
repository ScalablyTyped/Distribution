package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FAX_PRIORITY_TYPE_ENUM extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("FAXCOMEXLib.FAX_PRIORITY_TYPE_ENUM")
@js.native
object FAX_PRIORITY_TYPE_ENUM extends js.Object {
  @js.native
  sealed trait fptHIGH
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_PRIORITY_TYPE_ENUM
  
  @js.native
  sealed trait fptLOW
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_PRIORITY_TYPE_ENUM
  
  @js.native
  sealed trait fptNORMAL
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_PRIORITY_TYPE_ENUM
  
  /* 2 */ val fptHIGH: fptHIGH with scala.Double = js.native
  /* 0 */ val fptLOW: fptLOW with scala.Double = js.native
  /* 1 */ val fptNORMAL: fptNORMAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_PRIORITY_TYPE_ENUM with scala.Double] = js.native
}

