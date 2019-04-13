package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDocumentsResult extends js.Object {
  /**
    * The names of the Systems Manager documents.
    */
  var DocumentIdentifiers: js.UndefOr[DocumentIdentifierList] = js.undefined
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDocumentsResult {
  @scala.inline
  def apply(DocumentIdentifiers: DocumentIdentifierList = null, NextToken: NextToken = null): ListDocumentsResult = {
    val __obj = js.Dynamic.literal()
    if (DocumentIdentifiers != null) __obj.updateDynamic("DocumentIdentifiers")(DocumentIdentifiers)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDocumentsResult]
  }
}

