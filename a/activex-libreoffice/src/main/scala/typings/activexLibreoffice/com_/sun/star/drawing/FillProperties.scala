package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.awt.Gradient
import typings.activexLibreoffice.com_.sun.star.awt.XBitmap
import typings.activexLibreoffice.com_.sun.star.text.GraphicCrop
import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is a set of properties to describe the style for rendering an area. */
trait FillProperties extends StObject {
  
  /** if this is `TRUE` , the transparent background of a hatch filled area is drawn in the current background color. */
  var FillBackground: Boolean
  
  /** If the property {@link FillStyle} is set to FillStyle::BITMAP, this is the bitmap used. */
  var FillBitmap: XBitmap
  
  /**
    * specifies if the size is given in percentage or as an absolute value.
    *
    * If this is `TRUE` , the properties {@link FillBitmapSizeX} and {@link FillBitmapSizeY} contain the size of the tile in percent of the size of the
    * original bitmap. If this is `FALSE` , the size of the tile is specified with 1/100th mm.
    */
  var FillBitmapLogicalSize: Boolean
  
  /**
    * this enum selects how a area is filled with a single bitmap.
    *
    * This property corresponds to the properties {@link FillBitmapStretch} and {@link FillBitmapTile} .
    *
    * If set to BitmapMode::REPEAT, the property FillBitmapStretch is set to `FALSE` , and the property FillBitmapTile is set to `TRUE` .
    *
    * If set to BitmapMode::STRETCH, the property FillBitmapStretch is set to `TRUE` , and the property FillBitmapTile is set to `FALSE` .
    *
    * If set to BitmapMode::NO_REPEAT, both properties FillBitmapStretch and FillBitmapTile are set to `FALSE` .
    */
  var FillBitmapMode: BitmapMode
  
  /** If the property {@link FillStyle} is set to FillStyle::BITMAP, this is the name of the used fill bitmap style. */
  var FillBitmapName: String
  
  /** Every second line of tiles is moved the given percent of the width of the bitmap. */
  var FillBitmapOffsetX: Double
  
  /** Every second row of tiles is moved the given percent of the height of the bitmap. */
  var FillBitmapOffsetY: Double
  
  /**
    * This is the horizontal offset where the tile starts.
    *
    * It is given in percent in relation to the width of the bitmap.
    */
  var FillBitmapPositionOffsetX: Double
  
  /**
    * This is the vertical offset where the tile starts.
    *
    * It is given in percent in relation to the height of the bitmap.
    */
  var FillBitmapPositionOffsetY: Double
  
  /** The RectanglePoint specifies the position inside of the bitmap to use as the top left position for rendering. */
  var FillBitmapRectanglePoint: RectanglePoint
  
  /**
    * This is the width of the tile for filling.
    *
    * Depending on the property {@link FillBitmapLogicalSize} , this is either relative or absolute.
    */
  var FillBitmapSizeX: Double
  
  /**
    * This is the height of the tile for filling.
    *
    * Depending on the property {@link FillBitmapLogicalSize} , this is either relative or absolute.
    */
  var FillBitmapSizeY: Double
  
  /**
    * if set, the fill bitmap is stretched to fill the area of the shape.
    *
    * This property should not be used anymore and is included here for completeness. The {@link FillBitmapMode} property can be used instead to set all
    * supported bitmap modes.
    *
    * If set to `TRUE` , the value of the FillBitmapMode property changes to BitmapMode::STRETCH. BUT: behavior is undefined, if the property {@link
    * FillBitmapTile} is `TRUE` too.
    *
    * If set to `FALSE` , the value of the FillBitmapMode property changes to BitmapMode::REPEAT or BitmapMode::NO_REPEAT, depending on the current value of
    * the {@link FillBitmapTile} property.
    */
  var FillBitmapStretch: Boolean
  
  /**
    * if set, the fill bitmap is repeated to fill the area of the shape.
    *
    * This property should not be used anymore and is included here for completeness. The {@link FillBitmapMode} property can be used instead to set all
    * supported bitmap modes.
    *
    * If set to `TRUE` , the value of the FillBitmapMode property changes to BitmapMode::REPEAT. BUT: behavior is undefined, if the property {@link
    * FillBitmapStretch} is `TRUE` too.
    *
    * If set to `FALSE` , the value of the FillBitmapMode property changes to BitmapMode::STRETCH or BitmapMode::NO_REPEAT, depending on the current value
    * of the {@link FillBitmapStretch} property.
    */
  var FillBitmapTile: Boolean
  
  /** If the property {@link FillStyle} is set to FillStyle::BITMAP, this is a URL to the bitmap used. */
  var FillBitmapURL: String
  
  /** If the property {@link FillStyle} is set to FillStyle::SOLID, this is the color used. */
  var FillColor: Color
  
  /** If the property {@link FillStyle} is set to FillStyle::GRADIENT, this describes the gradient used. */
  var FillGradient: Gradient
  
  /** If the property {@link FillStyle} is set to FillStyle::GRADIENT, this is the name of the used fill gradient style. */
  var FillGradientName: String
  
  /** If the property {@link FillStyle} is set to FillStyle::HATCH, this describes the hatch used. */
  var FillHatch: Hatch
  
  /** If the property {@link FillStyle} is set to FillStyle::HATCH, this is the name of the used fill hatch style. */
  var FillHatchName: String
  
  /** This enumeration selects the style the area will be filled with. */
  var FillStyle: typings.activexLibreoffice.com_.sun.star.drawing.FillStyle
  
  /**
    * This is the transparence of the filled area.
    *
    * This property is only valid if the property {@link FillStyle} is set to FillStyle::SOLID.
    */
  var FillTransparence: Double
  
  /** This describes the transparency of the fill area as a gradient. */
  var FillTransparenceGradient: Gradient
  
  /**
    * If a gradient is used for transparency, this is the name of the used transparence gradient style or it is empty. If you set the name of a transparence
    * gradient style contained in the document, this style used.
    */
  var FillTransparenceGradientName: String
  
  /**
    * contains the cropping of the object.
    *
    * If the property {@link FillBitmapMode} is set to BitmapMode::STRETCH, this is the cropping, otherwise it is empty.
    * @see com.sun.star.text.GraphicCrop
    * @since LibreOffice 4.3
    */
  var GraphicCrop: typings.activexLibreoffice.com_.sun.star.text.GraphicCrop
}
object FillProperties {
  
  inline def apply(
    FillBackground: Boolean,
    FillBitmap: XBitmap,
    FillBitmapLogicalSize: Boolean,
    FillBitmapMode: BitmapMode,
    FillBitmapName: String,
    FillBitmapOffsetX: Double,
    FillBitmapOffsetY: Double,
    FillBitmapPositionOffsetX: Double,
    FillBitmapPositionOffsetY: Double,
    FillBitmapRectanglePoint: RectanglePoint,
    FillBitmapSizeX: Double,
    FillBitmapSizeY: Double,
    FillBitmapStretch: Boolean,
    FillBitmapTile: Boolean,
    FillBitmapURL: String,
    FillColor: Color,
    FillGradient: Gradient,
    FillGradientName: String,
    FillHatch: Hatch,
    FillHatchName: String,
    FillStyle: FillStyle,
    FillTransparence: Double,
    FillTransparenceGradient: Gradient,
    FillTransparenceGradientName: String,
    GraphicCrop: GraphicCrop
  ): FillProperties = {
    val __obj = js.Dynamic.literal(FillBackground = FillBackground.asInstanceOf[js.Any], FillBitmap = FillBitmap.asInstanceOf[js.Any], FillBitmapLogicalSize = FillBitmapLogicalSize.asInstanceOf[js.Any], FillBitmapMode = FillBitmapMode.asInstanceOf[js.Any], FillBitmapName = FillBitmapName.asInstanceOf[js.Any], FillBitmapOffsetX = FillBitmapOffsetX.asInstanceOf[js.Any], FillBitmapOffsetY = FillBitmapOffsetY.asInstanceOf[js.Any], FillBitmapPositionOffsetX = FillBitmapPositionOffsetX.asInstanceOf[js.Any], FillBitmapPositionOffsetY = FillBitmapPositionOffsetY.asInstanceOf[js.Any], FillBitmapRectanglePoint = FillBitmapRectanglePoint.asInstanceOf[js.Any], FillBitmapSizeX = FillBitmapSizeX.asInstanceOf[js.Any], FillBitmapSizeY = FillBitmapSizeY.asInstanceOf[js.Any], FillBitmapStretch = FillBitmapStretch.asInstanceOf[js.Any], FillBitmapTile = FillBitmapTile.asInstanceOf[js.Any], FillBitmapURL = FillBitmapURL.asInstanceOf[js.Any], FillColor = FillColor.asInstanceOf[js.Any], FillGradient = FillGradient.asInstanceOf[js.Any], FillGradientName = FillGradientName.asInstanceOf[js.Any], FillHatch = FillHatch.asInstanceOf[js.Any], FillHatchName = FillHatchName.asInstanceOf[js.Any], FillStyle = FillStyle.asInstanceOf[js.Any], FillTransparence = FillTransparence.asInstanceOf[js.Any], FillTransparenceGradient = FillTransparenceGradient.asInstanceOf[js.Any], FillTransparenceGradientName = FillTransparenceGradientName.asInstanceOf[js.Any], GraphicCrop = GraphicCrop.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillProperties]
  }
  
  extension [Self <: FillProperties](x: Self) {
    
    inline def setFillBackground(value: Boolean): Self = StObject.set(x, "FillBackground", value.asInstanceOf[js.Any])
    
    inline def setFillBitmap(value: XBitmap): Self = StObject.set(x, "FillBitmap", value.asInstanceOf[js.Any])
    
    inline def setFillBitmapLogicalSize(value: Boolean): Self = StObject.set(x, "FillBitmapLogicalSize", value.asInstanceOf[js.Any])
    
    inline def setFillBitmapMode(value: BitmapMode): Self = StObject.set(x, "FillBitmapMode", value.asInstanceOf[js.Any])
    
    inline def setFillBitmapName(value: String): Self = StObject.set(x, "FillBitmapName", value.asInstanceOf[js.Any])
    
    inline def setFillBitmapOffsetX(value: Double): Self = StObject.set(x, "FillBitmapOffsetX", value.asInstanceOf[js.Any])
    
    inline def setFillBitmapOffsetY(value: Double): Self = StObject.set(x, "FillBitmapOffsetY", value.asInstanceOf[js.Any])
    
    inline def setFillBitmapPositionOffsetX(value: Double): Self = StObject.set(x, "FillBitmapPositionOffsetX", value.asInstanceOf[js.Any])
    
    inline def setFillBitmapPositionOffsetY(value: Double): Self = StObject.set(x, "FillBitmapPositionOffsetY", value.asInstanceOf[js.Any])
    
    inline def setFillBitmapRectanglePoint(value: RectanglePoint): Self = StObject.set(x, "FillBitmapRectanglePoint", value.asInstanceOf[js.Any])
    
    inline def setFillBitmapSizeX(value: Double): Self = StObject.set(x, "FillBitmapSizeX", value.asInstanceOf[js.Any])
    
    inline def setFillBitmapSizeY(value: Double): Self = StObject.set(x, "FillBitmapSizeY", value.asInstanceOf[js.Any])
    
    inline def setFillBitmapStretch(value: Boolean): Self = StObject.set(x, "FillBitmapStretch", value.asInstanceOf[js.Any])
    
    inline def setFillBitmapTile(value: Boolean): Self = StObject.set(x, "FillBitmapTile", value.asInstanceOf[js.Any])
    
    inline def setFillBitmapURL(value: String): Self = StObject.set(x, "FillBitmapURL", value.asInstanceOf[js.Any])
    
    inline def setFillColor(value: Color): Self = StObject.set(x, "FillColor", value.asInstanceOf[js.Any])
    
    inline def setFillGradient(value: Gradient): Self = StObject.set(x, "FillGradient", value.asInstanceOf[js.Any])
    
    inline def setFillGradientName(value: String): Self = StObject.set(x, "FillGradientName", value.asInstanceOf[js.Any])
    
    inline def setFillHatch(value: Hatch): Self = StObject.set(x, "FillHatch", value.asInstanceOf[js.Any])
    
    inline def setFillHatchName(value: String): Self = StObject.set(x, "FillHatchName", value.asInstanceOf[js.Any])
    
    inline def setFillStyle(value: FillStyle): Self = StObject.set(x, "FillStyle", value.asInstanceOf[js.Any])
    
    inline def setFillTransparence(value: Double): Self = StObject.set(x, "FillTransparence", value.asInstanceOf[js.Any])
    
    inline def setFillTransparenceGradient(value: Gradient): Self = StObject.set(x, "FillTransparenceGradient", value.asInstanceOf[js.Any])
    
    inline def setFillTransparenceGradientName(value: String): Self = StObject.set(x, "FillTransparenceGradientName", value.asInstanceOf[js.Any])
    
    inline def setGraphicCrop(value: GraphicCrop): Self = StObject.set(x, "GraphicCrop", value.asInstanceOf[js.Any])
  }
}
