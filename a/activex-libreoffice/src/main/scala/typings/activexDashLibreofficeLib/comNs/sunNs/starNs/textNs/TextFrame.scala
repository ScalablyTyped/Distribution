package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a rectangular shape which contains a {@link Text} object and is attached to a piece of surrounding {@link Text} .
  * @see Text  This example shows how to create a {@link TextFrame} and insert it at the very beginning of {@link Text} component. The macro is ready to r
  */
trait TextFrame
  extends BaseFrame
     with XTextFrame {
  /** determines if the text frame should be editable in a read-only document. (This is usually used in forms.) */
  var EditInReadonly: scala.Boolean
  /** contains the metric height value of the frame. */
  var FrameHeightAbsolute: scala.Double
  /**
    * specifies a width relative to the width of the surrounding text.
    *
    * If the value for "HeightPercent" is 0, the absolute value from is used.
    */
  var FrameHeightPercent: scala.Double
  /** If "AutomaticHeight" is set, then the object grows if it is required by the frame content. */
  var FrameIsAutomaticHeight: scala.Boolean
  /** contains the metric width value of the frame. */
  var FrameWidthAbsolute: scala.Double
  /**
    * specifies a width relative to the width of the surrounding text.
    *
    * If the value for "WidthPercent" is 0, the absolute value from is used.
    */
  var FrameWidthPercent: scala.Double
  /**
    * controls, if the frame follows the text flow or can leave its layout environment
    *
    * If set, the frame follows the text flow and doesn't leaves the layout environment, which is given by its anchor, above and below. E.g.: Anchor resides
    * in the document body then the frame doesn't leave the document body above and below and follows the text flow through the document bodies of the
    * different pages.
    *
    * If not set, the frame doesn't follow the text flow and stays on the page, on which its anchor is found, but it may leave the layout environment, which
    * is given by its anchor. E.g.: Anchor resides in the document body then the frame stays on page, where this document body is, but it could leave the
    * document body above and below, e.g. overlapping with the page header.
    *
    * Note: The areas for the vertical orientation relation at page areas are interpreted in dependence to this property (
    * @see BaseFrameProperties.VertOrientRelation). If property is set, the page area is interpreted as the layout environment, given by its anchor. E.g.: A
    */
  var IsFollowingTextFlow: scala.Boolean
  /**
    * determines the interpretation of the height and relative height properties.
    * @@see SizeType
    */
  var SizeType: scala.Double
  /**
    * adjusts the vertical position of the text inside of the frame.
    * @see com.sun.star.drawing.TextVerticalAdjust
    * @since LibreOffice 4.3
    */
  var TextVerticalAdjust: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextVerticalAdjust
  /**
    * determines the interpretation of the width and relative width properties.
    * @see SizeType
    * @since OOo 2.4
    */
  var WidthType: scala.Double
  /** contains the writing direction, as represented by the {@link com.sun.star.text.WritingMode2} constants */
  var WritingMode: scala.Double
}

