package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XCoordinateSystemContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** retrieve all coordinate systems */
  var CoordinateSystems: stdLib.SafeArray[XCoordinateSystem]
  /**
    * add an coordinate system to the coordinate system container
    * @throws IllegalArgumentException If the given coordinate system is already contained in the container.
    */
  def addCoordinateSystem(aCoordSys: XCoordinateSystem): scala.Unit
  /** retrieve all coordinate systems */
  def getCoordinateSystems(): stdLib.SafeArray[XCoordinateSystem]
  /** removes one coordinate system from the coordinate system container. */
  def removeCoordinateSystem(aCoordSys: XCoordinateSystem): scala.Unit
  /** set all coordinate systems */
  def setCoordinateSystems(aCoordinateSystems: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XCoordinateSystem]): scala.Unit
}

object XCoordinateSystemContainer {
  @scala.inline
  def apply(
    CoordinateSystems: stdLib.SafeArray[XCoordinateSystem],
    acquire: () => scala.Unit,
    addCoordinateSystem: XCoordinateSystem => scala.Unit,
    getCoordinateSystems: () => stdLib.SafeArray[XCoordinateSystem],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeCoordinateSystem: XCoordinateSystem => scala.Unit,
    setCoordinateSystems: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XCoordinateSystem] => scala.Unit
  ): XCoordinateSystemContainer = {
    val __obj = js.Dynamic.literal(CoordinateSystems = CoordinateSystems, acquire = js.Any.fromFunction0(acquire), addCoordinateSystem = js.Any.fromFunction1(addCoordinateSystem), getCoordinateSystems = js.Any.fromFunction0(getCoordinateSystems), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCoordinateSystem = js.Any.fromFunction1(removeCoordinateSystem), setCoordinateSystems = js.Any.fromFunction1(setCoordinateSystems))
  
    __obj.asInstanceOf[XCoordinateSystemContainer]
  }
}

