package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConversionDirection extends js.Object

/**
  * Conversion direction to be used with {@link XConversionDictionary} when looking for conversions.
  * @since OOo 1.1.2
  */
@JSGlobal("com.sun.star.linguistic2.ConversionDirection")
@js.native
object ConversionDirection extends js.Object {
  /** the text to be looked for should match the left part of a dictionary entry. */
  @js.native
  sealed trait FROM_LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.ConversionDirection
  
  /** the text to be looked for should match the right part of a dictionary entry. */
  @js.native
  sealed trait FROM_RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.ConversionDirection
  
  /* 0 */ val FROM_LEFT: FROM_LEFT with scala.Double = js.native
  /* 1 */ val FROM_RIGHT: FROM_RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.ConversionDirection with scala.Double
  ] = js.native
}

