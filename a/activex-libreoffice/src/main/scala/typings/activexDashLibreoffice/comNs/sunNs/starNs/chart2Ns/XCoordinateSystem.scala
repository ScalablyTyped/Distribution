package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XCoordinateSystem extends XInterface {
  /** identifies the type of coordinate system (e.g. Cartesian, polar ...) */
  val CoordinateSystemType: String
  /** the dimension of the coordinate-system. */
  val Dimension: Double
  /** return a service name from which the view component for this coordinate system can be created */
  val ViewServiceName: String
  /**
    * The dimension says whether it is a x, y or z axis. The index indicates whether it is a primary or a secondary axis or maybe more in future. Use nIndex
    * == 0 for a primary axis. An empty Reference will be returned if the given nDimension and nIndex are in the valid range but no axis is set for those
    * values. An IndexOutOfBoundsException will be thrown if nDimension is lower than 0 or greater than the value returned by {@link getDimension()} and/or
    * if nIndex is lower 0 or greater than the value returned by getMaxAxisIndexByDimension(nDimension).
    */
  def getAxisByDimension(nDimension: Double, nIndex: Double): XAxis
  /** identifies the type of coordinate system (e.g. Cartesian, polar ...) */
  def getCoordinateSystemType(): String
  /** the dimension of the coordinate-system. */
  def getDimension(): Double
  /**
    * In one dimension there could be several axes to enable main and secondary axis and maybe more in future. This method returns the maximum index at
    * which an axis exists for the given dimension. It is allowed that some indexes in between do not have an axis.
    */
  def getMaximumAxisIndexByDimension(nDimension: Double): Double
  /** return a service name from which the view component for this coordinate system can be created */
  def getViewServiceName(): String
  /** The dimension says whether it is a x, y or z axis. The index says whether it is a primary or a secondary axis. Use nIndex == 0 for a primary axis. */
  def setAxisByDimension(nDimension: Double, xAxis: XAxis, nIndex: Double): Unit
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
    val __obj = js.Dynamic.literal(CoordinateSystemType = CoordinateSystemType, Dimension = Dimension, ViewServiceName = ViewServiceName, acquire = js.Any.fromFunction0(acquire), getAxisByDimension = js.Any.fromFunction2(getAxisByDimension), getCoordinateSystemType = js.Any.fromFunction0(getCoordinateSystemType), getDimension = js.Any.fromFunction0(getDimension), getMaximumAxisIndexByDimension = js.Any.fromFunction1(getMaximumAxisIndexByDimension), getViewServiceName = js.Any.fromFunction0(getViewServiceName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAxisByDimension = js.Any.fromFunction3(setAxisByDimension))
  
    __obj.asInstanceOf[XCoordinateSystem]
  }
}

