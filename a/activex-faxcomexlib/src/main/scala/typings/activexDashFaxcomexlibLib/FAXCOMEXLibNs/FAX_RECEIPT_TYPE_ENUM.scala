package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FAX_RECEIPT_TYPE_ENUM extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("FAXCOMEXLib.FAX_RECEIPT_TYPE_ENUM")
@js.native
object FAX_RECEIPT_TYPE_ENUM extends js.Object {
  @js.native
  sealed trait frtMAIL
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_RECEIPT_TYPE_ENUM
  
  @js.native
  sealed trait frtMSGBOX
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_RECEIPT_TYPE_ENUM
  
  @js.native
  sealed trait frtNONE
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_RECEIPT_TYPE_ENUM
  
  /* 1 */ val frtMAIL: frtMAIL with scala.Double = js.native
  /* 4 */ val frtMSGBOX: frtMSGBOX with scala.Double = js.native
  /* 0 */ val frtNONE: frtNONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_RECEIPT_TYPE_ENUM with scala.Double] = js.native
}

