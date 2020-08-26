package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoordinateSystem
  extends XCoordinateSystem
     with XChartTypeContainer
     with XCloneable {
  var SwapXAndYAxis: Boolean = js.native
}

object CoordinateSystem {
  @scala.inline
  def apply(
    ChartTypes: SafeArray[XChartType],
    CoordinateSystemType: String,
    Dimension: Double,
    SwapXAndYAxis: Boolean,
    ViewServiceName: String,
    acquire: () => Unit,
    addChartType: XChartType => Unit,
    createClone: () => XCloneable,
    getAxisByDimension: (Double, Double) => XAxis,
    getChartTypes: () => SafeArray[XChartType],
    getCoordinateSystemType: () => String,
    getDimension: () => Double,
    getMaximumAxisIndexByDimension: Double => Double,
    getViewServiceName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChartType: XChartType => Unit,
    setAxisByDimension: (Double, XAxis, Double) => Unit,
    setChartTypes: SeqEquiv[XChartType] => Unit
  ): CoordinateSystem = {
    val __obj = js.Dynamic.literal(ChartTypes = ChartTypes.asInstanceOf[js.Any], CoordinateSystemType = CoordinateSystemType.asInstanceOf[js.Any], Dimension = Dimension.asInstanceOf[js.Any], SwapXAndYAxis = SwapXAndYAxis.asInstanceOf[js.Any], ViewServiceName = ViewServiceName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addChartType = js.Any.fromFunction1(addChartType), createClone = js.Any.fromFunction0(createClone), getAxisByDimension = js.Any.fromFunction2(getAxisByDimension), getChartTypes = js.Any.fromFunction0(getChartTypes), getCoordinateSystemType = js.Any.fromFunction0(getCoordinateSystemType), getDimension = js.Any.fromFunction0(getDimension), getMaximumAxisIndexByDimension = js.Any.fromFunction1(getMaximumAxisIndexByDimension), getViewServiceName = js.Any.fromFunction0(getViewServiceName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartType = js.Any.fromFunction1(removeChartType), setAxisByDimension = js.Any.fromFunction3(setAxisByDimension), setChartTypes = js.Any.fromFunction1(setChartTypes))
    __obj.asInstanceOf[CoordinateSystem]
  }
  @scala.inline
  implicit class CoordinateSystemOps[Self <: CoordinateSystem] (val x: Self) extends AnyVal {
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
    def setSwapXAndYAxis(value: Boolean): Self = this.set("SwapXAndYAxis", value.asInstanceOf[js.Any])
  }
  
}

