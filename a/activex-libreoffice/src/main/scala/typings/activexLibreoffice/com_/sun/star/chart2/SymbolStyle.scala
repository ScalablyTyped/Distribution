package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** determines what kind of symbol to use */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
*/
trait SymbolStyle extends js.Object
object SymbolStyle {
  
  /**
    * The symbol is taken automatically. <p>This will typically be the nth standard symbol for the nth
    *
    * data series.</p>
    */
  @scala.inline
  def AUTO: `1` = 1.asInstanceOf[`1`]
  
  /** uses the graphic given in {@link Symbol.Graphic} as symbol. */
  @scala.inline
  def GRAPHIC: `4` = 4.asInstanceOf[`4`]
  
  /**
    * Default, no pies are exploded.
    *
    * The symbol is invisible
    *
    * no transparency attribute is evaluated
    */
  @scala.inline
  def NONE: `0` = 0.asInstanceOf[`0`]
  
  /** uses the symbol given in the {@link com.sun.star.drawing.PolyPolygonBezierCoords} given in {@link Symbol.PolygonCoords} . */
  @scala.inline
  def POLYGON: `3` = 3.asInstanceOf[`3`]
  
  /** uses one of the standard symbols. Which standard symbol is given in {@link Symbol.StandardSymbol} . */
  @scala.inline
  def STANDARD: `2` = 2.asInstanceOf[`2`]
}
