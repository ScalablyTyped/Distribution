package typings.activexDashFaxcomexlib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxServer Class */
@JSGlobal("FAXCOMEXLib.FaxServer")
@js.native
class FaxServer protected () extends IFaxServer {
  /** Fax server configuration */
  val Configuration: FaxConfiguration = js.native
  /** FaxAccount for the current connection */
  val CurrentAccount: FaxAccount = js.native
  var `FAXCOMEXLib.FaxServer_typekey`: FaxServer = js.native
  /** The FaxAccountSet configuration object */
  val FaxAccountSet: typings.activexDashFaxcomexlib.FAXCOMEXLibNs.FaxAccountSet = js.native
  /** The security configuration object */
  val Security2: FaxSecurity2 = js.native
}

