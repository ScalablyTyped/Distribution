package typings.amazonProductApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IItemLookupOptions extends js.Object {
  var condition: js.UndefOr[String] = js.native
  var domain: js.UndefOr[String] = js.native
  var idType: js.UndefOr[String] = js.native
  var includeReviewsSummary: js.UndefOr[Boolean] = js.native
  var itemId: js.UndefOr[String | js.Array[String]] = js.native
  var request: js.UndefOr[js.Function] = js.native
  var responseGroup: js.UndefOr[String] = js.native
  var searchIndex: js.UndefOr[String] = js.native
  var truncateReviewsAt: js.UndefOr[Double] = js.native
  var variationPage: js.UndefOr[String] = js.native
}

object IItemLookupOptions {
  @scala.inline
  def apply(): IItemLookupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IItemLookupOptions]
  }
  @scala.inline
  implicit class IItemLookupOptionsOps[Self <: IItemLookupOptions] (val x: Self) extends AnyVal {
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setIdType(value: String): Self = this.set("idType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdType: Self = this.set("idType", js.undefined)
    @scala.inline
    def setIncludeReviewsSummary(value: Boolean): Self = this.set("includeReviewsSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeReviewsSummary: Self = this.set("includeReviewsSummary", js.undefined)
    @scala.inline
    def setItemIdVarargs(value: String*): Self = this.set("itemId", js.Array(value :_*))
    @scala.inline
    def setItemId(value: String | js.Array[String]): Self = this.set("itemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    @scala.inline
    def setRequest(value: js.Function): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setResponseGroup(value: String): Self = this.set("responseGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseGroup: Self = this.set("responseGroup", js.undefined)
    @scala.inline
    def setSearchIndex(value: String): Self = this.set("searchIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchIndex: Self = this.set("searchIndex", js.undefined)
    @scala.inline
    def setTruncateReviewsAt(value: Double): Self = this.set("truncateReviewsAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncateReviewsAt: Self = this.set("truncateReviewsAt", js.undefined)
    @scala.inline
    def setVariationPage(value: String): Self = this.set("variationPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariationPage: Self = this.set("variationPage", js.undefined)
  }
  
}

