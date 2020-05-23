package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it easy to set suitable defaults for illumination and rotation for 3D charts
  * @see Dim3DDiagram
  */
trait X3DDefaultSetter extends XInterface {
  /** The result may depend on the current chart type and the current shade mode. */
  def set3DSettingsToDefault(): Unit
  /**
    * set suitable defaults for the illumination of the current 3D chart. The result may dependent on other 3D settings as rotation or shade mode. It may
    * depend on the current chart type also.
    */
  def setDefaultIllumination(): Unit
  /** sets a suitable default for the rotation of the current 3D chart. The result may depend on the current chart type. */
  def setDefaultRotation(): Unit
}

object X3DDefaultSetter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    set3DSettingsToDefault: () => Unit,
    setDefaultIllumination: () => Unit,
    setDefaultRotation: () => Unit
  ): X3DDefaultSetter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), set3DSettingsToDefault = js.Any.fromFunction0(set3DSettingsToDefault), setDefaultIllumination = js.Any.fromFunction0(setDefaultIllumination), setDefaultRotation = js.Any.fromFunction0(setDefaultRotation))
    __obj.asInstanceOf[X3DDefaultSetter]
  }
}

