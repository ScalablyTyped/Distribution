package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to 3D elements of a three-dimensional chart.
  * @see Dim3DDiagram
  */
trait X3DDisplay
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @returns the properties of the floor.  This is only valid for three-dimensional diagrams.
    * @see ChartArea
    */
  val Floor: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the diagram wall(s).  This specifies the properties of the two side walls of the chart scene.  Note that this property is also
    * @see ChartArea
    */
  val Wall: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the floor.  This is only valid for three-dimensional diagrams.
    * @see ChartArea
    */
  def getFloor(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the diagram wall(s).  This specifies the properties of the two side walls of the chart scene.  Note that this property is also
    * @see ChartArea
    */
  def getWall(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

object X3DDisplay {
  @scala.inline
  def apply(
    Floor: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    Wall: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    getFloor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getWall: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): X3DDisplay = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Floor")(Floor)
    __obj.updateDynamic("Wall")(Wall)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getFloor")(getFloor)
    __obj.updateDynamic("getWall")(getWall)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[X3DDisplay]
  }
}

