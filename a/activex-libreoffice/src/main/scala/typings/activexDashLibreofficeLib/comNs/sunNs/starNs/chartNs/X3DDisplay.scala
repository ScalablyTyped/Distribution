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

