package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FAX_COVERPAGE_TYPE_ENUM extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("FAXCOMEXLib.FAX_COVERPAGE_TYPE_ENUM")
@js.native
object FAX_COVERPAGE_TYPE_ENUM extends js.Object {
  @js.native
  sealed trait fcptLOCAL
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_COVERPAGE_TYPE_ENUM
  
  @js.native
  sealed trait fcptNONE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_COVERPAGE_TYPE_ENUM
  
  @js.native
  sealed trait fcptSERVER
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_COVERPAGE_TYPE_ENUM
  
  /* 1 */ val fcptLOCAL: fcptLOCAL with scala.Double = js.native
  /* 0 */ val fcptNONE: fcptNONE with scala.Double = js.native
  /* 2 */ val fcptSERVER: fcptSERVER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_COVERPAGE_TYPE_ENUM with scala.Double
  ] = js.native
}

