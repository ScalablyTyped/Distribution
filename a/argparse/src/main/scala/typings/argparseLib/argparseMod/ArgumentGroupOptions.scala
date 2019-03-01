package typings
package argparseLib.argparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgumentGroupOptions extends js.Object {
  var argumentDefault: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var prefixChars: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ArgumentGroupOptions {
  @scala.inline
  def apply(
    argumentDefault: js.Any = null,
    description: java.lang.String = null,
    prefixChars: java.lang.String = null,
    title: java.lang.String = null
  ): ArgumentGroupOptions = {
    val __obj = js.Dynamic.literal()
    if (argumentDefault != null) __obj.updateDynamic("argumentDefault")(argumentDefault)
    if (description != null) __obj.updateDynamic("description")(description)
    if (prefixChars != null) __obj.updateDynamic("prefixChars")(prefixChars)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ArgumentGroupOptions]
  }
}

