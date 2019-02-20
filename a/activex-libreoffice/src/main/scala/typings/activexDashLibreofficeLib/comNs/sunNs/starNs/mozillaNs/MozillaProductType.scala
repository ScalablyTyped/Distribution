package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MozillaProductType extends js.Object

/** Mozilla Product Types */
@JSGlobal("com.sun.star.mozilla.MozillaProductType")
@js.native
object MozillaProductType extends js.Object {
  /** Any product */
  @js.native
  sealed trait Default
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs.MozillaProductType
  
  /** Mozilla's next generation web browser. */
  @js.native
  sealed trait Firefox
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs.MozillaProductType
  
  /** Mozilla browse and mail suite */
  @js.native
  sealed trait Mozilla
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs.MozillaProductType
  
  /** Mozilla's next generation e-mail client. */
  @js.native
  sealed trait Thunderbird
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs.MozillaProductType
  
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 2 */ val Firefox: Firefox with scala.Double = js.native
  /* 1 */ val Mozilla: Mozilla with scala.Double = js.native
  /* 3 */ val Thunderbird: Thunderbird with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs.MozillaProductType with scala.Double
  ] = js.native
}

