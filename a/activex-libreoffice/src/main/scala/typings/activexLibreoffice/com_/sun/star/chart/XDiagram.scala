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
@js.native
trait XDiagram extends XShape {
  /** @returns a string representing the diagram type. This string contains the fully qualified name of the corresponding service. */
  val DiagramType: String = js.native
  /**
    * @param nCol the index of the data point of a series (0-based).
    * @param nRow the index of a series (0-based).
    * @returns the properties of the specified data point.
    * @see ChartDataPointProperties
    */
  def getDataPointProperties(nCol: Double, nRow: Double): XPropertySet = js.native
  /**
    * @param nRow the index of the series (0-based)
    * @returns the properties of the specified data row (series).
    * @see ChartDataRowProperties
    */
  def getDataRowProperties(nRow: Double): XPropertySet = js.native
  /** @returns a string representing the diagram type. This string contains the fully qualified name of the corresponding service. */
  def getDiagramType(): String = js.native
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
  @scala.inline
  implicit class XDiagramOps[Self <: XDiagram] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDiagramType(value: String): Self = this.set("DiagramType", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDataPointProperties(value: (Double, Double) => XPropertySet): Self = this.set("getDataPointProperties", js.Any.fromFunction2(value))
    @scala.inline
    def setGetDataRowProperties(value: Double => XPropertySet): Self = this.set("getDataRowProperties", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDiagramType(value: () => String): Self = this.set("getDiagramType", js.Any.fromFunction0(value))
  }
  
}

