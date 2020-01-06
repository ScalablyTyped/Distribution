package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDocumentClassificationJobResponse extends js.Object {
  /**
    * An object that describes the properties associated with the document classification job.
    */
  var DocumentClassificationJobProperties: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.DocumentClassificationJobProperties] = js.native
}

object DescribeDocumentClassificationJobResponse {
  @scala.inline
  def apply(DocumentClassificationJobProperties: DocumentClassificationJobProperties = null): DescribeDocumentClassificationJobResponse = {
    val __obj = js.Dynamic.literal()
    if (DocumentClassificationJobProperties != null) __obj.updateDynamic("DocumentClassificationJobProperties")(DocumentClassificationJobProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDocumentClassificationJobResponse]
  }
}

