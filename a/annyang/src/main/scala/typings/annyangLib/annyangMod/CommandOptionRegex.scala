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
  def apply(callback: () => scala.Unit, regexp: stdLib.RegExp): CommandOptionRegex = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), regexp = regexp)
  
    __obj.asInstanceOf[CommandOptionRegex]
  }
}

