package typings
package apostropheLib.apostropheMod.apostropheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AposType extends js.Object {
  var bless: js.UndefOr[js.Function2[/* req */ js.Any, /* field */ js.Any, scala.Unit]] = js.undefined
  var converters: apostropheLib.Anon_CallbackData
  var empty: js.UndefOr[js.Function2[/* field */ js.Any, /* value */ js.Any, scala.Unit]] = js.undefined
  var name: java.lang.String
  def index(value: js.Any, field: js.Any, texts: js.Any): scala.Unit
}

object AposType {
  @scala.inline
  def apply(
    converters: apostropheLib.Anon_CallbackData,
    index: js.Function3[js.Any, js.Any, js.Any, scala.Unit],
    name: java.lang.String,
    bless: js.Function2[/* req */ js.Any, /* field */ js.Any, scala.Unit] = null,
    empty: js.Function2[/* field */ js.Any, /* value */ js.Any, scala.Unit] = null
  ): AposType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("converters")(converters)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("name")(name)
    if (bless != null) __obj.updateDynamic("bless")(bless)
    if (empty != null) __obj.updateDynamic("empty")(empty)
    __obj.asInstanceOf[AposType]
  }
}

