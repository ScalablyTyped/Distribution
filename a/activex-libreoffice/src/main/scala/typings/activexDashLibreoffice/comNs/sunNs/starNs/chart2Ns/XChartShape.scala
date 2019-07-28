package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** this interface is used for a wrapper of objects implementing the service {@link com.sun.star.drawing.Shape} */
trait XChartShape extends XInterface {
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  var Position: Point
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} ??????????? deprecated */
  val ShapeType: String
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  var Size: typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  def getPosition(): Point
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.beans.XPropertySet} */
  def getPropertyValue(PropertyName: String): js.Any
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} ??????????? deprecated */
  def getShapeType(): String
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  def getSize(): Size
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  def setPosition(aPosition: Point): Unit
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.beans.XPropertySet} */
  def setPropertyValue(aPropertyName: String, aValue: js.Any): Unit
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  def setSize(aSize: Size): Unit
}

object XChartShape {
  @scala.inline
  def apply(
    Position: Point,
    ShapeType: String,
    Size: Size,
    acquire: () => Unit,
    getPosition: () => Point,
    getPropertyValue: String => js.Any,
    getShapeType: () => String,
    getSize: () => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPosition: Point => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setSize: Size => Unit
  ): XChartShape = {
    val __obj = js.Dynamic.literal(Position = Position, ShapeType = ShapeType, Size = Size, acquire = js.Any.fromFunction0(acquire), getPosition = js.Any.fromFunction0(getPosition), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSize = js.Any.fromFunction1(setSize))
  
    __obj.asInstanceOf[XChartShape]
  }
}

