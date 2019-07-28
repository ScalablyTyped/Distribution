package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XCoordinateSystemContainer extends XInterface {
  /** retrieve all coordinate systems */
  var CoordinateSystems: SafeArray[XCoordinateSystem]
  /**
    * add an coordinate system to the coordinate system container
    * @throws IllegalArgumentException If the given coordinate system is already contained in the container.
    */
  def addCoordinateSystem(aCoordSys: XCoordinateSystem): Unit
  /** retrieve all coordinate systems */
  def getCoordinateSystems(): SafeArray[XCoordinateSystem]
  /** removes one coordinate system from the coordinate system container. */
  def removeCoordinateSystem(aCoordSys: XCoordinateSystem): Unit
  /** set all coordinate systems */
  def setCoordinateSystems(aCoordinateSystems: SeqEquiv[XCoordinateSystem]): Unit
}

object XCoordinateSystemContainer {
  @scala.inline
  def apply(
    CoordinateSystems: SafeArray[XCoordinateSystem],
    acquire: () => Unit,
    addCoordinateSystem: XCoordinateSystem => Unit,
    getCoordinateSystems: () => SafeArray[XCoordinateSystem],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeCoordinateSystem: XCoordinateSystem => Unit,
    setCoordinateSystems: SeqEquiv[XCoordinateSystem] => Unit
  ): XCoordinateSystemContainer = {
    val __obj = js.Dynamic.literal(CoordinateSystems = CoordinateSystems, acquire = js.Any.fromFunction0(acquire), addCoordinateSystem = js.Any.fromFunction1(addCoordinateSystem), getCoordinateSystems = js.Any.fromFunction0(getCoordinateSystems), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCoordinateSystem = js.Any.fromFunction1(removeCoordinateSystem), setCoordinateSystems = js.Any.fromFunction1(setCoordinateSystems))
  
    __obj.asInstanceOf[XCoordinateSystemContainer]
  }
}

