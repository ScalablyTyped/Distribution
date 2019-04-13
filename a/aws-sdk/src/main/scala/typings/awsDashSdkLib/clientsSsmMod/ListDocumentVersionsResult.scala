package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDocumentVersionsResult extends js.Object {
  /**
    * The document versions.
    */
  var DocumentVersions: js.UndefOr[DocumentVersionList] = js.undefined
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDocumentVersionsResult {
  @scala.inline
  def apply(DocumentVersions: DocumentVersionList = null, NextToken: NextToken = null): ListDocumentVersionsResult = {
    val __obj = js.Dynamic.literal()
    if (DocumentVersions != null) __obj.updateDynamic("DocumentVersions")(DocumentVersions)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDocumentVersionsResult]
  }
}

