package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Arrangement extends js.Object

/**
  * With this enumeration you can arrange the relative position of an object within the other objects.
  * @deprecated Deprecated
  */
@JSGlobal("com.sun.star.drawing.Arrangement")
@js.native
object Arrangement extends js.Object {
  /** Move this object behind all other objects. */
  @js.native
  sealed trait BACK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Arrangement
  
  /** Move this object in front of all other objects. */
  @js.native
  sealed trait FRONT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Arrangement
  
  /** Move this object one object more to the back. */
  @js.native
  sealed trait MORE_BACK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Arrangement
  
  /** Move this object one object more to the front. */
  @js.native
  sealed trait MORE_FRONT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Arrangement
  
  /* 3 */ val BACK: BACK with scala.Double = js.native
  /* 0 */ val FRONT: FRONT with scala.Double = js.native
  /* 2 */ val MORE_BACK: MORE_BACK with scala.Double = js.native
  /* 1 */ val MORE_FRONT: MORE_FRONT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Arrangement with scala.Double
  ] = js.native
}

