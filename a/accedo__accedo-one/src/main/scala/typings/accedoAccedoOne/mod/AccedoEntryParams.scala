package typings.accedoAccedoOne.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccedoEntryParams extends js.Object {
  /** an array of entry aliases (strings) */
  var alias: js.UndefOr[js.Array[String]] = js.undefined
  /** when given, get the version at the given time */
  var at: js.UndefOr[String | Date] = js.undefined
  /** an array of entry ids (strings) */
  var id: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * if available, get the version for the given locale
    * (defaults to the default locale)
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Offset the result by that many pages */
  var offset: js.UndefOr[Double | String] = js.undefined
  /** when true, get the preview version */
  var preview: js.UndefOr[Boolean] = js.undefined
  /**
    * Limit to that many results per page (limits as per Accedo
    * One API, currently 1 to 50, default 20)
    */
  var size: js.UndefOr[Double | String] = js.undefined
  /** only return entries whose entry type has this alias */
  var typeAlias: js.UndefOr[String] = js.undefined
  /** only return entries of the given type ids (strings) */
  var typeId: js.UndefOr[js.Array[String]] = js.undefined
}

object AccedoEntryParams {
  @scala.inline
  def apply(
    alias: js.Array[String] = null,
    at: String | Date = null,
    id: js.Array[String] = null,
    locale: String = null,
    offset: Double | String = null,
    preview: js.UndefOr[Boolean] = js.undefined,
    size: Double | String = null,
    typeAlias: String = null,
    typeId: js.Array[String] = null
  ): AccedoEntryParams = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (typeAlias != null) __obj.updateDynamic("typeAlias")(typeAlias.asInstanceOf[js.Any])
    if (typeId != null) __obj.updateDynamic("typeId")(typeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccedoEntryParams]
  }
}

