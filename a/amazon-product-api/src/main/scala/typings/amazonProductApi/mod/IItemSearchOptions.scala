package typings.amazonProductApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IItemSearchOptions extends js.Object {
  var condition: js.UndefOr[String] = js.native
  var itemPage: js.UndefOr[Double] = js.native
  var keywords: js.UndefOr[String] = js.native
  var responseGroup: js.UndefOr[String] = js.native
  var searchIndex: js.UndefOr[String] = js.native
  var sort: js.UndefOr[String] = js.native
}

object IItemSearchOptions {
  @scala.inline
  def apply(): IItemSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IItemSearchOptions]
  }
  @scala.inline
  implicit class IItemSearchOptionsOps[Self <: IItemSearchOptions] (val x: Self) extends AnyVal {
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
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setItemPage(value: Double): Self = this.set("itemPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemPage: Self = this.set("itemPage", js.undefined)
    @scala.inline
    def setKeywords(value: String): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    @scala.inline
    def setResponseGroup(value: String): Self = this.set("responseGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseGroup: Self = this.set("responseGroup", js.undefined)
    @scala.inline
    def setSearchIndex(value: String): Self = this.set("searchIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchIndex: Self = this.set("searchIndex", js.undefined)
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

