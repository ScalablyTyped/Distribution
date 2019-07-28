package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDocumentResult extends js.Object {
  /**
    * Information about the Systems Manager document.
    */
  var DocumentDescription: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentDescription] = js.undefined
}

object CreateDocumentResult {
  @scala.inline
  def apply(DocumentDescription: DocumentDescription = null): CreateDocumentResult = {
    val __obj = js.Dynamic.literal()
    if (DocumentDescription != null) __obj.updateDynamic("DocumentDescription")(DocumentDescription)
    __obj.asInstanceOf[CreateDocumentResult]
  }
}

