package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows converting between different measurement units
  * @since OOo 3.0
  */
trait XUnitConversion
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * converts the given {@link Point} , which is specified in pixels, into the given logical unit
    * @param Point A given {@link Point} in a well known type
    * @param TargetUnit A type from {@link com.sun.star.util.MeasureUnit} in which the {@link Point} will convert to.
    * @returns Returns a new {@link Point} in the TargetUnit type format.
    */
  def convertPointToLogic(Point: Point, TargetUnit: scala.Double): Point
  /**
    * converts the given {@link Point} , which is specified in the given logical unit, into pixels
    * @param Point A given {@link Point} in the SourceUnit type
    * @param SourceUnit The type from {@link com.sun.star.util.MeasureUnit} of the {@link Point} .
    * @returns Return a new {@link Point} in Pixel type format.
    */
  def convertPointToPixel(Point: Point, SourceUnit: scala.Double): Point
  /**
    * converts the given {@link Size} , which is specified in pixels, into the given logical unit
    * @param Size A given {@link Size} in a well known type
    * @param TargetUnit A type from {@link com.sun.star.util.MeasureUnit} in which the {@link Size} will convert to.
    * @returns Returns a new {@link Size} in the TargetUnit type format.
    */
  def convertSizeToLogic(Size: Size, TargetUnit: scala.Double): Size
  /**
    * converts the given {@link Size} , which is specified in the given logical unit, into pixels
    * @param Size A given {@link Size} in a well known type
    * @param SourceUnit The type from {@link com.sun.star.util.MeasureUnit} of the {@link Size} .
    * @returns Returns a new {@link Size} in the TargetUnit type format.
    */
  def convertSizeToPixel(Size: Size, SourceUnit: scala.Double): Size
}

object XUnitConversion {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    convertPointToLogic: (Point, scala.Double) => Point,
    convertPointToPixel: (Point, scala.Double) => Point,
    convertSizeToLogic: (Size, scala.Double) => Size,
    convertSizeToPixel: (Size, scala.Double) => Size,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XUnitConversion = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convertPointToLogic = js.Any.fromFunction2(convertPointToLogic), convertPointToPixel = js.Any.fromFunction2(convertPointToPixel), convertSizeToLogic = js.Any.fromFunction2(convertSizeToLogic), convertSizeToPixel = js.Any.fromFunction2(convertSizeToPixel), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XUnitConversion]
  }
}

