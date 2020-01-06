package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDocumentResult extends js.Object {
  /**
    * Information about the Systems Manager document.
    */
  var Document: js.UndefOr[DocumentDescription] = js.native
}

object DescribeDocumentResult {
  @scala.inline
  def apply(Document: DocumentDescription = null): DescribeDocumentResult = {
    val __obj = js.Dynamic.literal()
    if (Document != null) __obj.updateDynamic("Document")(Document.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDocumentResult]
  }
}

