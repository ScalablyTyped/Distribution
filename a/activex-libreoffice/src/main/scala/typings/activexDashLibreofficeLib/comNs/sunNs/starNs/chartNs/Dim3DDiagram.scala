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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Dim3D")(Dim3D)
    __obj.updateDynamic("Floor")(Floor)
    __obj.updateDynamic("Perspective")(Perspective)
    __obj.updateDynamic("RotationHorizontal")(RotationHorizontal)
    __obj.updateDynamic("RotationVertical")(RotationVertical)
    __obj.updateDynamic("Wall")(Wall)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getFloor")(getFloor)
    __obj.updateDynamic("getWall")(getWall)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("set3DSettingsToDefault")(set3DSettingsToDefault)
    __obj.updateDynamic("setDefaultIllumination")(setDefaultIllumination)
    __obj.updateDynamic("setDefaultRotation")(setDefaultRotation)
    __obj.asInstanceOf[Dim3DDiagram]
  }
}

