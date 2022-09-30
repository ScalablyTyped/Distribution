package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import typings.activexLibreoffice.activexLibreofficeInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** determines what kind of symbol to use */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`4`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
*/
trait SymbolStyle extends StObject
object SymbolStyle {
  
  /**
    * The symbol is taken automatically. <p>This will typically be the nth standard symbol for the nth
    *
    * data series.</p>
    */
  inline def AUTO: `1` = 1.asInstanceOf[`1`]
  
  /** uses the graphic given in {@link Symbol.Graphic} as symbol. */
  inline def GRAPHIC: `4` = 4.asInstanceOf[`4`]
  
  /**
    * Default, no pies are exploded.
    *
    * The symbol is invisible
    *
    * no transparency attribute is evaluated
    */
  inline def NONE: `0` = 0.asInstanceOf[`0`]
  
  /** uses the symbol given in the {@link com.sun.star.drawing.PolyPolygonBezierCoords} given in {@link Symbol.PolygonCoords} . */
  inline def POLYGON: `3` = 3.asInstanceOf[`3`]
  
  /** uses one of the standard symbols. Which standard symbol is given in {@link Symbol.StandardSymbol} . */
  inline def STANDARD: `2` = 2.asInstanceOf[`2`]
}
