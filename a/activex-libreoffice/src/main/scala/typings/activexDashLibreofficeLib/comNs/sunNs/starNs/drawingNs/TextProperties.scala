package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is a set of properties to describe the style for rendering the text area inside a shape. */
trait TextProperties
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesAsian
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesComplex
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesAsian
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesComplex {
  /** If this is `TRUE` , numbering is ON for the text of this {@link Shape} . */
  var IsNumbering: scala.Boolean
  /** This is the number of pixels the text is moved in each animation step. */
  var TextAnimationAmount: scala.Double
  /**
    * This number defines how many times the text animation is repeated.
    *
    * If this is set to zero, the repeat is endless.
    */
  var TextAnimationCount: scala.Double
  /** This is the delay in thousandths of a second between each of the animation steps. */
  var TextAnimationDelay: scala.Double
  /** This enumeration defines the direction in which the text moves. */
  var TextAnimationDirection: TextAnimationDirection
  /** This value defines the type of animation. */
  var TextAnimationKind: TextAnimationKind
  /** If this value is `TRUE` , the text is visible at the start of the animation. */
  var TextAnimationStartInside: scala.Boolean
  /** If this value is `TRUE` , the text is visible at the end of the animation. */
  var TextAnimationStopInside: scala.Boolean
  /** If this value is `TRUE` , the height of the {@link Shape} is automatically expanded/shrunk when text is added to or removed from the {@link Shape} . */
  var TextAutoGrowHeight: scala.Boolean
  /** If this value is `TRUE` , the width of the {@link Shape} is automatically expanded/shrunk when text is added to or removed from the {@link Shape} . */
  var TextAutoGrowWidth: scala.Boolean
  /** If this value is `TRUE` , the left edge of every line of text is aligned with the left edge of this {@link Shape} . */
  var TextContourFrame: scala.Boolean
  /** With this set to `TRUE` , the text inside of the {@link Shape} is stretched to fit into the {@link Shape} . */
  var TextFitToSize: TextFitToSizeType
  /** adjusts the horizontal position of the text inside of the {@link Shape} . */
  var TextHorizontalAdjust: TextHorizontalAdjust
  /**
    * This is the distance from the left edge of the {@link Shape} to the left edge of the text.
    *
    * This is only useful if {@link Text.TextHorizontalAdjust} is BLOCK or STRETCH or if Text::TextFitSize is `TRUE` .
    */
  var TextLeftDistance: scala.Double
  /**
    * This is the distance from the lower edge of the {@link Shape} to the lower edge of the text.
    *
    * This is only useful if {@link Text.TextVerticalAdjust} is BLOCK or if Text::TextFitSize is `TRUE` .
    */
  var TextLowerDistance: scala.Double
  /**
    * with this property you can set the maximum height for a shape with text. On edit, the auto grow feature will not grow the object higher than the value
    * of this property.
    */
  var TextMaximumFrameHeight: scala.Double
  /**
    * with this property you can set the maximum width for a shape with text. On edit, the auto grow feature will not grow the objects wider than the value
    * of this property.
    */
  var TextMaximumFrameWidth: scala.Double
  /**
    * with this property you can set the minimum height for a shape with text. On edit, the auto grow feature will not shrink the objects height smaller
    * than the value of this property.
    */
  var TextMinimumFrameHeight: scala.Double
  /**
    * with this property you can set the minimum width for a shape with text. On edit, the auto grow feature will not shrink the object width smaller than
    * the value of this property.
    */
  var TextMinimumFrameWidth: scala.Double
  /**
    * This is the distance from the right edge of the {@link Shape} to the right edge of the text.
    *
    * This is only useful if {@link Text.TextHorizontalAdjust} is BLOCK or STRETCH or if Text::TextFitSize is `TRUE` .
    */
  var TextRightDistance: scala.Double
  /**
    * This is the distance from the upper edge of the {@link Shape} to the upper edge of the text.
    *
    * This is only useful if {@link Text.TextVerticalAdjust} is BLOCK or if Text::TextFitSize is `TRUE` .
    */
  var TextUpperDistance: scala.Double
  /** adjusts the vertical position of the text inside of the {@link Shape} . */
  var TextVerticalAdjust: TextVerticalAdjust
  /** This value selects the writing mode for the text. */
  var TextWritingMode: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WritingMode
}

