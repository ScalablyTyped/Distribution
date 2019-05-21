package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Circle extends js.Object {
  var shape: js.UndefOr[antdLib.antdLibStrings.square | antdLib.antdLibStrings.circle] = js.undefined
  var size: js.UndefOr[
    scala.Double | antdLib.antdLibStrings.small | antdLib.antdLibStrings.default | antdLib.antdLibStrings.large
  ] = js.undefined
}

object Anon_Circle {
  @scala.inline
  def apply(
    shape: antdLib.antdLibStrings.square | antdLib.antdLibStrings.circle = null,
    size: scala.Double | antdLib.antdLibStrings.small | antdLib.antdLibStrings.default | antdLib.antdLibStrings.large = null
  ): Anon_Circle = {
    val __obj = js.Dynamic.literal()
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Circle]
  }
}

