package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XCoordinateSystem
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** identifies the type of coordinate system (e.g. Cartesian, polar ...) */
  val CoordinateSystemType: java.lang.String
  /** the dimension of the coordinate-system. */
  val Dimension: scala.Double
  /** return a service name from which the view component for this coordinate system can be created */
  val ViewServiceName: java.lang.String
  /**
    * The dimension says whether it is a x, y or z axis. The index indicates whether it is a primary or a secondary axis or maybe more in future. Use nIndex
    * == 0 for a primary axis. An empty Reference will be returned if the given nDimension and nIndex are in the valid range but no axis is set for those
    * values. An IndexOutOfBoundsException will be thrown if nDimension is lower than 0 or greater than the value returned by {@link getDimension()} and/or
    * if nIndex is lower 0 or greater than the value returned by getMaxAxisIndexByDimension(nDimension).
    */
  def getAxisByDimension(nDimension: scala.Double, nIndex: scala.Double): XAxis
  /** identifies the type of coordinate system (e.g. Cartesian, polar ...) */
  def getCoordinateSystemType(): java.lang.String
  /** the dimension of the coordinate-system. */
  def getDimension(): scala.Double
  /**
    * In one dimension there could be several axes to enable main and secondary axis and maybe more in future. This method returns the maximum index at
    * which an axis exists for the given dimension. It is allowed that some indexes in between do not have an axis.
    */
  def getMaximumAxisIndexByDimension(nDimension: scala.Double): scala.Double
  /** return a service name from which the view component for this coordinate system can be created */
  def getViewServiceName(): java.lang.String
  /** The dimension says whether it is a x, y or z axis. The index says whether it is a primary or a secondary axis. Use nIndex == 0 for a primary axis. */
  def setAxisByDimension(nDimension: scala.Double, xAxis: XAxis, nIndex: scala.Double): scala.Unit
}

