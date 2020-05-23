package typings.anser.mod

import typings.anser.anserBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined anser.anser.AnserOptions & {  json  :true} */
trait OptionsWithJson extends js.Object {
  /** If `true`, the result will be an object. */
  var json: js.UndefOr[Boolean with `true`] = js.undefined
  var remove_empty: js.UndefOr[Boolean] = js.undefined
  /** If `true`, HTML classes will be appended to the HTML output. */
  var use_classes: js.UndefOr[Boolean] = js.undefined
}

object OptionsWithJson {
  @scala.inline
  def apply(
    json: js.UndefOr[Boolean with `true`] = js.undefined,
    remove_empty: js.UndefOr[Boolean] = js.undefined,
    use_classes: js.UndefOr[Boolean] = js.undefined
  ): OptionsWithJson = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remove_empty)) __obj.updateDynamic("remove_empty")(remove_empty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(use_classes)) __obj.updateDynamic("use_classes")(use_classes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithJson]
  }
}

