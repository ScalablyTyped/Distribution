package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input extends Accessor {
  /**
    * Gamepad input specific configuration settings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-input-Input.html#gamepad)
    */
  val gamepad: GamepadSettings = js.native
}

@JSGlobal("__esri.Input")
@js.native
class InputCls () extends Input {
  def this(properties: InputProperties) = this()
}

