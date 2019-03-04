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
    acquire: js.Function0[scala.Unit],
    getFloor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getWall: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    set3DSettingsToDefault: js.Function0[scala.Unit],
    setDefaultIllumination: js.Function0[scala.Unit],
    setDefaultRotation: js.Function0[scala.Unit]
  ): Dim3DDiagram = {
    val __obj = js.Dynamic.literal(Dim3D = Dim3D, Floor = Floor, Perspective = Perspective, RotationHorizontal = RotationHorizontal, RotationVertical = RotationVertical, Wall = Wall, acquire = acquire, getFloor = getFloor, getWall = getWall, queryInterface = queryInterface, release = release, set3DSettingsToDefault = set3DSettingsToDefault, setDefaultIllumination = setDefaultIllumination, setDefaultRotation = setDefaultRotation)
  
    __obj.asInstanceOf[Dim3DDiagram]
  }
}

