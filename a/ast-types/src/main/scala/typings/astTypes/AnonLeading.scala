package typings.astTypes

import typings.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeading extends js.Object {
  var leading: js.UndefOr[Boolean] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var trailing: js.UndefOr[Boolean] = js.undefined
  var value: String
}

object AnonLeading {
  @scala.inline
  def apply(
    value: String,
    leading: js.UndefOr[Boolean] = js.undefined,
    loc: SourceLocationKind = null,
    trailing: js.UndefOr[Boolean] = js.undefined
  ): AnonLeading = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(trailing)) __obj.updateDynamic("trailing")(trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeading]
  }
}

