package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs.RenderingCapabilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.datatransfer.clipboard.RenderingCapabilities.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait Delayed
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs.RenderingCapabilitiesNs.Constants
  
  @js.native
  sealed trait Persistant
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs.RenderingCapabilitiesNs.Constants
  
  /* 1 */ val Delayed: Delayed with scala.Double = js.native
  /* 2 */ val Persistant: Persistant with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs.RenderingCapabilitiesNs.Constants with scala.Double
  ] = js.native
}

