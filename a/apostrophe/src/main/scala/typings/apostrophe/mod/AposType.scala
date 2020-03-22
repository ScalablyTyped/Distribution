package typings.apostrophe.mod

import typings.apostrophe.AnonForm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AposType extends js.Object {
  var bless: js.UndefOr[js.Function2[/* req */ js.Any, /* field */ js.Any, Unit]] = js.undefined
  var converters: AnonForm
  var empty: js.UndefOr[js.Function2[/* field */ js.Any, /* value */ js.Any, Unit]] = js.undefined
  var name: String
  def index(value: js.Any, field: js.Any, texts: js.Any): Unit
}

object AposType {
  @scala.inline
  def apply(
    converters: AnonForm,
    index: (js.Any, js.Any, js.Any) => Unit,
    name: String,
    bless: (/* req */ js.Any, /* field */ js.Any) => Unit = null,
    empty: (/* field */ js.Any, /* value */ js.Any) => Unit = null
  ): AposType = {
    val __obj = js.Dynamic.literal(converters = converters.asInstanceOf[js.Any], index = js.Any.fromFunction3(index), name = name.asInstanceOf[js.Any])
    if (bless != null) __obj.updateDynamic("bless")(js.Any.fromFunction2(bless))
    if (empty != null) __obj.updateDynamic("empty")(js.Any.fromFunction2(empty))
    __obj.asInstanceOf[AposType]
  }
}

