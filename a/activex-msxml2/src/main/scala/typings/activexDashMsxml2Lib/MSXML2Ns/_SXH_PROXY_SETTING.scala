package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _SXH_PROXY_SETTING extends js.Object

@JSGlobal("MSXML2._SXH_PROXY_SETTING")
@js.native
object _SXH_PROXY_SETTING extends js.Object {
  @js.native
  sealed trait SXH_PROXY_SET_DEFAULT
    extends activexDashMsxml2Lib.MSXML2Ns._SXH_PROXY_SETTING
  
  @js.native
  sealed trait SXH_PROXY_SET_DIRECT
    extends activexDashMsxml2Lib.MSXML2Ns._SXH_PROXY_SETTING
  
  @js.native
  sealed trait SXH_PROXY_SET_PRECONFIG
    extends activexDashMsxml2Lib.MSXML2Ns._SXH_PROXY_SETTING
  
  @js.native
  sealed trait SXH_PROXY_SET_PROXY
    extends activexDashMsxml2Lib.MSXML2Ns._SXH_PROXY_SETTING
  
  /* 0 */ val SXH_PROXY_SET_DEFAULT: SXH_PROXY_SET_DEFAULT with scala.Double = js.native
  /* 1 */ val SXH_PROXY_SET_DIRECT: SXH_PROXY_SET_DIRECT with scala.Double = js.native
  /* 0 */ val SXH_PROXY_SET_PRECONFIG: SXH_PROXY_SET_PRECONFIG with scala.Double = js.native
  /* 2 */ val SXH_PROXY_SET_PROXY: SXH_PROXY_SET_PROXY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsxml2Lib.MSXML2Ns._SXH_PROXY_SETTING with scala.Double] = js.native
}

