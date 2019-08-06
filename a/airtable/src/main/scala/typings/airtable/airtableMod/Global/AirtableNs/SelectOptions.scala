package typings.airtable.airtableMod.Global.AirtableNs

import typings.airtable.airtableStrings.json
import typings.airtable.airtableStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectOptions extends js.Object {
  var cellFormat: js.UndefOr[json | string] = js.undefined
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  var filterByFormula: js.UndefOr[String] = js.undefined
  var maxRecords: js.UndefOr[Double] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[js.Array[SortParameter]] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
  var userLocale: js.UndefOr[String] = js.undefined
  var view: js.UndefOr[String] = js.undefined
}

object SelectOptions {
  @scala.inline
  def apply(
    cellFormat: json | string = null,
    fields: js.Array[String] = null,
    filterByFormula: String = null,
    maxRecords: Int | Double = null,
    pageSize: Int | Double = null,
    sort: js.Array[SortParameter] = null,
    timeZone: String = null,
    userLocale: String = null,
    view: String = null
  ): SelectOptions = {
    val __obj = js.Dynamic.literal()
    if (cellFormat != null) __obj.updateDynamic("cellFormat")(cellFormat.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (filterByFormula != null) __obj.updateDynamic("filterByFormula")(filterByFormula)
    if (maxRecords != null) __obj.updateDynamic("maxRecords")(maxRecords.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    if (userLocale != null) __obj.updateDynamic("userLocale")(userLocale)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[SelectOptions]
  }
}

