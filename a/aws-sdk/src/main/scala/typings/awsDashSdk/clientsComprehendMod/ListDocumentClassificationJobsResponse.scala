package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDocumentClassificationJobsResponse extends js.Object {
  /**
    * A list containing the properties of each job returned.
    */
  var DocumentClassificationJobPropertiesList: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.DocumentClassificationJobPropertiesList] = js.undefined
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListDocumentClassificationJobsResponse {
  @scala.inline
  def apply(
    DocumentClassificationJobPropertiesList: DocumentClassificationJobPropertiesList = null,
    NextToken: String = null
  ): ListDocumentClassificationJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (DocumentClassificationJobPropertiesList != null) __obj.updateDynamic("DocumentClassificationJobPropertiesList")(DocumentClassificationJobPropertiesList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDocumentClassificationJobsResponse]
  }
}

