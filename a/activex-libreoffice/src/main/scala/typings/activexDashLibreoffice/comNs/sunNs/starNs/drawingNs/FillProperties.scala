package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Gradient
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XBitmap
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.GraphicCrop
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is a set of properties to describe the style for rendering an area. */
trait FillProperties extends js.Object {
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
  var FillStyle: typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.FillStyle
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
  var GraphicCrop: typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.GraphicCrop
}

object FillProperties {
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(FillBackground = FillBackground, FillBitmap = FillBitmap, FillBitmapLogicalSize = FillBitmapLogicalSize, FillBitmapMode = FillBitmapMode, FillBitmapName = FillBitmapName, FillBitmapOffsetX = FillBitmapOffsetX, FillBitmapOffsetY = FillBitmapOffsetY, FillBitmapPositionOffsetX = FillBitmapPositionOffsetX, FillBitmapPositionOffsetY = FillBitmapPositionOffsetY, FillBitmapRectanglePoint = FillBitmapRectanglePoint, FillBitmapSizeX = FillBitmapSizeX, FillBitmapSizeY = FillBitmapSizeY, FillBitmapStretch = FillBitmapStretch, FillBitmapTile = FillBitmapTile, FillBitmapURL = FillBitmapURL, FillColor = FillColor, FillGradient = FillGradient, FillGradientName = FillGradientName, FillHatch = FillHatch, FillHatchName = FillHatchName, FillStyle = FillStyle, FillTransparence = FillTransparence, FillTransparenceGradient = FillTransparenceGradient, FillTransparenceGradientName = FillTransparenceGradientName, GraphicCrop = GraphicCrop)
  
    __obj.asInstanceOf[FillProperties]
  }
}

