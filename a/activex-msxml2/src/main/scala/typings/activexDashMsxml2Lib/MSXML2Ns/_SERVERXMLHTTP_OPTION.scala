package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _SERVERXMLHTTP_OPTION extends js.Object

@JSGlobal("MSXML2._SERVERXMLHTTP_OPTION")
@js.native
object _SERVERXMLHTTP_OPTION extends js.Object {
  @js.native
  sealed trait SXH_OPTION_ESCAPE_PERCENT_IN_URL
    extends activexDashMsxml2Lib.MSXML2Ns._SERVERXMLHTTP_OPTION
  
  @js.native
  sealed trait SXH_OPTION_IGNORE_SERVER_SSL_CERT_ERROR_FLAGS
    extends activexDashMsxml2Lib.MSXML2Ns._SERVERXMLHTTP_OPTION
  
  @js.native
  sealed trait SXH_OPTION_SELECT_CLIENT_SSL_CERT
    extends activexDashMsxml2Lib.MSXML2Ns._SERVERXMLHTTP_OPTION
  
  @js.native
  sealed trait SXH_OPTION_URL
    extends activexDashMsxml2Lib.MSXML2Ns._SERVERXMLHTTP_OPTION
  
  @js.native
  sealed trait SXH_OPTION_URL_CODEPAGE
    extends activexDashMsxml2Lib.MSXML2Ns._SERVERXMLHTTP_OPTION
  
  /* 1 */ val SXH_OPTION_ESCAPE_PERCENT_IN_URL: SXH_OPTION_ESCAPE_PERCENT_IN_URL with scala.Double = js.native
  /* 2 */ val SXH_OPTION_IGNORE_SERVER_SSL_CERT_ERROR_FLAGS: SXH_OPTION_IGNORE_SERVER_SSL_CERT_ERROR_FLAGS with scala.Double = js.native
  /* 3 */ val SXH_OPTION_SELECT_CLIENT_SSL_CERT: SXH_OPTION_SELECT_CLIENT_SSL_CERT with scala.Double = js.native
  /* -1 */ val SXH_OPTION_URL: SXH_OPTION_URL with scala.Double = js.native
  /* 0 */ val SXH_OPTION_URL_CODEPAGE: SXH_OPTION_URL_CODEPAGE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsxml2Lib.MSXML2Ns._SERVERXMLHTTP_OPTION with scala.Double] = js.native
}

