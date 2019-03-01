package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is a set of properties to describe the style for rendering an area. */
trait FillProperties extends js.Object {
  /** if this is `TRUE` , the transparent background of a hatch filled area is drawn in the current background color. */
  var FillBackground: scala.Boolean
  /** If the property {@link FillStyle} is set to FillStyle::BITMAP, this is the bitmap used. */
  var FillBitmap: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XBitmap
  /**
    * specifies if the size is given in percentage or as an absolute value.
    *
    * If this is `TRUE` , the properties {@link FillBitmapSizeX} and {@link FillBitmapSizeY} contain the size of the tile in percent of the size of the
    * original bitmap. If this is `FALSE` , the size of the tile is specified with 1/100th mm.
    */
  var FillBitmapLogicalSize: scala.Boolean
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
  var FillBitmapName: java.lang.String
  /** Every second line of tiles is moved the given percent of the width of the bitmap. */
  var FillBitmapOffsetX: scala.Double
  /** Every second row of tiles is moved the given percent of the height of the bitmap. */
  var FillBitmapOffsetY: scala.Double
  /**
    * This is the horizontal offset where the tile starts.
    *
    * It is given in percent in relation to the width of the bitmap.
    */
  var FillBitmapPositionOffsetX: scala.Double
  /**
    * This is the vertical offset where the tile starts.
    *
    * It is given in percent in relation to the height of the bitmap.
    */
  var FillBitmapPositionOffsetY: scala.Double
  /** The RectanglePoint specifies the position inside of the bitmap to use as the top left position for rendering. */
  var FillBitmapRectanglePoint: RectanglePoint
  /**
    * This is the width of the tile for filling.
    *
    * Depending on the property {@link FillBitmapLogicalSize} , this is either relative or absolute.
    */
  var FillBitmapSizeX: scala.Double
  /**
    * This is the height of the tile for filling.
    *
    * Depending on the property {@link FillBitmapLogicalSize} , this is either relative or absolute.
    */
  var FillBitmapSizeY: scala.Double
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
  var FillBitmapStretch: scala.Boolean
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
  var FillBitmapTile: scala.Boolean
  /** If the property {@link FillStyle} is set to FillStyle::BITMAP, this is a URL to the bitmap used. */
  var FillBitmapURL: java.lang.String
  /** If the property {@link FillStyle} is set to FillStyle::SOLID, this is the color used. */
  var FillColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** If the property {@link FillStyle} is set to FillStyle::GRADIENT, this describes the gradient used. */
  var FillGradient: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Gradient
  /** If the property {@link FillStyle} is set to FillStyle::GRADIENT, this is the name of the used fill gradient style. */
  var FillGradientName: java.lang.String
  /** If the property {@link FillStyle} is set to FillStyle::HATCH, this describes the hatch used. */
  var FillHatch: Hatch
  /** If the property {@link FillStyle} is set to FillStyle::HATCH, this is the name of the used fill hatch style. */
  var FillHatchName: java.lang.String
  /** This enumeration selects the style the area will be filled with. */
  var FillStyle: FillStyle
  /**
    * This is the transparence of the filled area.
    *
    * This property is only valid if the property {@link FillStyle} is set to FillStyle::SOLID.
    */
  var FillTransparence: scala.Double
  /** This describes the transparency of the fill area as a gradient. */
  var FillTransparenceGradient: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Gradient
  /**
    * If a gradient is used for transparency, this is the name of the used transparence gradient style or it is empty. If you set the name of a transparence
    * gradient style contained in the document, this style used.
    */
  var FillTransparenceGradientName: java.lang.String
  /**
    * contains the cropping of the object.
    *
    * If the property {@link FillBitmapMode} is set to BitmapMode::STRETCH, this is the cropping, otherwise it is empty.
    * @see com.sun.star.text.GraphicCrop
    * @since LibreOffice 4.3
    */
  var GraphicCrop: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.GraphicCrop
}

object FillProperties {
  @scala.inline
  def apply(
    FillBackground: scala.Boolean,
    FillBitmap: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XBitmap,
    FillBitmapLogicalSize: scala.Boolean,
    FillBitmapMode: BitmapMode,
    FillBitmapName: java.lang.String,
    FillBitmapOffsetX: scala.Double,
    FillBitmapOffsetY: scala.Double,
    FillBitmapPositionOffsetX: scala.Double,
    FillBitmapPositionOffsetY: scala.Double,
    FillBitmapRectanglePoint: RectanglePoint,
    FillBitmapSizeX: scala.Double,
    FillBitmapSizeY: scala.Double,
    FillBitmapStretch: scala.Boolean,
    FillBitmapTile: scala.Boolean,
    FillBitmapURL: java.lang.String,
    FillColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    FillGradient: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Gradient,
    FillGradientName: java.lang.String,
    FillHatch: Hatch,
    FillHatchName: java.lang.String,
    FillStyle: FillStyle,
    FillTransparence: scala.Double,
    FillTransparenceGradient: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Gradient,
    FillTransparenceGradientName: java.lang.String,
    GraphicCrop: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.GraphicCrop
  ): FillProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FillBackground")(FillBackground)
    __obj.updateDynamic("FillBitmap")(FillBitmap)
    __obj.updateDynamic("FillBitmapLogicalSize")(FillBitmapLogicalSize)
    __obj.updateDynamic("FillBitmapMode")(FillBitmapMode)
    __obj.updateDynamic("FillBitmapName")(FillBitmapName)
    __obj.updateDynamic("FillBitmapOffsetX")(FillBitmapOffsetX)
    __obj.updateDynamic("FillBitmapOffsetY")(FillBitmapOffsetY)
    __obj.updateDynamic("FillBitmapPositionOffsetX")(FillBitmapPositionOffsetX)
    __obj.updateDynamic("FillBitmapPositionOffsetY")(FillBitmapPositionOffsetY)
    __obj.updateDynamic("FillBitmapRectanglePoint")(FillBitmapRectanglePoint)
    __obj.updateDynamic("FillBitmapSizeX")(FillBitmapSizeX)
    __obj.updateDynamic("FillBitmapSizeY")(FillBitmapSizeY)
    __obj.updateDynamic("FillBitmapStretch")(FillBitmapStretch)
    __obj.updateDynamic("FillBitmapTile")(FillBitmapTile)
    __obj.updateDynamic("FillBitmapURL")(FillBitmapURL)
    __obj.updateDynamic("FillColor")(FillColor)
    __obj.updateDynamic("FillGradient")(FillGradient)
    __obj.updateDynamic("FillGradientName")(FillGradientName)
    __obj.updateDynamic("FillHatch")(FillHatch)
    __obj.updateDynamic("FillHatchName")(FillHatchName)
    __obj.updateDynamic("FillStyle")(FillStyle)
    __obj.updateDynamic("FillTransparence")(FillTransparence)
    __obj.updateDynamic("FillTransparenceGradient")(FillTransparenceGradient)
    __obj.updateDynamic("FillTransparenceGradientName")(FillTransparenceGradientName)
    __obj.updateDynamic("GraphicCrop")(GraphicCrop)
    __obj.asInstanceOf[FillProperties]
  }
}

