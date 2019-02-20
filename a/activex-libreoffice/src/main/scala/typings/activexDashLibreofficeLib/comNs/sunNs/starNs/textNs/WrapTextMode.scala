package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WrapTextMode extends js.Object

/** enumeration values specify the text wrap around objects in a text. */
@JSGlobal("com.sun.star.text.WrapTextMode")
@js.native
object WrapTextMode extends js.Object {
  /** text flow depends on the situation. The text formatting decides the best way. */
  @js.native
  sealed trait DYNAMIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WrapTextMode
  
  /**
    * the object is left adjusted.
    *
    * adjusted to the left.
    *
    * text flows to the left side of the object.
    */
  @js.native
  sealed trait LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WrapTextMode
  
  /** text does not flow around the object. */
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WrapTextMode
  
  /** text flows to the left and right of the object. */
  @js.native
  sealed trait PARALLEL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WrapTextMode
  
  /**
    * the object is right adjusted.
    *
    * adjusted to the right.
    *
    * text flows to the right side of the object.
    */
  @js.native
  sealed trait RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WrapTextMode
  
  /** text flow ignores the object. */
  @js.native
  sealed trait THROUGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WrapTextMode
  
  /* 3 */ val DYNAMIC: DYNAMIC with scala.Double = js.native
  /* 4 */ val LEFT: LEFT with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 2 */ val PARALLEL: PARALLEL with scala.Double = js.native
  /* 5 */ val RIGHT: RIGHT with scala.Double = js.native
  /* 1 */ val THROUGHT: THROUGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WrapTextMode with scala.Double
  ] = js.native
}

