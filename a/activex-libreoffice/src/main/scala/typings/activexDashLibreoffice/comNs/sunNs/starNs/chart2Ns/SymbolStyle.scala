package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** determines what kind of symbol to use */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
*/
trait SymbolStyle extends js.Object

object SymbolStyle {
  /**
    * The symbol is taken automatically. <p>This will typically be the nth standard symbol for the nth
    *
    * data series.</p>
    */
  @scala.inline
  def AUTO: `1` = this.cast(1)
  /** uses the graphic given in {@link Symbol.Graphic} as symbol. */
  @scala.inline
  def GRAPHIC: `4` = this.cast(4)
  /**
    * Default, no pies are exploded.
    *
    * The symbol is invisible
    *
    * no transparency attribute is evaluated
    */
  @scala.inline
  def NONE: `0` = this.cast(0)
  /** uses the symbol given in the {@link com.sun.star.drawing.PolyPolygonBezierCoords} given in {@link Symbol.PolygonCoords} . */
  @scala.inline
  def POLYGON: `3` = this.cast(3)
  /** uses one of the standard symbols. Which standard symbol is given in {@link Symbol.StandardSymbol} . */
  @scala.inline
  def STANDARD: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

