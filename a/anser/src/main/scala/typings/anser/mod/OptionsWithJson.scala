package typings.anser.mod

import typings.anser.anserBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined anser.anser.AnserOptions & {  json :true} */
@js.native
trait OptionsWithJson extends js.Object {
  /** If `true`, the result will be an object. */
  var json: js.UndefOr[Boolean] with `true` = js.native
  var remove_empty: js.UndefOr[Boolean] = js.native
  /** If `true`, HTML classes will be appended to the HTML output. */
  var use_classes: js.UndefOr[Boolean] = js.native
}

object OptionsWithJson {
  @scala.inline
  def apply(json: js.UndefOr[Boolean] with `true`): OptionsWithJson = {
    val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithJson]
  }
  @scala.inline
  implicit class OptionsWithJsonOps[Self <: OptionsWithJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJson(value: js.UndefOr[Boolean] with `true`): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove_empty(value: Boolean): Self = this.set("remove_empty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove_empty: Self = this.set("remove_empty", js.undefined)
    @scala.inline
    def setUse_classes(value: Boolean): Self = this.set("use_classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse_classes: Self = this.set("use_classes", js.undefined)
  }
  
}

