package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** determines what kind of symbol to use */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
*/
trait SymbolStyle extends js.Object

object SymbolStyle {
  /**
    * The symbol is taken automatically. <p>This will typically be the nth standard symbol for the nth
    *
    * data series.</p>
    */
  @scala.inline
  def AUTO: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** uses the graphic given in {@link Symbol.Graphic} as symbol. */
  @scala.inline
  def GRAPHIC: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /**
    * Default, no pies are exploded.
    *
    * The symbol is invisible
    *
    * no transparency attribute is evaluated
    */
  @scala.inline
  def NONE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** uses the symbol given in the {@link com.sun.star.drawing.PolyPolygonBezierCoords} given in {@link Symbol.PolygonCoords} . */
  @scala.inline
  def POLYGON: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** uses one of the standard symbols. Which standard symbol is given in {@link Symbol.StandardSymbol} . */
  @scala.inline
  def STANDARD: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

