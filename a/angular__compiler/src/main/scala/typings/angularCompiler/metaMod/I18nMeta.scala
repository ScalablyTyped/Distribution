package typings.angularCompiler.metaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nMeta extends js.Object {
  var customId: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var legacyIds: js.UndefOr[js.Array[String]] = js.undefined
  var meaning: js.UndefOr[String] = js.undefined
}

object I18nMeta {
  @scala.inline
  def apply(
    customId: String = null,
    description: String = null,
    id: String = null,
    legacyIds: js.Array[String] = null,
    meaning: String = null
  ): I18nMeta = {
    val __obj = js.Dynamic.literal()
    if (customId != null) __obj.updateDynamic("customId")(customId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (legacyIds != null) __obj.updateDynamic("legacyIds")(legacyIds.asInstanceOf[js.Any])
    if (meaning != null) __obj.updateDynamic("meaning")(meaning.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nMeta]
  }
}

