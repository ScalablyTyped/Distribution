package typings
package astDashTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fork extends js.Object {
  def use[T](plugin: Plugin[T]): T
}

object Fork {
  @scala.inline
  def apply(use: js.Function1[Plugin[js.Any], js.Any]): Fork = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("use")(use)
    __obj.asInstanceOf[Fork]
  }
}

