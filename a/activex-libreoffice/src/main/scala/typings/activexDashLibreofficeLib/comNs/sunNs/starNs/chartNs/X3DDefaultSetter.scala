package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it easy to set suitable defaults for illumination and rotation for 3D charts
  * @see Dim3DDiagram
  */
trait X3DDefaultSetter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** The result may depend on the current chart type and the current shade mode. */
  def set3DSettingsToDefault(): scala.Unit
  /**
    * set suitable defaults for the illumination of the current 3D chart. The result may dependent on other 3D settings as rotation or shade mode. It may
    * depend on the current chart type also.
    */
  def setDefaultIllumination(): scala.Unit
  /** sets a suitable default for the rotation of the current 3D chart. The result may depend on the current chart type. */
  def setDefaultRotation(): scala.Unit
}

object X3DDefaultSetter {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    set3DSettingsToDefault: js.Function0[scala.Unit],
    setDefaultIllumination: js.Function0[scala.Unit],
    setDefaultRotation: js.Function0[scala.Unit]
  ): X3DDefaultSetter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("set3DSettingsToDefault")(set3DSettingsToDefault)
    __obj.updateDynamic("setDefaultIllumination")(setDefaultIllumination)
    __obj.updateDynamic("setDefaultRotation")(setDefaultRotation)
    __obj.asInstanceOf[X3DDefaultSetter]
  }
}

