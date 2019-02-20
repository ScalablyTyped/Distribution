package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PushButtonType extends js.Object

/** specifies the default actions of a button. */
@JSGlobal("com.sun.star.awt.PushButtonType")
@js.native
object PushButtonType extends js.Object {
  /** acts like a cancel button. */
  @js.native
  sealed trait CANCEL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.PushButtonType
  
  /** acts like a help button. */
  @js.native
  sealed trait HELP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.PushButtonType
  
  /** acts like a OK button. */
  @js.native
  sealed trait OK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.PushButtonType
  
  /** acts like a standard push button. */
  @js.native
  sealed trait STANDARD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.PushButtonType
  
  /* 2 */ val CANCEL: CANCEL with scala.Double = js.native
  /* 3 */ val HELP: HELP with scala.Double = js.native
  /* 1 */ val OK: OK with scala.Double = js.native
  /* 0 */ val STANDARD: STANDARD with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.PushButtonType with scala.Double
  ] = js.native
}

