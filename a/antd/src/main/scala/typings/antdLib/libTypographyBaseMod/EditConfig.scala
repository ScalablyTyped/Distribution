package typings
package antdLib.libTypographyBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditConfig extends js.Object {
  var editing: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var onStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object EditConfig {
  @scala.inline
  def apply(
    editing: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: js.Function1[/* value */ java.lang.String, scala.Unit] = null,
    onStart: js.Function0[scala.Unit] = null
  ): EditConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onStart != null) __obj.updateDynamic("onStart")(onStart)
    __obj.asInstanceOf[EditConfig]
  }
}

