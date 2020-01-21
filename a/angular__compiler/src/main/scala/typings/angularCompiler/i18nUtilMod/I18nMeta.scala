package typings.angularCompiler.i18nUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nMeta extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var meaning: js.UndefOr[String] = js.undefined
}

object I18nMeta {
  @scala.inline
  def apply(description: String = null, id: String = null, meaning: String = null): I18nMeta = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (meaning != null) __obj.updateDynamic("meaning")(meaning.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nMeta]
  }
}

