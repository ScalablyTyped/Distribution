package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFaqsResponse extends js.Object {
  /**
    * information about the FAQs associated with the specified index.
    */
  var FaqSummaryItems: js.UndefOr[typings.awsDashSdk.clientsKendraMod.FaqSummaryItems] = js.native
  /**
    * The ListFaqs operation returns a page of FAQs at a time. The maximum size of the page is set by the MaxResults parameter. If there are more jobs in the list than the page size, Amazon Kendra returns the NextPage token. Include the token in the next request to the ListFaqs operation to return the next page of FAQs.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsKendraMod.NextToken] = js.native
}

object ListFaqsResponse {
  @scala.inline
  def apply(FaqSummaryItems: FaqSummaryItems = null, NextToken: NextToken = null): ListFaqsResponse = {
    val __obj = js.Dynamic.literal()
    if (FaqSummaryItems != null) __obj.updateDynamic("FaqSummaryItems")(FaqSummaryItems.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFaqsResponse]
  }
}

