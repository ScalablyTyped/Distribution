package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Leading extends js.Object {
  var leading: js.UndefOr[scala.Boolean] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var trailing: js.UndefOr[scala.Boolean] = js.undefined
  var value: java.lang.String
}

object Anon_Leading {
  @scala.inline
  def apply(
    value: java.lang.String,
    leading: js.UndefOr[scala.Boolean] = js.undefined,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    trailing: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Leading = {
    val __obj = js.Dynamic.literal(value = value)
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(trailing)) __obj.updateDynamic("trailing")(trailing)
    __obj.asInstanceOf[Anon_Leading]
  }
}

