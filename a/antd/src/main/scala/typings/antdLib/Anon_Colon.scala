package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colon extends js.Object {
  var colon: scala.Boolean
  var hideRequiredMark: scala.Boolean
  var layout: antdLib.antdLibStrings.`inline` | antdLib.antdLibStrings.horizontal | antdLib.antdLibStrings.vertical
  def onSubmit(e: reactLib.reactMod.FormEvent[stdLib.HTMLFormElement]): scala.Unit
}

object Anon_Colon {
  @scala.inline
  def apply(
    colon: scala.Boolean,
    hideRequiredMark: scala.Boolean,
    layout: antdLib.antdLibStrings.`inline` | antdLib.antdLibStrings.horizontal | antdLib.antdLibStrings.vertical,
    onSubmit: reactLib.reactMod.FormEvent[stdLib.HTMLFormElement] => scala.Unit
  ): Anon_Colon = {
    val __obj = js.Dynamic.literal(colon = colon, hideRequiredMark = hideRequiredMark, layout = layout.asInstanceOf[js.Any], onSubmit = js.Any.fromFunction1(onSubmit))
  
    __obj.asInstanceOf[Anon_Colon]
  }
}

