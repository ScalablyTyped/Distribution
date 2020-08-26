package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Easier access to the different axes within a chart.
  * @since OOo 3.4
  */
@js.native
trait XAxisSupplier extends XInterface {
  /**
    * @param nDimensionIndex Parameter nDimensionIndex says whether it is a x, y or z-axis (0 for x).
    * @returns the primary axis of the specified dimension. The returned object supports service {@link ChartAxis} .
    */
  def getAxis(nDimensionIndex: Double): XAxis = js.native
  /**
    * @param nDimensionIndex Parameter nDimensionIndex says whether it is a x, y or z-axis (0 for x).
    * @returns the secondary axis of the specified dimension. The returned object supports service {@link ChartAxis} .
    */
  def getSecondaryAxis(nDimensionIndex: Double): XAxis = js.native
}

object XAxisSupplier {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getAxis: Double => XAxis,
    getSecondaryAxis: Double => XAxis,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAxisSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getAxis = js.Any.fromFunction1(getAxis), getSecondaryAxis = js.Any.fromFunction1(getSecondaryAxis), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAxisSupplier]
  }
  @scala.inline
  implicit class XAxisSupplierOps[Self <: XAxisSupplier] (val x: Self) extends AnyVal {
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
    def setGetAxis(value: Double => XAxis): Self = this.set("getAxis", js.Any.fromFunction1(value))
    @scala.inline
    def setGetSecondaryAxis(value: Double => XAxis): Self = this.set("getSecondaryAxis", js.Any.fromFunction1(value))
  }
  
}

