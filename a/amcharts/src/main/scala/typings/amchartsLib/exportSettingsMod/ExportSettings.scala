package typings
package amchartsLib.exportSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSettings extends js.Object {
  var config: js.Any
  var enabled: scala.Boolean
  var libs: js.Object
  var menu: js.Object
  def capture(config: js.Any, callback: js.Function0[scala.Unit]): js.Any
  def toJPG(config: js.Any, callback: js.Function1[/* config */ js.Any, scala.Unit]): js.Any
}

object ExportSettings {
  @scala.inline
  def apply(
    capture: (js.Any, js.Function0[scala.Unit]) => js.Any,
    config: js.Any,
    enabled: scala.Boolean,
    libs: js.Object,
    menu: js.Object,
    toJPG: (js.Any, js.Function1[/* config */ js.Any, scala.Unit]) => js.Any
  ): ExportSettings = {
    val __obj = js.Dynamic.literal(capture = js.Any.fromFunction2(capture), config = config, enabled = enabled, libs = libs, menu = menu, toJPG = js.Any.fromFunction2(toJPG))
  
    __obj.asInstanceOf[ExportSettings]
  }
}

