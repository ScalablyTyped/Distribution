package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the **y** -axis of a chart.
  *
  * Note that not all diagrams are capable of displaying a **y** -axis, e.g., the {@link PieDiagram} .
  * @see XDiagram
  */
@js.native
trait XAxisYSupplier extends XInterface {
  /**
    * @returns the properties of the **y** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val YAxis: XPropertySet = js.native
  /**
    * @returns the **y** -axis title shape.
    * @see ChartTitle
    */
  val YAxisTitle: XShape = js.native
  /**
    * @returns the properties of the help grid (minor grid) of the **y** -axis of the diagram.
    * @see ChartGrid
    */
  val YHelpGrid: XPropertySet = js.native
  /**
    * @returns the properties of the main grid (major grid) of the **y** -axis of the diagram.
    * @see ChartGrid
    */
  val YMainGrid: XPropertySet = js.native
  /**
    * @returns the properties of the **y** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getYAxis(): XPropertySet = js.native
  /**
    * @returns the **y** -axis title shape.
    * @see ChartTitle
    */
  def getYAxisTitle(): XShape = js.native
  /**
    * @returns the properties of the help grid (minor grid) of the **y** -axis of the diagram.
    * @see ChartGrid
    */
  def getYHelpGrid(): XPropertySet = js.native
  /**
    * @returns the properties of the main grid (major grid) of the **y** -axis of the diagram.
    * @see ChartGrid
    */
  def getYMainGrid(): XPropertySet = js.native
}

object XAxisYSupplier {
  @scala.inline
  def apply(
    YAxis: XPropertySet,
    YAxisTitle: XShape,
    YHelpGrid: XPropertySet,
    YMainGrid: XPropertySet,
    acquire: () => Unit,
    getYAxis: () => XPropertySet,
    getYAxisTitle: () => XShape,
    getYHelpGrid: () => XPropertySet,
    getYMainGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAxisYSupplier = {
    val __obj = js.Dynamic.literal(YAxis = YAxis.asInstanceOf[js.Any], YAxisTitle = YAxisTitle.asInstanceOf[js.Any], YHelpGrid = YHelpGrid.asInstanceOf[js.Any], YMainGrid = YMainGrid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getYAxis = js.Any.fromFunction0(getYAxis), getYAxisTitle = js.Any.fromFunction0(getYAxisTitle), getYHelpGrid = js.Any.fromFunction0(getYHelpGrid), getYMainGrid = js.Any.fromFunction0(getYMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAxisYSupplier]
  }
  @scala.inline
  implicit class XAxisYSupplierOps[Self <: XAxisYSupplier] (val x: Self) extends AnyVal {
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
    def setYAxis(value: XPropertySet): Self = this.set("YAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def setYAxisTitle(value: XShape): Self = this.set("YAxisTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setYHelpGrid(value: XPropertySet): Self = this.set("YHelpGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setYMainGrid(value: XPropertySet): Self = this.set("YMainGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetYAxis(value: () => XPropertySet): Self = this.set("getYAxis", js.Any.fromFunction0(value))
    @scala.inline
    def setGetYAxisTitle(value: () => XShape): Self = this.set("getYAxisTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setGetYHelpGrid(value: () => XPropertySet): Self = this.set("getYHelpGrid", js.Any.fromFunction0(value))
    @scala.inline
    def setGetYMainGrid(value: () => XPropertySet): Self = this.set("getYMainGrid", js.Any.fromFunction0(value))
  }
  
}

