package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XChartShapeContainer extends XInterface {
  val Shape: XShape
  /** a renderer creates ChartShapes and adds it to this container */
  def addShape(xShape: XShape): Unit
  def getShape(): XShape
  /** a renderer can remove ChartShapes from this container (e.g. if the visible range has changed) */
  def removeShape(xShape: XShape): Unit
}

object XChartShapeContainer {
  @scala.inline
  def apply(
    Shape: XShape,
    acquire: () => Unit,
    addShape: XShape => Unit,
    getShape: () => XShape,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeShape: XShape => Unit
  ): XChartShapeContainer = {
    val __obj = js.Dynamic.literal(Shape = Shape.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addShape = js.Any.fromFunction1(addShape), getShape = js.Any.fromFunction0(getShape), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeShape = js.Any.fromFunction1(removeShape))
    __obj.asInstanceOf[XChartShapeContainer]
  }
}

