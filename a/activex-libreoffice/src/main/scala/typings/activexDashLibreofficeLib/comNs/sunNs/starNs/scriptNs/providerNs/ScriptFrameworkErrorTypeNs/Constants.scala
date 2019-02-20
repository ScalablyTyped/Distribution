package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.ScriptFrameworkErrorTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.script.provider.ScriptFrameworkErrorType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait MALFORMED_URL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.ScriptFrameworkErrorTypeNs.Constants
  
  @js.native
  sealed trait NOTSUPPORTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.ScriptFrameworkErrorTypeNs.Constants
  
  @js.native
  sealed trait NO_SUCH_SCRIPT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.ScriptFrameworkErrorTypeNs.Constants
  
  @js.native
  sealed trait UNKNOWN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.ScriptFrameworkErrorTypeNs.Constants
  
  /* 3 */ val MALFORMED_URL: MALFORMED_URL with scala.Double = js.native
  /* 1 */ val NOTSUPPORTED: NOTSUPPORTED with scala.Double = js.native
  /* 2 */ val NO_SUCH_SCRIPT: NO_SUCH_SCRIPT with scala.Double = js.native
  /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs.ScriptFrameworkErrorTypeNs.Constants with scala.Double
  ] = js.native
}

