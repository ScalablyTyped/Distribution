package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Miscellaneous extends js.Object

/** Miscellaneous string constants */
@JSGlobal("WIA.Miscellaneous")
@js.native
object Miscellaneous extends js.Object {
  @js.native
  sealed trait wiaAnyDeviceID
    extends activexDashWiaLib.WIANs.Miscellaneous
  
  @js.native
  sealed trait wiaIDUnknown
    extends activexDashWiaLib.WIANs.Miscellaneous
  
  /* "*" */ val wiaAnyDeviceID: wiaAnyDeviceID with java.lang.String = js.native
  /* "{00000000-0000-0000-0000-000000000000}" */ val wiaIDUnknown: wiaIDUnknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[activexDashWiaLib.WIANs.Miscellaneous with java.lang.String] = js.native
}

