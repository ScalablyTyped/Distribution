package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a graphic which can be embedded in {@link Text} . */
trait TextGraphicObject extends BaseFrame {
  /** contains the original size of the bitmap in the graphic object. */
  var ActualSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /** changes the display of the blue color channel. It contains percentage values between -100 and +100. */
  var AdjustBlue: scala.Double
  /** changes the display of contrast. It contains percentage values between -100 and +100. */
  var AdjustContrast: scala.Double
  /** changes the display of the green color channel. It contains percentage values between -100 and +100. */
  var AdjustGreen: scala.Double
  /** changes the display of the luminance. It contains percentage values between -100 and +100. */
  var AdjustLuminance: scala.Double
  /** changes the display of the red color channel. It contains percentage values between -100 and +100. */
  var AdjustRed: scala.Double
  /** the text flows only around the contour of the object. */
  var ContourOutside: scala.Boolean
  /** contains the contour of the object as PolyPolygon. */
  var ContourPolyPolygon: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PointSequenceSequence
  /** determines the gamma value of the graphic. */
  var Gamma: scala.Double
  /** contains the graphic. */
  var Graphic: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic
  /** contains the ColorMode as {@link com.sun.star.drawing.ColorMode} . */
  var GraphicColorMode: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ColorMode
  /**
    * contains the cropping of the object.
    * @see GraphicCrop
    */
  var GraphicCrop: GraphicCrop
  /** contains the name of the filter of the background graphic of the object. */
  var GraphicFilter: java.lang.String
  /** determines if the graphic is display in inverted colors. It contains percentage values between -100 and +100. */
  var GraphicIsInverted: scala.Boolean
  /** contains the URL of the background graphic of the object */
  var GraphicURL: java.lang.String
  /** determines if the object is horizontally mirrored on even pages. */
  var HoriMirroredOnEvenPages: scala.Boolean
  /** determines if the object is horizontally mirrored on odd pages. */
  var HoriMirroredOnOddPages: scala.Boolean
  /** returns the client-side image map if one is assigned to the object. */
  var ImageMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer
  /** determines if the text wraps around the contour of the object. */
  var SurroundContour: scala.Boolean
  /** contains percentage values between -100 and +100. */
  var Transparency: scala.Double
  /** determines if the object is mirrored vertically. */
  var VertMirrored: scala.Boolean
}

