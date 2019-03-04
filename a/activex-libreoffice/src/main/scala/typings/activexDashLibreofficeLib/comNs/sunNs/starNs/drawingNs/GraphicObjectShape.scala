package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service is for a graphic shape. */
trait GraphicObjectShape
  extends Text
     with Shape
     with ShadowProperties
     with RotationDescriptor {
  /** If this property is set, the blue channel of this graphic shape is adjusted by the given signed percent value. */
  var AdjustBlue: scala.Double
  /** If this property is set, the contrast of this graphic shape is adjusted by the given signed percent value. */
  var AdjustContrast: scala.Double
  /** If this property is set, the green channel of this graphic shape is adjusted by the given signed percent value. */
  var AdjustGreen: scala.Double
  /** If this property is set, the luminance of this graphic shape is adjusted by the given signed percent value. */
  var AdjustLuminance: scala.Double
  /** If this property is set, the red channel of this graphic shape is adjusted by the given signed percent value. */
  var AdjustRed: scala.Double
  /** If this property is set, the gamma value of this graphic shape is adjusted by the given value. */
  var Gamma: scala.Double
  /** This is the graphic that represents this graphic shape */
  var Graphic: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic
  /** This property selects the color mode that is used for rendering. */
  var GraphicColorMode: ColorMode
  /** Deprecated. Use graphic property instead! This is the bitmap that represents this graphic shape. */
  var GraphicObjectFillBitmap: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XBitmap
  /** This is an url to the stream ("in document" or linked graphic) for this graphic shape. */
  var GraphicStreamURL: java.lang.String
  /** This is an url to the source bitmap for this graphic shape. */
  var GraphicURL: java.lang.String
  /**
    * This property contains a image map for this graphic.
    * @see com.sun.star.image.ImageMap
    */
  var ImageMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer
  /**
    * If this property is set, the transparency value of this graphic shape is adjusted by the given unsigned percent value. 100% is fully transparent, 0%
    * is fully opaque.
    */
  var Transparency: scala.Double
}

object GraphicObjectShape {
  @scala.inline
  def apply(
    AdjustBlue: scala.Double,
    AdjustContrast: scala.Double,
    AdjustGreen: scala.Double,
    AdjustLuminance: scala.Double,
    AdjustRed: scala.Double,
    Gamma: scala.Double,
    Graphic: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic,
    GraphicColorMode: ColorMode,
    GraphicObjectFillBitmap: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XBitmap,
    GraphicStreamURL: java.lang.String,
    GraphicURL: java.lang.String,
    ImageMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer,
    RotationDescriptor: RotationDescriptor = null,
    ShadowProperties: ShadowProperties = null,
    Shape: Shape = null,
    Transparency: scala.Double,
    Text: Text = null
  ): GraphicObjectShape = {
    val __obj = js.Dynamic.literal(AdjustBlue = AdjustBlue, AdjustContrast = AdjustContrast, AdjustGreen = AdjustGreen, AdjustLuminance = AdjustLuminance, AdjustRed = AdjustRed, Gamma = Gamma, Graphic = Graphic, GraphicColorMode = GraphicColorMode, GraphicObjectFillBitmap = GraphicObjectFillBitmap, GraphicStreamURL = GraphicStreamURL, GraphicURL = GraphicURL, ImageMap = ImageMap, Transparency = Transparency)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, RotationDescriptor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ShadowProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, Shape)
    js.Dynamic.global.Object.assign(__obj, Text)
    __obj.asInstanceOf[GraphicObjectShape]
  }
}

