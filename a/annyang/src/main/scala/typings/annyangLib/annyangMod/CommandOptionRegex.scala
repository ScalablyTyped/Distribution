package typings
package annyangLib.annyangMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandOptionRegex extends js.Object {
  var regexp: stdLib.RegExp
  def callback(): scala.Unit
}

object CommandOptionRegex {
  @scala.inline
  def apply(callback: js.Function0[scala.Unit], regexp: stdLib.RegExp): CommandOptionRegex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callback")(callback)
    __obj.updateDynamic("regexp")(regexp)
    __obj.asInstanceOf[CommandOptionRegex]
  }
}

