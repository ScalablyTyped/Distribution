package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _SXH_SERVER_CERT_OPTION extends js.Object

@JSGlobal("MSXML2._SXH_SERVER_CERT_OPTION")
@js.native
object _SXH_SERVER_CERT_OPTION extends js.Object {
  @js.native
  sealed trait SXH_SERVER_CERT_IGNORE_ALL_SERVER_ERRORS
    extends activexDashMsxml2Lib.MSXML2Ns._SXH_SERVER_CERT_OPTION
  
  @js.native
  sealed trait SXH_SERVER_CERT_IGNORE_CERT_CN_INVALID
    extends activexDashMsxml2Lib.MSXML2Ns._SXH_SERVER_CERT_OPTION
  
  @js.native
  sealed trait SXH_SERVER_CERT_IGNORE_CERT_DATE_INVALID
    extends activexDashMsxml2Lib.MSXML2Ns._SXH_SERVER_CERT_OPTION
  
  @js.native
  sealed trait SXH_SERVER_CERT_IGNORE_UNKNOWN_CA
    extends activexDashMsxml2Lib.MSXML2Ns._SXH_SERVER_CERT_OPTION
  
  @js.native
  sealed trait SXH_SERVER_CERT_IGNORE_WRONG_USAGE
    extends activexDashMsxml2Lib.MSXML2Ns._SXH_SERVER_CERT_OPTION
  
  /* 13056 */ val SXH_SERVER_CERT_IGNORE_ALL_SERVER_ERRORS: SXH_SERVER_CERT_IGNORE_ALL_SERVER_ERRORS with scala.Double = js.native
  /* 4096 */ val SXH_SERVER_CERT_IGNORE_CERT_CN_INVALID: SXH_SERVER_CERT_IGNORE_CERT_CN_INVALID with scala.Double = js.native
  /* 8192 */ val SXH_SERVER_CERT_IGNORE_CERT_DATE_INVALID: SXH_SERVER_CERT_IGNORE_CERT_DATE_INVALID with scala.Double = js.native
  /* 256 */ val SXH_SERVER_CERT_IGNORE_UNKNOWN_CA: SXH_SERVER_CERT_IGNORE_UNKNOWN_CA with scala.Double = js.native
  /* 512 */ val SXH_SERVER_CERT_IGNORE_WRONG_USAGE: SXH_SERVER_CERT_IGNORE_WRONG_USAGE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsxml2Lib.MSXML2Ns._SXH_SERVER_CERT_OPTION with scala.Double] = js.native
}

