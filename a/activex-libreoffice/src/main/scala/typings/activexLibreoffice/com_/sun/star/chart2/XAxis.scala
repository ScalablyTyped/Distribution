package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XAxis extends XInterface {
  /** the returned property set must support the service {@link GridProperties} */
  val GridProperties: XPropertySet = js.native
  var ScaleData: typings.activexLibreoffice.com_.sun.star.chart2.ScaleData = js.native
  /**
    * the returned property sets must support the service {@link GridProperties}
    *
    * If you do not want to render certain a sub-grid, in the corresponding XPropertySet the property {@link GridProperties.Show} must be `FALSE` .
    */
  val SubGridProperties: SafeArray[XPropertySet] = js.native
  /** the returned property sets must support the service TickProperties */
  val SubTickProperties: SafeArray[XPropertySet] = js.native
  /** the returned property set must support the service {@link GridProperties} */
  def getGridProperties(): XPropertySet = js.native
  def getScaleData(): ScaleData = js.native
  /**
    * the returned property sets must support the service {@link GridProperties}
    *
    * If you do not want to render certain a sub-grid, in the corresponding XPropertySet the property {@link GridProperties.Show} must be `FALSE` .
    */
  def getSubGridProperties(): SafeArray[XPropertySet] = js.native
  /** the returned property sets must support the service TickProperties */
  def getSubTickProperties(): SafeArray[XPropertySet] = js.native
  def setScaleData(aScale: ScaleData): Unit = js.native
}

object XAxis {
  @scala.inline
  def apply(
    GridProperties: XPropertySet,
    ScaleData: ScaleData,
    SubGridProperties: SafeArray[XPropertySet],
    SubTickProperties: SafeArray[XPropertySet],
    acquire: () => Unit,
    getGridProperties: () => XPropertySet,
    getScaleData: () => ScaleData,
    getSubGridProperties: () => SafeArray[XPropertySet],
    getSubTickProperties: () => SafeArray[XPropertySet],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setScaleData: ScaleData => Unit
  ): XAxis = {
    val __obj = js.Dynamic.literal(GridProperties = GridProperties.asInstanceOf[js.Any], ScaleData = ScaleData.asInstanceOf[js.Any], SubGridProperties = SubGridProperties.asInstanceOf[js.Any], SubTickProperties = SubTickProperties.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getGridProperties = js.Any.fromFunction0(getGridProperties), getScaleData = js.Any.fromFunction0(getScaleData), getSubGridProperties = js.Any.fromFunction0(getSubGridProperties), getSubTickProperties = js.Any.fromFunction0(getSubTickProperties), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setScaleData = js.Any.fromFunction1(setScaleData))
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
    def setGridProperties(value: XPropertySet): Self = this.set("GridProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleData(value: ScaleData): Self = this.set("ScaleData", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubGridProperties(value: SafeArray[XPropertySet]): Self = this.set("SubGridProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubTickProperties(value: SafeArray[XPropertySet]): Self = this.set("SubTickProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetGridProperties(value: () => XPropertySet): Self = this.set("getGridProperties", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScaleData(value: () => ScaleData): Self = this.set("getScaleData", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSubGridProperties(value: () => SafeArray[XPropertySet]): Self = this.set("getSubGridProperties", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSubTickProperties(value: () => SafeArray[XPropertySet]): Self = this.set("getSubTickProperties", js.Any.fromFunction0(value))
    @scala.inline
    def setSetScaleData(value: ScaleData => Unit): Self = this.set("setScaleData", js.Any.fromFunction1(value))
  }
  
}

