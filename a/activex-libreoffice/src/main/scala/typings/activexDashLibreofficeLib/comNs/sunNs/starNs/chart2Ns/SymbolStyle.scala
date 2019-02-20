package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SymbolStyle extends js.Object

/** determines what kind of symbol to use */
@JSGlobal("com.sun.star.chart2.SymbolStyle")
@js.native
object SymbolStyle extends js.Object {
  /**
    * The symbol is taken automatically. <p>This will typically be the nth standard symbol for the nth
    *
    * data series.</p>
    */
  @js.native
  sealed trait AUTO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.SymbolStyle
  
  /** uses the graphic given in {@link Symbol.Graphic} as symbol. */
  @js.native
  sealed trait GRAPHIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.SymbolStyle
  
  /**
    * Default, no pies are exploded.
    *
    * The symbol is invisible
    *
    * no transparency attribute is evaluated
    */
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.SymbolStyle
  
  /** uses the symbol given in the {@link com.sun.star.drawing.PolyPolygonBezierCoords} given in {@link Symbol.PolygonCoords} . */
  @js.native
  sealed trait POLYGON
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.SymbolStyle
  
  /** uses one of the standard symbols. Which standard symbol is given in {@link Symbol.StandardSymbol} . */
  @js.native
  sealed trait STANDARD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.SymbolStyle
  
  /* 1 */ val AUTO: AUTO with scala.Double = js.native
  /* 4 */ val GRAPHIC: GRAPHIC with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 3 */ val POLYGON: POLYGON with scala.Double = js.native
  /* 2 */ val STANDARD: STANDARD with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.SymbolStyle with scala.Double
  ] = js.native
}

