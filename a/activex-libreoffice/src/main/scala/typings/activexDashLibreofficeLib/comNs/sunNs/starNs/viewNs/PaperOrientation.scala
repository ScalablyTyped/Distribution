package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PaperOrientation extends js.Object

/** specifies the orientation of the paper. */
@JSGlobal("com.sun.star.view.PaperOrientation")
@js.native
object PaperOrientation extends js.Object {
  /** set the paper orientation to landscape. */
  @js.native
  sealed trait LANDSCAPE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PaperOrientation
  
  /** set the paper orientation to portrait. */
  @js.native
  sealed trait PORTRAIT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PaperOrientation
  
  /* 1 */ val LANDSCAPE: LANDSCAPE with scala.Double = js.native
  /* 0 */ val PORTRAIT: PORTRAIT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PaperOrientation with scala.Double
  ] = js.native
}

