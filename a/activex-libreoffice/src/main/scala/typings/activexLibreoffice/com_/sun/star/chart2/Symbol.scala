package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.drawing.PolyPolygonBezierCoords
import typings.activexLibreoffice.com_.sun.star.graphic.XGraphic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** properties that are used for {@link DataSeries} that display symbols. */
trait Symbol extends StObject {
  
  /**
    * The color used for drawing the border of symbols.
    *
    * Only effective if {@link Style} is SymbolStyle::AUTO, SymbolStyle::STANDARD or SymbolStyle::POLYGON.
    */
  var BorderColor: Double
  
  /**
    * The color used for filling symbols that contain closed polygons.
    *
    * Only effective if {@link Style} is SymbolStyle::AUTO, SymbolStyle::STANDARD or SymbolStyle::POLYGON.
    */
  var FillColor: Double
  
  /** use this graphic as symbol */
  var Graphic: XGraphic
  
  /** The given polygon is used as symbol. */
  var PolygonCoords: PolyPolygonBezierCoords
  
  /** The size of the symbol in 100th of a mm. */
  var Size: typings.activexLibreoffice.com_.sun.star.awt.Size
  
  /**
    * Use the nth standard symbol, if {@link Style} is set to SymbolStlye::STANDARD.
    *
    * If n is the number of standard symbols available in an implementation, the symbol number is {@link StandardSymbol} modulo n.
    *
    * The default implementation for example currently uses 8 different standard symbols that are matched to the numbers 0 to 7.
    *
    * {{table here, see documentation}}
    */
  var StandardSymbol: Double
  
  /** determines which of the following members determines the appearance of the symbol. */
  var Style: SymbolStyle
}
object Symbol {
  
  inline def apply(
    BorderColor: Double,
    FillColor: Double,
    Graphic: XGraphic,
    PolygonCoords: PolyPolygonBezierCoords,
    Size: Size,
    StandardSymbol: Double,
    Style: SymbolStyle
  ): Symbol = {
    val __obj = js.Dynamic.literal(BorderColor = BorderColor.asInstanceOf[js.Any], FillColor = FillColor.asInstanceOf[js.Any], Graphic = Graphic.asInstanceOf[js.Any], PolygonCoords = PolygonCoords.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], StandardSymbol = StandardSymbol.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
  
  extension [Self <: Symbol](x: Self) {
    
    inline def setBorderColor(value: Double): Self = StObject.set(x, "BorderColor", value.asInstanceOf[js.Any])
    
    inline def setFillColor(value: Double): Self = StObject.set(x, "FillColor", value.asInstanceOf[js.Any])
    
    inline def setGraphic(value: XGraphic): Self = StObject.set(x, "Graphic", value.asInstanceOf[js.Any])
    
    inline def setPolygonCoords(value: PolyPolygonBezierCoords): Self = StObject.set(x, "PolygonCoords", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Size): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setStandardSymbol(value: Double): Self = StObject.set(x, "StandardSymbol", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: SymbolStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
  }
}
