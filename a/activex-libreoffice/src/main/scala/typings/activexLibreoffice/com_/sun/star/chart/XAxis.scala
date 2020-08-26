package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows easier access to the different subelements of an axis.
  * @since OOo 3.4
  */
@js.native
trait XAxis extends XInterface {
  /** @returns the title of the axis. The returned object supports the properties described in service {@link ChartTitle} . */
  val AxisTitle: XPropertySet = js.native
  /** @returns the properties of the major grid of the axis. The returned object supports service {@link ChartGrid} . */
  val MajorGrid: XPropertySet = js.native
  /** @returns the properties of the minor grid of the axis. The returned object supports service {@link ChartGrid} . */
  val MinorGrid: XPropertySet = js.native
  /** @returns the title of the axis. The returned object supports the properties described in service {@link ChartTitle} . */
  def getAxisTitle(): XPropertySet = js.native
  /** @returns the properties of the major grid of the axis. The returned object supports service {@link ChartGrid} . */
  def getMajorGrid(): XPropertySet = js.native
  /** @returns the properties of the minor grid of the axis. The returned object supports service {@link ChartGrid} . */
  def getMinorGrid(): XPropertySet = js.native
}

object XAxis {
  @scala.inline
  def apply(
    AxisTitle: XPropertySet,
    MajorGrid: XPropertySet,
    MinorGrid: XPropertySet,
    acquire: () => Unit,
    getAxisTitle: () => XPropertySet,
    getMajorGrid: () => XPropertySet,
    getMinorGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAxis = {
    val __obj = js.Dynamic.literal(AxisTitle = AxisTitle.asInstanceOf[js.Any], MajorGrid = MajorGrid.asInstanceOf[js.Any], MinorGrid = MinorGrid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAxisTitle = js.Any.fromFunction0(getAxisTitle), getMajorGrid = js.Any.fromFunction0(getMajorGrid), getMinorGrid = js.Any.fromFunction0(getMinorGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAxis]
  }
  @scala.inline
  implicit class XAxisOps[Self <: XAxis] (val x: Self) extends AnyVal {
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
    def setAxisTitle(value: XPropertySet): Self = this.set("AxisTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setMajorGrid(value: XPropertySet): Self = this.set("MajorGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinorGrid(value: XPropertySet): Self = this.set("MinorGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAxisTitle(value: () => XPropertySet): Self = this.set("getAxisTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMajorGrid(value: () => XPropertySet): Self = this.set("getMajorGrid", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMinorGrid(value: () => XPropertySet): Self = this.set("getMinorGrid", js.Any.fromFunction0(value))
  }
  
}

