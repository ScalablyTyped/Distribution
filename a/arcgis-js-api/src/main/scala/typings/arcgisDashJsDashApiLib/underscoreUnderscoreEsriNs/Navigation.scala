package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigation extends Accessor {
  /**
    * Gamepad navigation specific configuration settings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#gamepad)
    */
  val gamepad: gamepadGamepadSettings = js.native
}

@JSGlobal("__esri.Navigation")
@js.native
class NavigationCls () extends Navigation {
  def this(properties: NavigationProperties) = this()
}

