package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDocumentClassifierResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the document classifier.
    */
  var DocumentClassifierArn: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.DocumentClassifierArn] = js.undefined
}

object CreateDocumentClassifierResponse {
  @scala.inline
  def apply(DocumentClassifierArn: DocumentClassifierArn = null): CreateDocumentClassifierResponse = {
    val __obj = js.Dynamic.literal()
    if (DocumentClassifierArn != null) __obj.updateDynamic("DocumentClassifierArn")(DocumentClassifierArn)
    __obj.asInstanceOf[CreateDocumentClassifierResponse]
  }
}

