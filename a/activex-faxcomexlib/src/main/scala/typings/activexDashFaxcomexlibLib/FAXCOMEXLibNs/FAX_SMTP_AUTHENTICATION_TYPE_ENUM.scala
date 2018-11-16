package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FAX_SMTP_AUTHENTICATION_TYPE_ENUM extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("FAXCOMEXLib.FAX_SMTP_AUTHENTICATION_TYPE_ENUM")
@js.native
object FAX_SMTP_AUTHENTICATION_TYPE_ENUM extends js.Object {
  @js.native
  sealed trait fsatANONYMOUS
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SMTP_AUTHENTICATION_TYPE_ENUM
  
  @js.native
  sealed trait fsatBASIC
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SMTP_AUTHENTICATION_TYPE_ENUM
  
  @js.native
  sealed trait fsatNTLM
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SMTP_AUTHENTICATION_TYPE_ENUM
  
  /* 0 */ val fsatANONYMOUS: fsatANONYMOUS with scala.Double = js.native
  /* 1 */ val fsatBASIC: fsatBASIC with scala.Double = js.native
  /* 2 */ val fsatNTLM: fsatNTLM with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_SMTP_AUTHENTICATION_TYPE_ENUM with scala.Double
  ] = js.native
}

