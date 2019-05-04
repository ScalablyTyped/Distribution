package typings
package ansiUnderscoreUpLib.ansiUnderscoreUpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatter extends js.Object {
  def compose(segments: js.Array[_], instance: AnsiUp): js.Any
  def transform(fragment: TextWithAttr, instance: AnsiUp): js.Any
}

object Formatter {
  @scala.inline
  def apply(compose: (js.Array[_], AnsiUp) => js.Any, transform: (TextWithAttr, AnsiUp) => js.Any): Formatter = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction2(compose), transform = js.Any.fromFunction2(transform))
  
    __obj.asInstanceOf[Formatter]
  }
}

