package typings.argparse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgumentGroupOptions extends js.Object {
  var argumentDefault: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var prefixChars: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object ArgumentGroupOptions {
  @scala.inline
  def apply(
    argumentDefault: js.Any = null,
    description: String = null,
    prefixChars: String = null,
    title: String = null
  ): ArgumentGroupOptions = {
    val __obj = js.Dynamic.literal()
    if (argumentDefault != null) __obj.updateDynamic("argumentDefault")(argumentDefault.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (prefixChars != null) __obj.updateDynamic("prefixChars")(prefixChars.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentGroupOptions]
  }
}

