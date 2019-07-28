package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDocumentClassifierRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the document classifier. The operation returns this identifier in its response.
    */
  var DocumentClassifierArn: typings.awsDashSdk.clientsComprehendMod.DocumentClassifierArn
}

object DescribeDocumentClassifierRequest {
  @scala.inline
  def apply(DocumentClassifierArn: DocumentClassifierArn): DescribeDocumentClassifierRequest = {
    val __obj = js.Dynamic.literal(DocumentClassifierArn = DocumentClassifierArn)
  
    __obj.asInstanceOf[DescribeDocumentClassifierRequest]
  }
}

