package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is a service for diagrams that support the capability to render themselves as three-dimensional diagrams as well as two-dimensional ones. */
trait Dim3DDiagram
  extends X3DDisplay
     with X3DDefaultSetter {
  /** If set to `TRUE` , the chart becomes a three-dimensional chart. Otherwise it is two-dimensional. */
  var Dim3D: scala.Boolean
  /** Perspective of 3D charts ( [0,100] ). */
  var Perspective: scala.Double
  /** Horizontal rotation of 3D charts in degrees ( ]-180,180] ). */
  var RotationHorizontal: scala.Double
  /** Vertical rotation of 3D charts in degrees ( ]-180,180] ). */
  var RotationVertical: scala.Double
}

object Dim3DDiagram {
  @scala.inline
  def apply(
    Dim3D: scala.Boolean,
    Floor: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    Perspective: scala.Double,
    RotationHorizontal: scala.Double,
    RotationVertical: scala.Double,
    Wall: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: () => scala.Unit,
    getFloor: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getWall: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    set3DSettingsToDefault: () => scala.Unit,
    setDefaultIllumination: () => scala.Unit,
    setDefaultRotation: () => scala.Unit
  ): Dim3DDiagram = {
    val __obj = js.Dynamic.literal(Dim3D = Dim3D, Floor = Floor, Perspective = Perspective, RotationHorizontal = RotationHorizontal, RotationVertical = RotationVertical, Wall = Wall, acquire = js.Any.fromFunction0(acquire), getFloor = js.Any.fromFunction0(getFloor), getWall = js.Any.fromFunction0(getWall), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), set3DSettingsToDefault = js.Any.fromFunction0(set3DSettingsToDefault), setDefaultIllumination = js.Any.fromFunction0(setDefaultIllumination), setDefaultRotation = js.Any.fromFunction0(setDefaultRotation))
  
    __obj.asInstanceOf[Dim3DDiagram]
  }
}

