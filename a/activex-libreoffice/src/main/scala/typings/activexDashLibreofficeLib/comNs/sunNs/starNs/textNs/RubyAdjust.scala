package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RubyAdjust extends js.Object

/** These enumeration values describe the adjustment of ruby text. */
@JSGlobal("com.sun.star.text.RubyAdjust")
@js.native
object RubyAdjust extends js.Object {
  /** adjusted to both borders / stretched */
  @js.native
  sealed trait BLOCK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.RubyAdjust
  
  /**
    * the object is adjusted to the center.
    *
    * centric adjusted.
    */
  @js.native
  sealed trait CENTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.RubyAdjust
  
  /** adjusted to both borders except for a small indent on both sides */
  @js.native
  sealed trait INDENT_BLOCK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.RubyAdjust
  
  /**
    * the object is left adjusted.
    *
    * adjusted to the left.
    *
    * text flows to the left side of the object.
    */
  @js.native
  sealed trait LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.RubyAdjust
  
  /**
    * the object is right adjusted.
    *
    * adjusted to the right.
    *
    * text flows to the right side of the object.
    */
  @js.native
  sealed trait RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.RubyAdjust
  
  /* 3 */ val BLOCK: BLOCK with scala.Double = js.native
  /* 1 */ val CENTER: CENTER with scala.Double = js.native
  /* 4 */ val INDENT_BLOCK: INDENT_BLOCK with scala.Double = js.native
  /* 0 */ val LEFT: LEFT with scala.Double = js.native
  /* 2 */ val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.RubyAdjust with scala.Double] = js.native
}

