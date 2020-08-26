package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XCoordinateSystem extends XInterface {
  /** identifies the type of coordinate system (e.g. Cartesian, polar ...) */
  val CoordinateSystemType: String = js.native
  /** the dimension of the coordinate-system. */
  val Dimension: Double = js.native
  /** return a service name from which the view component for this coordinate system can be created */
  val ViewServiceName: String = js.native
  /**
    * The dimension says whether it is a x, y or z axis. The index indicates whether it is a primary or a secondary axis or maybe more in future. Use nIndex
    * == 0 for a primary axis. An empty Reference will be returned if the given nDimension and nIndex are in the valid range but no axis is set for those
    * values. An IndexOutOfBoundsException will be thrown if nDimension is lower than 0 or greater than the value returned by {@link getDimension()} and/or
    * if nIndex is lower 0 or greater than the value returned by getMaxAxisIndexByDimension(nDimension).
    */
  def getAxisByDimension(nDimension: Double, nIndex: Double): XAxis = js.native
  /** identifies the type of coordinate system (e.g. Cartesian, polar ...) */
  def getCoordinateSystemType(): String = js.native
  /** the dimension of the coordinate-system. */
  def getDimension(): Double = js.native
  /**
    * In one dimension there could be several axes to enable main and secondary axis and maybe more in future. This method returns the maximum index at
    * which an axis exists for the given dimension. It is allowed that some indexes in between do not have an axis.
    */
  def getMaximumAxisIndexByDimension(nDimension: Double): Double = js.native
  /** return a service name from which the view component for this coordinate system can be created */
  def getViewServiceName(): String = js.native
  /** The dimension says whether it is a x, y or z axis. The index says whether it is a primary or a secondary axis. Use nIndex == 0 for a primary axis. */
  def setAxisByDimension(nDimension: Double, xAxis: XAxis, nIndex: Double): Unit = js.native
}

object XCoordinateSystem {
  @scala.inline
  def apply(
    CoordinateSystemType: String,
    Dimension: Double,
    ViewServiceName: String,
    acquire: () => Unit,
    getAxisByDimension: (Double, Double) => XAxis,
    getCoordinateSystemType: () => String,
    getDimension: () => Double,
    getMaximumAxisIndexByDimension: Double => Double,
    getViewServiceName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setAxisByDimension: (Double, XAxis, Double) => Unit
  ): XCoordinateSystem = {
    val __obj = js.Dynamic.literal(CoordinateSystemType = CoordinateSystemType.asInstanceOf[js.Any], Dimension = Dimension.asInstanceOf[js.Any], ViewServiceName = ViewServiceName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAxisByDimension = js.Any.fromFunction2(getAxisByDimension), getCoordinateSystemType = js.Any.fromFunction0(getCoordinateSystemType), getDimension = js.Any.fromFunction0(getDimension), getMaximumAxisIndexByDimension = js.Any.fromFunction1(getMaximumAxisIndexByDimension), getViewServiceName = js.Any.fromFunction0(getViewServiceName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAxisByDimension = js.Any.fromFunction3(setAxisByDimension))
    __obj.asInstanceOf[XCoordinateSystem]
  }
  @scala.inline
  implicit class XCoordinateSystemOps[Self <: XCoordinateSystem] (val x: Self) extends AnyVal {
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
    def setCoordinateSystemType(value: String): Self = this.set("CoordinateSystemType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDimension(value: Double): Self = this.set("Dimension", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewServiceName(value: String): Self = this.set("ViewServiceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAxisByDimension(value: (Double, Double) => XAxis): Self = this.set("getAxisByDimension", js.Any.fromFunction2(value))
    @scala.inline
    def setGetCoordinateSystemType(value: () => String): Self = this.set("getCoordinateSystemType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDimension(value: () => Double): Self = this.set("getDimension", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMaximumAxisIndexByDimension(value: Double => Double): Self = this.set("getMaximumAxisIndexByDimension", js.Any.fromFunction1(value))
    @scala.inline
    def setGetViewServiceName(value: () => String): Self = this.set("getViewServiceName", js.Any.fromFunction0(value))
    @scala.inline
    def setSetAxisByDimension(value: (Double, XAxis, Double) => Unit): Self = this.set("setAxisByDimension", js.Any.fromFunction3(value))
  }
  
}

