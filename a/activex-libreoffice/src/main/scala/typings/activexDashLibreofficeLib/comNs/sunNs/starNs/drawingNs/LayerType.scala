package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LayerType extends js.Object

/** This enumeration specifies the type of a drawing layer. */
@JSGlobal("com.sun.star.drawing.LayerType")
@js.native
object LayerType extends js.Object {
  /** This is the layer for the controls. */
  @js.native
  sealed trait CONTROLSA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LayerType
  
  /** This is the layer for all measure shapes. */
  @js.native
  sealed trait DIMENSIONIANG_LINES
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LayerType
  
  /** This is the layer for all standard shapes. */
  @js.native
  sealed trait LAYOUT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LayerType
  
  /** There can be zero or more layers of this type. */
  @js.native
  sealed trait USER_DEFINED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LayerType
  
  /* 1 */ val CONTROLSA: CONTROLSA with scala.Double = js.native
  /* 2 */ val DIMENSIONIANG_LINES: DIMENSIONIANG_LINES with scala.Double = js.native
  /* 0 */ val LAYOUT: LAYOUT with scala.Double = js.native
  /* 3 */ val USER_DEFINED: USER_DEFINED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LayerType with scala.Double
  ] = js.native
}

