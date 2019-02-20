package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XCoordinateSystemContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** retrieve all coordinate systems */
  var CoordinateSystems: activexDashInteropLib.SafeArray[XCoordinateSystem]
  /**
    * add an coordinate system to the coordinate system container
    * @throws IllegalArgumentException If the given coordinate system is already contained in the container.
    */
  def addCoordinateSystem(aCoordSys: XCoordinateSystem): scala.Unit
  /** retrieve all coordinate systems */
  def getCoordinateSystems(): activexDashInteropLib.SafeArray[XCoordinateSystem]
  /** removes one coordinate system from the coordinate system container. */
  def removeCoordinateSystem(aCoordSys: XCoordinateSystem): scala.Unit
  /** set all coordinate systems */
  def setCoordinateSystems(aCoordinateSystems: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XCoordinateSystem]): scala.Unit
}

