package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransparencyStyle extends js.Object

@JSGlobal("com.sun.star.chart2.TransparencyStyle")
@js.native
object TransparencyStyle extends js.Object {
  /** The property TransparencyGradient is evaluated, Transparency is ignored */
  @js.native
  sealed trait GRADIENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.TransparencyStyle
  
  /** The property Transparency is evaluated, TransparencyGradient is ignored */
  @js.native
  sealed trait LINEAR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.TransparencyStyle
  
  /**
    * Default, no pies are exploded.
    *
    * The symbol is invisible
    *
    * no transparency attribute is evaluated
    */
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.TransparencyStyle
  
  /* 2 */ val GRADIENT: GRADIENT with scala.Double = js.native
  /* 1 */ val LINEAR: LINEAR with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.TransparencyStyle with scala.Double
  ] = js.native
}

