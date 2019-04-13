package typings
package apostropheLib.apostropheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AposType extends js.Object {
  var bless: js.UndefOr[js.Function2[/* req */ js.Any, /* field */ js.Any, scala.Unit]] = js.undefined
  var converters: apostropheLib.Anon_Callback
  var empty: js.UndefOr[js.Function2[/* field */ js.Any, /* value */ js.Any, scala.Unit]] = js.undefined
  var name: java.lang.String
  def index(value: js.Any, field: js.Any, texts: js.Any): scala.Unit
}

object AposType {
  @scala.inline
  def apply(
    converters: apostropheLib.Anon_Callback,
    index: (js.Any, js.Any, js.Any) => scala.Unit,
    name: java.lang.String,
    bless: (/* req */ js.Any, /* field */ js.Any) => scala.Unit = null,
    empty: (/* field */ js.Any, /* value */ js.Any) => scala.Unit = null
  ): AposType = {
    val __obj = js.Dynamic.literal(converters = converters, index = js.Any.fromFunction3(index), name = name)
    if (bless != null) __obj.updateDynamic("bless")(js.Any.fromFunction2(bless))
    if (empty != null) __obj.updateDynamic("empty")(js.Any.fromFunction2(empty))
    __obj.asInstanceOf[AposType]
  }
}

