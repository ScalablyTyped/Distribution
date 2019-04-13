package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDocumentResult extends js.Object {
  /**
    * Information about the Systems Manager document.
    */
  var Document: js.UndefOr[DocumentDescription] = js.undefined
}

object DescribeDocumentResult {
  @scala.inline
  def apply(Document: DocumentDescription = null): DescribeDocumentResult = {
    val __obj = js.Dynamic.literal()
    if (Document != null) __obj.updateDynamic("Document")(Document)
    __obj.asInstanceOf[DescribeDocumentResult]
  }
}

