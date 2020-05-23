package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * manages the diagram of the chart document.
  * @see XChartDocument
  */
trait XDiagram extends XShape {
  /** @returns a string representing the diagram type. This string contains the fully qualified name of the corresponding service. */
  val DiagramType: String
  /**
    * @param nCol the index of the data point of a series (0-based).
    * @param nRow the index of a series (0-based).
    * @returns the properties of the specified data point.
    * @see ChartDataPointProperties
    */
  def getDataPointProperties(nCol: Double, nRow: Double): XPropertySet
  /**
    * @param nRow the index of the series (0-based)
    * @returns the properties of the specified data row (series).
    * @see ChartDataRowProperties
    */
  def getDataRowProperties(nRow: Double): XPropertySet
  /** @returns a string representing the diagram type. This string contains the fully qualified name of the corresponding service. */
  def getDiagramType(): String
}

object XDiagram {
  @scala.inline
  def apply(
    DiagramType: String,
    Position: Point,
    ShapeType: String,
    Size: Size,
    acquire: () => Unit,
    getDataPointProperties: (Double, Double) => XPropertySet,
    getDataRowProperties: Double => XPropertySet,
    getDiagramType: () => String,
    getPosition: () => Point,
    getShapeType: () => String,
    getSize: () => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPosition: Point => Unit,
    setSize: Size => Unit
  ): XDiagram = {
    val __obj = js.Dynamic.literal(DiagramType = DiagramType.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDataPointProperties = js.Any.fromFunction2(getDataPointProperties), getDataRowProperties = js.Any.fromFunction1(getDataRowProperties), getDiagramType = js.Any.fromFunction0(getDiagramType), getPosition = js.Any.fromFunction0(getPosition), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPosition = js.Any.fromFunction1(setPosition), setSize = js.Any.fromFunction1(setSize))
    __obj.asInstanceOf[XDiagram]
  }
}

