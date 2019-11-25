package typings.antd

import typings.antd.antdStrings.`inline`
import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.vertical
import typings.react.reactMod.FormEvent
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colon extends js.Object {
  var colon: Boolean
  var hideRequiredMark: Boolean
  var layout: `inline` | horizontal | vertical
  def onSubmit(e: FormEvent[HTMLFormElement]): Unit
}

object Anon_Colon {
  @scala.inline
  def apply(
    colon: Boolean,
    hideRequiredMark: Boolean,
    layout: `inline` | horizontal | vertical,
    onSubmit: FormEvent[HTMLFormElement] => Unit
  ): Anon_Colon = {
    val __obj = js.Dynamic.literal(colon = colon.asInstanceOf[js.Any], hideRequiredMark = hideRequiredMark.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], onSubmit = js.Any.fromFunction1(onSubmit))
  
    __obj.asInstanceOf[Anon_Colon]
  }
}

