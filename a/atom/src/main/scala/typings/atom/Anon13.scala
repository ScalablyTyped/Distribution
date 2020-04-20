package typings.atom

import typings.atom.atomStrings.Bottom
import typings.atom.atomStrings.Left
import typings.atom.atomStrings.Right
import typings.atom.atomStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon13 extends js.Object {
  var newValue: Top | Right | Bottom | Left
  var oldValue: js.UndefOr[Top | Right | Bottom | Left] = js.undefined
}

object Anon13 {
  @scala.inline
  def apply(newValue: Top | Right | Bottom | Left, oldValue: Top | Right | Bottom | Left = null): Anon13 = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon13]
  }
}

