package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePresignedNotebookInstanceUrlOutput extends js.Object {
  /**
    * A JSON object that contains the URL string. 
    */
  var AuthorizedUrl: js.UndefOr[NotebookInstanceUrl] = js.native
}

object CreatePresignedNotebookInstanceUrlOutput {
  @scala.inline
  def apply(AuthorizedUrl: NotebookInstanceUrl = null): CreatePresignedNotebookInstanceUrlOutput = {
    val __obj = js.Dynamic.literal()
    if (AuthorizedUrl != null) __obj.updateDynamic("AuthorizedUrl")(AuthorizedUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresignedNotebookInstanceUrlOutput]
  }
}

