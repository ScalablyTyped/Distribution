package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDocumentClassifiersResponse extends js.Object {
  /**
    * A list containing the properties of each job returned.
    */
  var DocumentClassifierPropertiesList: js.UndefOr[DocumentClassifierPropertiesList] = js.undefined
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListDocumentClassifiersResponse {
  @scala.inline
  def apply(
    DocumentClassifierPropertiesList: DocumentClassifierPropertiesList = null,
    NextToken: String = null
  ): ListDocumentClassifiersResponse = {
    val __obj = js.Dynamic.literal()
    if (DocumentClassifierPropertiesList != null) __obj.updateDynamic("DocumentClassifierPropertiesList")(DocumentClassifierPropertiesList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDocumentClassifiersResponse]
  }
}

