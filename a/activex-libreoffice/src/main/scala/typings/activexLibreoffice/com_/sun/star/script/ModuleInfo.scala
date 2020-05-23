package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleInfo extends js.Object {
  var ModuleObject: XInterface
  var ModuleType: Double
}

object ModuleInfo {
  @scala.inline
  def apply(ModuleObject: XInterface, ModuleType: Double): ModuleInfo = {
    val __obj = js.Dynamic.literal(ModuleObject = ModuleObject.asInstanceOf[js.Any], ModuleType = ModuleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleInfo]
  }
}

