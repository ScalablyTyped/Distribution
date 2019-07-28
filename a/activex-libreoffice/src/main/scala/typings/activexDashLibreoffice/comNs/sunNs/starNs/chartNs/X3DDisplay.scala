package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to 3D elements of a three-dimensional chart.
  * @see Dim3DDiagram
  */
trait X3DDisplay extends XInterface {
  /**
    * @returns the properties of the floor.  This is only valid for three-dimensional diagrams.
    * @see ChartArea
    */
  val Floor: XPropertySet
  /**
    * @returns the properties of the diagram wall(s).  This specifies the properties of the two side walls of the chart scene.  Note that this property is also
    * @see ChartArea
    */
  val Wall: XPropertySet
  /**
    * @returns the properties of the floor.  This is only valid for three-dimensional diagrams.
    * @see ChartArea
    */
  def getFloor(): XPropertySet
  /**
    * @returns the properties of the diagram wall(s).  This specifies the properties of the two side walls of the chart scene.  Note that this property is also
    * @see ChartArea
    */
  def getWall(): XPropertySet
}

object X3DDisplay {
  @scala.inline
  def apply(
    Floor: XPropertySet,
    Wall: XPropertySet,
    acquire: () => Unit,
    getFloor: () => XPropertySet,
    getWall: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): X3DDisplay = {
    val __obj = js.Dynamic.literal(Floor = Floor, Wall = Wall, acquire = js.Any.fromFunction0(acquire), getFloor = js.Any.fromFunction0(getFloor), getWall = js.Any.fromFunction0(getWall), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[X3DDisplay]
  }
}

