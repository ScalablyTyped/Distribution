package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the **x** -axis of a chart.
  *
  * Note that not all diagrams are capable of displaying an **x** -axis, e.g., the {@link PieDiagram} .
  * @see XDiagram
  */
trait XAxisXSupplier extends XInterface {
  /**
    * @returns the properties of the **x** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val XAxis: XPropertySet
  /**
    * @returns the **x** -axis title shape.
    * @see ChartTitle
    */
  val XAxisTitle: XShape
  /**
    * @returns the properties of the help grid (minor grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  val XHelpGrid: XPropertySet
  /**
    * @returns the properties of the main grid (major grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  val XMainGrid: XPropertySet
  /**
    * @returns the properties of the **x** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getXAxis(): XPropertySet
  /**
    * @returns the **x** -axis title shape.
    * @see ChartTitle
    */
  def getXAxisTitle(): XShape
  /**
    * @returns the properties of the help grid (minor grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  def getXHelpGrid(): XPropertySet
  /**
    * @returns the properties of the main grid (major grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  def getXMainGrid(): XPropertySet
}

object XAxisXSupplier {
  @scala.inline
  def apply(
    XAxis: XPropertySet,
    XAxisTitle: XShape,
    XHelpGrid: XPropertySet,
    XMainGrid: XPropertySet,
    acquire: () => Unit,
    getXAxis: () => XPropertySet,
    getXAxisTitle: () => XShape,
    getXHelpGrid: () => XPropertySet,
    getXMainGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAxisXSupplier = {
    val __obj = js.Dynamic.literal(XAxis = XAxis.asInstanceOf[js.Any], XAxisTitle = XAxisTitle.asInstanceOf[js.Any], XHelpGrid = XHelpGrid.asInstanceOf[js.Any], XMainGrid = XMainGrid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getXAxis = js.Any.fromFunction0(getXAxis), getXAxisTitle = js.Any.fromFunction0(getXAxisTitle), getXHelpGrid = js.Any.fromFunction0(getXHelpGrid), getXMainGrid = js.Any.fromFunction0(getXMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAxisXSupplier]
  }
}

