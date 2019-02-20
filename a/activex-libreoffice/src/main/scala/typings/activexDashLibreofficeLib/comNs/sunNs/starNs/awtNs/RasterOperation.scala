package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RasterOperation extends js.Object

/** These values are used to specify the binary pixel-operation applied when pixels are written to the device. */
@JSGlobal("com.sun.star.awt.RasterOperation")
@js.native
object RasterOperation extends js.Object {
  /** All bits which are affected by this operation are set to 1. */
  @js.native
  sealed trait ALLBITS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.RasterOperation
  
  /** All bits which are affected by this operation are inverted. */
  @js.native
  sealed trait INVERT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.RasterOperation
  
  /** sets all pixel as written in the output operation. */
  @js.native
  sealed trait OVERPAINT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.RasterOperation
  
  /** uses the pixel written as one and the current pixel as the other operator of an exclusive or-operation. */
  @js.native
  sealed trait XOR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.RasterOperation
  
  /** All bits which are affected by this operation are set to 0. */
  @js.native
  sealed trait ZEROBITS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.RasterOperation
  
  /* 3 */ val ALLBITS: ALLBITS with scala.Double = js.native
  /* 4 */ val INVERT: INVERT with scala.Double = js.native
  /* 0 */ val OVERPAINT: OVERPAINT with scala.Double = js.native
  /* 1 */ val XOR: XOR with scala.Double = js.native
  /* 2 */ val ZEROBITS: ZEROBITS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.RasterOperation with scala.Double
  ] = js.native
}

