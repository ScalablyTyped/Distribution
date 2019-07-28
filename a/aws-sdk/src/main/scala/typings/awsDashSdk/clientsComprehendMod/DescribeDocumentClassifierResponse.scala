package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDocumentClassifierResponse extends js.Object {
  /**
    * An object that contains the properties associated with a document classifier.
    */
  var DocumentClassifierProperties: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.DocumentClassifierProperties] = js.undefined
}

object DescribeDocumentClassifierResponse {
  @scala.inline
  def apply(DocumentClassifierProperties: DocumentClassifierProperties = null): DescribeDocumentClassifierResponse = {
    val __obj = js.Dynamic.literal()
    if (DocumentClassifierProperties != null) __obj.updateDynamic("DocumentClassifierProperties")(DocumentClassifierProperties)
    __obj.asInstanceOf[DescribeDocumentClassifierResponse]
  }
}

