package typings.airtable.mod.global.Airtable

import typings.airtable.airtableStrings.json
import typings.airtable.airtableStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectOptions extends js.Object {
  var cellFormat: js.UndefOr[json | string] = js.native
  var fields: js.UndefOr[js.Array[String]] = js.native
  var filterByFormula: js.UndefOr[String] = js.native
  var maxRecords: js.UndefOr[Double] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var sort: js.UndefOr[js.Array[SortParameter]] = js.native
  var timeZone: js.UndefOr[String] = js.native
  var userLocale: js.UndefOr[String] = js.native
  var view: js.UndefOr[String] = js.native
}

object SelectOptions {
  @scala.inline
  def apply(): SelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectOptions]
  }
  @scala.inline
  implicit class SelectOptionsOps[Self <: SelectOptions] (val x: Self) extends AnyVal {
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
    def setCellFormat(value: json | string): Self = this.set("cellFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellFormat: Self = this.set("cellFormat", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFilterByFormula(value: String): Self = this.set("filterByFormula", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterByFormula: Self = this.set("filterByFormula", js.undefined)
    @scala.inline
    def setMaxRecords(value: Double): Self = this.set("maxRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRecords: Self = this.set("maxRecords", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setSortVarargs(value: SortParameter*): Self = this.set("sort", js.Array(value :_*))
    @scala.inline
    def setSort(value: js.Array[SortParameter]): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    @scala.inline
    def setUserLocale(value: String): Self = this.set("userLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserLocale: Self = this.set("userLocale", js.undefined)
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

