package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_E extends js.Object {
  var hideRequiredMark: scala.Boolean
  var layout: antdLib.antdLibStrings.`inline` | antdLib.antdLibStrings.horizontal | antdLib.antdLibStrings.vertical
  def onSubmit(e: reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLFormElement]): scala.Unit
}

object Anon_E {
  @scala.inline
  def apply(
    hideRequiredMark: scala.Boolean,
    layout: antdLib.antdLibStrings.`inline` | antdLib.antdLibStrings.horizontal | antdLib.antdLibStrings.vertical,
    onSubmit: js.Function1[reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLFormElement], scala.Unit]
  ): Anon_E = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hideRequiredMark")(hideRequiredMark)
    __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.updateDynamic("onSubmit")(onSubmit)
    __obj.asInstanceOf[Anon_E]
  }
}

