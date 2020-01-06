package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDocumentVersionsResult extends js.Object {
  /**
    * The document versions.
    */
  var DocumentVersions: js.UndefOr[DocumentVersionList] = js.native
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.native
}

object ListDocumentVersionsResult {
  @scala.inline
  def apply(DocumentVersions: DocumentVersionList = null, NextToken: NextToken = null): ListDocumentVersionsResult = {
    val __obj = js.Dynamic.literal()
    if (DocumentVersions != null) __obj.updateDynamic("DocumentVersions")(DocumentVersions.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDocumentVersionsResult]
  }
}

