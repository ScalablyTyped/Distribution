package typings
package amchartsLib.exportsettingsMod

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

