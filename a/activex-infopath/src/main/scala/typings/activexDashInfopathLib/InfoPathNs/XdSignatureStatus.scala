package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XdSignatureStatus extends js.Object

@JSGlobal("InfoPath.XdSignatureStatus")
@js.native
object XdSignatureStatus extends js.Object {
  @js.native
  sealed trait xdSignatureStatusError
    extends activexDashInfopathLib.InfoPathNs.XdSignatureStatus
  
  @js.native
  sealed trait xdSignatureStatusInvalid
    extends activexDashInfopathLib.InfoPathNs.XdSignatureStatus
  
  @js.native
  sealed trait xdSignatureStatusUnsupported
    extends activexDashInfopathLib.InfoPathNs.XdSignatureStatus
  
  @js.native
  sealed trait xdSignatureStatusValid
    extends activexDashInfopathLib.InfoPathNs.XdSignatureStatus
  
  /* 0 */ val xdSignatureStatusError: xdSignatureStatusError with scala.Double = js.native
  /* 2 */ val xdSignatureStatusInvalid: xdSignatureStatusInvalid with scala.Double = js.native
  /* 3 */ val xdSignatureStatusUnsupported: xdSignatureStatusUnsupported with scala.Double = js.native
  /* 1 */ val xdSignatureStatusValid: xdSignatureStatusValid with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashInfopathLib.InfoPathNs.XdSignatureStatus with scala.Double] = js.native
}

